package naturix.JARM.proxy;

import java.io.File;

import naturix.JARM.Config;
import naturix.JARM.JARM;
import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import naturix.JARM.armor.AmethystBoots;
import naturix.JARM.armor.AmethystChestplate;
import naturix.JARM.armor.AmethystHelmet;
import naturix.JARM.armor.AmethystLeggings;
import naturix.JARM.armor.EmeraldBoots;
import naturix.JARM.armor.EmeraldChestplate;
import naturix.JARM.armor.EmeraldHelmet;
import naturix.JARM.armor.EmeraldLeggings;
import naturix.JARM.armor.LapisBoots;
import naturix.JARM.armor.LapisChestplate;
import naturix.JARM.armor.LapisHelmet;
import naturix.JARM.armor.LapisLeggings;
import naturix.JARM.armor.PrismarineHelmet;
import naturix.JARM.armor.RubyBoots;
import naturix.JARM.armor.RubyChestplate;
import naturix.JARM.armor.RubyHelmet;
import naturix.JARM.armor.RubyLeggings;
import naturix.JARM.armor.ShulkerBoots;
import naturix.JARM.armor.ShulkerChestplate;
import naturix.JARM.armor.ShulkerHelmet;
import naturix.JARM.armor.ShulkerLeggings;
import naturix.JARM.blocks.Amethyst;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.blocks.RubyOre;
import naturix.JARM.items.AxeAmethyst;
import naturix.JARM.items.AxeEmerald;
import naturix.JARM.items.AxeLapis;
import naturix.JARM.items.AxeRuby;
import naturix.JARM.items.GemRuby;
import naturix.JARM.items.HoeAmethyst;
import naturix.JARM.items.HoeEmerald;
import naturix.JARM.items.HoeLapis;
import naturix.JARM.items.HoeRuby;
import naturix.JARM.items.PickaxeAmethyst;
import naturix.JARM.items.PickaxeEmerald;
import naturix.JARM.items.PickaxeLapis;
import naturix.JARM.items.PickaxeRuby;
import naturix.JARM.items.ShovelAmethyst;
import naturix.JARM.items.ShovelEmerald;
import naturix.JARM.items.ShovelLapis;
import naturix.JARM.items.ShovelRuby;
import naturix.JARM.items.SwordAmethyst;
import naturix.JARM.items.SwordEmerald;
import naturix.JARM.items.SwordLapis;
import naturix.JARM.items.SwordRuby;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "naturix/Just Another Ruby Mod.cfg"));
        JARM.logger.info("JARM config found");
        Config.readConfig();
        JARM.logger.info("JARM config read");
        ModItems.initOreDict();
    }

    public void init(FMLInitializationEvent e)
    {
    	 JARM.logger.info("JARM Initialized :D");
    }
    
    public void postInit(FMLPostInitializationEvent e) 
    {
    	if (config.hasChanged()) {
            config.save();
            JARM.logger.info("JARM config loaded");
    }
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(new RubyBlock());
    	event.getRegistry().register(new RubyOre(null));
    	event.getRegistry().register(new Amethyst(null));
    	JARM.logger.info("JARM Blocks have just been loaded");
    	
    }
        
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new GemRuby());
        event.getRegistry().register(new SwordRuby(null));
        event.getRegistry().register(new PickaxeRuby(null));
        event.getRegistry().register(new AxeRuby(null));
        event.getRegistry().register(new ShovelRuby(null));
        event.getRegistry().register(new HoeRuby(null));
        event.getRegistry().register(new RubyBoots());
        event.getRegistry().register(new RubyLeggings());
        event.getRegistry().register(new RubyChestplate());
        event.getRegistry().register(new RubyHelmet());
        event.getRegistry().register(new PrismarineHelmet());
        event.getRegistry().register(new LapisBoots());
        event.getRegistry().register(new LapisLeggings());
        event.getRegistry().register(new LapisChestplate());
        event.getRegistry().register(new LapisHelmet());
        event.getRegistry().register(new AxeLapis(null));
        event.getRegistry().register(new SwordLapis(null));
        event.getRegistry().register(new HoeLapis(null));
        event.getRegistry().register(new PickaxeLapis(null));
        event.getRegistry().register(new ShovelLapis(null));
        event.getRegistry().register(new EmeraldBoots());
        event.getRegistry().register(new EmeraldLeggings());
        event.getRegistry().register(new EmeraldChestplate());
        event.getRegistry().register(new EmeraldHelmet());
        event.getRegistry().register(new AxeEmerald(null));
        event.getRegistry().register(new HoeEmerald(null));
        event.getRegistry().register(new PickaxeEmerald(null));
        event.getRegistry().register(new ShovelEmerald(null));
        event.getRegistry().register(new SwordEmerald(null));
        event.getRegistry().register(new AxeAmethyst(null));
        event.getRegistry().register(new HoeAmethyst(null));
        event.getRegistry().register(new PickaxeAmethyst(null));
        event.getRegistry().register(new ShovelAmethyst(null));
        event.getRegistry().register(new SwordAmethyst(null));
        event.getRegistry().register(new AmethystHelmet());
        event.getRegistry().register(new AmethystChestplate());
        event.getRegistry().register(new AmethystLeggings());
        event.getRegistry().register(new AmethystBoots());
        event.getRegistry().register(new ShulkerBoots());
        event.getRegistry().register(new ShulkerLeggings());
        event.getRegistry().register(new ShulkerChestplate());
        event.getRegistry().register(new ShulkerHelmet());
        event.getRegistry().register(new ItemBlock(ModBlocks.rubyblock).setRegistryName(ModBlocks.rubyblock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.rubyore).setRegistryName(ModBlocks.rubyore.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.amethystrock).setRegistryName(ModBlocks.amethystrock.getRegistryName()));
        JARM.logger.info("JARM Items have just been loaded");
    }



}