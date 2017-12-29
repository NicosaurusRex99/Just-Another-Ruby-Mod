package naturix.JARM;

import org.apache.logging.log4j.Logger;

import naturix.JARM.proxy.CommonProxy;
import naturix.JARM.recipestuff.ModRecipes;
import naturix.JARM.world.ModWorldGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = JARM.MODID, name = JARM.MODNAME, version = JARM.MODVERSION, updateJSON = JARM.UPDATE_URL)
public class JARM {

    public static final String MODID = "jarm";
    public static final String MODNAME = "Just Another Ruby Mod";
    public static final String MODVERSION = "1.12.2.9";
    public static final String UPDATE_URL = "https://raw.github.com/nicosaurusrex99/jarm/1.12.2/\" + MOD_ID + \"_update.json";

    @SidedProxy(clientSide = "naturix.JARM.proxy.ClientProxy", serverSide = "naturix.JARM.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JARM instance;

    public static Logger logger;
    
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("ruby", MODID + ":ruby", 15, new int[]{Config.rubyHelm, Config.rubyChest, Config.rubyLeg, Config.rubyBoot}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 4, 4096, 14, 9, 19);
    public static final ItemArmor.ArmorMaterial PrismarineArmorMaterial = EnumHelper.addArmorMaterial("prismarine", MODID + ":prismarine", 4, new int[]{Config.prismarineHelm, 5, 2, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LapisArmorMaterial = EnumHelper.addArmorMaterial("lapis", MODID + ":lapis", 4, new int[]{Config.lapisHelm, Config.lapisChest, Config.lapisLeg, Config.lapisBoot}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", MODID + ":emerald", 4, new int[]{Config.emeraldHelm, Config.emeraldChest, Config.emeraldLeg, Config.emeraldBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final ToolMaterial LapisToolMaterial = EnumHelper.addToolMaterial("LAPIS", 1, 100, 2, 1, 50);
    public static final ToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("EMERALD", 3, 1300, 11, 7, 50);
    public static final ToolMaterial AmethystToolMaterial = EnumHelper.addToolMaterial("AMETHYST", 4, 6723, 13, 10, 500);
    public static final ItemArmor.ArmorMaterial AmethystArmorMaterial = EnumHelper.addArmorMaterial("amethyst", MODID + ":emerald", 4, new int[]{Config.amethystHelm, Config.amethystChest, Config.amethystLeg, Config.amethystBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ShulkerArmorMaterial = EnumHelper.addArmorMaterial("SHULKER", MODID + ":shulker", 4, new int[]{Config.shulkerHelm, Config.shulkerChest, Config.shulkerLeg, Config.shulkerBoot}, 500, SoundEvents.ENTITY_SHULKER_AMBIENT, 0.0F); 
  

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
        proxy.preInit(event);
    	GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    	JARM.logger.info("WorldGen Loaded");
    	
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        ModRecipes.init();
        JARM.logger.info("JARM recipes loaded");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    public static final CreativeTabs JustAnotherRubyMod = new CreativeTabs("JARM")
    {

        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.swordruby);
        }
        @EventHandler
            public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
                FMLLog.bigWarning("Invalid fingerprint detected for the JARM jar file! The file " + e.getSource().getName() + " may have been tampered with. This version will NOT be supported!");
            }
		
    };
}