package naturix.ruby.world;

import naturix.ruby.Config;
import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

import java.util.Random;

public class MeteorFall {


    public static void init(PlayerEntity playerEntity) {
        World world = playerEntity.world;
        Random random = world.rand;
        BlockPos pos = new BlockPos(playerEntity.getPosX(), playerEntity.world.getHeight() - 1, playerEntity.getPosZ());
        Block block = ModBlocks.meteoriteOre;
        if (random.nextInt(Config.METEORFREQUENCY.get() * 100) == 0 && playerEntity.getEntityWorld().func_230315_m_() == DimensionType.func_236019_a_() && !world.isRemote && world.canBlockSeeSky(new BlockPos(playerEntity.getPosX(), playerEntity.getPosY()+1, playerEntity.getPosZ()))) {
            world.setBlockState(pos, block.getDefaultState());
            world.notifyBlockUpdate(pos, world.getBlockState(pos), block.getDefaultState(), 0);
            }
    }
}
