package naturix.jarm.integration.baubles.rings;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import baubles.api.cap.IBaublesItemHandler;
import baubles.common.Baubles;
import baubles.common.items.ItemRing;
import naturix.jarm.JARM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmethystMeteorRing extends Item implements IBauble
{
	
	public static final Item RING = null;
	public String name;
	public AmethystMeteorRing(String name)
	{
		super();
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(JARM.JARM);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.name = name;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
		if (this.isInCreativeTab(tab)) {
			list.add(new ItemStack(this, 1, 0));
		}
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0 && player.ticksExisted%39==0) {
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE,40,0,true,true));
			player.fallDistance = 0;
		}
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}


	public static void registerItem(String name, Item item)
	{
		item.setRegistryName(name);
		item.setCreativeTab(JARM.JARM);
		item.setUnlocalizedName(name);
		//ForgeRegistries.ITEMS.register(item);	
		//JARMItemList.add(item);
		}
	public void registerItemModel() {
		JARM.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		//player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 1.9f);
		//player.setHealth(60);
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		//player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 2f);
		//player.setHealth(20);
	}
}
