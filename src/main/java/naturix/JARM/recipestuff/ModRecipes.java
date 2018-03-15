package naturix.JARM.recipestuff;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import naturix.JARM.modules.BrauniteModule;
import naturix.JARM.modules.RubyModule;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.rubyore, new ItemStack(RubyModule.gemruby), 0.7f);
		GameRegistry.addSmelting(ModBlocks.brauniteore, new ItemStack(BrauniteModule.gembraunite), 0.7f);
		if (Config.debug == true ) {
			JARM.logger.info("furnace recipes loaded");
			}
	}
}
