package naturix.jarm.registry;

import naturix.jarm.JARM;
import naturix.jarm.armor.BootsBase;
import naturix.jarm.armor.ChestplateBase;
import naturix.jarm.armor.HelmetBase;
import naturix.jarm.armor.LeggingsBase;
import naturix.jarm.armor.PrismarineHelmet;
import naturix.jarm.armor.ShulkerBoots;
import naturix.jarm.items.ItemBase;
import naturix.jarm.items.tools.AxeBase;
import naturix.jarm.items.tools.HoeBase;
import naturix.jarm.items.tools.PickaxeBase;
import naturix.jarm.items.tools.SpadeBase;
import naturix.jarm.items.tools.SwordBase;
import naturix.jarm.items.tools.hammers.BrauniteHammer;
import naturix.jarm.items.tools.hammers.HammerBase;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemBase gemRuby = new ItemBase("gem_ruby").setCreativeTab(JARM.JARM);
	public static ItemBase gemBraunite= new ItemBase("gem_braunite").setCreativeTab(JARM.JARM);
	public static ItemBase gemAmber= new ItemBase("gem_amber").setCreativeTab(JARM.JARM);
	public static ItemBase gemCinnibar= new ItemBase("gem_cinnibar").setCreativeTab(JARM.JARM);
	public static ItemBase gemFossil= new ItemBase("gem_fossil").setCreativeTab(JARM.JARM);
	public static ItemBase gemJade= new ItemBase("gem_jade").setCreativeTab(JARM.JARM);
	public static ItemBase gemMeteorite= new ItemBase("gem_meteorite").setCreativeTab(JARM.JARM);
	public static ItemBase gemOpal= new ItemBase("gem_opal").setCreativeTab(JARM.JARM);
	public static ItemBase gemSaphire= new ItemBase("gem_saphire").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_tin= new ItemBase("ingot_tin").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_copper= new ItemBase("ingot_copper").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_lead= new ItemBase("ingot_lead").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_silver= new ItemBase("ingot_silver").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_tungsten= new ItemBase("ingot_tungsten").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_platinum= new ItemBase("ingot_platinum").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_cobalt= new ItemBase("ingot_cobalt").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_mythrill= new ItemBase("ingot_mythrill").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_titanium= new ItemBase("ingot_titanium").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_luminite= new ItemBase("ingot_luminite").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_uranium= new ItemBase("ingot_uranium").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_nickel= new ItemBase("ingot_nickel").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_steel= new ItemBase("ingot_steel").setCreativeTab(JARM.JARM);
	public static ItemBase ingot_osmium= new ItemBase("ingot_osmium").setCreativeTab(JARM.JARM);
	
	public static BootsBase bootsAmethyst= new BootsBase("AmethystBoots");
	public static LeggingsBase leggingsAmethyst= new LeggingsBase("AmethystLeggings");
	public static ChestplateBase chestplateAmethyst= new ChestplateBase("AmethystChestplate");
	public static HelmetBase helmetAmethyst= new HelmetBase("AmethystHelmet");
	public static BootsBase bootsBraunite = new BootsBase("BrauniteBoots");
	public static LeggingsBase leggingsBraunite= new LeggingsBase("BrauniteLeggings");
	public static ChestplateBase chestplateBraunite= new ChestplateBase("BrauniteChestplate");
	public static HelmetBase helmetBraunite= new HelmetBase("BrauniteHelmet");
	public static BootsBase bootsEmerald= new BootsBase("EmeraldBoots");
	public static LeggingsBase leggingsEmerald= new LeggingsBase("EmeraldLeggings");
	public static ChestplateBase chestplateEmerald= new ChestplateBase("EmeraldChestplate");
	public static HelmetBase helmetEmerald= new HelmetBase("EmeraldHelmet");
	public static BootsBase bootsLapis= new BootsBase("LapisBoots");
	public static LeggingsBase leggingsLapis= new LeggingsBase("LapisLeggings");
	public static ChestplateBase chestplateLapis= new ChestplateBase("LapisChestplate");
	public static HelmetBase helmetLapis= new HelmetBase("LapisHelmet");
	public static BootsBase bootsRuby= new BootsBase("RubyBoots");
	public static LeggingsBase leggingsRuby= new LeggingsBase("RubyLeggings");
	public static ChestplateBase chestplateRuby= new ChestplateBase("RubyChestplate");
	public static HelmetBase helmetRuby= new HelmetBase("RubyHelmet");
	public static ShulkerBoots bootsShulker= new ShulkerBoots("ShulkerBoots");
	public static LeggingsBase leggingsShulker= new LeggingsBase("ShulkerLeggings");
	public static ChestplateBase chestplateShulker= new ChestplateBase("ShulkerChestplate");
	public static HelmetBase helmetShulker= new HelmetBase("ShulkerHelmet");
	public static PrismarineHelmet helmetPrismarine= new PrismarineHelmet("PrismarineHelmet");
	public static HammerBase rubyHammer = new HammerBase(JARM.rubyToolMaterial, "hammer_ruby");
	public static BrauniteHammer brauniteHammer = new BrauniteHammer(JARM.brauniteToolMaterial, "hammer_braunite");
	public static HammerBase amethystHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_amethyst");
	public static SwordBase amethystSword = new SwordBase(JARM.AmethystToolMaterial, "sword_amethyst");
	public static SwordBase brauniteSword = new SwordBase(JARM.brauniteToolMaterial, "sword_braunite");
	public static SwordBase emeraldSword = new SwordBase(JARM.EmeraldToolMaterial, "sword_emerald");
	public static SwordBase lapisSword = new SwordBase(JARM.LapisToolMaterial, "sword_lapis");
	public static SwordBase rubySword = new SwordBase(JARM.rubyToolMaterial, "sword_ruby");
	public static SpadeBase amethystSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_amethyst");
	public static SpadeBase brauniteSpade = new SpadeBase(JARM.brauniteToolMaterial, "spade_braunite");
	public static SpadeBase emeraldSpade = new SpadeBase(JARM.EmeraldToolMaterial, "spade_emerald");
	public static SpadeBase lapisSpade = new SpadeBase(JARM.LapisToolMaterial, "spade_lapis");
	public static SpadeBase rubySpade = new SpadeBase(JARM.rubyToolMaterial, "spade_ruby");
	public static PickaxeBase amethystPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_amethyst");
	public static PickaxeBase braunitePickaxe = new PickaxeBase(JARM.brauniteToolMaterial, "pickaxe_braunite");
	public static PickaxeBase emeraldPickaxe = new PickaxeBase(JARM.EmeraldToolMaterial, "pickaxe_emerald");
	public static PickaxeBase lapisPickaxe = new PickaxeBase(JARM.LapisToolMaterial, "pickaxe_lapis");
	public static PickaxeBase rubyPickaxe = new PickaxeBase(JARM.rubyToolMaterial, "pickaxe_ruby");
	public static AxeBase amethystAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_amethyst");
	public static AxeBase brauniteAxe = new AxeBase(JARM.brauniteToolMaterial, "axe_braunite");
	public static AxeBase emeraldAxe = new AxeBase(JARM.EmeraldToolMaterial, "axe_emerald");
	public static AxeBase lapisAxe = new AxeBase(JARM.LapisToolMaterial, "axe_lapis");
	public static AxeBase rubyAxe = new AxeBase(JARM.rubyToolMaterial, "axe_ruby");
	public static HoeBase amethystHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_amethyst");
	public static HoeBase brauniteHoe = new HoeBase(JARM.brauniteToolMaterial, "hoe_braunite");
	public static HoeBase emeraldHoe = new HoeBase(JARM.EmeraldToolMaterial, "hoe_emerald");
	public static HoeBase lapisHoe = new HoeBase(JARM.LapisToolMaterial, "hoe_lapis");
	public static HoeBase rubyHoe = new HoeBase(JARM.rubyToolMaterial, "hoe_ruby");
	
	public static void register(IForgeRegistry<Item> registry) {
	if(ConfigMain.rubyModule == true) {
		registry.registerAll(
				gemRuby,
				bootsRuby,
				leggingsRuby,
				chestplateRuby,
				helmetRuby,
				rubyHoe,
				rubyPickaxe,
				rubySpade,
				rubySword,
				rubyAxe
		);
		if(Loader.isModLoaded("thermalfoundation")) {
			registry.registerAll(
					rubyHammer
					);
		}
	if(ConfigMain.brauniteModule == true) {
		registry.registerAll(
				gemBraunite,
				bootsBraunite,
				leggingsBraunite,
				chestplateBraunite,
				helmetBraunite,
				brauniteHoe,
				braunitePickaxe,
				brauniteSpade,
				brauniteSword,
				brauniteAxe
		);if(Loader.isModLoaded("thermalfoundation")) {
			registry.registerAll(
					brauniteHammer
					);
		}
		}
	 
	 if(ConfigMain.prismarineModule == true) {
		 registry.registerAll(
					helmetPrismarine
			);
	    }
	 if(ConfigMain.lapisModule == true) {
		 registry.registerAll(
					bootsLapis,
					leggingsLapis,
					chestplateLapis,
					helmetLapis,
					lapisHoe,
					lapisPickaxe,
					lapisSpade,
					lapisSword,
					lapisAxe
			);
	    }
	 if(ConfigMain.emeraldModule == true) {
		 registry.registerAll(
				 	bootsEmerald,
					leggingsEmerald,
					chestplateEmerald,
					helmetEmerald,
					emeraldHoe,
					emeraldPickaxe,
					emeraldSpade,
					emeraldSword,
					emeraldAxe
					);
	    }
	 if(ConfigMain.amethystModule == true) {
		 registry.registerAll(
				 	bootsAmethyst,
					leggingsAmethyst,
					chestplateAmethyst,
					helmetAmethyst,
					amethystHoe,
					amethystPickaxe,
					amethystSpade,
					amethystSword,
					amethystAxe
					);
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						amethystHammer
						);
			}
	    }
	 if(ConfigMain.shulkerModule == true) {
		 registry.registerAll(
				 	bootsShulker,
					leggingsShulker,
					chestplateShulker,
					helmetShulker
					);
	    }
	 if(ConfigMain.amberModule == true) {
		 registry.registerAll(
				 gemAmber
				 );
	 }
	 if(ConfigMain.cinnibarModule == true) {
		 registry.registerAll(
				 gemCinnibar
				 );
	 }
	 if(ConfigMain.fossilModule == true) {
		 registry.registerAll(
				 gemFossil
				 );
	 }
	 if(ConfigMain.jadeModule == true) {
		 registry.registerAll(
				 gemJade
				 );
	 }
	 if(ConfigMain.opalModule == true) {
		 registry.registerAll(
				 gemOpal
				 );
	 }
	 if(ConfigMain.saphireModule == true) {
		 registry.registerAll(
				 gemSaphire
				 );
	 }
	 if(ConfigMain.meteoriteModule == true) {
		 registry.registerAll(
				 gemMeteorite
				 );
	 }
	 if(ConfigMain.tinModule == true) {
		 registry.registerAll(
				 ingot_tin
				 );
	 }
	 if(ConfigMain.copperModule == true) {
		 registry.registerAll(
				 ingot_copper
				 );
	 }
	 if(ConfigMain.leadModule == true) {
		 registry.registerAll(
				 ingot_lead
				 );
	 }
	 if(ConfigMain.silverModule == true) {
		 registry.registerAll(
				 ingot_silver
				 );
	 }
	 if(ConfigMain.tungstenModule == true) {
		 registry.registerAll(
				 ingot_tungsten
				 );
	 }
	 if(ConfigMain.platinumModule == true) {
		 registry.registerAll(
				 ingot_platinum
				 );
	 }
	 if(ConfigMain.cobaltModule == true) {
		 registry.registerAll(
				 ingot_cobalt
				 );
	 }
	 if(ConfigMain.mythrillModule == true) {
		 registry.registerAll(
				 ingot_mythrill
				 );
	 }
	 if(ConfigMain.titaniumModule == true) {
		 registry.registerAll(
				 ingot_titanium
				 );
	 }
	 if(ConfigMain.luminiteModule == true) {
		 registry.registerAll(
				 ingot_luminite
				 );
	 }
	 if(ConfigMain.uraniumModule == true) {
		 registry.registerAll(
				 ingot_uranium
				 );
	 }
	 if(ConfigMain.nickelModule == true) {
		 registry.registerAll(
				 ingot_nickel
				 );
	 }
	 if(ConfigMain.steelModule == true) {
		 registry.registerAll(
				 ingot_steel
				 );
	 }
	 if(ConfigMain.osmiumModule == true) {
		 registry.registerAll(
				 ingot_osmium
				 );
	 }
	 
	 }}

