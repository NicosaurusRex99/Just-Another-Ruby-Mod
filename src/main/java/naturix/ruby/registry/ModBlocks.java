package naturix.ruby.registry;

import naturix.ruby.Ruby;
import naturix.ruby.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Ruby.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    @ObjectHolder("ruby:ruby_ore")
    public static Block rubyOre = null;
    @ObjectHolder("ruby:braunite_ore")
    public static Block brauniteOre = null;
    @ObjectHolder("ruby:opal_ore")
    public static Block opalOre = null;
    @ObjectHolder("ruby:amethyst")
    public static Block amethyst = null;
    @ObjectHolder("ruby:meteorite_ore")
    public static Block meteoriteOre = null;

    @ObjectHolder("ruby:braunite_block")
    public static Block brauniteBlock = null;
    @ObjectHolder("ruby:opal_block")
    public static Block opalBlock = null;
    @ObjectHolder("ruby:ruby_block")
    public static Block rubyBlock = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> e) {
        register(e, new BlockBase("ruby_ore", 3));
        register(e, new BlockBase("braunite_ore", 3));
        register(e, new BlockBase("opal_ore", 1));
        register(e, new Amethyst("amethyst", 3));
        register(e, new Meteorite("meteorite_ore"));


        register(e, new BlockBase("braunite_block", 3));
        register(e, new BlockBase("opal_block", 1));
        register(e, new BlockBase("ruby_block", 3));


    }
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {
        registerItem(e, rubyOre);
        registerItem(e, brauniteOre);
        registerItem(e, opalOre);
        registerItem(e, amethyst);
        registerItem(e, meteoriteOre);


        registerItem(e, brauniteBlock);
        registerItem(e, opalBlock);
        registerItem(e, rubyBlock);
    }
    private static void register(RegistryEvent.Register<Block> event, Block block) {
        event.getRegistry().register(block);
    }
    private static void registerItem(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(new BlockItem(block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName(block.getRegistryName()));
    }
}
