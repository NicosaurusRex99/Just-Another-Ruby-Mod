package naturix.ruby.objects.blocks;
import naturix.ruby.Ruby;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;
public class SaplingBase extends SaplingBlock implements IGrowable
{
    public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    public static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    public final Tree tree;

    public SaplingBase(String name, Tree tree)
    {
        super(tree, Block.Properties
                .create(Material.PLANTS)
                .tickRandomly()
                .hardnessAndResistance(0.2f, 0.1f));
        this.tree = tree;
        this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
        this.setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {
        return SHAPE;
    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random)
    {
        super.tick(state, worldIn, pos, random);
        if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
        if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
            this.grow(worldIn, pos, state, random);
        }

    }

    @Override
    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand)
    {
        if (state.get(STAGE) == 0)
        {
            worldIn.setBlockState(pos, state.cycle(STAGE), 4);
        }
        else
        {
            if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos)) return;
            this.tree.spawn(worldIn, pos, state, rand);
        }

    }

    /**
     * Whether this IGrowable can grow
     */
    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient)
    {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state)
    {
        this.grow(worldIn, pos, state, rand);
    }


    @Override
    public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(STAGE);
    }

    @Override
    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face)
    {
        return Blocks.OAK_SAPLING.getFlammability(state, world, pos, face);
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face)
    {
        return Blocks.OAK_SAPLING.getFireSpreadSpeed(state,world, pos, face);
    }
}