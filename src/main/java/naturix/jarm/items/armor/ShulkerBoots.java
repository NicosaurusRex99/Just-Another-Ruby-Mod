package naturix.jarm.items.armor;

import naturix.jarm.JARM;
import naturix.jarm.items.ItemBase;
import naturix.jarm.utils.CustomMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ShulkerBoots extends ItemArmor 
{
	public ShulkerBoots(String name)
	{
		super(CustomMaterials.ShulkerArmorMaterial, 0, EntityEquipmentSlot.FEET);
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
		return "jarm:textures/models/armor/shulkerboots.png";
	}

	private String name;
	public void registerItemModel() {
		JARM.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public int getMaxDamage()
	{
		return 1232;
	}


	@Override
	public boolean isDamageable()
	{
		return true;
	}
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
    {
     player.fallDistance = 0;
    }
}