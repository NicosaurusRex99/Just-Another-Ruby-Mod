package naturix.JARM.proxy;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
        ModBlocks.initModels();
        }

}