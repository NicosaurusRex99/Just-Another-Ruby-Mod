package naturix.jarm.utils.config;

import org.apache.logging.log4j.Level;

import naturix.jarm.JARM;
import naturix.jarm.proxy.CommonProxy;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Configuration;


public class Config {

    private static final String CATEGORY_GENERAL = "General";
    private static final String CATEGORY_ORE = "Ore Gen";
    private static final String CATEGORY_ARMOUR = "Armour";
    private static final String CATEGORY_MISC = "Misc";
    private static final String CATEGORY_MODULES = "Modules";

    public static boolean addBeaconBase = true;
    public static boolean doWorldGen = true;
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
    public static boolean amberModule = true;
    public static boolean cinnibarModule = true;
    public static boolean fossilModule = false;
    public static boolean jadeModule = true;
    public static boolean meteoriteModule = true;
    public static boolean opalModule = true;
    public static boolean saphireModule = true;
    public static boolean tinModule = true;
    public static boolean copperModule = true;
    public static boolean leadModule = true;
    public static boolean silverModule = true;
    public static boolean tungstenModule = true;
    public static boolean platinumModule = true;
    public static boolean cobaltModule = true;
    public static boolean mythrillModule = true;
    public static boolean titaniumModule = true;
    public static boolean luminiteModule = true;
    public static boolean uraniumModule = true;
    public static boolean nickelModule = true;
    public static boolean steelModule = true;
    public static boolean osmiumModule = true;
    public static boolean woodModule = true;
    public static boolean updateNotifications = true;
    public static int maxCooldown;
    public static int magRange;
    public static int pullSpeed;
    public static int maxPull;
    public static int amberVeinSize = 2;
    public static int amberMax = 15;
    public static int amberMin = 1;
    public static int amberSpawnTries = 1;
    public static int cinnibarVeinSize = 2;
    public static int cinnibarMax = 15;
    public static int cinnibarMin = 1;
    public static int cinnibarSpawnTries = 1;
    public static int fossilVeinSize = 2;
    public static int fossilMax = 15;
    public static int fossilMin = 1;
    public static int fossilSpawnTries = 1;
    public static int jadeVeinSize = 2;
    public static int jadeMax = 15;
    public static int jadeMin = 1;
    public static int jadeSpawnTries = 1;
    public static int meteoriteVeinSize = 2;
    public static int meteoriteMax = 15;
    public static int meteoriteMin = 1;
    public static int meteoriteSpawnTries = 1;
    public static int opalVeinSize = 2;
    public static int opalMax = 15;
    public static int opalMin = 1;
    public static int opalSpawnTries = 1;
    public static int saphireVeinSize = 2;
    public static int saphireMax = 15;
    public static int saphireMin = 1;
    public static int saphireSpawnTries = 1;
    public static int tinVeinSize = 2;
    public static int tinMax = 15;
    public static int tinMin = 1;
    public static int tinSpawnTries = 1;
    public static int copperVeinSize = 2;
    public static int copperMax = 15;
    public static int copperMin = 1;
    public static int copperSpawnTries = 1;
    public static int leadVeinSize = 2;
    public static int leadMax = 15;
    public static int leadMin = 1;
    public static int leadSpawnTries = 1;
    public static int silverVeinSize = 2;
    public static int silverMax = 15;
    public static int silverMin = 1;
    public static int silverSpawnTries = 1;
    public static int tungstenVeinSize = 2;
    public static int tungstenMax = 15;
    public static int tungstenMin = 1;
    public static int tungstenSpawnTries = 1;
    public static int platinumVeinSize = 2;
    public static int platinumMax = 15;
    public static int platinumMin = 1;
    public static int platinumSpawnTries = 1;
    public static int cobaltVeinSize = 2;
    public static int cobaltMax = 15;
    public static int cobaltMin = 1;
    public static int cobaltSpawnTries = 1;
    public static int mythrillVeinSize = 2;
    public static int mythrillMax = 15;
    public static int mythrillMin = 1;
    public static int mythrillSpawnTries = 1;
    public static int titaniumVeinSize = 2;
    public static int titaniumMax = 15;
    public static int titaniumMin = 1;
    public static int titaniumSpawnTries = 1;
    public static int luminiteVeinSize = 2;
    public static int luminiteMax = 15;
    public static int luminiteMin = 1;
    public static int luminiteSpawnTries = 1;
    public static int uraniumVeinSize = 2;
    public static int uraniumMax = 15;
    public static int uraniumMin = 1;
    public static int uraniumSpawnTries = 1;
    public static int osmiumVeinSize = 2;
    public static int osmiumMax = 15;
    public static int osmiumMin = 1;
    public static int osmiumSpawnTries = 1;
    public static int nickelVeinSize = 2;
    public static int nickelMax = 15;
    public static int nickelMin = 1;
    public static int nickelSpawnTries = 1;
    
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
        addBeaconBase = cfg.getBoolean("addBeaconBase", CATEGORY_GENERAL, addBeaconBase, "Set to false to disable ingot/gem blocks from being a beacon base");
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
        cfg.addCustomCategoryComment(CATEGORY_MODULES, "Individual Modules");
        rubyModule = cfg.getBoolean("ruby", CATEGORY_MODULES, rubyModule, "Disable to remove this module");
        amethystModule = cfg.getBoolean("amethyst", CATEGORY_MODULES, amethystModule, "Disable to remove this module");
        brauniteModule = cfg.getBoolean("braunite", CATEGORY_MODULES, brauniteModule, "Disable to remove this module");
        emeraldModule = cfg.getBoolean("emerald", CATEGORY_MODULES, emeraldModule, "Disable to remove this module");
        lapisModule = cfg.getBoolean("lapis", CATEGORY_MODULES, lapisModule, "Disable to remove this module");
        prismarineModule = cfg.getBoolean("prismarine", CATEGORY_MODULES, prismarineModule, "Disable to remove this module");
        shulkerModule = cfg.getBoolean("shulker", CATEGORY_MODULES, shulkerModule, "Disable to remove this module");
        amberModule = cfg.getBoolean("amber", CATEGORY_MODULES, amberModule, "Disable to remove this module");
        cinnibarModule = cfg.getBoolean("cinnibar", CATEGORY_MODULES, cinnibarModule, "Disable to remove this module");
        fossilModule = cfg.getBoolean("fossil", CATEGORY_MODULES, fossilModule, "Enable to see some WIP stuff");
        jadeModule = cfg.getBoolean("jade", CATEGORY_MODULES, jadeModule, "Disable to remove this module");
        meteoriteModule = cfg.getBoolean("meteorite", CATEGORY_MODULES, meteoriteModule, "Disable to remove this module");
        opalModule = cfg.getBoolean("opal", CATEGORY_MODULES, opalModule, "Disable to remove this module");
        saphireModule = cfg.getBoolean("saphire", CATEGORY_MODULES, saphireModule, "Disable to remove this module");
        tinModule = cfg.getBoolean("tin", CATEGORY_MODULES, tinModule, "Disable to remove this module");
        copperModule = cfg.getBoolean("copper", CATEGORY_MODULES, copperModule, "Disable to remove this module");
        leadModule = cfg.getBoolean("lead", CATEGORY_MODULES, leadModule, "Disable to remove this module");
        silverModule = cfg.getBoolean("silver", CATEGORY_MODULES, silverModule, "Disable to remove this module");
        tungstenModule = cfg.getBoolean("tungsten", CATEGORY_MODULES, tungstenModule, "Disable to remove this module");
        platinumModule = cfg.getBoolean("platinum", CATEGORY_MODULES, platinumModule, "Disable to remove this module");
        cobaltModule = cfg.getBoolean("cobalt", CATEGORY_MODULES, cobaltModule, "Disable to remove this module");
        mythrillModule = cfg.getBoolean("mythrill", CATEGORY_MODULES, mythrillModule, "Disable to remove this module");
        titaniumModule = cfg.getBoolean("titanium", CATEGORY_MODULES, titaniumModule, "Disable to remove this module");
        luminiteModule = cfg.getBoolean("luminite", CATEGORY_MODULES, luminiteModule, "Disable to remove this module");
        uraniumModule = cfg.getBoolean("uranium", CATEGORY_MODULES, uraniumModule, "Disable to remove this module");
        nickelModule = cfg.getBoolean("nickel", CATEGORY_MODULES, nickelModule, "Disable to remove this module");
        steelModule = cfg.getBoolean("steel", CATEGORY_MODULES, steelModule, "Disable to remove this module");
        osmiumModule = cfg.getBoolean("osmium", CATEGORY_MODULES, osmiumModule, "Disable to remove this module");
        updateNotifications = cfg.getBoolean("update alerts", CATEGORY_GENERAL, updateNotifications, "Disable to remove the ingame update notification");
        maxCooldown = cfg.getInt("MeteorCooldown", CATEGORY_GENERAL, 4, 1, 1000000, "How long until the meteor can pull more stuff");
        magRange = cfg.getInt("MeteorRange", CATEGORY_GENERAL, 4, 1, 1000000, "Meteor pull range");
        pullSpeed = cfg.getInt("MeteorPullSpeed", CATEGORY_GENERAL, 4, 1, 1000000, "Meteor pull speed");
        maxPull = cfg.getInt("MeteorPull", CATEGORY_GENERAL, 4, 1, 1000000, "Meteor max pull");
        woodModule = cfg.getBoolean("wood", CATEGORY_MODULES, woodModule, "Disable to remove this module");
    	amberVeinSize = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        amberMax = cfg.getInt("amberMax", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        amberMin = cfg.getInt("amberMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        amberSpawnTries = cfg.getInt("amberTries", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cinnibarVeinSize = cfg.getInt("cinnibarSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cinnibarMax = cfg.getInt("cinnibarMax", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cinnibarMin = cfg.getInt("cinnibarMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cinnibarSpawnTries = cfg.getInt("cinnibarTries", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        fossilVeinSize = cfg.getInt("fossilSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        fossilMax  = cfg.getInt("fossilMax", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        fossilMin  = cfg.getInt("fossilMin", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        fossilSpawnTries  = cfg.getInt("fossilTries", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        jadeVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        jadeMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        jadeMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        jadeSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        meteoriteVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        meteoriteMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        meteoriteMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        meteoriteSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        opalVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        opalMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        opalMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        opalSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        saphireVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        saphireMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        saphireMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        saphireSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tinVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tinMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tinMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tinSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        copperVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        copperMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        copperMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        copperSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        leadVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        leadMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        leadMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        leadSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        silverVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        silverMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        silverMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        silverSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tungstenVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tungstenMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tungstenMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        tungstenSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        platinumVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        platinumMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        platinumMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        platinumSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cobaltVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cobaltMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cobaltMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        cobaltSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        mythrillVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        mythrillMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        mythrillMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        mythrillSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        titaniumVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        titaniumMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        titaniumMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        titaniumSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        luminiteVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        luminiteMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        luminiteMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        luminiteSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        uraniumVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        uraniumMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        uraniumMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        uraniumSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        osmiumVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        osmiumMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        osmiumMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        osmiumSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        nickelVeinSize  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        nickelMax  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        nickelMin  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
        nickelSpawnTries  = cfg.getInt("amberSize", CATEGORY_ORE, 1, 1, 255, "Choose a number between 1 and 255 to choose the min ore height");
    }
    public static class GameRules
    {
    	@Comment("Adding dimension ids to this list allows JARM ores to spawn in that dimension")
		public String[] CustomDimensionIDs = {""};
		
    }
    }
    
