package naturix.JARM.armor;

import naturix.JARM.JARM;
import naturix.JARM.modules.BrauniteModule;
import naturix.JARM.modules.PrismarineModule;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PrismarineHelmet extends ItemArmor 
{

	public PrismarineHelmet()
	{
		super(JARM.PrismarineArmorMaterial, 0, EntityEquipmentSlot.HEAD);
		ItemBase.registerItem("PrismarineHelmet", this);
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
         if (itemStack.getItem() == PrismarineModule.prismarinehelmet)
         {
        	 player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 2, 5));
        	 player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("water_breathing"), 2, 5));
         }
    }
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}