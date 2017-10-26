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
    private static final String CATEGORY_TOOLS = "Tools";

    public static boolean isRubyBeaconBase = true;
    public static boolean doWorldGen = true;
    public static int rubyVeinSize;
    public static int rubyMax;
    public static int rubyMin;
    public static int rubySpawnTries;
    public static int rubyHelm;
    public static int rubyChest;
    public static int rubyLeg;
    public static int rubyBoot;
    public static int emeraldHelm;
    public static int emeraldChest;
    public static int emeraldLeg;
    public static int emeraldBoot;
    public static int lapisHelm;
    public static int lapisChest;
    public static int lapisLeg;
    public static int lapisBoot;
    public static int prismarineHelm;
    public static int AmethystVeinSize;
    public static int AmethystMax;
    public static int AmethystMin;
    public static int AmethystSpawnTries;
    public static int amethystHelm;
    public static int amethystChest;
    public static int amethystLeg;
    public static int amethystBoot;
    public static int rubyHarvestLevel;
    public static int rubyMaxUses;
    public static int rubyEfficiency;
    public static int rubyDamage;
    public static int rubyEnchantability;

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
        rubySpawnTries = cfg.getInt("rubySpawnTries", CATEGORY_ORE, 1, 1, 100, "Choose a number between 1 and 100 to change how often you see ruby ore");
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
        AmethystSpawnTries = cfg.getInt("AmethystSpawnTries", CATEGORY_ORE, 1, 1, 100, "Choose a number between 1 and 100 to change how often you see amethyst");
        amethystHelm = cfg.getInt("amethystHelm", CATEGORY_ARMOUR, 6, 1, 1000000, "Damage reduction on the amethyst helmet.");
        amethystChest = cfg.getInt("amethystChest", CATEGORY_ARMOUR, 10, 1, 1000000, "Damage reduction on the amethyst chestplate.");
        amethystLeg = cfg.getInt("amethystLeg", CATEGORY_ARMOUR, 13, 1, 1000000, "Damage reduction on the amethyst leggings.");
        amethystBoot = cfg.getInt("amethystBoot", CATEGORY_ARMOUR, 6, 1, 1000000, "Damage reduction on the amethyst boots.");
        cfg.addCustomCategoryComment(CATEGORY_MISC, "Random stuff");
        doWorldGen = cfg.getBoolean("doWorldGen", CATEGORY_MISC, doWorldGen, "Set to false to disable all world gen");
        cfg.addCustomCategoryComment(CATEGORY_TOOLS, "values of tools");
        rubyHarvestLevel = cfg.getInt("rubyHarvestLevel", CATEGORY_TOOLS, 4, 0, 10, "Ruby pickaxe harvest level");
        rubyMaxUses = cfg.getInt("Ruby Uses", CATEGORY_TOOLS, 4096, 0, 100000000, "Maximum durability of the ruby tools");
        rubyEfficiency = cfg.getInt("RubyEfficiency", CATEGORY_TOOLS, 14, 0, 5000, "Efficiency of ruby tools");
        rubyDamage = cfg.getInt("Ruby Damage", CATEGORY_TOOLS, 9, 0, 1000000, "Damage dealt by ruby tools");
        rubyEnchantability = cfg.getInt("Ruby Enchantability", CATEGORY_TOOLS, 19, 0, 50, "Higher means better enchants");
        
    }
    

}