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
import naturix.jarm.items.tools.hammers.MeteoriteHammer;
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
	public static HammerBase amberHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_amber");
	public static SwordBase amberSword = new SwordBase(JARM.AmethystToolMaterial, "sword_amber");
	public static SpadeBase amberSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_amber");
	public static PickaxeBase amberPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_amber");
	public static AxeBase amberAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_amber");
	public static HoeBase amberHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_amber");
	public static HammerBase jadeHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_jade");
	public static SwordBase jadeSword = new SwordBase(JARM.AmethystToolMaterial, "sword_jade");
	public static SpadeBase jadeSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_jade");
	public static PickaxeBase jadePickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_jade");
	public static AxeBase jadeAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_jade");
	public static HoeBase jadeHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_jade");
	public static HammerBase osmiumHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_osmium");
	public static SwordBase osmiumSword = new SwordBase(JARM.AmethystToolMaterial, "sword_osmium");
	public static SpadeBase osmiumSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_osmium");
	public static PickaxeBase osmiumPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_osmium");
	public static AxeBase osmiumAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_osmium");
	public static HoeBase osmiumHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_osmium");
	public static HammerBase cinnibarHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_cinnibar");
	public static SwordBase cinnibarSword = new SwordBase(JARM.AmethystToolMaterial, "sword_cinnibar");
	public static SpadeBase cinnibarSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_cinnibar");
	public static PickaxeBase cinnibarPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_cinnibar");
	public static AxeBase cinnibarAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_cinnibar");
	public static HoeBase cinnibarHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_cinnibar");
	public static HammerBase steelHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_steel");
	public static SwordBase steelSword = new SwordBase(JARM.AmethystToolMaterial, "sword_steel");
	public static SpadeBase steelSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_steel");
	public static PickaxeBase steelPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_steel");
	public static AxeBase steelAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_steel");
	public static HoeBase steelHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_steel");
	public static HammerBase nickelHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_nickel");
	public static SwordBase nickelSword = new SwordBase(JARM.AmethystToolMaterial, "sword_nickel");
	public static SpadeBase nickelSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_nickel");
	public static PickaxeBase nickelPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_nickel");
	public static AxeBase nickelAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_nickel");
	public static HoeBase nickelHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_nickel");
	public static HammerBase opalHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_opal");
	public static SwordBase opalSword = new SwordBase(JARM.AmethystToolMaterial, "sword_opal");
	public static SpadeBase opalSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_opal");
	public static PickaxeBase opalPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_opal");
	public static AxeBase opalAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_opal");
	public static HoeBase opalHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_opal");
	public static HammerBase uraniumHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_uranium");
	public static HammerBase saphireHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_saphire");
	public static SwordBase saphireSword = new SwordBase(JARM.AmethystToolMaterial, "sword_saphire");
	public static SpadeBase saphireSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_saphire");
	public static PickaxeBase saphirePickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_saphire");
	public static AxeBase saphireAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_saphire");
	public static HoeBase saphireHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_saphire");
	public static HammerBase luminiteHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_luminite");
	public static SwordBase luminiteSword = new SwordBase(JARM.AmethystToolMaterial, "sword_luminite");
	public static SpadeBase luminiteSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_luminite");
	public static PickaxeBase luminitePickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_luminite");
	public static AxeBase luminiteAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_luminite");
	public static HoeBase luminiteHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_luminite");
	public static HammerBase titaniumHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_titanium");
	public static SwordBase titaniumSword = new SwordBase(JARM.AmethystToolMaterial, "sword_titanium");
	public static SpadeBase titaniumSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_titanium");
	public static PickaxeBase titaniumPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_titanium");
	public static AxeBase titaniumAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_titanium");
	public static HoeBase titaniumHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_titanium");
	public static HammerBase mythrillHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_mythrill");
	public static SwordBase mythrillSword = new SwordBase(JARM.AmethystToolMaterial, "sword_mythrill");
	public static SpadeBase mythrillSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_mythrill");
	public static PickaxeBase mythrillPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_mythrill");
	public static AxeBase mythrillAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_mythrill");
	public static HoeBase mythrillHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_mythrill");
	public static HammerBase cobaltHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_cobalt");
	public static SwordBase cobaltSword = new SwordBase(JARM.AmethystToolMaterial, "sword_cobalt");
	public static SpadeBase cobaltSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_cobalt");
	public static PickaxeBase cobaltPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_cobalt");
	public static AxeBase cobaltAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_cobalt");
	public static HoeBase cobaltHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_cobalt");
	public static MeteoriteHammer meteoriteHammer = new MeteoriteHammer(JARM.AmethystToolMaterial, "hammer_meteorite");
	public static SwordBase meteoriteSword = new SwordBase(JARM.AmethystToolMaterial, "sword_meteorite");
	public static SpadeBase meteoriteSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_meteorite");
	public static PickaxeBase meteoritePickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_meteorite");
	public static AxeBase meteoriteAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_meteorite");
	public static HoeBase meteoriteHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_meteorite");
	public static SwordBase platinumSword = new SwordBase(JARM.AmethystToolMaterial, "sword_platinum");
	public static SpadeBase platinumSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_platinum");
	public static PickaxeBase platinumPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_platinum");
	public static AxeBase platinumAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_platinum");
	public static HoeBase platinumHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_platinum");
	public static HammerBase tungstenHammer = new HammerBase(JARM.AmethystToolMaterial, "hammer_tungsten");
	public static SwordBase tungstenSword = new SwordBase(JARM.AmethystToolMaterial, "sword_tungsten");
	public static SpadeBase tungstenSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_tungsten");
	public static PickaxeBase tungstenPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_tungsten");
	public static AxeBase tungstenAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_tungsten");
	public static HoeBase tungstenHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_tungsten");
	public static SwordBase silverSword = new SwordBase(JARM.AmethystToolMaterial, "sword_silver");
	public static SpadeBase silverSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_silver");
	public static PickaxeBase silverPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_silver");
	public static AxeBase silverAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_silver");
	public static HoeBase silverHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_silver");
	public static SwordBase leadSword = new SwordBase(JARM.AmethystToolMaterial, "sword_lead");
	public static SpadeBase leadSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_lead");
	public static PickaxeBase leadPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_lead");
	public static AxeBase leadAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_lead");
	public static HoeBase leadHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_lead");
	public static SwordBase copperSword = new SwordBase(JARM.AmethystToolMaterial, "sword_copper");
	public static SpadeBase copperSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_copper");
	public static PickaxeBase copperPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_copper");
	public static AxeBase copperAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_copper");
	public static HoeBase copperHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_copper");
	public static SwordBase tinSword = new SwordBase(JARM.AmethystToolMaterial, "sword_tin");
	public static SpadeBase tinSpade = new SpadeBase(JARM.AmethystToolMaterial, "spade_tin");
	public static PickaxeBase tinPickaxe = new PickaxeBase(JARM.AmethystToolMaterial, "pickaxe_tin");
	public static AxeBase tinAxe = new AxeBase(JARM.AmethystToolMaterial, "axe_tin");
	public static HoeBase tinHoe = new HoeBase(JARM.AmethystToolMaterial, "hoe_tin");
	
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
				 gemAmber,
				 amberHoe,
				 amberPickaxe,
				 amberSpade,
				 amberSword,
				 amberAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						amberHammer
						);
			}
	 }
	 if(ConfigMain.cinnibarModule == true) {
		 registry.registerAll(
				 gemCinnibar,
				 cinnibarHoe,
				 cinnibarPickaxe,
				 cinnibarSpade,
				 cinnibarSword,
				 cinnibarAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						cinnibarHammer
						);
			}
	 }
	 if(ConfigMain.fossilModule == true) {
		 registry.registerAll(
				 gemFossil
				 );
	 }
	 if(ConfigMain.jadeModule == true) {
		 registry.registerAll(
				 gemJade,
				 jadeHoe,
				 jadePickaxe,
				 jadeSpade,
				 jadeSword,
				 jadeAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						jadeHammer
						);
			}
	 }
	 if(ConfigMain.opalModule == true) {
		 registry.registerAll(
				 gemOpal,
				 opalHoe,
				 opalPickaxe,
				 opalSpade,
				 opalSword,
				 opalAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						opalHammer
						);
			}
	 }
	 if(ConfigMain.saphireModule == true) {
		 registry.registerAll(
				 gemSaphire,
				 saphireHoe,
				 saphirePickaxe,
				 saphireSpade,
				 saphireSword,
				 saphireAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						saphireHammer
						);
			}
	 }
	 if(ConfigMain.meteoriteModule == true) {
		 registry.registerAll(
				 gemMeteorite,
				 meteoriteHoe,
				 meteoritePickaxe,
				 meteoriteSpade,
				 meteoriteSword,
				 meteoriteAxe
				 );
		 if(Loader.isModLoaded("thermalfoundation")) {
				registry.registerAll(
						meteoriteHammer
						);
			}
	 }
	 if(ConfigMain.tinModule == true) {
		 registry.registerAll(
				 ingot_tin,
				 tinHoe,
				 tinPickaxe,
				 tinSpade,
				 tinSword,
				 tinAxe
				 );

	 }
	 if(ConfigMain.copperModule == true) {
		 registry.registerAll(
				 ingot_copper,
				 copperHoe,
				 copperPickaxe,
				 copperSpade,
				 copperSword,
				 copperAxe
				 );
	 }
	 if(ConfigMain.leadModule == true) {
		 registry.registerAll(
				 ingot_lead,
				 leadHoe,
				 leadPickaxe,
				 leadSpade,
				 leadSword,
				 leadAxe
				 );
	 }
	 if(ConfigMain.silverModule == true) {
		 registry.registerAll(
				 ingot_silver,
				 silverHoe,
				 silverPickaxe,
				 silverSpade,
				 silverSword,
				 silverAxe
				 );
	 }
	 if(ConfigMain.tungstenModule == true) {
		 registry.registerAll(
				 ingot_tungsten,
				 tungstenHoe,
				 tungstenPickaxe,
				 tungstenSpade,
				 tungstenSword,
				 tungstenAxe
				 );
	 }
	 if(ConfigMain.platinumModule == true) {
		 registry.registerAll(
				 ingot_platinum,
				 platinumHoe,
				 platinumPickaxe,
				 platinumSpade,
				 platinumSword,
				 platinumAxe
				 );
	 }
	 if(ConfigMain.cobaltModule == true) {
		 registry.registerAll(
				 ingot_cobalt,
				 cobaltHoe,
				 cobaltPickaxe,
				 cobaltSpade,
				 cobaltSword,
				 cobaltAxe
				 );
	 }
	 if(ConfigMain.mythrillModule == true) {
		 registry.registerAll(
				 ingot_mythrill,
				 mythrillHoe,
				 mythrillPickaxe,
				 mythrillSpade,
				 mythrillSword,
				 mythrillAxe
				 );
	 }
	 if(ConfigMain.titaniumModule == true) {
		 registry.registerAll(
				 ingot_titanium,
				 titaniumHoe,
				 titaniumPickaxe,
				 titaniumSpade,
				 titaniumSword,
				 titaniumAxe
				 );
	 }
	 if(ConfigMain.luminiteModule == true) {
		 registry.registerAll(
				 ingot_luminite,
				 luminiteHoe,
				 luminitePickaxe,
				 luminiteSpade,
				 luminiteSword,
				 luminiteAxe
				 );
	 }
	 if(ConfigMain.uraniumModule == true) {
		 registry.registerAll(
				 ingot_uranium
				 );
	 }
	 if(ConfigMain.nickelModule == true) {
		 registry.registerAll(
				 ingot_nickel,
				 nickelHoe,
				 nickelPickaxe,
				 nickelSpade,
				 nickelSword,
				 nickelAxe
				 );
	 }
	 if(ConfigMain.steelModule == true) {
		 registry.registerAll(
				 ingot_steel,
				 steelHoe,
				 steelPickaxe,
				 steelSpade,
				 steelSword,
				 steelAxe
				 );
	 }
	 if(ConfigMain.osmiumModule == true) {
		 registry.registerAll(
				 ingot_osmium,
				 osmiumHoe,
				 osmiumPickaxe,
				 osmiumSpade,
				 osmiumSword,
				 osmiumAxe
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
		 amberHoe.registerItemModel();
		 amberPickaxe.registerItemModel();
		 amberSpade.registerItemModel();
		 amberSword.registerItemModel();
		 amberAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				amberHammer.registerItemModel();
				
	}
}
if(ConfigMain.cinnibarModule == true) {
 
		 gemCinnibar.registerItemModel();
		 cinnibarHoe.registerItemModel();
		 cinnibarPickaxe.registerItemModel();
		 cinnibarSpade.registerItemModel();
		 cinnibarSword.registerItemModel();
		 cinnibarAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				cinnibarHammer.registerItemModel();
				
	}
}
if(ConfigMain.fossilModule == true) {
 
		 gemFossil.registerItemModel();
		 
}
if(ConfigMain.jadeModule == true) {
 
		 gemJade.registerItemModel();
		 jadeHoe.registerItemModel();
		 jadePickaxe.registerItemModel();
		 jadeSpade.registerItemModel();
		 jadeSword.registerItemModel();
		 jadeAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				jadeHammer.registerItemModel();
				
	}
}
if(ConfigMain.opalModule == true) {
 
		 gemOpal.registerItemModel();
		 opalHoe.registerItemModel();
		 opalPickaxe.registerItemModel();
		 opalSpade.registerItemModel();
		 opalSword.registerItemModel();
		 opalAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				opalHammer.registerItemModel();
				
	}
}
if(ConfigMain.saphireModule == true) {
 
		 gemSaphire.registerItemModel();
		 saphireHoe.registerItemModel();
		 saphirePickaxe.registerItemModel();
		 saphireSpade.registerItemModel();
		 saphireSword.registerItemModel();
		 saphireAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				saphireHammer.registerItemModel();
				
	}
}
if(ConfigMain.meteoriteModule == true) {
 
		 gemMeteorite.registerItemModel();
		 meteoriteHoe.registerItemModel();
		 meteoritePickaxe.registerItemModel();
		 meteoriteSpade.registerItemModel();
		 meteoriteSword.registerItemModel();
		 meteoriteAxe.registerItemModel();
		 
 if(Loader.isModLoaded("thermalfoundation")) {
		
				meteoriteHammer.registerItemModel();
				
	}
}
if(ConfigMain.tinModule == true) {
 
		 ingot_tin.registerItemModel();
		 tinHoe.registerItemModel();
		 tinPickaxe.registerItemModel();
		 tinSpade.registerItemModel();
		 tinSword.registerItemModel();
		 tinAxe.registerItemModel();
		 

}
if(ConfigMain.copperModule == true) {
 
		 ingot_copper.registerItemModel();
		 copperHoe.registerItemModel();
		 copperPickaxe.registerItemModel();
		 copperSpade.registerItemModel();
		 copperSword.registerItemModel();
		 copperAxe.registerItemModel();
		 
}
if(ConfigMain.leadModule == true) {
 
		 ingot_lead.registerItemModel();
		 leadHoe.registerItemModel();
		 leadPickaxe.registerItemModel();
		 leadSpade.registerItemModel();
		 leadSword.registerItemModel();
		 leadAxe.registerItemModel();
		 
}
if(ConfigMain.silverModule == true) {
 
		 ingot_silver.registerItemModel();
		 silverHoe.registerItemModel();
		 silverPickaxe.registerItemModel();
		 silverSpade.registerItemModel();
		 silverSword.registerItemModel();
		 silverAxe.registerItemModel();
		 
}
if(ConfigMain.tungstenModule == true) {
 
		 ingot_tungsten.registerItemModel();
		 tungstenHoe.registerItemModel();
		 tungstenPickaxe.registerItemModel();
		 tungstenSpade.registerItemModel();
		 tungstenSword.registerItemModel();
		 tungstenAxe.registerItemModel();
		 
}
if(ConfigMain.platinumModule == true) {
 
		 ingot_platinum.registerItemModel();
		 platinumHoe.registerItemModel();
		 platinumPickaxe.registerItemModel();
		 platinumSpade.registerItemModel();
		 platinumSword.registerItemModel();
		 platinumAxe.registerItemModel();
		 
}
if(ConfigMain.cobaltModule == true) {
 
		 ingot_cobalt.registerItemModel();
		 cobaltHoe.registerItemModel();
		 cobaltPickaxe.registerItemModel();
		 cobaltSpade.registerItemModel();
		 cobaltSword.registerItemModel();
		 cobaltAxe.registerItemModel();
		 
}
if(ConfigMain.mythrillModule == true) {
 
		 ingot_mythrill.registerItemModel();
		 mythrillHoe.registerItemModel();
		 mythrillPickaxe.registerItemModel();
		 mythrillSpade.registerItemModel();
		 mythrillSword.registerItemModel();
		 mythrillAxe.registerItemModel();
		 
}
if(ConfigMain.titaniumModule == true) {
 
		 ingot_titanium.registerItemModel();
		 titaniumHoe.registerItemModel();
		 titaniumPickaxe.registerItemModel();
		 titaniumSpade.registerItemModel();
		 titaniumSword.registerItemModel();
		 titaniumAxe.registerItemModel();
		 
}
if(ConfigMain.luminiteModule == true) {
 
		 ingot_luminite.registerItemModel();
		 luminiteHoe.registerItemModel();
		 luminitePickaxe.registerItemModel();
		 luminiteSpade.registerItemModel();
		 luminiteSword.registerItemModel();
		 luminiteAxe.registerItemModel();
		 
}
if(ConfigMain.uraniumModule == true) {
 
		 ingot_uranium.registerItemModel();
		 
}
if(ConfigMain.nickelModule == true) {
 
		 ingot_nickel.registerItemModel();
		 nickelHoe.registerItemModel();
		 nickelPickaxe.registerItemModel();
		 nickelSpade.registerItemModel();
		 nickelSword.registerItemModel();
		 nickelAxe.registerItemModel();
		 
}
if(ConfigMain.steelModule == true) {
 
		 ingot_steel.registerItemModel();
		 steelHoe.registerItemModel();
		 steelPickaxe.registerItemModel();
		 steelSpade.registerItemModel();
		 steelSword.registerItemModel();
		 steelAxe.registerItemModel();
		 
}
if(ConfigMain.osmiumModule == true) {
 
		 ingot_osmium.registerItemModel();
		 osmiumHoe.registerItemModel();
		 osmiumPickaxe.registerItemModel();
		 osmiumSpade.registerItemModel();
		 osmiumSword.registerItemModel();
		 osmiumAxe.registerItemModel();
		 
}
	}
}