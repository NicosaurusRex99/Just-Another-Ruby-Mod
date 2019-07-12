package naturix.ruby.world;
import com.google.common.base.Predicate;
import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
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
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.opal_ore.getDefaultState(), 3),
                        COUNT_RANGE, new CountRangeConfig(8, 32, 47, 48)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.ruby_ore.getDefaultState(), 3),
                        COUNT_RANGE, new CountRangeConfig(4, 2, 15, 16)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.braunite_ore.getDefaultState(), 5),
                        COUNT_RANGE, new CountRangeConfig(4, 4, 30, 38)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.amethyst.getDefaultState(), 2),
                        COUNT_RANGE, new CountRangeConfig(4, 2, 8, 13)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.meteorite_ore.getDefaultState(), 2),
                        COUNT_RANGE, new CountRangeConfig(4, 48, 99, 100)));


            }
        }
    }