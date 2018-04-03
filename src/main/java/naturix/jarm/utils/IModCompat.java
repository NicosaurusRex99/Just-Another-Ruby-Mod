package naturix.jarm.utils;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IModCompat {
		void preInit(FMLPreInitializationEvent event);

		void init(FMLInitializationEvent event);

		void postInit(FMLPostInitializationEvent event);
}