package naturix.JARM.compat.ThermalFoundation;

import cofh.core.item.tool.ItemHammerCore;
import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmethystHammer extends ItemHammerCore {

    public AmethystHammer(ToolMaterial material) {
    	super(material);
        setRegistryName("hammer_amethyst");
        setUnlocalizedName(JARM.MODID + ".hammer_amethyst");
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