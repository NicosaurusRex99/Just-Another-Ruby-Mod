package naturix.JARM.blocks;

import naturix.JARM.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyBlock extends Block {

    public RubyBlock(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}

	public RubyBlock() {
        super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".rubyblock");
        setRegistryName("rubyblock");
        setCreativeTab(JARM.JustAnotherRubyMod);
    }
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}