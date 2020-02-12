package naturix.ruby;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;


    public static ForgeConfigSpec.IntValue AMETHYSTMIN;
    public static ForgeConfigSpec.IntValue AMETHYSTMAX;
    public static ForgeConfigSpec.IntValue AMETHYSTVEIN;
    public static ForgeConfigSpec.IntValue BRAUNITEMIN;
    public static ForgeConfigSpec.IntValue BRAUNITEMAX;
    public static ForgeConfigSpec.IntValue BRAUNITEVEIN;
    public static ForgeConfigSpec.IntValue METEORITEVEIN;
    public static ForgeConfigSpec.IntValue OPALMIN;
    public static ForgeConfigSpec.IntValue OPALMAX;
    public static ForgeConfigSpec.IntValue OPALVEIN;
    public static ForgeConfigSpec.IntValue RUBYMIN;
    public static ForgeConfigSpec.IntValue RUBYMAX;
    public static ForgeConfigSpec.IntValue RUBYVEIN;

    public static ForgeConfigSpec.IntValue METEORFREQUENCY;

    public static ForgeConfigSpec.IntValue BOMBSTRENGTH;



    static {

        COMMON_BUILDER.comment("General settings").push(CATEGORY_GENERAL);
        COMMON_BUILDER.pop();

        setupConfig();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    private static void setupConfig() {
        COMMON_BUILDER.comment("General settings").push(CATEGORY_GENERAL);

        AMETHYSTMIN = COMMON_BUILDER.comment("Minimum height amethyst can spawn at")
                .defineInRange("Amethyst Min", 2, 1, 250);
        AMETHYSTMAX = COMMON_BUILDER.comment("Maximum height amethyst can spawn at")
                .defineInRange("Amethyst Max", 16, 1, 250);
        AMETHYSTVEIN = COMMON_BUILDER.comment("Maximum vein size of amethyst")
                .defineInRange("Amethyst Vein", 3, 1, 512);
        BRAUNITEMIN = COMMON_BUILDER.comment("Minimum height braunite can spawn at")
                .defineInRange("Braunite Min", 4, 1, 250);
        BRAUNITEMAX = COMMON_BUILDER.comment("Maximum height braunite can spawn at")
                .defineInRange("Braunite Max", 30, 1, 250);
        BRAUNITEVEIN = COMMON_BUILDER.comment("Maximum vein size of braunite")
                .defineInRange("Braunite Vein", 6, 1, 512);
        METEORITEVEIN = COMMON_BUILDER.comment("Maximum vein size of meteorite")
                .defineInRange("Meteorite Vein", 3, 1, 512);
        OPALMIN = COMMON_BUILDER.comment("Minimum height opal can spawn at")
                .defineInRange("Opal Min", 32, 1, 250);
        OPALMAX = COMMON_BUILDER.comment("Maximum height opal can spawn at")
                .defineInRange("Opal Max", 48, 1, 250);
        OPALVEIN = COMMON_BUILDER.comment("Maximum vein size of opal")
                .defineInRange("Opal Vein", 4, 1, 512);
        RUBYMIN = COMMON_BUILDER.comment("Minimum height ruby can spawn at")
                .defineInRange("Ruby Min", 2, 1, 250);
        RUBYMAX = COMMON_BUILDER.comment("Maximum height ruby can spawn at")
                .defineInRange("Ruby Max", 48, 1, 250);
        RUBYVEIN = COMMON_BUILDER.comment("Maximum vein size of ruby")
                .defineInRange("Ruby Vein", 8, 1, 512);
        BOMBSTRENGTH = COMMON_BUILDER.comment("How strong is the bomb?")
                .defineInRange("Bomb Strength", 64, 1, 4096);
        METEORFREQUENCY = COMMON_BUILDER.comment("Lower number is more frequent")
                .defineInRange("Meteor Frequency", 100000, 1, 100000000);
        COMMON_BUILDER.pop();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {

        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }


}