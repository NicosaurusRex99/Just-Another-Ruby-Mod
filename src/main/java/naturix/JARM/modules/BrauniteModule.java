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
    @GameRegistry.ObjectHolder("JARM:gembraunite")
	public static GemBraunite gembraunite;
    @GameRegistry.ObjectHolder("JARM:helmet_braunite")
	public static BrauniteHelmet helmetbraunite;
    @GameRegistry.ObjectHolder("JARM:chestplate_braunite")
	public static BrauniteChestplate chestplatebraunite;
    @GameRegistry.ObjectHolder("JARM:leggings_braunite")
	public static BrauniteLeggings leggingsbraunite;
    @GameRegistry.ObjectHolder("JARM:boots_braunite")
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
