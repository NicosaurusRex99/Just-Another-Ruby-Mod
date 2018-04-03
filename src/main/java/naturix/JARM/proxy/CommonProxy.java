package naturix.jarm.proxy;

import java.io.File;

import naturix.jarm.registry.ModRecipes;
import naturix.jarm.utils.config.ConfigMain;
import naturix.jarm.utils.handlers.TradeHandler;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;
	VillagerRegistry.VillagerProfession smith=ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:smith"));
	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "naturix/Just Another Ruby Mod!.cfg"));
        ConfigMain.readConfig();
        smith.getCareer(5).addTrade(1,new TradeHandler());
	}

    public void init(FMLInitializationEvent e)
    {
    	ModRecipes.init();
    }
    
    public void postInit(FMLPostInitializationEvent e) 
    {
    	if (config.hasChanged()) {
            config.save();

    }
    }
	@EventHandler 
	public void serverLoad(FMLServerStartingEvent event) 
	{

	}
	public void registerItemRenderer(Item item, int meta, String id) {
	}
} 
