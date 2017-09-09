package naturix.JARM.items;

import java.util.Set;

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import naturix.JARM.JARM;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SwordRuby extends ItemSword
{

	public double attackDamage;
	public SwordRuby(ToolMaterial material) {
		super(JARM.rubyToolMaterial);
		setRegistryName("swordruby");
		setUnlocalizedName(JARM.MODID + ".swordruby");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(1500);
        getItemEnchantability();
	}

	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
