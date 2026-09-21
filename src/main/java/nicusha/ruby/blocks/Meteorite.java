package nicusha.ruby.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Meteorite extends FallingBlock {
    public Meteorite(Properties properties) {
        super(properties);
    }

    @Override
    public int getDustColor(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.getMapColor(blockGetter, blockPos).col;
    }

    protected static final VoxelShape SHAPE = Block.box(1D, 0.0D, 1D, 14D, 10D, 14D);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}