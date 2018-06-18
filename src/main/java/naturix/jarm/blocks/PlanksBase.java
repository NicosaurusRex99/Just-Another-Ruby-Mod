package naturix.jarm.blocks;

import naturix.jarm.proxy.*;
import naturix.jarm.JARM;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PlanksBase extends BlockPlanks {

	protected String name;

	public PlanksBase(String name, int level) {
		super();
		this.name = name;
		setCreativeTab(JARM.JARM);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", level);
        setHardness(4f);
		setResistance(5f);
	}
	public PlanksBase(String name) {
		super();
		this.name = name;
		setCreativeTab(JARM.JARM);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("axe", 0);
        setHardness(4f);
		setResistance(5f);
		}
	@SideOnly(Side.CLIENT)
	public void registerItemModel(Item itemBlock) {
		JARM.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (PlanksBase.EnumType blockplanks$enumtype : PlanksBase.EnumType.values())
        {
            items.add(new ItemStack(this, 1, blockplanks$enumtype.getMetadata()));
        }
    }
	public static enum EnumType implements IStringSerializable
    {
        Dwarf(0, "Dwarf", MapColor.WOOD);
        
        private static final PlanksBase.EnumType[] META_LOOKUP = new PlanksBase.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;
        /** The color that represents this entry on a map. */
        private final MapColor mapColor;

        private EnumType(int metaIn, String nameIn, MapColor mapColorIn)
        {
            this(metaIn, nameIn, nameIn, mapColorIn);
        }

        private EnumType(int metaIn, String nameIn, String unlocalizedNameIn, MapColor mapColorIn)
        {
            this.meta = metaIn;
            this.name = nameIn;
            this.unlocalizedName = unlocalizedNameIn;
            this.mapColor = mapColorIn;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        /**
         * The color which represents this entry on a map.
         */
        public MapColor getMapColor()
        {
            return this.mapColor;
        }

        public String toString()
        {
            return this.name;
        }

        public static EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.name;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }

        static
        {
            for (EnumType blockplanks$enumtype : values())
            {
                META_LOOKUP[blockplanks$enumtype.getMetadata()] = blockplanks$enumtype;
            }
        }
    }
}