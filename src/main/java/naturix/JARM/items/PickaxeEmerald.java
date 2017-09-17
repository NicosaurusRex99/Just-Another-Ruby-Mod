package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PickaxeEmerald extends ItemPickaxe {

    public PickaxeEmerald(ToolMaterial material) {
    	super(JARM.EmeraldToolMaterial);
        setRegistryName("pickaxeemerald");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JARM.MODID + ".pickaxeemerald");     // Used for localization (en_US.lang)
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(3420);
        setHarvestLevel(getUnlocalizedName(), 1);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}