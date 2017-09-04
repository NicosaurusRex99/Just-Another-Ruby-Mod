package naturix.JARM;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.apache.logging.log4j.Logger;

import naturix.JARM.items.GemRuby;
import naturix.JARM.proxy.CommonProxy;

@Mod(modid = JARM.MODID, name = JARM.MODNAME, version = JARM.MODVERSION, dependencies = "required-after:forge@[13.19.0.2129,)", useMetadata = true)
public class JARM {

    public static final String MODID = "jarm";
    public static final String MODNAME = "JARM";
    public static final String MODVERSION = "1.12.1.1";

    @SidedProxy(clientSide = "naturix.JARM.proxy.ClientProxy", serverSide = "naturix.JARM.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JARM instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    public static final CreativeTabs JustAnotherRubyMod = new CreativeTabs("JARM")
    {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.gemruby);
        }
    };
}