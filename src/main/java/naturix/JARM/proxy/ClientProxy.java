package naturix.JARM.proxy;

import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
        ModItems.initModels();
    }
}