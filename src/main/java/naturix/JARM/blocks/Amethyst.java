package naturix.jarm.blocks;

import naturix.jarm.JARM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Amethyst  extends Block {

	public Amethyst() {
		super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + ".block_amethyst");
        setRegistryName("block_amethyst");
        setCreativeTab(JARM.JARM);
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
	public void registerItemModel(Item itemBlock) {
		JARM.proxy.registerItemRenderer(itemBlock, 0, "block_amethyst");
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
} 