package naturix.jarm.items.tools.hammers;

import java.util.Collections;
import java.util.Set;

import javax.annotation.Nullable;

import gnu.trove.set.hash.THashSet;
import gnu.trove.set.hash.TLinkedHashSet;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public abstract class ItemHammerCore extends ItemTool implements IAOEBreakItem  {

	protected final TLinkedHashSet<String> toolClasses = new TLinkedHashSet<>();
	protected final Set<String> immutableClasses = Collections.unmodifiableSet(toolClasses);

	protected String repairIngot = "";
	protected THashSet<Block> effectiveBlocks = new THashSet<>();
	protected THashSet<Material> effectiveMaterials = new THashSet<>();

	protected int harvestLevel = -1;

	protected boolean showInCreative = true;

	public ItemHammerCore(float baseDamage, float attackSpeed, ToolMaterial toolMaterial) {

		super(baseDamage, attackSpeed, toolMaterial, null);
		harvestLevel = toolMaterial.getHarvestLevel();
	}

	public ItemHammerCore setHarvestLevel(int harvestLevel) {

		this.harvestLevel = harvestLevel;
		return this;
	}

	public ItemHammerCore setRepairIngot(String repairIngot) {

		this.repairIngot = repairIngot;
		return this;
	}

	public ItemHammerCore setShowInCreative(boolean showInCreative) {

		this.showInCreative = showInCreative;
		return this;
	}

	protected ItemHammerCore addToolClass(String string) {

		toolClasses.add(string);
		return this;
	}

	protected boolean harvestBlock(World world, BlockPos pos, EntityPlayer player) {

		if (world.isAirBlock(pos)) {
			return false;
		}
		EntityPlayerMP playerMP = null;
		if (player instanceof EntityPlayerMP) {
			playerMP = (EntityPlayerMP) player;
		}
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();

		// only effective materials
		if (!(toolClasses.contains(state.getBlock().getHarvestTool(state)) || canHarvestBlock(state, player.getHeldItemMainhand()))) {
			return false;
		}
		if (!ForgeHooks.canHarvestBlock(block, player, world, pos)) {
			return false;
		}
		// send the blockbreak event
		int xpToDrop = 0;
		if (playerMP != null) {
			xpToDrop = ForgeHooks.onBlockBreakEvent(world, playerMP.interactionManager.getGameType(), playerMP, pos);
			if (xpToDrop == -1) {
				return false;
			}
		}
		if (!world.isRemote) {
			if (block.removedByPlayer(state, world, pos, player, !player.capabilities.isCreativeMode)) {
				block.onBlockDestroyedByPlayer(world, pos, state);

				if (!player.capabilities.isCreativeMode) {
					block.harvestBlock(world, player, pos, state, world.getTileEntity(pos), player.getHeldItemMainhand());
					if (xpToDrop > 0) {
						block.dropXpOnBlockBreak(world, pos, xpToDrop);
					}
				}
			}
			// always send block update to client
			playerMP.connection.sendPacket(new SPacketBlockChange(world, pos));
		} else {
			if (block.removedByPlayer(state, world, pos, player, !player.capabilities.isCreativeMode)) {
				block.onBlockDestroyedByPlayer(world, pos, state);
			}
			Minecraft.getMinecraft().getConnection().sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, pos, Minecraft.getMinecraft().objectMouseOver.sideHit));
		}
		return true;
	}

	protected float getEfficiency(ItemStack stack) {

		return efficiency;
	}

	protected THashSet<Block> getEffectiveBlocks(ItemStack stack) {

		return effectiveBlocks;
	}

	protected THashSet<Material> getEffectiveMaterials(ItemStack stack) {

		return effectiveMaterials;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {

		if (isInCreativeTab(tab) && showInCreative) {
			items.add(new ItemStack(this, 1, 0));
		}
	}

	@Override
	public boolean canHarvestBlock(IBlockState state, ItemStack stack) {

		return harvestLevel >= state.getBlock().getHarvestLevel(state) && getDestroySpeed(stack, state) > 1.0F;
	}


	@Override
	public boolean isEnchantable(ItemStack stack) {

		return true;
	}

	@Override
	public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {

		if (!getToolClasses(stack).contains(toolClass)) {
			return -1;
		}
		return harvestLevel != -1 ? harvestLevel : toolMaterial.getHarvestLevel();
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {

		return (getEffectiveMaterials(stack).contains(state.getMaterial()) || getEffectiveBlocks(stack).contains(state)) ? getEfficiency(stack) : 1.0F;
	}

	@Override
	public String getToolMaterialName() {

		return super.getToolMaterialName().contains(":") ? super.getToolMaterialName().split(":", 2)[1] : super.getToolMaterialName();
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {

		return toolClasses.isEmpty() ? super.getToolClasses(stack) : immutableClasses;
	}

}