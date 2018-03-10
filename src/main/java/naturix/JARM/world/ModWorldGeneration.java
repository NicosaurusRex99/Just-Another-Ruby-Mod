package naturix.JARM.world;

import java.util.Random;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator {
	
	public static ModWorldGeneration instance = new ModWorldGeneration();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { 
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -11325) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 7) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 20) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 6) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -112) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -127) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -9999) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (Config.debug == true ) {
			JARM.logger.info("World Gen Loaded");
		}
	}
	

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.rubyore.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, Config.rubyVeinSize + random.nextInt(4), Config.rubySpawnTries);
		generateOre(ModBlocks.amethystrock.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 1 + random.nextInt(4), Config.AmethystSpawnTries);
	}


}