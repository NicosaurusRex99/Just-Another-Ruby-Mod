package nicusha.ruby.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.Ruby;
import nicusha.ruby.blocks.Amethyst;
import nicusha.ruby.blocks.Meteorite;

import javax.annotation.Nonnull;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Ruby.MODID);
    private static int WOOD_GOLD = 0, STONE = 1, IRON = 2, DIAMOND = 3, NETHERITE = 4;

    public static final DeferredBlock<Block> RUBY_ORE = createOreBlock("ruby_ore", MapColor.COLOR_RED, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> RUBY_ORE_DEEPSLATE = createOreBlock("ruby_ore_deepslate", MapColor.COLOR_RED, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> BRAUNITE_ORE = createOreBlock("braunite_ore", MapColor.COLOR_GRAY, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> BRAUNITE_ORE_DEEPSLATE = createOreBlock("braunite_ore_deepslate", MapColor.COLOR_GRAY, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> OPAL_ORE = createOreBlock("opal_ore", MapColor.COLOR_LIGHT_BLUE, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> OPAL_ORE_DEEPSLATE = createOreBlock("opal_ore_deepslate", MapColor.COLOR_LIGHT_BLUE, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> AMETHYST = createOreBlock("amethyst", MapColor.COLOR_PURPLE, 2, 4, DIAMOND, SoundType.STONE, false);
    public static final DeferredBlock<Block> METEORITE_ORE = createOreBlock("meteorite_ore", MapColor.COLOR_ORANGE, 5, 8, NETHERITE, SoundType.STONE, false);
    public static final DeferredBlock<Block> BRAUNITE_BLOCK = createOreBlock("braunite_block", MapColor.COLOR_GRAY, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> OPAL_BLOCK = createOreBlock("opal_block", MapColor.COLOR_LIGHT_BLUE, 2, 4, DIAMOND, SoundType.STONE, true);
    public static final DeferredBlock<Block> RUBY_BLOCK = createOreBlock("ruby_block", MapColor.COLOR_RED, 2, 4, DIAMOND, SoundType.STONE, true);

    private static DeferredBlock<Block> createOreBlock(@Nonnull String id, MapColor color, float hardness, float resistance, float harvestLevel, SoundType sound, boolean fullBlock){
        if(fullBlock){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance)));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        if(id == "amethyst"){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new Amethyst(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).noOcclusion()));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        if(id == "meteorite_ore"){
            DeferredBlock<Block> block = BLOCKS.register(id, () -> new Meteorite(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).noOcclusion()));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
            return block;
        }
        DeferredBlock<Block> block = BLOCKS.register(id, () -> new Block(BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance).noOcclusion()));
        ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
        return block;
    }

}
