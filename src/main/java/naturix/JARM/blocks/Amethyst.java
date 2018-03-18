package naturix.JARM.blocks;

import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Amethyst extends Block {


	public Amethyst(Material materialIn) {
		super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".amethystrock");
        setRegistryName("amethystrock");
        setCreativeTab(JARM.JustAnotherRubyMod);
        setHarvestLevel("pickaxe", 4);
        setHardness(4f);
		setResistance(5f);
		}
		
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public static final AxisAlignedBB BLOCK_AABB = new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.4F, 0.8F);
	 @Override
	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	        return BLOCK_AABB;
	    }
	public boolean canEntitySpawn(Entity entityIn)
	{
		return false;
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}