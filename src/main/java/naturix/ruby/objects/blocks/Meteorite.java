package naturix.ruby.objects.blocks;

import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Meteorite extends FallingBlock {

    public Meteorite(String name) {
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5.0f, 8.0f)
                .harvestLevel(2));
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
    }
    protected static final VoxelShape METEORESHAPE = Block.makeCuboidShape(1D, 0.0D, 1D, 14D, 10D, 14D);

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return METEORESHAPE;
    }
}
