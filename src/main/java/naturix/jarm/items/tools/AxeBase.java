package naturix.jarm.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import naturix.jarm.JARM;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class AxeBase extends ItemTool{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.COCOA, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    
public String name;
public AxeBase(ToolMaterial material, String name) {
	super(11, 4, material, EFFECTIVE_ON);
    setRegistryName(name);
    setUnlocalizedName(JARM.MODID + "." + name);
    setCreativeTab(JARM.JARM);
    setMaxStackSize(1);
    setMaxDamage(8420);
    setHarvestLevel(getUnlocalizedName(), 4);
    getItemEnchantability();
    this.name = name;
}
public void registerItemModel() {
	JARM.proxy.registerItemRenderer(this, 0, name);
}
}