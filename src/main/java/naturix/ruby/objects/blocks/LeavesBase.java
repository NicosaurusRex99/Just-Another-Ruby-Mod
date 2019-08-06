package naturix.ruby.objects.blocks;

import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class LeavesBase extends LeavesBlock {

    Item.Properties properties;
    public LeavesBase(String name){
        super(Block.Properties
                .create(Material.LEAVES)
                .hardnessAndResistance(0.3f, 0.2f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));

    }
    public boolean ticksRandomly(BlockState state) {
        return false;
    }
    public void randomTick(BlockState state, World worldIn, BlockPos pos, Random random) {
        if (!state.get(PERSISTENT) && state.get(DISTANCE) == 7) {
            spawnDrops(state, worldIn, pos);
            worldIn.removeBlock(pos, false);
        }

    }
    private static int getDistance(BlockState neighbor) {
        if (neighbor.getBlock() == ModBlocks.log) {
            return 0;
        } else {
            return neighbor.getBlock() instanceof LeavesBlock ? neighbor.get(DISTANCE) : 7;
        }
    }
}