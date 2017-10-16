package naturix.JARM.recipestuffz;

import naturix.JARM.Config;
import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.rubyore, new ItemStack(ModItems.gemruby), 0.7f);
	}
}
