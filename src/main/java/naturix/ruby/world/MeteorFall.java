package naturix.ruby.world;

import naturix.ruby.Config;
import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import java.util.Random;

public class MeteorFall {


    public static void init(PlayerEntity playerEntity){
        World world = playerEntity.world;
        Random random = world.rand;
        BlockPos pos = new BlockPos(playerEntity.getPosition().getX(), playerEntity.world.getMaxHeight() - 1, playerEntity.getPosition().getZ());
        Block block = ModBlocks.meteorite_ore;
        if(random.nextInt(Config.METEORFREQUENCY.get() * 100) == 0 && playerEntity.dimension == DimensionType.OVERWORLD && !world.isRemote && world.canBlockSeeSky(playerEntity.getPosition().up())){
            world.setBlockState(pos, block.getDefaultState());
            world.notifyBlockUpdate(pos, world.getBlockState(pos), block.getDefaultState(), 0);
        }
    }
}
