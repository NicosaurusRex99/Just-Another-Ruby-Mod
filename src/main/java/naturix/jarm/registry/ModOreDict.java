package naturix.jarm.registry;

import naturix.jarm.Config;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	public static void initOreDict() {
		if(Config.amethystModule == true) {
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModBlocks.block_amethyst));
		}if(Config.brauniteModule == true) {
		OreDictionary.registerOre("gemBraunite", ModItems.gemBraunite);
		}if (Config.rubyModule == true) {
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		}
	    
	}
}