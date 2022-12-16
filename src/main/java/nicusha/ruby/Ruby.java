package nicusha.ruby;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.*;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.*;
import net.minecraftforge.registries.*;
import nicusha.ruby.integration.ModCompat;
import nicusha.ruby.registry.*;
import org.slf4j.Logger;


@Mod("ruby")
public class Ruby
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "ruby";

    public Ruby()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(Ruby::registerTab);
        bus.addListener(this::client);
        bus.addListener(this::setup);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);
        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("Just Another Ruby Mod.toml"));

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void client(final FMLClientSetupEvent event){
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ModCompat.initCommon(event);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {

    }


    public static final ResourceLocation TAB = new ResourceLocation(Ruby.MODID, "ruby");

    private static ItemStack makeIcon() {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Ruby.MODID, "ruby_gem")));
    }


    public static void registerTab(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(TAB, builder -> builder.title(Component.translatable("itemGroup.ruby")).icon(Ruby::makeIcon).displayItems((flags, output, isOp) -> {
            for(RegistryObject<Item> item : ItemRegistry.ITEMS.getEntries()){
                output.accept(item.get());
            }
        }));

    }


}
