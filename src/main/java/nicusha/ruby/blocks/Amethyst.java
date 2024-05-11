package nicusha.ruby.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Amethyst extends Block {
    public Amethyst(Properties properties) {
        super(properties);
    }

    public static final MapCodec<Amethyst> CODEC = simpleCodec(Amethyst::new);
    @Override
    protected MapCodec<? extends Block> codec() {
        return CODEC;
    }

    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 4.0D, 12.0D);

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }
}
