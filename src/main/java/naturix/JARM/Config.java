package naturix.JARM;

import net.minecraftforge.common.config.Configuration;
import scala.Int;

import org.apache.logging.log4j.Level;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.proxy.CommonProxy;


public class Config {

    private static final String CATEGORY_GENERAL = "general";

    public static boolean AddMeme = true;
    public static boolean isRubyBeaconBase = true;

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
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        AddMeme = cfg.getBoolean("addMeme", CATEGORY_GENERAL, AddMeme, "Set to false if you don't like memes");
        isRubyBeaconBase = cfg.getBoolean("isRubyBeaconBase", CATEGORY_GENERAL, isRubyBeaconBase, "Set to false to disable ruby block from being a beacon base");
    }

}