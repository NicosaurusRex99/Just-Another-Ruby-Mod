package nicusha.ruby.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

import java.util.function.Supplier;

import static nicusha.ruby.Ruby.MODID;

public class BlockRegistry {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> RUBY_ORE = createOreBlock("ruby_ore", MapColor.COLOR_RED, 3.0f, 5.0f, NoteBlockInstrument.XYLOPHONE);
    public static final DeferredBlock<Block> RUBY_ORE_DEEPSLATE = createOreBlock("ruby_ore_deepslate", MapColor.COLOR_RED, 4.0f, 6.0f, NoteBlockInstrument.XYLOPHONE);
    public static final DeferredBlock<Block> BRAUNITE_ORE = createOreBlock("braunite_ore", MapColor.COLOR_GRAY, 2.5f, 4.0f, NoteBlockInstrument.IRON_XYLOPHONE);
    public static final DeferredBlock<Block> BRAUNITE_ORE_DEEPSLATE = createOreBlock("braunite_ore_deepslate", MapColor.COLOR_GRAY, 3.0f, 5.0f, NoteBlockInstrument.IRON_XYLOPHONE);
    public static final DeferredBlock<Block> OPAL_ORE = createOreBlock("opal_ore", MapColor.COLOR_LIGHT_BLUE, 3.0f, 5.0f, NoteBlockInstrument.CHIME);
    public static final DeferredBlock<Block> OPAL_ORE_DEEPSLATE = createOreBlock("opal_ore_deepslate", MapColor.COLOR_LIGHT_BLUE, 3.5f, 6.0f, NoteBlockInstrument.CHIME);
    public static final DeferredBlock<Block> AMETHYST = registerBlock("amethyst", () -> new Amethyst(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops().strength(2.0f, 3.0f).instrument(NoteBlockInstrument.XYLOPHONE).noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "amethyst")))));
    public static final DeferredBlock<Block> METEORITE_ORE = registerBlock("meteorite_ore", () -> new Meteorite(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(5.0f, 8.0f).instrument(NoteBlockInstrument.IRON_XYLOPHONE).noOcclusion().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "meteorite_ore")))));

    public static final DeferredBlock<Block> BRAUNITE_BLOCK = createBlock("braunite_block", MapColor.COLOR_GRAY, 5.0f, 6.0f, NoteBlockInstrument.IRON_XYLOPHONE);
    public static final DeferredBlock<Block> OPAL_BLOCK = createBlock("opal_block", MapColor.COLOR_LIGHT_BLUE, 5.0f, 6.0f, NoteBlockInstrument.CHIME);
    public static final DeferredBlock<Block> RUBY_BLOCK = createBlock("ruby_block", MapColor.COLOR_RED, 5.0f, 6.0f, NoteBlockInstrument.XYLOPHONE);

    private static DeferredBlock<Block> createOreBlock(@Nonnull String name, MapColor color, float hardness, float resistance, NoteBlockInstrument sound) {
        return registerBlock(name, () -> new DropExperienceBlock(UniformInt.of(0, 5), BlockBehaviour.Properties.of().mapColor(color).instrument(sound).requiresCorrectToolForDrops().strength(hardness, resistance).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredBlock<Block> createBlock(@Nonnull String name, MapColor color, float hardness, float resistance, NoteBlockInstrument instrument) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).instrument(instrument).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> registeredBlock = BLOCKS.register(name, block);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(registeredBlock.get(), new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        return registeredBlock;
    }
}