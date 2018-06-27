package naturix.jarm.world;

import java.util.Random;

import com.google.common.base.Predicate;

import naturix.jarm.JARM;
import naturix.jarm.registry.ModBlocks;
import naturix.jarm.utils.config.Config;
import naturix.jarm.world.tree.DwarfApple;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGeneration implements IWorldGenerator {

	public static ModWorldGeneration instance = new ModWorldGeneration();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimensionType()==DimensionType.OVERWORLD)
			genSurface(world, random, chunkX, chunkZ);
	
			if (world.provider.getDimensionType()==DimensionType.NETHER) {
			genNether(world, random, chunkX, chunkZ);
			}
	}
	 private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   int posZ = blockZPos + random.nextInt(maxZ);
		   WorldGenMinable gen = new WorldGenMinable(block, maxVeinSize, blockToSpawnIn);
		   BlockPos pos = new BlockPos(posX, posY, posZ);
		   gen.generate(world, random, pos);
		   JARM.logger.info("[minY " + minY + "] [maxY "+ maxY+ "] [diff "+diffMinMaxY +"] [world " +world.provider.getDimension()+"] [position " +pos+"] [block "+block.getBlock().getLocalizedName()+"]");
		  }
		 }
	 private void genSurface(World world, Random random, int chunkX, int chunkZ){
		 addOreSpawn(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.amberSpawnTries, Config.amberMin, Config.amberMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_braunite.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.brauniteSpawnTries, Config.brauniteMin, Config.brauniteMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_cinnibar.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_copper.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.copperSpawnTries, Config.copperMin, Config.copperMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_fossil.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 3, world.getSeaLevel()-8, world.getSeaLevel(), BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_jade.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.jadeSpawnTries, Config.jadeMin, Config.jadeMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_lead.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.leadSpawnTries, Config.leadMin, Config.leadMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_luminite.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.luminiteSpawnTries, Config.luminiteMin, Config.luminiteMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_meteorite.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 3, world.getSeaLevel()-8, world.getSeaLevel()+8, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_mythrill.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.mythrillSpawnTries, Config.mythrillMin, Config.mythrillMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_nickel.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.nickelSpawnTries, Config.nickelMin, Config.nickelMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_opal.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.opalSpawnTries, Config.opalMin, Config.opalMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_osmium.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.osmiumSpawnTries, Config.osmiumMin, Config.osmiumMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_platinum.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.platinumSpawnTries, Config.platinumMin, Config.platinumMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_ruby.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_saphire.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_silver.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_tin.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_titanium.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_tungsten.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE));
		 addOreSpawn(ModBlocks.ore_uranium.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cinnibarSpawnTries, Config.cinnibarMin, Config.cinnibarMax, BlockMatcher.forBlock(Blocks.STONE)); 
		 addOreSpawn(ModBlocks.block_amethyst.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.AmethystSpawnTries, Config.AmethystMin, Config.AmethystMax, BlockMatcher.forBlock(Blocks.STONE)); 
		 }
	 private void genNether(World world, Random random, int chunkX, int chunkZ){
		 addOreSpawn(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cobaltSpawnTries, Config.cobaltMin, Config.cobaltMax, BlockMatcher.forBlock(Blocks.NETHERRACK));
	 }
}