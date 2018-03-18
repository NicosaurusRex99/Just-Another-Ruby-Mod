package naturix.JARM;

import naturix.JARM.modules.BrauniteModule;
import naturix.JARM.modules.RubyModule;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	public static void initOreDict() {
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModBlocks.amethystrock));
		OreDictionary.registerOre("gemRuby", RubyModule.gemruby);
        OreDictionary.registerOre("gemBraunite", BrauniteModule.gembraunite);
	    
	}
}