public static void registerModels() {
	if(ConfigMain.rubyModule == true) {
				gemRuby.registerItemModel();
				bootsRuby.registerItemModel();
				leggingsRuby.registerItemModel();
				chestplateRuby.registerItemModel();
				helmetRuby.registerItemModel();
				rubyHoe.registerItemModel();
				rubyPickaxe.registerItemModel();
				rubySpade.registerItemModel();
				rubySword.registerItemModel();
				rubyAxe.registerItemModel();
				
				if(Loader.isModLoaded("thermalexpansion")) {
					rubyHammer.registerItemModel();
				}
				}
	if(ConfigMain.brauniteModule == true) {
				gemBraunite.registerItemModel();
				bootsBraunite.registerItemModel();
				leggingsBraunite.registerItemModel();
				chestplateBraunite.registerItemModel();
				helmetBraunite.registerItemModel();
				brauniteHoe.registerItemModel();
				braunitePickaxe.registerItemModel();
				brauniteSpade.registerItemModel();
				brauniteSword.registerItemModel();
				brauniteAxe.registerItemModel();
				if(Loader.isModLoaded("thermalexpansion")) {
					brauniteHammer.registerItemModel();
				}
		}
	 
	 if(ConfigMain.prismarineModule == true) {
					helmetPrismarine.registerItemModel();
	    }
	 if(ConfigMain.lapisModule == true) {
					bootsLapis.registerItemModel();
					leggingsLapis.registerItemModel();
					chestplateLapis.registerItemModel();
					helmetLapis.registerItemModel();
					lapisHoe.registerItemModel();
					lapisPickaxe.registerItemModel();
					lapisSpade.registerItemModel();
					lapisSword.registerItemModel();
					lapisAxe.registerItemModel();
	    }
	 if(ConfigMain.emeraldModule == true) {
				 	bootsEmerald.registerItemModel();
					leggingsEmerald.registerItemModel();
					chestplateEmerald.registerItemModel();
					helmetEmerald.registerItemModel();
					emeraldHoe.registerItemModel();
					emeraldPickaxe.registerItemModel();
					emeraldSpade.registerItemModel();
					emeraldSword.registerItemModel();
					emeraldAxe.registerItemModel();
	    }
	 if(ConfigMain.amethystModule == true) {
				 	bootsAmethyst.registerItemModel();
					leggingsAmethyst.registerItemModel();
					chestplateAmethyst.registerItemModel();
					helmetAmethyst.registerItemModel();
					amethystHoe.registerItemModel();
					amethystPickaxe.registerItemModel();
					amethystSpade.registerItemModel();
					amethystSword.registerItemModel();
					amethystAxe.registerItemModel();
					if(Loader.isModLoaded("thermalexpansion")) {
						amethystHammer.registerItemModel();
					}
	    }
	 if(ConfigMain.shulkerModule == true) {
				 	bootsShulker.registerItemModel();
					leggingsShulker.registerItemModel();
					chestplateShulker.registerItemModel();
					helmetShulker.registerItemModel();
	    }
	 if(ConfigMain.amberModule == true) {
		 gemAmber.registerItemModel();
	 }
	 if(ConfigMain.cinnibarModule == true) {
		 gemCinnibar.registerItemModel();
	 }
	 if(ConfigMain.fossilModule == true) {
		 gemFossil.registerItemModel();
	 }
	 if(ConfigMain.jadeModule == true) {
		 gemJade.registerItemModel();
	 }
	 if(ConfigMain.opalModule == true) {
		 gemOpal.registerItemModel();
	 }
	 if(ConfigMain.saphireModule == true) {
		 gemSaphire.registerItemModel();
	 }
	 if(ConfigMain.meteoriteModule == true) {
		 gemMeteorite.registerItemModel();
	 }
	 if(ConfigMain.tinModule == true) {
		 ingot_tin.registerItemModel();
		 	 }
	 if(ConfigMain.copperModule == true) {
		 ingot_copper.registerItemModel();
		 	 }
	 if(ConfigMain.leadModule == true) {
		 ingot_lead.registerItemModel();
		 	 }
	 if(ConfigMain.silverModule == true) {
		 ingot_silver.registerItemModel();
		 	 }
	 if(ConfigMain.tungstenModule == true) {
		 ingot_tungsten.registerItemModel();
		 	 }
	 if(ConfigMain.platinumModule == true) {
		 ingot_platinum.registerItemModel();
		 	 }
	 if(ConfigMain.cobaltModule == true) {
		 ingot_cobalt.registerItemModel();
		 	 }
	 if(ConfigMain.mythrillModule == true) {
		 ingot_mythrill.registerItemModel();
		 	 }
	 if(ConfigMain.titaniumModule == true) {
		 ingot_titanium.registerItemModel();
		 	 }
	 if(ConfigMain.luminiteModule == true) {
		 ingot_luminite.registerItemModel();
		 	 }
	 if(ConfigMain.uraniumModule == true) {
		 ingot_uranium.registerItemModel();
		 	 }
	 if(ConfigMain.nickelModule == true) {
		 ingot_nickel.registerItemModel();
		 	 }
	 if(ConfigMain.steelModule == true) {
		 ingot_steel.registerItemModel();
		 	 }
	 if(ConfigMain.osmiumModule == true) {
		 ingot_osmium.registerItemModel();
		 	 }
	}
}