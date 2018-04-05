package naturix.jarm;


import naturix.jarm.proxy.CommonProxy;
import naturix.jarm.registry.ModBlocks;
import naturix.jarm.registry.ModItems;
import naturix.jarm.registry.ModOreDict;
import naturix.jarm.registry.ModRecipes;
import naturix.jarm.utils.config.ConfigMain;
import naturix.jarm.world.ModWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@Mod(modid = JARM.MODID, name = JARM.MOD_NAME, version = JARM.VERSION, updateJSON = JARM.UPDATE_URL, useMetadata = true)
public class JARM
{ 
	public static final String MODID = "jarm";
    public static final String VERSION = "1.12.2.13";
    public static final String MOD_NAME = "Just Another Ruby Mod!";
    public static final String UPDATE_URL = "https://raw.githubusercontent.com/NicosaurusRex99/JARMGit/1.12.2/jarm_update.json";
    
    @SidedProxy(clientSide = "naturix.jarm.proxy.ClientProxy", serverSide = "naturix.jarm.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JARM instance;

    public static org.apache.logging.log4j.Logger logger;
    

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        ModOreDict.initOreDict();
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {

    }
    
    public static final CreativeTabs JARM = new CreativeTabs("JARMTab")
    {

        @Override
		@SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.block_ruby);
        }
		
    };
    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
	
	}
} 