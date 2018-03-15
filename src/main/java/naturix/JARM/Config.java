package naturix.JARM;

import net.minecraftforge.common.config.Configuration;
import scala.Int;

import org.apache.logging.log4j.Level;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.proxy.CommonProxy;


public class Config {

    private static final String CATEGORY_GENERAL = "General";
    private static final String CATEGORY_ORE = "Ore Gen";
    private static final String CATEGORY_ARMOUR = "Armour";
    private static final String CATEGORY_MISC = "Misc";
    private static final String CATEGORY_MODULES = "Modules";

    public static boolean isRubyBeaconBase = true;
    public static boolean doWorldGen = true;
    public static boolean debug = false;
    public static int rubyVeinSize = 2;
    public static int rubyMax = 15;
    public static int rubyMin = 1;
    public static int rubySpawnTries = 1;
    public static int rubyHelm = 5;
    public static int rubyChest = 9;
    public static int rubyLeg = 12;
    public static int rubyBoot = 5;
    public static int emeraldHelm = 4;
    public static int emeraldChest = 7;
    public static int emeraldLeg = 5;
    public static int emeraldBoot = 3;
    public static int lapisHelm = 2;
    public static int lapisChest = 5;
    public static int lapisLeg = 3;
    public static int lapisBoot = 2;
    public static int prismarineHelm = 2;
    public static int AmethystVeinSize = 1;
    public static int AmethystMax = 5;
    public static int AmethystMin = 1;
    public static int AmethystSpawnTries = 1;
    public static int amethystHelm = 6;
    public static int amethystChest = 10;
    public static int amethystLeg = 13;
    public static int amethystBoot = 6;
    public static int shulkerHelm = 5;
    public static int shulkerChest = 8;
    public static int shulkerLeg = 10;
    public static int shulkerBoot = 4;
    public static boolean rubyModule = true;
    public static boolean amethystModule = true;
    public static boolean brauniteModule = true;
    public static boolean emeraldModule = true;
    public static boolean lapisModule = true;
    public static boolean prismarineModule = true;
    public static boolean shulkerModule = true;
    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            JARM.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        isRubyBeaconBase = cfg.getBoolean("isRubyBeaconBase", CATEGORY_GENERAL, isRubyBeaconBase, "Set to false to disable ruby block from being a beacon base");
        cfg.addCustomCategoryComment(CATEGORY_ORE, "Generation of ore");
        rubyVeinSize = cfg.getInt("rubyVeinSize", CATEGORY_ORE, 2, 1, 1000, "Choose a number between 1 and 1000 to change the size of ruby ore veins");
        rubyMin = cfg.getInt("rubyMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ruby ore height");
        rubyMax = cfg.getInt("rubyMax", CATEGORY_ORE, 15, 1, 256, "Choose a number between 1 and 256 to choose the max ruby ore height");
        rubySpawnTries = cfg.getInt("rubySpawnTries", CATEGORY_ORE, 2, 1, 100, "Choose a number between 1 and 100 to change how often you see ruby ore");
        cfg.addCustomCategoryComment(CATEGORY_ARMOUR, "Armour values");
        rubyHelm = cfg.getInt("rubyHelm", CATEGORY_ARMOUR, 5, 1, 1000000, "Damage reduction on the ruby helmet.");
        rubyChest = cfg.getInt("rubyChest", CATEGORY_ARMOUR, 9, 1, 1000000, "Damage reduction on the ruby chestplate.");
        rubyLeg = cfg.getInt("rubyLeg", CATEGORY_ARMOUR, 12, 1, 1000000, "Damage reduction on the ruby leggings.");
        rubyBoot = cfg.getInt("rubyBoot", CATEGORY_ARMOUR, 5, 1, 1000000, "Damage reduction on the ruby boots.");
        emeraldHelm = cfg.getInt("emeraldHelm", CATEGORY_ARMOUR, 4, 1, 1000000, "Damage reduction on the emerald helmet.");
        emeraldChest = cfg.getInt("emeraldChest", CATEGORY_ARMOUR, 7, 1, 1000000, "Damage reduction on the emerald chestplate.");
        emeraldLeg = cfg.getInt("emeraldLeg", CATEGORY_ARMOUR, 5, 1, 1000000, "Damage reduction on the emerald leggings.");
        emeraldBoot = cfg.getInt("emeraldBoot", CATEGORY_ARMOUR, 3, 1, 1000000, "Damage reduction on the emerald boots.");
        lapisHelm = cfg.getInt("lapisHelm", CATEGORY_ARMOUR, 2, 1, 1000000, "Damage reduction on the lapis helmet.");
        lapisChest = cfg.getInt("lapisChest", CATEGORY_ARMOUR, 5, 1, 1000000, "Damage reduction on the lapis chestplate.");
        lapisLeg = cfg.getInt("lapisLeg", CATEGORY_ARMOUR, 3, 1, 1000000, "Damage reduction on the lapis leggings.");
        lapisBoot = cfg.getInt("lapisBoot", CATEGORY_ARMOUR, 2, 1, 1000000, "Damage reduction on the lapis boots.");
        prismarineHelm = cfg.getInt("prismarineHelm", CATEGORY_ARMOUR, 2, 1, 1000000, "Damage reduction on the prismarine helmet.");
        AmethystMin = cfg.getInt("AmethystMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min amethyst height");
        AmethystMax = cfg.getInt("AmethystMax", CATEGORY_ORE, 5, 1, 256, "Choose a number between 1 and 256 to choose the max amethyst height");
        AmethystSpawnTries = cfg.getInt("AmethystSpawnTries", CATEGORY_ORE, 2, 1, 100, "Choose a number between 1 and 100 to change how often you see amethyst");
        amethystHelm = cfg.getInt("amethystHelm", CATEGORY_ARMOUR, 6, 1, 1000000, "Damage reduction on the amethyst helmet.");
        amethystChest = cfg.getInt("amethystChest", CATEGORY_ARMOUR, 10, 1, 1000000, "Damage reduction on the amethyst chestplate.");
        amethystLeg = cfg.getInt("amethystLeg", CATEGORY_ARMOUR, 13, 1, 1000000, "Damage reduction on the amethyst leggings.");
        amethystBoot = cfg.getInt("amethystBoot", CATEGORY_ARMOUR, 6, 1, 1000000, "Damage reduction on the amethyst boots.");
        cfg.addCustomCategoryComment(CATEGORY_MISC, "Random stuff");
        doWorldGen = cfg.getBoolean("doWorldGen", CATEGORY_MISC, doWorldGen, "Set to false to disable all world gen");
        shulkerHelm = cfg.getInt("shulkerHelm", CATEGORY_ARMOUR, 5, 1, 1000000, "Damage reduction on the shulker helmet.");
        shulkerChest = cfg.getInt("shulkerChest", CATEGORY_ARMOUR, 8, 1, 1000000, "Damage reduction on the shulker chestplate.");
        shulkerLeg = cfg.getInt("shulkerLeg", CATEGORY_ARMOUR, 10, 1, 1000000, "Damage reduction on the shulker leggings.");
        shulkerBoot = cfg.getInt("shulkerBoot", CATEGORY_ARMOUR, 4, 1, 1000000, "Damage reduction on the shulker boots.");
        debug = cfg.getBoolean("debug", CATEGORY_GENERAL, debug, "set to true to see what loaded");
        cfg.addCustomCategoryComment(CATEGORY_MODULES, "Individual Modules");
        rubyModule = cfg.getBoolean("ruby", CATEGORY_MODULES, rubyModule, "Disable to remove this module");
        amethystModule = cfg.getBoolean("amethyst", CATEGORY_MODULES, amethystModule, "Disable to remove this module");
        brauniteModule = cfg.getBoolean("braunite", CATEGORY_MODULES, brauniteModule, "Disable to remove this module");
        emeraldModule = cfg.getBoolean("emerald", CATEGORY_MODULES, emeraldModule, "Disable to remove this module");
        lapisModule = cfg.getBoolean("lapis", CATEGORY_MODULES, lapisModule, "Disable to remove this module");
        prismarineModule = cfg.getBoolean("prismarine", CATEGORY_MODULES, prismarineModule, "Disable to remove this module");
        shulkerModule = cfg.getBoolean("shulker", CATEGORY_MODULES, shulkerModule, "Disable to remove this module");
        
    }
    

}