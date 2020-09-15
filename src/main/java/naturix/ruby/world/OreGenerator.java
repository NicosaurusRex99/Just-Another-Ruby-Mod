package naturix.ruby.world;

import com.google.common.collect.Lists;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;


public class OreGenerator
{
    public static void setupOreGenerator() {
        for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.func_239659_c_()) {
            genOre(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeature.OPAL);
            genOre(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeature.RUBY);
            genOre(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeature.BRAUNITE);
            genOre(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeature.AMETHYST);
            genOre(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeature.METEORITE);
        }
    }

    public static void genOre(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature)
    {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.func_242440_e().func_242498_c());
        while (biomeFeatures.size() <= decoration.ordinal())
        {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);
        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures,
                "field_242484_f");
    }
}