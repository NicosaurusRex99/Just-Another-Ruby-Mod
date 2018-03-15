package naturix.JARM.modules;

import naturix.JARM.armor.AmethystBoots;
import naturix.JARM.armor.AmethystChestplate;
import naturix.JARM.armor.AmethystHelmet;
import naturix.JARM.armor.AmethystLeggings;
import naturix.JARM.armor.EmeraldBoots;
import naturix.JARM.armor.EmeraldChestplate;
import naturix.JARM.armor.EmeraldHelmet;
import naturix.JARM.armor.EmeraldLeggings;
import naturix.JARM.armor.LapisBoots;
import naturix.JARM.armor.LapisChestplate;
import naturix.JARM.armor.LapisHelmet;
import naturix.JARM.armor.LapisLeggings;
import naturix.JARM.armor.PrismarineHelmet;
import naturix.JARM.armor.RubyBoots;
import naturix.JARM.armor.RubyChestplate;
import naturix.JARM.armor.RubyHelmet;
import naturix.JARM.armor.RubyLeggings;
import naturix.JARM.armor.ShulkerBoots;
import naturix.JARM.armor.ShulkerChestplate;
import naturix.JARM.armor.ShulkerHelmet;
import naturix.JARM.armor.ShulkerLeggings;
import naturix.JARM.items.AxeAmethyst;
import naturix.JARM.items.AxeEmerald;
import naturix.JARM.items.AxeLapis;
import naturix.JARM.items.AxeRuby;
import naturix.JARM.items.GemBraunite;
import naturix.JARM.items.GemRuby;
import naturix.JARM.items.HoeAmethyst;
import naturix.JARM.items.HoeEmerald;
import naturix.JARM.items.HoeLapis;
import naturix.JARM.items.HoeRuby;
import naturix.JARM.items.PickaxeAmethyst;
import naturix.JARM.items.PickaxeEmerald;
import naturix.JARM.items.PickaxeLapis;
import naturix.JARM.items.PickaxeRuby;
import naturix.JARM.items.ShovelAmethyst;
import naturix.JARM.items.ShovelEmerald;
import naturix.JARM.items.ShovelLapis;
import naturix.JARM.items.ShovelRuby;
import naturix.JARM.items.SwordAmethyst;
import naturix.JARM.items.SwordEmerald;
import naturix.JARM.items.SwordLapis;
import naturix.JARM.items.SwordRuby;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BrauniteModule 
{
    @GameRegistry.ObjectHolder("JARM:gembraunite")
	public static GemBraunite gembraunite;
    
@SideOnly(Side.CLIENT)
public static void initModels() {
    gembraunite.initModel();
}
	
public static void initOreDict() {
{
		OreDictionary.registerOre("gemBraunite", BrauniteModule.gembraunite);
}
	}

}
