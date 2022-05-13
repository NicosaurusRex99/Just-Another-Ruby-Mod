package nicusha.ruby.registry;

import net.minecraft.util.valueproviders.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.material.*;
import net.minecraftforge.registries.*;
import nicusha.ruby.*;

import javax.annotation.*;

import static nicusha.ruby.Ruby.MODID;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static int WOOD_GOLD = 0, STONE = 1, IRON = 2, DIAMOND = 3, NETHERITE = 4;

    public static final RegistryObject<Block> RUBY_ORE = createOreBlock("ruby_ore", Material.STONE, MaterialColor.COLOR_RED, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);
    public static final RegistryObject<Block> BRAUNITE_ORE = createOreBlock("braunite_ore", Material.STONE, MaterialColor.COLOR_GRAY, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);
    public static final RegistryObject<Block> OPAL_ORE = createOreBlock("opal_ore", Material.STONE, MaterialColor.COLOR_LIGHT_BLUE, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);
    public static final RegistryObject<Block> AMETHYST = createOreBlock("amethyst", Material.STONE, MaterialColor.COLOR_PURPLE, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, false);
    public static final RegistryObject<Block> METEORITE_ORE = createOreBlock("meteorite_ore", Material.STONE, MaterialColor.COLOR_ORANGE, 5, 8, NETHERITE, SoundType.STONE, Ruby.RUBY_TAB, false);
    public static final RegistryObject<Block> BRAUNITE_BLOCK = createOreBlock("braunite_block", Material.STONE, MaterialColor.COLOR_GRAY, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);
    public static final RegistryObject<Block> OPAL_BLOCK = createOreBlock("opal_block", Material.STONE, MaterialColor.COLOR_LIGHT_BLUE, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);
    public static final RegistryObject<Block> RUBY_BLOCK = createOreBlock("ruby_block", Material.STONE, MaterialColor.COLOR_RED, 2, 4, DIAMOND, SoundType.STONE, Ruby.RUBY_TAB, true);

    private static RegistryObject<Block> createOreBlock(@Nonnull String id, Material material, MaterialColor color, float hardness, float resistance, float harvestLevel, SoundType sound, CreativeModeTab itemGroup, boolean fullBlock){
        if(fullBlock){
            RegistryObject<Block> block = BLOCKS.register(id, () -> new OreBlock(BlockBehaviour.Properties.of(material, color).requiresCorrectToolForDrops().strength(hardness, resistance), UniformInt.of(3, 7)));
            ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup).fireResistant()));
            return block;
        }
        RegistryObject<Block> block = BLOCKS.register(id, () -> new OreBlock(BlockBehaviour.Properties.of(material, color).requiresCorrectToolForDrops().strength(hardness, resistance).noOcclusion(), UniformInt.of(3, 7)));
        ItemRegistry.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup).fireResistant()));
        return block;
    }

}
