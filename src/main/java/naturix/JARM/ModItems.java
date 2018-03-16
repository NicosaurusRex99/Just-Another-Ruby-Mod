package naturix.JARM;

import naturix.JARM.compat.ThermalFoundation.TFModItems;
import naturix.JARM.modules.AmethystModule;
import naturix.JARM.modules.BrauniteModule;
import naturix.JARM.modules.EmeraldModule;
import naturix.JARM.modules.LapisModule;
import naturix.JARM.modules.PrismarineModule;
import naturix.JARM.modules.RubyModule;
import naturix.JARM.modules.ShulkerModule;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    
@SideOnly(Side.CLIENT)
public static void initModels() {
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
