package naturix.JARM;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import naturix.JARM.items.GemRuby;

public class OreDictUtil {
	public static void init(){
        //Vanilla Ores
        addOre(ModItems.gemruby, "gemRuby");
	}
    private static void addOre(GemRuby gemruby, String name){
        OreDictionary.registerOre(name, gemruby);
    }
}