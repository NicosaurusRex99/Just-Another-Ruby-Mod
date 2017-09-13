package naturix.JARM;

import org.apache.logging.log4j.Logger;

import naturix.JARM.proxy.CommonProxy;
import naturix.JARM.recipestuffz.ModRecipes;
import naturix.JARM.world.ModWorldGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = JARM.MODID, name = JARM.MODNAME, version = JARM.MODVERSION, dependencies = "required-after:forge@[13.19.0.2129,)", useMetadata = true)
public class JARM {

    public static final String MODID = "jarm";
    public static final String MODNAME = "JARM";
    public static final String MODVERSION = "1.12.1.8";

    @SidedProxy(clientSide = "naturix.JARM.proxy.ClientProxy", serverSide = "naturix.JARM.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JARM instance;

    public static Logger logger;
    
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("ruby", MODID + ":ruby", 15, new int[]{5, 9, 12, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 4, 4096, 14, 9, 19);
    public static final ItemArmor.ArmorMaterial PrismarineArmorMaterial = EnumHelper.addArmorMaterial("prismarine", MODID + ":prismarine", 4, new int[]{2, 5, 2, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LapisArmorMaterial = EnumHelper.addArmorMaterial("lapis", MODID + ":lapis", 4, new int[]{2, 5, 2, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", MODID + ":emerald", 4, new int[]{4, 7, 5, 3}, 500, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final Item.ToolMaterial LapisToolMaterial = EnumHelper.addToolMaterial("LAPIS", 1, 100, 2, 1, 50);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        ModRecipes.init();
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
            return new ItemStack(ModBlocks.rubyblock);
        }
		
    };
}