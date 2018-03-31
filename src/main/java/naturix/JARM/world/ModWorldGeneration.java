package naturix.jarm.world;

import java.util.Random;

import naturix.jarm.Config;
import naturix.jarm.JARM;
import naturix.jarm.registry.ModBlocks;
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
		if (world.provider.getDimension() == -11325) {//Deep Dark
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 7) {//Twilight Forest
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 20) {//BOP promised land
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 6) {//Aromas Mining Dimension
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -9999) {//XU2 mining dim
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 502)  {//Jerrys Mod Dim
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -100) {//Deep Dark also
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 10) {//The Beneath
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 66) {//Erebus
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 50) {//Abysal wasteland
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 51) {//Dreadlands
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 52) {//Omothol
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 53) {//Dark Lands
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -127) {//Tropics (tropicraft)
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 17) {//Atum
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 10) {//Wildycraft (Runescape)
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 1304) {//Landia
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -3) {//Dinosaur Dimension
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
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
		if(Config.rubyModule == true) {
		generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, Config.rubyVeinSize + random.nextInt(4), Config.rubySpawnTries);
		}if(Config.amethystModule == true) {
		generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 1 + random.nextInt(4), Config.AmethystSpawnTries);
		}if(Config.brauniteModule == true) {
		generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 1 + random.nextInt(4), Config.AmethystSpawnTries);
		}}
	
	private void generateModDimensions(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(Config.rubyModule == true) {
		generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, Config.rubyVeinSize + 3 + random.nextInt(4), Config.rubySpawnTries + 3);
		}if(Config.amethystModule == true) {
		generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax + 3, 1 + random.nextInt(4), Config.AmethystSpawnTries + 2);
		}if(Config.brauniteModule == true) {
		generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 3 + random.nextInt(4), Config.AmethystSpawnTries + 3);
		}}


}