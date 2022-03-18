package nicusha.ruby.feature;

import net.minecraft.core.*;
import net.minecraft.data.worldgen.features.*;
import net.minecraft.data.worldgen.placement.*;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import nicusha.ruby.*;
import nicusha.ruby.registry.*;

import java.util.List;
@Mod.EventBusSubscriber(modid = Ruby.MODID)
public class RFeatures
{
    private static final RuleTest NATURAL_STONE = OreFeatures.STONE_ORE_REPLACEABLES;
    private static final RuleTest DEEP_STONE = OreFeatures.DEEPSLATE_ORE_REPLACEABLES;
    public static class Placed{

        public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
                OreConfiguration.RUBY_ORE, commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(54), VerticalAnchor.aboveBottom(128))));

        public static final Holder<PlacedFeature> AMETHYST_PLACED = PlacementUtils.register("amethyst_placed",
                OreConfiguration.AMETHYST, rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(80))));

        public static final Holder<PlacedFeature> AMETHYST_DEEP_PLACED = PlacementUtils.register("amethyst_deep_placed",
                OreConfiguration.AMETHYST_DEEP, rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(50))));

        public static final Holder<PlacedFeature> BRAUNITE_ORE_PLACED = PlacementUtils.register("braunite_ore_placed",
                OreConfiguration.BRAUNITE_ORE, rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(120))));

        public static final Holder<PlacedFeature> OPAL_ORE_PLACED = PlacementUtils.register("opal_ore_placed",
                OreConfiguration.OPAL_ORE, commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(54), VerticalAnchor.aboveBottom(128))));

        public static final Holder<PlacedFeature> METEORITE_ORE_PLACED = PlacementUtils.register("meteorite_ore_placed",
                OreConfiguration.METEORITE, rareOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(50), VerticalAnchor.aboveBottom(182))));

    }


    public static class OreConfiguration {

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore_cf",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(NATURAL_STONE, BlockRegistry.RUBY_ORE.get().defaultBlockState(), 5));

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> AMETHYST = FeatureUtils.register("amethyst_cf",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(NATURAL_STONE, BlockRegistry.AMETHYST.get().defaultBlockState(), 3));

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> AMETHYST_DEEP = FeatureUtils.register("amethyst_cf_deep",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(DEEP_STONE, BlockRegistry.AMETHYST.get().defaultBlockState(), 3));

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> BRAUNITE_ORE = FeatureUtils.register("braunite_ore_cf",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(DEEP_STONE, BlockRegistry.BRAUNITE_ORE.get().defaultBlockState(), 6));

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> OPAL_ORE = FeatureUtils.register("opal_ore_cf",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(NATURAL_STONE, BlockRegistry.OPAL_ORE.get().defaultBlockState(), 6));

        public static final Holder<ConfiguredFeature<net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration, ?>> METEORITE = FeatureUtils.register("meteorite_cf",
                Feature.ORE, new net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration(NATURAL_STONE, BlockRegistry.METEORITE_ORE.get().defaultBlockState(), 4));

    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int attempt, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(attempt), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int attempt, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(attempt), modifier);
    }

    @SubscribeEvent
    public static void addOres(final BiomeLoadingEvent e) {
        List<Holder<PlacedFeature>> base = e.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        base.add(Placed.RUBY_ORE_PLACED);
        base.add(Placed.AMETHYST_PLACED);
        base.add(Placed.AMETHYST_DEEP_PLACED);
        base.add(Placed.BRAUNITE_ORE_PLACED);
        base.add(Placed.OPAL_ORE_PLACED);
        base.add(Placed.METEORITE_ORE_PLACED);
    }

}