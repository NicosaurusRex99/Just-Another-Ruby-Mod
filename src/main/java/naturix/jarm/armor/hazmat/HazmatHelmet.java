package naturix.jarm.armor.hazmat;

import naturix.jarm.JARM;
import naturix.jarm.items.ItemBase;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HazmatHelmet extends ItemArmor 
	{
	
		public HazmatHelmet(String name, ArmorMaterial material)
		{
			super(material, 0, EntityEquipmentSlot.HEAD);
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
			return "jarm:textures/models/armor/"+ name + ".png";
		}
	
		private String name;
		public void registerItemModel() {
			JARM.proxy.registerItemRenderer(this, 0, name);
		}
		@Override
		public int getMaxDamage()
		{
			return 2010;
		}
	
	
		@Override
		public boolean isDamageable()
		{
			return true;
		}
}
