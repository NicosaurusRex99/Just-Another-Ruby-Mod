package naturix.JARM.proxy;

import naturix.JARM.Config;
import naturix.JARM.ModBlocks;
import naturix.JARM.compat.ThermalFoundation.TFModItems;
import naturix.JARM.modules.AmethystModule;
import naturix.JARM.modules.EmeraldModule;
import naturix.JARM.modules.LapisModule;
import naturix.JARM.modules.BrauniteModule;
import naturix.JARM.modules.PrismarineModule;
import naturix.JARM.modules.RubyModule;
import naturix.JARM.modules.ShulkerModule;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }
	@Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }
	@Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModBlocks.initModels();
        if (Loader.isModLoaded("thermalexpansion")) {
        	TFModItems.initModels();
        }
        if(Config.rubyModule == true) {
        	RubyModule.initModels();
        }
        if(Config.prismarineModule == true) {
        	PrismarineModule.initModels();
        }
        if(Config.lapisModule == true) {
        	LapisModule.initModels();
        }
        if(Config.emeraldModule == true) {
        	EmeraldModule.initModels();
        }
        if(Config.amethystModule == true) {
        	AmethystModule.initModels();
        }
        if(Config.shulkerModule == true) {
        	ShulkerModule.initModels();
        }
        if(Config.brauniteModule == true) {
        	BrauniteModule.initModels();
        }
        }
}