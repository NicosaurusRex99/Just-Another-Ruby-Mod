package naturix.jarm.proxy;

import java.io.File;

import naturix.jarm.integration.ProjectECompat;
import naturix.jarm.registry.ModRecipes;
import naturix.jarm.utils.config.Config;
import naturix.jarm.utils.handlers.TradeHandlerSmith;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;
	VillagerRegistry.VillagerProfession smith=ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:smith"));
	VillagerRegistry.VillagerProfession tree=ForgeRegistries.VILLAGER_PROFESSIONS.getValue(new ResourceLocation("minecraft:farmer"));
	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "naturix/Just Another Ruby Mod!.cfg"));
        Config.readConfig();
        smith.getCareer(5).addTrade(1,new TradeHandlerSmith());
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
    if(Loader.isModLoaded("projecte")) {
    	ProjectECompat.init();
    }
    }
	@EventHandler 
	public void serverLoad(FMLServerStartingEvent event) 
	{

	}
	@SideOnly(Side.CLIENT)
	public void registerItemRenderer(Item item, int meta, String id) {
	}
} 
