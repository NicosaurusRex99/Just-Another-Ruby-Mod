package naturix.JARM;

import naturix.JARM.armor.RubyBoots;
import naturix.JARM.armor.RubyChestplate;
import naturix.JARM.armor.RubyHelmet;
import naturix.JARM.armor.RubyLeggings;
import naturix.JARM.items.AxeRuby;
import naturix.JARM.items.GemRuby;
import naturix.JARM.items.HoeRuby;
import naturix.JARM.items.PickaxeRuby;
import naturix.JARM.items.ShovelRuby;
import naturix.JARM.items.SwordRuby;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
}

}
