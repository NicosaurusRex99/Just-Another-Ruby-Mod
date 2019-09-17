package naturix.ruby.registry;


import naturix.ruby.Ruby;
import naturix.ruby.world.MeteorFall;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Ruby.MODID, value = Dist.CLIENT)
public class ModEvents {

    @SubscribeEvent
    public static void tickEvent(final TickEvent.PlayerTickEvent event) {
        MeteorFall.init(event.player);
    }
}
