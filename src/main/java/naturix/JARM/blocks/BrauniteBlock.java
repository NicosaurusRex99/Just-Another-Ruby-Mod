package naturix.JARM.blocks;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BrauniteBlock extends Block {

	public boolean isBrauniteBeaconBase = Config.isRubyBeaconBase;
	
    public BrauniteBlock(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}

	public BrauniteBlock() {
        super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".brauniteblock");
        setRegistryName("brauniteblock");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setHardness(4f);
		setResistance(5f);
	}
	public BrauniteBlock setBeaconBase(boolean b){
		isBrauniteBeaconBase = b;
		return this;
	}
	
	@Override
	public boolean isBeaconBase(IBlockAccess world, BlockPos pos, BlockPos beacon){
		return isBrauniteBeaconBase;
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