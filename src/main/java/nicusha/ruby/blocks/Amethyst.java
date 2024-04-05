package nicusha.ruby.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.phys.shapes.*;
import nicusha.ruby.blocks.block_entity.AmethystBlockEntity;
import nicusha.ruby.registry.BlockEntityRegistry;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.Nullable;

public class Amethyst extends BaseEntityBlock {

    public Amethyst(Properties properties) {
        super(properties);
    }

    public static final MapCodec<Amethyst> CODEC = simpleCodec(Amethyst::new);
    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 4.0D, 12.0D);

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }
    @Override
    public RenderShape getRenderShape(BlockState state) {return RenderShape.MODEL;}

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AmethystBlockEntity(pos, state);
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return level.isClientSide ? null : createTickerHelper(type, BlockEntityRegistry.AMETHYST.get(), AmethystBlockEntity::serverTick);
    }
}
