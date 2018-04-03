package naturix.jarm.items.tools.hammers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import naturix.jarm.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BrauniteHammer extends ItemHammerCore {
	public String name;
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.COCOA, Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.CONCRETE_POWDER);

	    public BrauniteHammer(ToolMaterial material, String name) {
	    	super(11, 4, material);
	        setRegistryName(name);
	        setUnlocalizedName(JARM.MODID + "." + name);
	        setCreativeTab(JARM.JARM);
	        setMaxStackSize(1);
	        setMaxDamage(8420);
	        setHarvestLevel(getUnlocalizedName(), 4);
	        getItemEnchantability();
	        this.name = name;
	    		addToolClass("pickaxe");
	    		addToolClass("hammer");

	    		setMaxDamage(toolMaterial.getMaxUses() * 2);

	    		effectiveBlocks.addAll(EFFECTIVE_ON);
	    		effectiveMaterials.add(Material.IRON);
	    		effectiveMaterials.add(Material.ANVIL);
	    		effectiveMaterials.add(Material.ROCK);
	    		effectiveMaterials.add(Material.ICE);
	    		effectiveMaterials.add(Material.PACKED_ICE);
	    		effectiveMaterials.add(Material.GLASS);
	    		effectiveMaterials.add(Material.REDSTONE_LIGHT);
	    		effectiveMaterials.add(Material.GROUND);
	    		effectiveMaterials.add(Material.CLAY);
	    		effectiveMaterials.add(Material.LEAVES);
	    		effectiveMaterials.add(Material.GRASS);
	    		effectiveMaterials.add(Material.PISTON);
	    		effectiveMaterials.add(Material.SAND);
	    		effectiveMaterials.add(Material.SNOW);
	    		effectiveMaterials.add(Material.SPONGE);
	    		effectiveMaterials.add(Material.VINE);
	    		effectiveMaterials.add(Material.WEB);
	    		effectiveMaterials.add(Material.WOOD);
	    		effectiveMaterials.add(Material.TNT);
	    		

	    		if (harvestLevel > 0) {
	    			attackDamage = 10.0F;
	    			attackSpeed = -3.5F + (0.1F * harvestLevel);
	    		} else {
	    			attackDamage = 7.0F;
	    			attackSpeed = -3.4F + (0.1F * (int) (efficiency / 5));
	    		}
	    }
	    public void registerItemModel() {
			JARM.proxy.registerItemRenderer(this, 0, name);
		}


	    	@Override
	    	public boolean onBlockStartBreak(ItemStack stack, BlockPos pos, EntityPlayer player) {

	    		World world = player.world;
	    		IBlockState state = world.getBlockState(pos);

	    		if (state.getBlockHardness(world, pos) == 0.0F) {
	    			return false;
	    		}
	    		if (!canHarvestBlock(state, stack)) {
	    			if (!player.capabilities.isCreativeMode) {
	    				stack.damageItem(1, player);
	    			}
	    			return false;
	    		}
	    		world.playEvent(2001, pos, Block.getStateId(state));

	    		float refStrength = state.getPlayerRelativeBlockHardness(player, world, pos);
	    		if (refStrength != 0.0F) {
	    			RayTraceResult traceResult = RayTracer.retrace(player, false);

	    			if (traceResult == null || traceResult.sideHit == null) {
	    				return false;
	    			}
	    			BlockPos adjPos;
	    			IBlockState adjState;
	    			float strength;
	    			int count = 0;

	    			int x = pos.getX();
	    			int y = pos.getY();
	    			int z = pos.getZ();
	    			int radius = 1;

	    			switch (traceResult.sideHit) {
	    				case DOWN:
	    				case UP:
	    					for (int i = x - radius; i <= x + radius; i++) {
	    						for (int k = z - radius; k <= z + radius; k++) {
	    							adjPos = new BlockPos(i, y, k);
	    							adjState = world.getBlockState(adjPos);
	    							strength = adjState.getPlayerRelativeBlockHardness(player, world, adjPos);
	    							if (strength > 0F && refStrength / strength <= 10F) {
	    								if (harvestBlock(world, adjPos, player)) {
	    									count++;
	    								}
	    							}
	    						}
	    					}
	    					break;
	    				case NORTH:
	    				case SOUTH:
	    					for (int i = x - radius; i <= x + radius; i++) {
	    						for (int j = y - radius; j <= y + radius; j++) {
	    							adjPos = new BlockPos(i, j, z);
	    							adjState = world.getBlockState(adjPos);
	    							strength = adjState.getPlayerRelativeBlockHardness(player, world, adjPos);
	    							if (strength > 0F && refStrength / strength <= 10F) {
	    								if (harvestBlock(world, adjPos, player)) {
	    									count++;
	    								}
	    							}
	    						}
	    					}
	    					break;
	    				case WEST:
	    				case EAST:
	    					for (int j = y - radius; j <= y + radius; j++) {
	    						for (int k = z - radius; k <= z + radius; k++) {
	    							adjPos = new BlockPos(x, j, k);
	    							adjState = world.getBlockState(adjPos);
	    							strength = adjState.getPlayerRelativeBlockHardness(player, world, adjPos);
	    							if (strength > 0F && refStrength / strength <= 10F) {
	    								if (harvestBlock(world, adjPos, player)) {
	    									count++;
	    								}
	    							}
	    						}
	    					}
	    					break;
	    			}
	    			if (count > 0 && !player.capabilities.isCreativeMode) {
	    				stack.damageItem(count, player);
	    			}
	    		}
	    		return true;
	    	}

	    	/* IAOEBreakItem */
	    	@Override
	    	public ImmutableList<BlockPos> getAOEBlocks(ItemStack stack, BlockPos pos, EntityPlayer player) {

	    		ArrayList<BlockPos> area = new ArrayList<>();
	    		World world = player.getEntityWorld();

	    		RayTraceResult traceResult = RayTracer.retrace(player, false);
	    		if (traceResult == null || traceResult.sideHit == null || !canHarvestBlock(world.getBlockState(pos), stack)) {
	    			return ImmutableList.copyOf(area);
	    		}
	    		BlockPos harvestPos;

	    		int x = pos.getX();
	    		int y = pos.getY();
	    		int z = pos.getZ();
	    		int radius = 1;

	    		switch (traceResult.sideHit) {
	    			case DOWN:
	    			case UP:
	    				for (int i = x - radius; i <= x + radius; i++) {
	    					for (int k = z - radius; k <= z + radius; k++) {
	    						if (i == x && k == z) {
	    							continue;
	    						}
	    						harvestPos = new BlockPos(i, y, k);
	    						if (canHarvestBlock(world.getBlockState(harvestPos), stack)) {
	    							area.add(harvestPos);
	    						}
	    					}
	    				}
	    				break;
	    			case NORTH:
	    			case SOUTH:
	    				for (int i = x - radius; i <= x + radius; i++) {
	    					for (int j = y - radius; j <= y + radius; j++) {
	    						if (i == x && j == y) {
	    							continue;
	    						}
	    						harvestPos = new BlockPos(i, j, z);
	    						if (canHarvestBlock(world.getBlockState(harvestPos), stack)) {
	    							area.add(harvestPos);
	    						}
	    					}
	    				}
	    				break;
	    			case WEST:
	    			case EAST:
	    				for (int j = y - radius; j <= y + radius; j++) {
	    					for (int k = z - radius; k <= z + radius; k++) {
	    						if (j == y && k == z) {
	    							continue;
	    						}
	    						harvestPos = new BlockPos(x, j, k);
	    						if (canHarvestBlock(world.getBlockState(harvestPos), stack)) {
	    							area.add(harvestPos);
	    						}
	    					}
	    				}
	    				break;
	    		}
	    		return ImmutableList.copyOf(area);
	    	}
	    	}    