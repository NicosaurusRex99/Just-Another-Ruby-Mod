package naturix.jarm.registry;

import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	public static void initOreDict() {
		if(ConfigMain.amethystModule == true) {
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModBlocks.block_amethyst));
		}if(ConfigMain.brauniteModule == true) {
		OreDictionary.registerOre("gemBraunite", ModItems.gemBraunite);
		}if (ConfigMain.rubyModule == true) {
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		}
	    
	}
}