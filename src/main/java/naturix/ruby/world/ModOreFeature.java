package naturix.ruby.world;

import naturix.ruby.Config;
import naturix.ruby.Ruby;
import naturix.ruby.registry.ModBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModOreFeature
{
    public static ConfiguredFeature<?, ?> OPAL = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, ModBlocks.opalOre.getDefaultState(),
                    Config.OPALVEIN.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            Config.OPALMIN.get(),
                            0,
                            Config.OPALMAX.get())))
            .func_242728_a().func_242731_b(Config.OPALTRIES.get());

    public static ConfiguredFeature<?, ?> RUBY = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, ModBlocks.rubyOre.getDefaultState(),
                    Config.RUBYVEIN.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            Config.RUBYMIN.get(),
                            0,
                            Config.RUBYMAX.get())))
            .func_242728_a().func_242731_b(Config.RUBYTRIES.get());

    public static ConfiguredFeature<?, ?> BRAUNITE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, ModBlocks.brauniteOre.getDefaultState(),
                    Config.BRAUNITEVEIN.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            Config.BRAUNITEMIN.get(),
                            0,
                            Config.BRAUNITEMAX.get())))
            .func_242728_a().func_242731_b(Config.BRAUNITETRIES.get());

    public static ConfiguredFeature<?, ?> AMETHYST = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, ModBlocks.amethyst.getDefaultState(),
                    Config.AMETHYSTVEIN.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            Config.AMETHYSTMIN.get(),
                            0,
                            Config.AMETHYSTMAX.get())))
            .func_242728_a().func_242731_b(Config.AMETHYSTTRIES.get());

    public static ConfiguredFeature<?, ?> METEORITE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241882_a, ModBlocks.meteoriteOre.getDefaultState(),
                    Config.METEORITEVEIN.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            30,
                            0,
                            100)))
            .func_242728_a().func_242731_b(Config.METEORITETRIES.get());

    public static void initModFeatures ()
    {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(Ruby.MODID, "ore_opal"), OPAL);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(Ruby.MODID, "ore_ruby"), RUBY);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(Ruby.MODID, "ore_braunite"), BRAUNITE);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(Ruby.MODID, "ore_amethyst"), AMETHYST);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(Ruby.MODID, "ore_meteorite"), METEORITE);
    }

}