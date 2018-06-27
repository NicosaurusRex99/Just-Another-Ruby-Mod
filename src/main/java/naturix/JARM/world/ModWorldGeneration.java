package naturix.jarm.world;

import java.util.Random;

import naturix.jarm.JARM;
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
	
	public static ModWorldGeneration instance = new ModWorldGeneration();

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { //overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -1) { //Nether
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -11325) {//Deep Dark
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 7) {//Twilight Forest
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 20) {//BOP promised land
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 6) {//Aromas Mining Dimension
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -9999) {//XU2 mining dim
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 502)  {//Jerrys Mod Dim
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -100) {//Deep Dark also
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 10) {//The Beneath
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 66) {//Erebus
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 50) {//Abysal wasteland
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 51) {//Dreadlands
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 52) {//Omothol
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 53) {//Dark Lands
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -127) {//Tropics (tropicraft)
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 17) {//Atum
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 10) {//Wildycraft (Runescape)
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == 1304) {//Landia
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -3) {//Dinosaur Dimension
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
	}
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int maxY, int minY, int size, int chances) {
		int difference = maxY - minY;
		JARM.logger.info(difference + " difference");
		int negDifference = difference* -1;
		int deltaY = Math.max(negDifference, 1);
		JARM.logger.info(deltaY + " deltaY");
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			JARM.logger.info(ore.getBlock().getLocalizedName() + " spawned at " + pos + " in a size of " + size);
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(Config.rubyModule) {
			generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.rubyMin, Config.rubyMax, 5, Config.rubySpawnTries);
			}	
			if(Config.amethystModule) {
			generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.AmethystMin, Config.AmethystMax, 3, Config.AmethystSpawnTries);
				}
			if(Config.amberModule) 	{
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.amberMin, Config.amberMax, 2, Config.amberSpawnTries);
				}
			if(Config.cinnibarModule) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.cinnibarMin, Config.cinnibarMax, 2, Config.cinnibarSpawnTries);
				}
			if(Config.copperModule) { 
				generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.copperMin, Config.copperMax, random.nextInt(4), Config.copperSpawnTries);
				}
			if(Config.fossilModule) {
			generateOre(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + 4, 2);
				}
			if(Config.jadeModule) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.jadeMin, Config.jadeMax, 2, Config.jadeSpawnTries);
				}
			if(Config.leadModule) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.leadMin, Config.leadMax, 3, Config.leadSpawnTries);
				}
			if(Config.luminiteModule) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.luminiteMin, Config.luminiteMax, 2, Config.luminiteSpawnTries);
				}
			if(Config.mythrillModule) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.mythrillMin, Config.mythrillMax, 2, Config.mythrillSpawnTries);
				}
			if(Config.nickelModule) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.nickelMin, Config.nickelMax, 4, Config.nickelSpawnTries);
				}
			if(Config.opalModule) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.opalMin, Config.opalMax, 7, Config.opalSpawnTries);
				}
			if(Config.osmiumModule) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.osmiumMin, Config.osmiumMax, 5, Config.osmiumSpawnTries);
				}
			if(Config.platinumModule) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.platinumMin, Config.platinumMax, 2, Config.platinumSpawnTries);
				}
			if(Config.saphireModule) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.saphireMin, Config.saphireMax, 3, Config.saphireSpawnTries);
				}
			if(Config.silverModule) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.silverMin, Config.silverMax, 2, Config.silverSpawnTries);
				}
			if(Config.tinModule) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.tinMin, Config.tinMax, 6, Config.tinSpawnTries);
				}
			if(Config.titaniumModule) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.titaniumMin, Config.titaniumMax, 2, Config.titaniumSpawnTries);
				}
			if(Config.tungstenModule) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.tungstenMin, Config.tungstenMax, 3, Config.tungstenSpawnTries);
				}
			if(Config.uraniumModule) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.uraniumMin, Config.uraniumMax, 2, Config.uraniumSpawnTries);
				}
			if(Config.meteoriteModule) {
			generateOre(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, 2, 2);
				}
			if(Config.woodModule) {
				new DwarfApple();
			}
			if(Config.brauniteModule) {
				generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Config.brauniteMin, Config.brauniteMax, 2, Config.brauniteSpawnTries);
					}	
			}
	private void generateNetherOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block) {
		int deltaY = maxY - minY;
		if (deltaY > world.getHeight()) {
			deltaY = world.getHeight() - random.nextInt(50);
		}
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			JARM.logger.info(ore.getBlock().getLocalizedName() + " spawned at " + pos + " in a size of " + size);
			JARM.logger.info(deltaY + " DeltaY");
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateNetherOre(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, random.nextInt(2), 10, Blocks.NETHERRACK);
    }

}