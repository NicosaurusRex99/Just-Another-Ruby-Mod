package naturix.jarm.world;

import java.util.Random;

import naturix.jarm.JARM;
import naturix.jarm.registry.ModBlocks;
import naturix.jarm.utils.ConfigStringToInt;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import naturix.jarm.utils.ConfigStringToInt;

public class ModWorldGeneration implements IWorldGenerator {
	
	private static final int ConfigStringToInt = 0;
	public static ModWorldGeneration instance = new ModWorldGeneration();
	private int parsedint;
	public static IBlockState[] glazedStates = {ModBlocks.ore_amber.getDefaultState(), ModBlocks.ore_braunite.getDefaultState(), ModBlocks.ore_cinnibar.getDefaultState(), ModBlocks.ore_cobalt.getDefaultState()};

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { //overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -1) { //Nether
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
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
		if (world.provider.getDimension() == -3) {//Dimensions From Config
			generateModDimensions(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		parsedint = ConfigStringToInt;
		if (world.provider.getDimension() == parsedint ) {//Dimensions From Config
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
		if(ConfigMain.rubyModule == true) {
		generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.rubyMin, ConfigMain.rubyMax, ConfigMain.rubyVeinSize + random.nextInt(4), ConfigMain.rubySpawnTries);
		}if(ConfigMain.amethystModule == true) {
		generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.AmethystMin, ConfigMain.AmethystMax, 1 + random.nextInt(4), ConfigMain.AmethystSpawnTries);
		}if(ConfigMain.brauniteModule == true) {
		generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.AmethystMin, ConfigMain.AmethystMax, 1 + random.nextInt(4), ConfigMain.AmethystSpawnTries);
		if(ConfigMain.amberModule == true) {
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 24, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.copperModule == true) 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.fossilModule == true) {
			generateOre(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 30, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 8, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, ConfigMain.AmethystMax + 3, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 32, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 50, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 32, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 16, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 12, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.meteoriteModule == true) {
			generateOre(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, random.nextInt(2), 2);
				}
		}
	
	private void generateModDimensions(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(ConfigMain.rubyModule == true) {
		generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.rubyMin, ConfigMain.rubyMax, ConfigMain.rubyVeinSize + 3 + random.nextInt(4), ConfigMain.rubySpawnTries + 3);
		}if(ConfigMain.amethystModule == true) {
		generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.AmethystMin, ConfigMain.AmethystMax + 3, 1 + random.nextInt(4), ConfigMain.AmethystSpawnTries + 2);
		}if(ConfigMain.brauniteModule == true) {
		generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, ConfigMain.AmethystMin, ConfigMain.AmethystMax, 3 + random.nextInt(4), ConfigMain.AmethystSpawnTries + 3);
		if(ConfigMain.amberModule == true) {
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 24, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.copperModule == true) 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.fossilModule == true) {
			generateOre(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 30, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 8, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, ConfigMain.AmethystMax + 3, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 32, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 50, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 32, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 16, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 12, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(ConfigMain.meteoriteModule == true) {
			generateOre(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, 1 + random.nextInt(4), 2);
				}
		}
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre2(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 256, random.nextInt(2) + random.nextInt(4), 10, Blocks.NETHERRACK);
    }

    private void generateOre2(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block){

        int deltaY = maxY - minY;
        for(int i=0; i<chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
            generator.generate(world, random, pos);
        }
    }
}