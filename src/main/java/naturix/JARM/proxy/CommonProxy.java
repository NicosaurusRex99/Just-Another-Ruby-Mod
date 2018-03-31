package naturix.jarm.proxy;

import java.io.File;

import naturix.jarm.Config;
import naturix.jarm.registry.ModRecipes;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "naturix/Just Another Ruby Mod!.cfg"));
        Config.readConfig();

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
