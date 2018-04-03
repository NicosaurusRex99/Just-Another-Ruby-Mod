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

public class Meteorite  extends Block {

	private String name;
	public Meteorite(String name, float hardness, float resistance) {
		super(Material.ROCK);
        setUnlocalizedName(JARM.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(JARM.JARM);
        setHarvestLevel("pickaxe", 4);
        setHardness(hardness);
		setResistance(resistance);
		this.name = name;
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

	public static final AxisAlignedBB BLOCK_AABB = new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.9F, 0.7F, 0.9F);
	 @Override
	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	        return BLOCK_AABB;
	    }
	public boolean canEntitySpawn(Entity entityIn)
	{
		return false;
	}
	public void registerItemModel(Item itemBlock) {
		JARM.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
} 