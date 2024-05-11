package nicusha.ruby;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import nicusha.ruby.registry.ArmourMaterialRegistry;
import nicusha.ruby.registry.BlockRegistry;
import nicusha.ruby.registry.CreativeTabRegistry;
import nicusha.ruby.registry.ItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(Ruby.MODID)
public class Ruby
{
    public static final String MODID = "ruby";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Ruby(IEventBus bus, ModContainer container)
    {
        bus.addListener(this::commonSetup);

        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(bus);
        ArmourMaterialRegistry.ARMOR_MATERIALS.register(bus);
        NeoForge.EVENT_BUS.register(this);
        bus.addListener(this::addCreative);
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public void meteorFall(PlayerTickEvent.Post event){
        Player player = event.getEntity();
        Level world = player.level();
        RandomSource random = world.random;
        BlockPos pos = player.blockPosition().below();
        BlockState state = BlockRegistry.METEORITE_ORE.get().defaultBlockState();
        if (random.nextInt(Config.METEOR_FREQUENCY * 100) == 0 && player.level().canSeeSky(pos) && !world.isClientSide && world.canSeeSky(player.blockPosition().above())) {
            world.setBlockAndUpdate(pos, state);
        }
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    if (event.getTabKey() == CreativeTabRegistry.TAB.getKey())
        for (var regObj : ItemRegistry.ITEMS.getEntries()) {
            event.accept(regObj.get());

        }
}
}
