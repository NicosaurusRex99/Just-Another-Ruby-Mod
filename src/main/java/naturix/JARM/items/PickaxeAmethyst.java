package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PickaxeAmethyst extends ItemPickaxe {

    public PickaxeAmethyst(ToolMaterial material) {
    	super(JARM.AmethystToolMaterial);
        setRegistryName("pickaxeamethyst");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JARM.MODID + ".pickaxeamethyst");     // Used for localization (en_US.lang)
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(5420);
        setHarvestLevel(getUnlocalizedName(), 5);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}