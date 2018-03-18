package naturix.JARM.compat.ThermalFoundation;

import naturix.JARM.JARM;
import naturix.JARM.hidden.ItemHammerCore;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmethystHammer extends ItemHammerCore {

    public AmethystHammer(ToolMaterial material) {
    	super(12, 4, material);
        setRegistryName("hammer_amethyst");
        setUnlocalizedName(JARM.MODID + ".hammer_amethyst");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(13420);
        setHarvestLevel(getUnlocalizedName(), 4);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}