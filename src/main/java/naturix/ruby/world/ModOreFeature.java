package naturix.ruby.world;
import com.google.common.base.Predicate;
import naturix.ruby.Config;
import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;
public class ModOreFeature
    {
        private static final Predicate<BlockState> STONE = state -> state.getBlock() == Blocks.STONE;
        public static void setupOreGenerator()
        {
            for(Biome biome : ForgeRegistries.BIOMES)
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.opal_ore.getDefaultState(), Config.OPALVEIN.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.OPALVEIN.get(), Config.OPALMIN.get(), Config.OPALMIN.get(), Config.OPALMAX.get()))));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.ruby_ore.getDefaultState(), Config.RUBYVEIN.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.RUBYVEIN.get(), Config.RUBYMIN.get(), Config.RUBYMIN.get(), Config.RUBYMAX.get()))));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.braunite_ore.getDefaultState(), Config.BRAUNITEVEIN.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.BRAUNITEVEIN.get(), Config.BRAUNITEMIN.get(), Config.BRAUNITEMIN.get(), Config.BRAUNITEMAX.get()))));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.amethyst.getDefaultState(), Config.AMETHYSTVEIN.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.AMETHYSTVEIN.get(), Config.AMETHYSTMIN.get(), Config.AMETHYSTMIN.get(), Config.AMETHYSTMAX.get()))));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.meteorite_ore.getDefaultState(), Config.METEORITEVEIN.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(Config.METEORITEVEIN.get(), 30, 30, 100))));
            }
        }
    }