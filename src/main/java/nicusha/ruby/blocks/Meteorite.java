package nicusha.ruby.blocks;

import com.mojang.serialization.MapCodec;
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
    public static final MapCodec<Meteorite> CODEC = simpleCodec(Meteorite::new);
    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
    protected static final VoxelShape SHAPE = Block.box(1D, 0.0D, 1D, 14D, 10D, 14D);

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }
}