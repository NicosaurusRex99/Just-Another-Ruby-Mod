package naturix.JARM.items;

import naturix.JARM.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SwordLapis  extends ItemSword
{

	public double attackDamage;
	public SwordLapis(ToolMaterial material) {
		super(JARM.LapisToolMaterial);
		setRegistryName("swordlapis");
		setUnlocalizedName(JARM.MODID + ".swordlapis");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setMaxStackSize(1);
        setMaxDamage(230);
        getItemEnchantability();
	}

	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
