package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AxeAmethyst extends ItemAxe {

    public AxeAmethyst(ToolMaterial material) {
    	super(material.IRON);
        setRegistryName("axeamethyst");
        setUnlocalizedName(JARM.MODID + ".axeamethyst");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(3420);
        setHarvestLevel(getUnlocalizedName(), 4);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
