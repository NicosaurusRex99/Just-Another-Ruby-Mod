package nicusha.ruby.event;

import net.minecraft.core.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.state.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import nicusha.ruby.*;
import nicusha.ruby.registry.*;

import java.util.*;

@Mod.EventBusSubscriber(modid = Ruby.MODID)
public class MeteorFallEvent {
    @SubscribeEvent
    public void meteorFall(TickEvent.PlayerTickEvent event){
        Player player = event.player;
        Level world = player.level();
        RandomSource random = world.random;
        BlockPos pos = player.blockPosition().below();
        BlockState state = BlockRegistry.METEORITE_ORE.get().defaultBlockState();
        if (random.nextInt(Config.METEORFREQUENCY.get() * 100) == 0 && player.level().canSeeSky(pos) && !world.isClientSide && world.canSeeSky(player.blockPosition().above())) {
            world.setBlockAndUpdate(pos, state);
        }
    }
}
