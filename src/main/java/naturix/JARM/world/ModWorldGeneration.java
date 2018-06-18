package naturix.jarm.world;

import java.util.Random;

import naturix.jarm.registry.ModBlocks;
import naturix.jarm.utils.config.Config;
import naturix.jarm.world.tree.DwarfApple;
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
			if(Config.rubyModule == true) {
			generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, random.nextInt(Config.rubyVeinSize), Config.rubySpawnTries);
				}	
			if(Config.amethystModule == true) {
			generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, random.nextInt(Config.AmethystVeinSize), Config.AmethystSpawnTries);
				}
			if(Config.brauniteModule == true) {
			generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.brauniteMin, Config.brauniteMax, random.nextInt(Config.brauniteVeinSize), Config.brauniteSpawnTries);
				}	
			if(Config.amberModule == true) 	{
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.amberMin, Config.amberMax, random.nextInt(Config.amberVeinSize), Config.amberSpawnTries);
				}
			if(Config.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.cinnibarMin, Config.cinnibarMax, random.nextInt(Config.cinnibarVeinSize), Config.cinnibarSpawnTries);
				}
			if(Config.copperModule == true) { 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.copperMin, Config.copperMax, random.nextInt(Config.copperVeinSize), Config.copperSpawnTries);
				}
			if(Config.fossilModule == true) {
			generateOre(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + random.nextInt(4), 2);
				}
			if(Config.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.jadeMin, Config.jadeMax, random.nextInt(Config.jadeVeinSize), Config.jadeSpawnTries);
				}
			if(Config.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.leadMin, Config.leadMax, random.nextInt(Config.leadVeinSize), Config.leadSpawnTries);
				}
			if(Config.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.luminiteMin, Config.luminiteMax, random.nextInt(Config.luminiteVeinSize), Config.luminiteSpawnTries);
				}
			if(Config.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.mythrillMin, Config.mythrillMax, random.nextInt(Config.mythrillVeinSize), Config.mythrillSpawnTries);
				}
			if(Config.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.nickelMin, Config.nickelMax, random.nextInt(Config.nickelVeinSize), Config.nickelSpawnTries);
				}
			if(Config.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.opalMin, Config.opalMax, random.nextInt(Config.opalVeinSize), Config.opalSpawnTries);
				}
			if(Config.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.osmiumMin, Config.osmiumMax, random.nextInt(Config.osmiumVeinSize), Config.osmiumSpawnTries);
				}
			if(Config.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.platinumMin, Config.platinumMax, random.nextInt(Config.platinumVeinSize), Config.platinumSpawnTries);
				}
			if(Config.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.saphireMin, Config.saphireMax, random.nextInt(Config.saphireVeinSize), Config.saphireSpawnTries);
				}
			if(Config.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.silverMin, Config.silverMax, random.nextInt(Config.silverVeinSize), Config.silverSpawnTries);
				}
			if(Config.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.tinMin, Config.tinMax, random.nextInt(Config.tinVeinSize), Config.tinSpawnTries);
				}
			if(Config.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.titaniumMin, Config.titaniumMax, random.nextInt(Config.titaniumVeinSize), Config.titaniumSpawnTries);
				}
			if(Config.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.brauniteMin, Config.tungstenMax, random.nextInt(Config.brauniteVeinSize), Config.tungstenSpawnTries);
				}
			if(Config.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.uraniumMin, Config.uraniumMax, random.nextInt(Config.uraniumVeinSize), Config.uraniumSpawnTries);
				}
			if(Config.meteoriteModule == true) {
			generateOre(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, random.nextInt(2), 2);
				}
			if(Config.woodModule == true) {
				new DwarfApple();
			}
		}
	
	private void generateModDimensions(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(Config.rubyModule == true) {
		generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, Config.rubyVeinSize + 3 + random.nextInt(4), Config.rubySpawnTries + 3);
		}if(Config.amethystModule == true) {
		generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax + 3, 1 + random.nextInt(4), Config.AmethystSpawnTries + 2);
		}if(Config.brauniteModule == true) {
		generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 3 + random.nextInt(4), Config.AmethystSpawnTries + 3);
		if(Config.amberModule == true) {
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(Config.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 24, 1 + random.nextInt(4), 2);
				}
			if(Config.copperModule == true) 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + random.nextInt(4), 2);
				}
			if(Config.fossilModule == true) {
			generateOre(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + random.nextInt(4), 2);
				}
			if(Config.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 30, 1 + random.nextInt(4), 2);
				}
			if(Config.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(Config.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 8, 1 + random.nextInt(4), 2);
				}
			if(Config.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, Config.AmethystMax + 3, 1 + random.nextInt(4), 2);
				}
			if(Config.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(Config.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 32, 48, 1 + random.nextInt(4), 2);
				}
			if(Config.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 50, 1 + random.nextInt(4), 2);
				}
			if(Config.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(Config.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 32, 1 + random.nextInt(4), 2);
				}
			if(Config.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 16, 1 + random.nextInt(4), 2);
				}
			if(Config.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(Config.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + random.nextInt(4), 2);
				}
			if(Config.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 12, 1 + random.nextInt(4), 2);
				}
			if(Config.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + random.nextInt(4), 2);
				}
			if(Config.meteoriteModule == true) {
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