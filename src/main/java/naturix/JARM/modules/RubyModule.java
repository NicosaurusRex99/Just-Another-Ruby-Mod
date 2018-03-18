package naturix.JARM.modules;

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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyModule {
	@GameRegistry.ObjectHolder("jarm:gemruby")
    public static GemRuby gemruby;
    @GameRegistry.ObjectHolder("jarm:swordruby")
    public static SwordRuby swordruby;
    @GameRegistry.ObjectHolder("jarm:pickaxeruby")
    public static PickaxeRuby pickaxeruby;
    @GameRegistry.ObjectHolder("jarm:axeruby")
    public static AxeRuby axeruby;
    @GameRegistry.ObjectHolder("jarm:shovelruby")
    public static ShovelRuby shovelruby;
    @GameRegistry.ObjectHolder("jarm:hoeruby")
    public static HoeRuby hoeruby;
    @GameRegistry.ObjectHolder("jarm:rubyboots")
    public static RubyBoots rubyboots;
    @GameRegistry.ObjectHolder("jarm:rubyleggings")
    public static RubyLeggings rubyleggings;
    @GameRegistry.ObjectHolder("jarm:rubychestplate")
    public static RubyChestplate rubychestplate;
    @GameRegistry.ObjectHolder("jarm:rubyhelmet")
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
