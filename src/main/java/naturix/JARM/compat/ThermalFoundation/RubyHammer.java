package naturix.JARM.compat.ThermalFoundation;


import naturix.JARM.JARM;
import naturix.JARM.hidden.ItemHammerCore;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyHammer extends ItemHammerCore {

    public RubyHammer(ToolMaterial material) {
    	super(11, 4, material);
        setRegistryName("hammer_ruby");
        setUnlocalizedName(JARM.MODID + ".hammer_ruby");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(8420);
        setHarvestLevel(getUnlocalizedName(), 4);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}