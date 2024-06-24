package nicusha.ruby.registry;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.Ruby;
import nicusha.ruby.blocks.Amethyst;
import nicusha.ruby.blocks.Meteorite;

import javax.annotation.Nonnull;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Ruby.MODID);

    public static final DeferredBlock<Block> RUBY_ORE = createOreBlock("ruby_ore", MapColor.COLOR_RED, 2, 4, NoteBlockInstrument.XYLOPHONE, true);
    public static final DeferredBlock<Block> RUBY_ORE_DEEPSLATE = createOreBlock("ruby_ore_deepslate", MapColor.COLOR_RED, 2, 4, NoteBlockInstrument.XYLOPHONE, true);
    public static final DeferredBlock<Block> BRAUNITE_ORE = createOreBlock("braunite_ore", MapColor.COLOR_GRAY, 2, 4, NoteBlockInstrument.IRON_XYLOPHONE, true);
    public static final DeferredBlock<Block> BRAUNITE_ORE_DEEPSLATE = createOreBlock("braunite_ore_deepslate", MapColor.COLOR_GRAY, 2, 4, NoteBlockInstrument.IRON_XYLOPHONE, true);
    public static final DeferredBlock<Block> OPAL_ORE = createOreBlock("opal_ore", MapColor.COLOR_LIGHT_BLUE, 2, 4, NoteBlockInstrument.CHIME, true);
    public static final DeferredBlock<Block> OPAL_ORE_DEEPSLATE = createOreBlock("opal_ore_deepslate", MapColor.COLOR_LIGHT_BLUE, 2, 4, NoteBlockInstrument.CHIME, true);
    public static final DeferredBlock<Block> AMETHYST = createOreBlock("amethyst", MapColor.COLOR_PURPLE, 2, 4, NoteBlockInstrument.XYLOPHONE, false);
    public static final DeferredBlock<Block> METEORITE_ORE = createOreBlock("meteorite_ore", MapColor.COLOR_ORANGE, 5, 8, NoteBlockInstrument.IRON_XYLOPHONE, false);
    public static final DeferredBlock<Block> BRAUNITE_BLOCK = createBlock("braunite_block", MapColor.COLOR_GRAY, 2, 4, NoteBlockInstrument.IRON_XYLOPHONE);
    public static final DeferredBlock<Block> OPAL_BLOCK = createBlock("opal_block", MapColor.COLOR_LIGHT_BLUE, 2, 4, NoteBlockInstrument.CHIME);
    public static final DeferredBlock<Block> RUBY_BLOCK = createBlock("ruby_block", MapColor.COLOR_RED, 2, 4, NoteBlockInstrument.XYLOPHONE);

    private static DeferredBlock<Block> createOreBlock(@Nonnull String id, MapColor color, float hardness, float resistance, NoteBlockInstrument sound, boolean fullBlock){
        if(fullBlock){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new DropExperienceBlock(UniformInt.of(0, 5), BlockBehaviour.Properties.of().mapColor(color).instrument(sound).requiresCorrectToolForDrops().strength(hardness, resistance)));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        if(id == "amethyst"){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new Amethyst(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).instrument(sound).noOcclusion()));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        if(id == "meteorite_ore"){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new Meteorite(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).instrument(sound).noOcclusion()));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        DeferredBlock<Block> block = BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).instrument(sound).noOcclusion()));
        ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
        return block;
    }

    private static DeferredBlock<Block> createBlock(@Nonnull String id, MapColor color, float hardness, float resistance, NoteBlockInstrument instrument){
        DeferredBlock<Block> block = BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).noOcclusion().instrument(instrument)));
        ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
        return block;
    }

}
