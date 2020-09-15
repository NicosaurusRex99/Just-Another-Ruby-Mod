package naturix.ruby.utils;

import naturix.ruby.registry.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static naturix.ruby.Ruby.MODID;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = MODID)
public class CutoutMipped {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        final RenderType cutoutMipped = RenderType.getCutoutMipped();
        RenderTypeLookup.setRenderLayer(ModBlocks.amethyst, cutoutMipped);
        RenderTypeLookup.setRenderLayer(ModBlocks.meteoriteOre, cutoutMipped);
    }
}
