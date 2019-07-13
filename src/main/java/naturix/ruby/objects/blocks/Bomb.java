package naturix.ruby.objects.blocks;

import naturix.ruby.Config;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Bomb extends BlockBase {
    public static final BooleanProperty UNSTABLE = BlockStateProperties.UNSTABLE;

    public Bomb(String name) {
        super(name);
        this.setDefaultState(this.getDefaultState().with(UNSTABLE, Boolean.valueOf(false)));
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (oldState.getBlock() != state.getBlock()) {
            if (worldIn.isBlockPowered(pos)) {
                explode(worldIn, pos);
                worldIn.removeBlock(pos, false);
            }

        }
    }

    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (worldIn.isBlockPowered(pos)) {
            explode(worldIn, pos);
            worldIn.removeBlock(pos, false);
        }

    }

    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!worldIn.isRemote() && !player.isCreative() && state.get(UNSTABLE)) {
            explode(worldIn, pos);
        }

        super.onBlockHarvested(worldIn, pos, state, player);
    }

    public static void explode(World world, BlockPos pos) {
        explode(world, pos, (LivingEntity)null);
    }
    private static void explode(World world, BlockPos pos, @Nullable LivingEntity e) {
        if (!world.isRemote) {
            world.createExplosion(e, pos.getX(), pos.getY(), pos.getZ(), Config.BOMBSTRENGTH.get(), Explosion.Mode.DESTROY);
            world.playSound((PlayerEntity) null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
    }

    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(UNSTABLE);
    }

}