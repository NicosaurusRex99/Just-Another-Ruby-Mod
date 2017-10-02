package naturix.JARM;

import net.minecraftforge.common.config.Configuration;
import scala.Int;

import org.apache.logging.log4j.Level;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.proxy.CommonProxy;


public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_RUBY_ORE = "Ruby Ore";

    public static boolean isRubyBeaconBase = true;
    public static int rubyVeinSize = 2;
    public static int rubyMax = 15;
    public static int rubyMin = 1;
    public static int rubySpawnTries = 1;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
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
        cfg.addCustomCategoryComment(CATEGORY_RUBY_ORE, "Generation of ruby ore");
        rubyVeinSize = cfg.getInt("rubyVeinSize", CATEGORY_RUBY_ORE, 2, 1, 1000, "choose a number between 1 and 1000 to change the size of ruby ore veins");
        rubyMin = cfg.getInt("rubyMin", CATEGORY_RUBY_ORE, 1, 1, 255, "choose a number between 1 and 255 to choose the min ruby ore height");
        rubyMax = cfg.getInt("rubyMax", CATEGORY_RUBY_ORE, 15, 1, 256, "choose a number between 1 and 256 to choose the max ruby ore height");
        rubySpawnTries = cfg.getInt("rubySpawnTries", CATEGORY_RUBY_ORE, 1, 1, 100, "choose a number between 1 and 100 to change how often you see ruby ore");


    }
    

}