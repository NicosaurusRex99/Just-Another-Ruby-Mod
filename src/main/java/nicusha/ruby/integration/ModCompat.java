package nicusha.ruby.integration;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModCompat {

    public static void initCommon(FMLCommonSetupEvent e){
        if(ModList.get().isLoaded("projecte")){
            ProjectECompat.init();
        }
        if(ModList.get().isLoaded("jeresources")){
            JERCompat.init();
        }
    }
}
