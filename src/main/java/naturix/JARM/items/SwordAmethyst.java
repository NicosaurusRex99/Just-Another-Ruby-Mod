package naturix.JARM.items;
import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SwordAmethyst extends ItemSword {

    public SwordAmethyst(ToolMaterial material) {
    	super(JARM.AmethystToolMaterial);
        setRegistryName("swordamethyst");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JARM.MODID + ".swordamethyst");     // Used for localization (en_US.lang)
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(10230);
        setHarvestLevel(getUnlocalizedName(), 2);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}