package naturix.ruby;

import naturix.ruby.proxy.ClientProxy;
import naturix.ruby.proxy.IProxy;
import naturix.ruby.proxy.ModSetup;
import naturix.ruby.proxy.ServerProxy;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.registry.ModItems;
import naturix.ruby.world.ModOreFeature;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ruby.MODID)
public class Ruby
{
    public static final String MODID = "ruby";
    public static final String MODNAME = "Just Another Ruby Mod";
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public Ruby() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ruby-client.toml"));
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ruby-common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();

        ModOreFeature.setupOreGenerator();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
            event.getRegistry().register(new BlockItem(ModBlocks.ruby_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("ruby_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.braunite_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("braunite_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.opal_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("opal_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.amethyst, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("amethyst"));
            event.getRegistry().register(new BlockItem(ModBlocks.meteorite_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("meteorite_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.braunite_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("braunite_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.opal_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("opal_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.ruby_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("ruby_block"));
        }
    }
}