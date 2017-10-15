package naturix.JARM.blocks;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyBlock extends Block {

	public boolean isRubyBeaconBase = Config.isRubyBeaconBase;
	
    public RubyBlock(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}

	public RubyBlock() {
        super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".rubyblock");
        setRegistryName("rubyblock");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setHardness(4f);
		setResistance(5f);
	}
	public RubyBlock setBeaconBase(boolean b){
		isRubyBeaconBase = b;
		return this;
	}
	
	@Override
	public boolean isBeaconBase(IBlockAccess world, BlockPos pos, BlockPos beacon){
		return isRubyBeaconBase;
	}

	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	public boolean canEntitySpawn(Entity entityIn)
	{
		return true;
	}
	
}