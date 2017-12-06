package naturix.JARM;

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
import naturix.JARM.items.AxeAmethyst;
import naturix.JARM.items.AxeEmerald;
import naturix.JARM.items.AxeLapis;
import naturix.JARM.items.AxeRuby;
import naturix.JARM.items.GemRuby;
import naturix.JARM.items.HoeAmethyst;
import naturix.JARM.items.HoeEmerald;
import naturix.JARM.items.HoeLapis;
import naturix.JARM.items.HoeRuby;
import naturix.JARM.items.PickaxeAmethyst;
import naturix.JARM.items.PickaxeEmerald;
import naturix.JARM.items.PickaxeLapis;
import naturix.JARM.items.PickaxeRuby;
import naturix.JARM.items.RFSword;
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



public class ModItems 
{

    @GameRegistry.ObjectHolder("JARM:gemruby")
    public static GemRuby gemruby;
    @GameRegistry.ObjectHolder("JARM:swordruby")
    public static SwordRuby swordruby;
    @GameRegistry.ObjectHolder("JARM:pickaxeruby")
    public static PickaxeRuby pickaxeruby;
    @GameRegistry.ObjectHolder("JARM:axeruby")
    public static AxeRuby axeruby;
    @GameRegistry.ObjectHolder("JARM:shovelruby")
    public static ShovelRuby shovelruby;
    @GameRegistry.ObjectHolder("JARM:hoeruby")
    public static HoeRuby hoeruby;
    @GameRegistry.ObjectHolder("JARM:rubyboots")
    public static RubyBoots rubyboots;
    @GameRegistry.ObjectHolder("JARM:rubyleggings")
    public static RubyLeggings rubyleggings;
    @GameRegistry.ObjectHolder("JARM:rubychestplate")
    public static RubyChestplate rubychestplate;
    @GameRegistry.ObjectHolder("JARM:rubyhelmet")
    public static RubyHelmet rubyhelmet;
    @GameRegistry.ObjectHolder("JARM:prismarinehelmet")
    public static PrismarineHelmet prismarinehelmet;
    @GameRegistry.ObjectHolder("JARM:lapisboots")
    public static LapisBoots lapisboots;
    @GameRegistry.ObjectHolder("JARM:lapisleggings")
    public static LapisLeggings lapisleggings;
    @GameRegistry.ObjectHolder("JARM:lapischestplate")
    public static LapisChestplate lapischestplate;
    @GameRegistry.ObjectHolder("JARM:lapishelmet")
    public static LapisHelmet lapishelmet;
    @GameRegistry.ObjectHolder("JARM:axelapis")
    public static AxeLapis axelapis;
    @GameRegistry.ObjectHolder("JARM:swordlapis")
    public static SwordLapis swordlapis;
    @GameRegistry.ObjectHolder("JARM:hoelapis")
    public static HoeLapis hoelapis;
    @GameRegistry.ObjectHolder("JARM:pickaxelapis")
    public static PickaxeLapis pickaxelapis;
    @GameRegistry.ObjectHolder("JARM:shovellapis")
    public static ShovelLapis shovellapis;
    @GameRegistry.ObjectHolder("JARM:emeraldboots")
    public static EmeraldBoots emeraldboots;
    @GameRegistry.ObjectHolder("JARM:emeraldleggings")
    public static EmeraldLeggings emeraldleggings;
    @GameRegistry.ObjectHolder("JARM:emeraldchestplate")
    public static EmeraldChestplate emeraldchestplate;
    @GameRegistry.ObjectHolder("JARM:emeraldhelmet")
    public static EmeraldHelmet emeraldhelmet;
    @GameRegistry.ObjectHolder("JARM:axeemerald")
    public static AxeEmerald emeraldaxe;
    @GameRegistry.ObjectHolder("JARM:hoeemerald")
    public static HoeEmerald emeraldhoe;
    @GameRegistry.ObjectHolder("JARM:pickaxeemerald")
    public static PickaxeEmerald emeraldpickaxe;
    @GameRegistry.ObjectHolder("JARM:shovelemerald")
    public static ShovelEmerald emeraldshovel;
    @GameRegistry.ObjectHolder("JARM:swordemerald")
    public static SwordEmerald emeraldsword;
    @GameRegistry.ObjectHolder("JARM:amethysthelmet")
    public static AmethystHelmet amethysthelmet;
    @GameRegistry.ObjectHolder("JARM:amethystchestplate")
    public static AmethystChestplate amethystchestplate;
    @GameRegistry.ObjectHolder("JARM:amethystleggings")
    public static AmethystLeggings amethystleggings;
    @GameRegistry.ObjectHolder("JARM:amethystboots")
    public static AmethystBoots amethystboots;
    @GameRegistry.ObjectHolder("JARM:axeamethyst")
    public static AxeAmethyst axeamethyst;
    @GameRegistry.ObjectHolder("JARM:hoeamethyst")
    public static HoeAmethyst hoeamethyst;
    @GameRegistry.ObjectHolder("JARM:pickaxeamethyst")
    public static PickaxeAmethyst pickaxeamethyst;
    @GameRegistry.ObjectHolder("JARM:swordamethyst")
    public static SwordAmethyst swordamethyst;
    @GameRegistry.ObjectHolder("JARM:shovelamethyst")
    public static ShovelAmethyst shovelamethyst;
    @GameRegistry.ObjectHolder("JARM:rfsword")
    public static RFSword rfsword;
    
@SideOnly(Side.CLIENT)
public static void initModels() {
    gemruby.initModel();
    swordruby.initModel();
    pickaxeruby.initModel();
    axeruby.initModel();
    shovelruby.initModel();
    hoeruby.initModel();
    rubyboots.initModel();
    rubyleggings.initModel();
    rubychestplate.initModel();
    rubyhelmet.initModel();
    prismarinehelmet.initModel();
    lapisboots.initModel();
    lapisleggings.initModel();
    lapischestplate.initModel();
    lapishelmet.initModel();
    axelapis.initModel();
    swordlapis.initModel();
    pickaxeamethyst.initModel();
    hoelapis.initModel();
    pickaxelapis.initModel();
    shovellapis.initModel();
    emeraldboots.initModel();
    emeraldleggings.initModel();
    emeraldchestplate.initModel();
    emeraldhelmet.initModel();
    emeraldaxe.initModel();
    emeraldhoe.initModel();
    emeraldpickaxe.initModel();
    emeraldshovel.initModel();
    emeraldsword.initModel();
    amethystleggings.initModel();
    amethystchestplate.initModel();
    amethysthelmet.initModel();
    amethystboots.initModel();
    axeamethyst.initModel();
    hoeamethyst.initModel();
    swordamethyst.initModel();
    shovelamethyst.initModel();
    rfsword.initModel(); 
}
	
	public static void initOreDict() {
{
		OreDictionary.registerOre("gemRuby", ModItems.gemruby);
		OreDictionary.registerOre("gemAmethyst", ModBlocks.amethystrock);
}
	}
}
