package naturix.ruby.world;
import com.google.common.base.Predicate;
import naturix.ruby.Config;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.world.tree.DwarfAppleFeature;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;
public class ModOreFeature
    {
        private static final Predicate<BlockState> STONE = state -> state.getBlock() == Blocks.STONE;
        public static final AbstractTreeFeature<NoFeatureConfig> TREE = new DwarfAppleFeature.Builder().create();
        public static void setupOreGenerator()
        {
            for(Biome biome : ForgeRegistries.BIOMES)
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.opal_ore.getDefaultState(), Config.OPALVEIN.get()),
                        COUNT_RANGE, new CountRangeConfig(8, Config.OPALMIN.get(), Config.OPALMAX.get(), Config.OPALMAX.get()+1)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.ruby_ore.getDefaultState(), Config.RUBYVEIN.get()),
                        COUNT_RANGE, new CountRangeConfig(4, Config.RUBYMIN.get(), Config.RUBYMAX.get()/3, Config.RUBYMAX.get()+1)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.braunite_ore.getDefaultState(), Config.BRAUNITEVEIN.get()),
                        COUNT_RANGE, new CountRangeConfig(4, Config.BRAUNITEMIN.get(), Config.BRAUNITEMAX.get()/2, Config.BRAUNITEMAX.get()+1)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.amethyst.getDefaultState(), Config.AMETHYSTVEIN.get()),
                        COUNT_RANGE, new CountRangeConfig(6, Config.AMETHYSTMIN.get(), Config.AMETHYSTMAX.get()/2, Config.AMETHYSTMAX.get()+1)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                        new OreFeatureConfig(NATURAL_STONE, ModBlocks.meteorite_ore.getDefaultState(), Config.METEORITEVEIN.get()),
                        COUNT_RANGE, new CountRangeConfig(3
                                , 30, 50, 100)));

                if (biome.equals(Biomes.MOUNTAINS)) {
                    biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{ModOreFeature.TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.1F}, ModOreFeature.TREE, IFeatureConfig.NO_FEATURE_CONFIG), Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(1, 0.1F, 1)));
                }
            }
        }
    }