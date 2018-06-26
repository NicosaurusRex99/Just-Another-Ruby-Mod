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
	}
	
	private void generateOre2(IBlockState object, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(object, size);
			generator.generate(world, random, pos);
		}
	}
	public void generateOre(IBlockState block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn)
    {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, BlockMatcher.forBlock(generateIn));
        for (int i = 0; i < chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(xRand, yRand, zRand));
            //LogHelper.info(block.getUnlocalizedName() + " at " + xRand + " " + yRand + " " + zRand);
        }
    }

	private void generateOverworld(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
			if(Config.rubyModule == true) {
			generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, 5, Config.rubySpawnTries, chunkY, Blocks.STONE);
			}	
			if(Config.amethystModule == true) {
			generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 3, Config.AmethystSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.amberModule == true) 	{
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.amberMin, Config.amberMax, 2, Config.amberSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.cinnibarMin, Config.cinnibarMax, 2, Config.cinnibarSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.copperModule == true) { 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16,  1 + Config.copperMax, Config.copperMin, 5, Config.copperSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.fossilModule == true) {
			generateOre2(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + 4, 2);
				}
			if(Config.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.jadeMin, Config.jadeMax, 2, Config.jadeSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.leadMin, Config.leadMax, 3, Config.leadSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.luminiteMin, Config.luminiteMax, 2, Config.luminiteSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.mythrillMin, Config.mythrillMax, 2, Config.mythrillSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.nickelMin, Config.nickelMax, 4, Config.nickelSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.opalMin, Config.opalMax, 7, Config.opalSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.osmiumMin, Config.osmiumMax, 5, Config.osmiumSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.platinumMin, Config.platinumMax, 2, Config.platinumSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.saphireMin, Config.saphireMax, 3, Config.saphireSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.silverMin, Config.silverMax, 2, Config.silverSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.tinMin, Config.tinMax, 6, Config.tinSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.titaniumMin, Config.titaniumMax, 2, Config.titaniumSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.tungstenMin, Config.tungstenMax, 3, Config.tungstenSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.uraniumMin, Config.uraniumMax, 2, Config.uraniumSpawnTries, chunkY, Blocks.STONE);
				}
			if(Config.meteoriteModule == true) {
			generateOre2(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, 2, 2);
				}
			if(Config.woodModule == true) {
				new DwarfApple();
			}
			if(Config.brauniteModule == true) {
				generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.brauniteMin, Config.brauniteMax, 2, Config.brauniteSpawnTries, chunkY, Blocks.STONE);
					}	
			}
	
	private void generateModDimensions(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
			if(Config.rubyModule == true) {
			generateOre(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.rubyMin, Config.rubyMax, 3 + 4, Config.rubySpawnTries, chunkY + 3, Blocks.STONE);
			}
			if(Config.amethystModule == true) {
			generateOre(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax + 3, 1 + 4, Config.AmethystSpawnTries, chunkY + 2, Blocks.STONE);
			}
			if(Config.brauniteModule == true) {
			generateOre(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.AmethystMin, Config.AmethystMax, 3 + 4, Config.AmethystSpawnTries, chunkY + 3, Blocks.STONE);
		
			if(Config.amberModule == true) {
			generateOre(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.cinnibarModule == true) {
			generateOre(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 24, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.copperModule == true) 
			generateOre(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 63, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.fossilModule == true) {
			generateOre2(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 6, world.provider.getActualHeight(), 1 + 4, 2);
				}
			if(Config.jadeModule == true) {
			generateOre(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 30, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.leadModule == true) {
			generateOre(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.luminiteModule == true) {
			generateOre(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 8, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.mythrillModule == true) {
			generateOre(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 1 + Config.AmethystMax + 3, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.nickelModule == true) {
			generateOre(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.opalModule == true) {
			generateOre(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 32, 48, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.osmiumModule == true) {
			generateOre(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 50, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.platinumModule == true) {
			generateOre(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.saphireModule == true) {
			generateOre(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 32, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.silverModule == true) {
			generateOre(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 16, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.tinModule == true) {
			generateOre(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.titaniumModule == true) {
			generateOre(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 18, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.tungstenModule == true) {	
			generateOre(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 12, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.uraniumModule == true) {
			generateOre(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX * 16, chunkY * 16, 1, 48, 1 + 4, 2, chunkY, Blocks.STONE);
				}
			if(Config.meteoriteModule == true) {
			generateOre2(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX * 16, chunkY * 16, world.getSeaLevel() - 8, world.getSeaLevel() + 8, 1 + 4, 2);
				}
		}
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 256, random.nextInt(2) + random.nextInt(4), 10, chunkZ, Blocks.NETHERRACK);
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