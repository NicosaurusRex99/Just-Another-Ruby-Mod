package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.event.RegistryEvent;


public class ShovelRuby extends ItemSpade {

	public ShovelRuby(ToolMaterial material) {
    	super(JARM.rubyToolMaterial);
        setRegistryName("shovelruby");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JARM.MODID + ".shovelruby");     // Used for localization (en_US.lang)
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(1480);
        setHarvestLevel(getUnlocalizedName(), 3);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}