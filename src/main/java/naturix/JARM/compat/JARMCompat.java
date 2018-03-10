package naturix.JARM.compat;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import naturix.JARM.compat.top.TOPCompat;
import net.minecraftforge.fml.common.Loader;

public class JARMCompat {
	
	public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompat.register();
        }
        if (Config.debug == true ) {
        	JARM.logger.info("compat loaded loaded");
        }
    }
	
	
}