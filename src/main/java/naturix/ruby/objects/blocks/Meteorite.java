package naturix.ruby.objects.blocks;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class Meteorite extends FallingBlock {

    public Meteorite(String name) {
        super(Block.Properties
                .create(Material.ROCK)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                .func_235861_h_()
                .hardnessAndResistance(5.0f, 8.0f)
                .tickRandomly()
        );
        setRegistryName(Ruby.MODID, name);
    }
    protected static final VoxelShape METEORESHAPE = Block.makeCuboidShape(1D, 0.0D, 1D, 14D, 10D, 14D);

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
            return METEORESHAPE;
    }
}
