package naturix.jarm;


import org.lwjgl.opengl.GL11;

import naturix.jarm.proxy.CommonProxy;
import naturix.jarm.registry.ModBlocks;
import naturix.jarm.registry.ModItems;
import naturix.jarm.registry.ModOreDict;
import naturix.jarm.registry.ModRecipes;
import naturix.jarm.utils.uuid.LibRegistry;
import naturix.jarm.utils.uuid.ModelHat;
import naturix.jarm.utils.uuid.UUIDGrabber;
import naturix.jarm.world.ModWorldGeneration;
import naturix.jarm.world.tree.TreeWorldGen;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
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
    public static final String VERSION = "1.12.2.15";
    public static final String MOD_NAME = "Just Another Ruby Mod!";
    public static final String UPDATE_URL = "https://raw.githubusercontent.com/NicosaurusRex99/JARMGit/1.12.2/jarm_update.json";
    
    @SidedProxy(clientSide = "naturix.jarm.proxy.ClientProxy", serverSide = "naturix.jarm.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JARM instance;

    public static org.apache.logging.log4j.Logger logger;
    
    public static KeyBinding keyToggle;
    public static Minecraft mc;
    public static EntityPlayer player;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event); 
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
        GameRegistry.registerWorldGenerator(new TreeWorldGen(), 3);
        
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
		private static ModelHat hat = new ModelHat();
		private static UUIDGrabber uuid;
		private AbstractClientPlayer player2;
		@SubscribeEvent
		public void playerRender(RenderPlayerEvent.Specials.Pre evt) {
			if(uuid.isContributor(player2)) {
				GL11.glPushMatrix();
				evt.getRenderer().getMainModel().bipedHead.postRender(0.0625f);
				GL11.glRotatef(180, 0, 0, 1);
				GL11.glTranslatef(-0.5f, 0.5f, -0.5f);
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("jarm:textures/models/devhat.png"));
				hat.renderAll();
				GL11.glPopMatrix();
			}
		}
	}
    
}

