package naturix.JARM.modules;

import naturix.JARM.armor.BrauniteBoots;
import naturix.JARM.armor.BrauniteChestplate;
import naturix.JARM.armor.BrauniteHelmet;
import naturix.JARM.armor.BrauniteLeggings;
import naturix.JARM.items.GemBraunite;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BrauniteModule 
{
    @GameRegistry.ObjectHolder("jarm:gembraunite")
	public static GemBraunite gembraunite;
    @GameRegistry.ObjectHolder("jarm:helmet_braunite")
	public static BrauniteHelmet helmetbraunite;
    @GameRegistry.ObjectHolder("jarm:chestplate_braunite")
	public static BrauniteChestplate chestplatebraunite;
    @GameRegistry.ObjectHolder("jarm:leggings_braunite")
	public static BrauniteLeggings leggingsbraunite;
    @GameRegistry.ObjectHolder("jarm:boots_braunite")
	public static BrauniteBoots bootsbraunite;
    
@SideOnly(Side.CLIENT)
public static void initModels() {
    gembraunite.initModel();
    helmetbraunite.initModel();
    chestplatebraunite.initModel();
    leggingsbraunite.initModel();
    bootsbraunite.initModel();
}
	
public static void initOreDict() {
{
		OreDictionary.registerOre("gemBraunite", BrauniteModule.gembraunite);
}
	}

}
