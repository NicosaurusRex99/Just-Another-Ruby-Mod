package naturix.JARM.blocks;

import naturix.JARM.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyOre extends Block {


	public RubyOre(Material materialIn) {
		super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".rubyore");
        setRegistryName("rubyore");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setHarvestLevel("pickaxe", 3);
        setHardness(4f);
		setResistance(5f);
	}
		// TODO Auto-generated constructor stub
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}