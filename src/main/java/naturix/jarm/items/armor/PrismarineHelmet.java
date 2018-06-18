package naturix.jarm.items.armor;
import naturix.jarm.proxy.*;
import naturix.jarm.JARM;
import naturix.jarm.items.ItemBase;
import naturix.jarm.utils.CustomMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PrismarineHelmet extends ItemArmor 
{

	public PrismarineHelmet(String name)
	{
		super(CustomMaterials.PrismarineArmorMaterial, 0, EntityEquipmentSlot.HEAD);
		ItemBase.registerItem(name, this);
		this.name = name;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.RARE;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return "jarm:textures/models/armor/prismarinehelmet.png";
	}

	private String name;
	public void registerItemModel() {
		JARM.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public int getMaxDamage()
	{
		return 410;
	}


	@Override
	public boolean isDamageable()
	{
		return true;
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
    {
         if (itemStack.getItem() == this)
         {
        	 player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 2, 5));
        	 player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("water_breathing"), 2, 5));
         }
    }

} 