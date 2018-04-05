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
import naturix.jarm.utils.CustomMaterials;
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
	
	public static BootsBase bootsAmethyst= new BootsBase("AmethystBoots", CustomMaterials.AmethystArmorMaterial);
	public static LeggingsBase leggingsAmethyst= new LeggingsBase("AmethystLeggings", CustomMaterials.AmethystArmorMaterial);
	public static ChestplateBase chestplateAmethyst= new ChestplateBase("AmethystChestplate", CustomMaterials.AmethystArmorMaterial);
	public static HelmetBase helmetAmethyst= new HelmetBase("AmethystHelmet", CustomMaterials.AmethystArmorMaterial);
	public static BootsBase bootsBraunite = new BootsBase("BrauniteBoots", CustomMaterials.brauniteArmorMaterial);
	public static LeggingsBase leggingsBraunite= new LeggingsBase("BrauniteLeggings", CustomMaterials.brauniteArmorMaterial);
	public static ChestplateBase chestplateBraunite= new ChestplateBase("BrauniteChestplate", CustomMaterials.brauniteArmorMaterial);
	public static HelmetBase helmetBraunite= new HelmetBase("BrauniteHelmet", CustomMaterials.brauniteArmorMaterial);
	public static BootsBase bootsEmerald= new BootsBase("EmeraldBoots", CustomMaterials.EmeraldArmorMaterial);
	public static LeggingsBase leggingsEmerald= new LeggingsBase("EmeraldLeggings", CustomMaterials.EmeraldArmorMaterial);
	public static ChestplateBase chestplateEmerald= new ChestplateBase("EmeraldChestplate", CustomMaterials.EmeraldArmorMaterial);
	public static HelmetBase helmetEmerald= new HelmetBase("EmeraldHelmet", CustomMaterials.EmeraldArmorMaterial);
	public static BootsBase bootsLapis= new BootsBase("LapisBoots", CustomMaterials.LapisArmorMaterial);
	public static LeggingsBase leggingsLapis= new LeggingsBase("LapisLeggings", CustomMaterials.LapisArmorMaterial);
	public static ChestplateBase chestplateLapis= new ChestplateBase("LapisChestplate", CustomMaterials.LapisArmorMaterial);
	public static HelmetBase helmetLapis= new HelmetBase("LapisHelmet", CustomMaterials.LapisArmorMaterial);
	public static BootsBase bootsRuby= new BootsBase("RubyBoots", CustomMaterials.rubyArmorMaterial);
	public static LeggingsBase leggingsRuby= new LeggingsBase("RubyLeggings", CustomMaterials.rubyArmorMaterial);
	public static ChestplateBase chestplateRuby= new ChestplateBase("RubyChestplate", CustomMaterials.rubyArmorMaterial);
	public static HelmetBase helmetRuby= new HelmetBase("RubyHelmet", CustomMaterials.rubyArmorMaterial);
	public static ShulkerBoots bootsShulker= new ShulkerBoots("ShulkerBoots");
	public static LeggingsBase leggingsShulker= new LeggingsBase("ShulkerLeggings", CustomMaterials.ShulkerArmorMaterial);
	public static ChestplateBase chestplateShulker= new ChestplateBase("ShulkerChestplate", CustomMaterials.ShulkerArmorMaterial);
	public static HelmetBase helmetShulker= new HelmetBase("ShulkerHelmet", CustomMaterials.ShulkerArmorMaterial);
	public static PrismarineHelmet helmetPrismarine= new PrismarineHelmet("PrismarineHelmet");
	public static HammerBase rubyHammer = new HammerBase(CustomMaterials.rubyToolMaterial, "hammer_ruby");
	public static BrauniteHammer brauniteHammer = new BrauniteHammer(CustomMaterials.brauniteToolMaterial, "hammer_braunite");
	public static HammerBase amethystHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_amethyst");
	public static SwordBase amethystSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_amethyst");
	public static SwordBase brauniteSword = new SwordBase(CustomMaterials.brauniteToolMaterial, "sword_braunite");
	public static SwordBase emeraldSword = new SwordBase(CustomMaterials.EmeraldToolMaterial, "sword_emerald");
	public static SwordBase lapisSword = new SwordBase(CustomMaterials.LapisToolMaterial, "sword_lapis");
	public static SwordBase rubySword = new SwordBase(CustomMaterials.rubyToolMaterial, "sword_ruby");
	public static SpadeBase amethystSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_amethyst");
	public static SpadeBase brauniteSpade = new SpadeBase(CustomMaterials.brauniteToolMaterial, "spade_braunite");
	public static SpadeBase emeraldSpade = new SpadeBase(CustomMaterials.EmeraldToolMaterial, "spade_emerald");
	public static SpadeBase lapisSpade = new SpadeBase(CustomMaterials.LapisToolMaterial, "spade_lapis");
	public static SpadeBase rubySpade = new SpadeBase(CustomMaterials.rubyToolMaterial, "spade_ruby");
	public static PickaxeBase amethystPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_amethyst");
	public static PickaxeBase braunitePickaxe = new PickaxeBase(CustomMaterials.brauniteToolMaterial, "pickaxe_braunite");
	public static PickaxeBase emeraldPickaxe = new PickaxeBase(CustomMaterials.EmeraldToolMaterial, "pickaxe_emerald");
	public static PickaxeBase lapisPickaxe = new PickaxeBase(CustomMaterials.LapisToolMaterial, "pickaxe_lapis");
	public static PickaxeBase rubyPickaxe = new PickaxeBase(CustomMaterials.rubyToolMaterial, "pickaxe_ruby");
	public static AxeBase amethystAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_amethyst");
	public static AxeBase brauniteAxe = new AxeBase(CustomMaterials.brauniteToolMaterial, "axe_braunite");
	public static AxeBase emeraldAxe = new AxeBase(CustomMaterials.EmeraldToolMaterial, "axe_emerald");
	public static AxeBase lapisAxe = new AxeBase(CustomMaterials.LapisToolMaterial, "axe_lapis");
	public static AxeBase rubyAxe = new AxeBase(CustomMaterials.rubyToolMaterial, "axe_ruby");
	public static HoeBase amethystHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_amethyst");
	public static HoeBase brauniteHoe = new HoeBase(CustomMaterials.brauniteToolMaterial, "hoe_braunite");
	public static HoeBase emeraldHoe = new HoeBase(CustomMaterials.EmeraldToolMaterial, "hoe_emerald");
	public static HoeBase lapisHoe = new HoeBase(CustomMaterials.LapisToolMaterial, "hoe_lapis");
	public static HoeBase rubyHoe = new HoeBase(CustomMaterials.rubyToolMaterial, "hoe_ruby");
	public static HammerBase amberHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_amber");
	public static SwordBase amberSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_amber");
	public static SpadeBase amberSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_amber");
	public static PickaxeBase amberPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_amber");
	public static AxeBase amberAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_amber");
	public static HoeBase amberHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_amber");
	public static HammerBase jadeHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_jade");
	public static SwordBase jadeSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_jade");
	public static SpadeBase jadeSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_jade");
	public static PickaxeBase jadePickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_jade");
	public static AxeBase jadeAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_jade");
	public static HoeBase jadeHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_jade");
	public static HammerBase osmiumHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_osmium");
	public static SwordBase osmiumSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_osmium");
	public static SpadeBase osmiumSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_osmium");
	public static PickaxeBase osmiumPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_osmium");
	public static AxeBase osmiumAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_osmium");
	public static HoeBase osmiumHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_osmium");
	public static HammerBase cinnibarHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_cinnibar");
	public static SwordBase cinnibarSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_cinnibar");
	public static SpadeBase cinnibarSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_cinnibar");
	public static PickaxeBase cinnibarPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_cinnibar");
	public static AxeBase cinnibarAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_cinnibar");
	public static HoeBase cinnibarHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_cinnibar");
	public static HammerBase steelHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_steel");
	public static SwordBase steelSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_steel");
	public static SpadeBase steelSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_steel");
	public static PickaxeBase steelPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_steel");
	public static AxeBase steelAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_steel");
	public static HoeBase steelHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_steel");
	public static HammerBase nickelHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_nickel");
	public static SwordBase nickelSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_nickel");
	public static SpadeBase nickelSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_nickel");
	public static PickaxeBase nickelPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_nickel");
	public static AxeBase nickelAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_nickel");
	public static HoeBase nickelHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_nickel");
	public static HammerBase opalHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_opal");
	public static SwordBase opalSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_opal");
	public static SpadeBase opalSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_opal");
	public static PickaxeBase opalPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_opal");
	public static AxeBase opalAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_opal");
	public static HoeBase opalHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_opal");
	public static HammerBase uraniumHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_uranium");
	public static HammerBase saphireHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_saphire");
	public static SwordBase saphireSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_saphire");
	public static SpadeBase saphireSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_saphire");
	public static PickaxeBase saphirePickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_saphire");
	public static AxeBase saphireAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_saphire");
	public static HoeBase saphireHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_saphire");
	public static HammerBase luminiteHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_luminite");
	public static SwordBase luminiteSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_luminite");
	public static SpadeBase luminiteSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_luminite");
	public static PickaxeBase luminitePickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_luminite");
	public static AxeBase luminiteAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_luminite");
	public static HoeBase luminiteHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_luminite");
	public static HammerBase titaniumHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_titanium");
	public static SwordBase titaniumSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_titanium");
	public static SpadeBase titaniumSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_titanium");
	public static PickaxeBase titaniumPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_titanium");
	public static AxeBase titaniumAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_titanium");
	public static HoeBase titaniumHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_titanium");
	public static HammerBase mythrillHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_mythrill");
	public static SwordBase mythrillSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_mythrill");
	public static SpadeBase mythrillSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_mythrill");
	public static PickaxeBase mythrillPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_mythrill");
	public static AxeBase mythrillAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_mythrill");
	public static HoeBase mythrillHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_mythrill");
	public static HammerBase cobaltHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_cobalt");
	public static SwordBase cobaltSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_cobalt");
	public static SpadeBase cobaltSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_cobalt");
	public static PickaxeBase cobaltPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_cobalt");
	public static AxeBase cobaltAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_cobalt");
	public static HoeBase cobaltHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_cobalt");
	public static MeteoriteHammer meteoriteHammer = new MeteoriteHammer(CustomMaterials.AmethystToolMaterial, "hammer_meteorite");
	public static SwordBase meteoriteSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_meteorite");
	public static SpadeBase meteoriteSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_meteorite");
	public static PickaxeBase meteoritePickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_meteorite");
	public static AxeBase meteoriteAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_meteorite");
	public static HoeBase meteoriteHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_meteorite");
	public static SwordBase platinumSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_platinum");
	public static SpadeBase platinumSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_platinum");
	public static PickaxeBase platinumPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_platinum");
	public static AxeBase platinumAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_platinum");
	public static HoeBase platinumHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_platinum");
	public static HammerBase tungstenHammer = new HammerBase(CustomMaterials.AmethystToolMaterial, "hammer_tungsten");
	public static SwordBase tungstenSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_tungsten");
	public static SpadeBase tungstenSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_tungsten");
	public static PickaxeBase tungstenPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_tungsten");
	public static AxeBase tungstenAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_tungsten");
	public static HoeBase tungstenHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_tungsten");
	public static SwordBase silverSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_silver");
	public static SpadeBase silverSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_silver");
	public static PickaxeBase silverPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_silver");
	public static AxeBase silverAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_silver");
	public static HoeBase silverHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_silver");
	public static SwordBase leadSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_lead");
	public static SpadeBase leadSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_lead");
	public static PickaxeBase leadPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_lead");
	public static AxeBase leadAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_lead");
	public static HoeBase leadHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_lead");
	public static SwordBase copperSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_copper");
	public static SpadeBase copperSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_copper");
	public static PickaxeBase copperPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_copper");
	public static AxeBase copperAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_copper");
	public static HoeBase copperHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_copper");
	public static SwordBase tinSword = new SwordBase(CustomMaterials.AmethystToolMaterial, "sword_tin");
	public static SpadeBase tinSpade = new SpadeBase(CustomMaterials.AmethystToolMaterial, "spade_tin");
	public static PickaxeBase tinPickaxe = new PickaxeBase(CustomMaterials.AmethystToolMaterial, "pickaxe_tin");
	public static AxeBase tinAxe = new AxeBase(CustomMaterials.AmethystToolMaterial, "axe_tin");
	public static HoeBase tinHoe = new HoeBase(CustomMaterials.AmethystToolMaterial, "hoe_tin");
	public static BootsBase bootsAmber= new BootsBase("AmberBoots");
	public static LeggingsBase leggingsAmber= new LeggingsBase("AmberLeggings");
	public static ChestplateBase chestplateAmber= new ChestplateBase("AmberChestplate");
	public static HelmetBase helmetAmber= new HelmetBase("AmberHelmet");
	public static BootsBase bootsCinnibar= new BootsBase("CinnibarBoots");
	public static LeggingsBase leggingsCinnibar= new LeggingsBase("CinnibarLeggings");
	public static ChestplateBase chestplateCinnibar= new ChestplateBase("CinnibarChestplate");
	public static HelmetBase helmetCinnibar= new HelmetBase("CinnibarHelmet");
	public static BootsBase bootsJade= new BootsBase("JadeBoots");
	public static LeggingsBase leggingsJade= new LeggingsBase("JadeLeggings");
	public static ChestplateBase chestplateJade= new ChestplateBase("JadeChestplate");
	public static HelmetBase helmetJade= new HelmetBase("JadeHelmet");
	public static BootsBase bootsOpal= new BootsBase("OpalBoots");
	public static LeggingsBase leggingsOpal= new LeggingsBase("OpalLeggings");
	public static ChestplateBase chestplateOpal= new ChestplateBase("OpalChestplate");
	public static HelmetBase helmetOpal= new HelmetBase("OpalHelmet");
	public static BootsBase bootsSaphire= new BootsBase("SaphireBoots");
	public static LeggingsBase leggingsSaphire= new LeggingsBase("SaphireLeggings");
	public static ChestplateBase chestplateSaphire= new ChestplateBase("SaphireChestplate");
	public static HelmetBase helmetSaphire= new HelmetBase("SaphireHelmet");
	public static BootsBase bootsMeteorite= new BootsBase("MeteoriteBoots");
	public static LeggingsBase leggingsMeteorite= new LeggingsBase("MeteoriteLeggings");
	public static ChestplateBase chestplateMeteorite= new ChestplateBase("MeteoriteChestplate");
	public static HelmetBase helmetMeteorite= new HelmetBase("MeteoriteHelmet");
	public static BootsBase bootsTin= new BootsBase("TinBoots");
	public static LeggingsBase leggingsTin= new LeggingsBase("TinLeggings");
	public static ChestplateBase chestplateTin= new ChestplateBase("TinChestplate");
	public static HelmetBase helmetTin= new HelmetBase("TinHelmet");
	public static BootsBase bootsCopper= new BootsBase("CopperBoots");
	public static LeggingsBase leggingsCopper= new LeggingsBase("CopperLeggings");
	public static ChestplateBase chestplateCopper= new ChestplateBase("CopperChestplate");
	public static HelmetBase helmetCopper= new HelmetBase("CopperHelmet");
	public static BootsBase bootsLead= new BootsBase("LeadBoots");
	public static LeggingsBase leggingsLead= new LeggingsBase("LeadLeggings");
	public static ChestplateBase chestplateLead= new ChestplateBase("LeadChestplate");
	public static HelmetBase helmetLead= new HelmetBase("LeadHelmet");
	public static BootsBase bootsSilver= new BootsBase("SilverBoots");
	public static LeggingsBase leggingsSilver= new LeggingsBase("SilverLeggings");
	public static ChestplateBase chestplateSilver= new ChestplateBase("SilverChestplate");
	public static HelmetBase helmetSilver= new HelmetBase("SilverHelmet");
	public static BootsBase bootsTungsten= new BootsBase("TungstenBoots");
	public static LeggingsBase leggingsTungsten= new LeggingsBase("TungstenLeggings");
	public static ChestplateBase chestplateTungsten= new ChestplateBase("TungstenChestplate");
	public static HelmetBase helmetTungsten= new HelmetBase("TungstenHelmet");
	public static BootsBase bootsPlatinum= new BootsBase("PlatinumBoots");
	public static LeggingsBase leggingsPlatinum= new LeggingsBase("PlatinumLeggings");
	public static ChestplateBase chestplatePlatinum= new ChestplateBase("PlatinumChestplate");
	public static HelmetBase helmetPlatinum= new HelmetBase("PlatinumHelmet");
	public static BootsBase bootsCobalt= new BootsBase("CobaltBoots");
	public static LeggingsBase leggingsCobalt= new LeggingsBase("CobaltLeggings");
	public static ChestplateBase chestplateCobalt= new ChestplateBase("CobaltChestplate");
	public static HelmetBase helmetCobalt= new HelmetBase("CobaltHelmet");
	public static BootsBase bootsMythrill= new BootsBase("MythrillBoots");
	public static LeggingsBase leggingsMythrill= new LeggingsBase("MythrillLeggings");
	public static ChestplateBase chestplateMythrill= new ChestplateBase("MythrillChestplate");
	public static HelmetBase helmetMythrill= new HelmetBase("MythrillHelmet");
	public static BootsBase bootsTitanium= new BootsBase("TitaniumBoots");
	public static LeggingsBase leggingsTitanium= new LeggingsBase("TitaniumLeggings");
	public static ChestplateBase chestplateTitanium= new ChestplateBase("TitaniumChestplate");
	public static HelmetBase helmetTitanium= new HelmetBase("TitaniumHelmet");
	public static BootsBase bootsLuminite= new BootsBase("LuminiteBoots");
	public static LeggingsBase leggingsLuminite= new LeggingsBase("LuminiteLeggings");
	public static ChestplateBase chestplateLuminite= new ChestplateBase("LuminiteChestplate");
	public static HelmetBase helmetLuminite= new HelmetBase("LuminiteHelmet");
	public static BootsBase bootsUranium= new BootsBase("UraniumBoots");
	public static LeggingsBase leggingsUranium= new LeggingsBase("UraniumLeggings");
	public static ChestplateBase chestplateUranium= new ChestplateBase("UraniumChestplate");
	public static HelmetBase helmetUranium= new HelmetBase("UraniumHelmet");
	public static BootsBase bootsNickel= new BootsBase("NickelBoots");
	public static LeggingsBase leggingsNickel= new LeggingsBase("NickelLeggings");
	public static ChestplateBase chestplateNickel= new ChestplateBase("NickelChestplate");
	public static HelmetBase helmetNickel= new HelmetBase("NickelHelmet");
	public static BootsBase bootsSteel= new BootsBase("SteelBoots");
	public static LeggingsBase leggingsSteel= new LeggingsBase("SteelLeggings");
	public static ChestplateBase chestplateSteel= new ChestplateBase("SteelChestplate");
	public static HelmetBase helmetSteel= new HelmetBase("SteelHelmet");
	public static BootsBase bootsOsmium= new BootsBase("OsmiumBoots");
	public static LeggingsBase leggingsOsmium= new LeggingsBase("OsmiumLeggings");
	public static ChestplateBase chestplateOsmium= new ChestplateBase("OsmiumChestplate");
	public static HelmetBase helmetOsmium= new HelmetBase("OsmiumHelmet");
	
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
				 amberAxe,
					bootsAmber,
					leggingsAmber,
					chestplateAmber,
					helmetAmber
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
				 cinnibarAxe,
					bootsCinnibar,
					leggingsCinnibar,
					chestplateCinnibar,
					helmetCinnibar
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
				 jadeAxe,
					bootsJade,
					leggingsJade,
					chestplateJade,
					helmetJade
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
				 opalAxe,
					bootsOpal,
					leggingsOpal,
					chestplateOpal,
					helmetOpal
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
				 saphireAxe,
					bootsSaphire,
					leggingsSaphire,
					chestplateSaphire,
					helmetSaphire
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
				 meteoriteAxe,
					bootsMeteorite,
					leggingsMeteorite,
					chestplateMeteorite,
					helmetMeteorite
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
				 tinAxe,
					bootsTin,
					leggingsTin,
					chestplateTin,
					helmetTin
				 );

	 }
	 if(ConfigMain.copperModule == true) {
		 registry.registerAll(
				 ingot_copper,
				 copperHoe,
				 copperPickaxe,
				 copperSpade,
				 copperSword,
				 copperAxe,
					bootsCopper,
					leggingsCopper,
					chestplateCopper,
					helmetCopper
				 );
	 }
	 if(ConfigMain.leadModule == true) {
		 registry.registerAll(
				 ingot_lead,
				 leadHoe,
				 leadPickaxe,
				 leadSpade,
				 leadSword,
				 leadAxe,
					bootsLead,
					leggingsLead,
					chestplateLead,
					helmetLead
				 );
	 }
	 if(ConfigMain.silverModule == true) {
		 registry.registerAll(
				 ingot_silver,
				 silverHoe,
				 silverPickaxe,
				 silverSpade,
				 silverSword,
				 silverAxe,
					bootsSilver,
					leggingsSilver,
					chestplateSilver,
					helmetSilver
				 );
	 }
	 if(ConfigMain.tungstenModule == true) {
		 registry.registerAll(
				 ingot_tungsten,
				 tungstenHoe,
				 tungstenPickaxe,
				 tungstenSpade,
				 tungstenSword,
				 tungstenAxe,
					bootsTungsten,
					leggingsTungsten,
					chestplateTungsten,
					helmetTungsten
				 );
	 }
	 if(ConfigMain.platinumModule == true) {
		 registry.registerAll(
				 ingot_platinum,
				 platinumHoe,
				 platinumPickaxe,
				 platinumSpade,
				 platinumSword,
				 platinumAxe,
					bootsPlatinum,
					leggingsPlatinum,
					chestplatePlatinum,
					helmetPlatinum
				 );
	 }
	 if(ConfigMain.cobaltModule == true) {
		 registry.registerAll(
				 ingot_cobalt,
				 cobaltHoe,
				 cobaltPickaxe,
				 cobaltSpade,
				 cobaltSword,
				 cobaltAxe,
					bootsCobalt,
					leggingsCobalt,
					chestplateCobalt,
					helmetCobalt
				 );
	 }
	 if(ConfigMain.mythrillModule == true) {
		 registry.registerAll(
				 ingot_mythrill,
				 mythrillHoe,
				 mythrillPickaxe,
				 mythrillSpade,
				 mythrillSword,
				 mythrillAxe,
					bootsMythrill,
					leggingsMythrill,
					chestplateMythrill,
					helmetMythrill
				 );
	 }
	 if(ConfigMain.titaniumModule == true) {
		 registry.registerAll(
				 ingot_titanium,
				 titaniumHoe,
				 titaniumPickaxe,
				 titaniumSpade,
				 titaniumSword,
				 titaniumAxe,
					bootsTitanium,
					leggingsTitanium,
					chestplateTitanium,
					helmetTitanium
				 );
	 }
	 if(ConfigMain.luminiteModule == true) {
		 registry.registerAll(
				 ingot_luminite,
				 luminiteHoe,
				 luminitePickaxe,
				 luminiteSpade,
				 luminiteSword,
				 luminiteAxe,
					bootsLuminite,
					leggingsLuminite,
					chestplateLuminite,
					helmetLuminite
				 );
	 }
	 if(ConfigMain.uraniumModule == true) {
		 registry.registerAll(
				 ingot_uranium,
					bootsUranium,
					leggingsUranium,
					chestplateUranium,
					helmetUranium
				 );
	 }
	 if(ConfigMain.nickelModule == true) {
		 registry.registerAll(
				 ingot_nickel,
				 nickelHoe,
				 nickelPickaxe,
				 nickelSpade,
				 nickelSword,
				 nickelAxe,
					bootsNickel,
					leggingsNickel,
					chestplateNickel,
					helmetNickel
				 );
	 }
	 if(ConfigMain.steelModule == true) {
		 registry.registerAll(
				 ingot_steel,
				 steelHoe,
				 steelPickaxe,
				 steelSpade,
				 steelSword,
				 steelAxe,
					bootsSteel,
					leggingsSteel,
					chestplateSteel,
					helmetSteel
				 );
	 }
	 if(ConfigMain.osmiumModule == true) {
		 registry.registerAll(
				 ingot_osmium,
				 osmiumHoe,
				 osmiumPickaxe,
				 osmiumSpade,
				 osmiumSword,
				 osmiumAxe,
					bootsOsmium,
					leggingsOsmium,
					chestplateOsmium,
					helmetOsmium
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
		 helmetAmber.registerItemModel();
		 chestplateAmber.registerItemModel();
		 leggingsAmber.registerItemModel();
		 bootsAmber.registerItemModel();
		 
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
		 helmetCinnibar.registerItemModel();
		 chestplateCinnibar.registerItemModel();
		 leggingsCinnibar.registerItemModel();
		 bootsCinnibar.registerItemModel();
		 
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
		 helmetJade.registerItemModel();
		 chestplateJade.registerItemModel();
		 leggingsJade.registerItemModel();
		 bootsJade.registerItemModel();
		 
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
		 helmetOpal.registerItemModel();
		 chestplateOpal.registerItemModel();
		 leggingsOpal.registerItemModel();
		 bootsOpal.registerItemModel();
		 
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
		 helmetSaphire.registerItemModel();
		 chestplateSaphire.registerItemModel();
		 leggingsSaphire.registerItemModel();
		 bootsSaphire.registerItemModel();
		 
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
		 helmetMeteorite.registerItemModel();
		 chestplateMeteorite.registerItemModel();
		 leggingsMeteorite.registerItemModel();
		 bootsMeteorite.registerItemModel();
		 
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
		 helmetTin.registerItemModel();
		 chestplateTin.registerItemModel();
		 leggingsTin.registerItemModel();
		 bootsTin.registerItemModel();

}
if(ConfigMain.copperModule == true) {
 
		 ingot_copper.registerItemModel();
		 copperHoe.registerItemModel();
		 copperPickaxe.registerItemModel();
		 copperSpade.registerItemModel();
		 copperSword.registerItemModel();
		 copperAxe.registerItemModel();
		 helmetCopper.registerItemModel();
		 chestplateCopper.registerItemModel();
		 leggingsCopper.registerItemModel();
		 bootsCopper.registerItemModel();
		 
}
if(ConfigMain.leadModule == true) {
 
		 ingot_lead.registerItemModel();
		 leadHoe.registerItemModel();
		 leadPickaxe.registerItemModel();
		 leadSpade.registerItemModel();
		 leadSword.registerItemModel();
		 leadAxe.registerItemModel();
		 helmetLead.registerItemModel();
		 chestplateLead.registerItemModel();
		 leggingsLead.registerItemModel();
		 bootsLead.registerItemModel();
		 
}
if(ConfigMain.silverModule == true) {
 
		 ingot_silver.registerItemModel();
		 silverHoe.registerItemModel();
		 silverPickaxe.registerItemModel();
		 silverSpade.registerItemModel();
		 silverSword.registerItemModel();
		 silverAxe.registerItemModel();
		 helmetSilver.registerItemModel();
		 chestplateSilver.registerItemModel();
		 leggingsSilver.registerItemModel();
		 bootsSilver.registerItemModel();
		 
}
if(ConfigMain.tungstenModule == true) {
 
		 ingot_tungsten.registerItemModel();
		 tungstenHoe.registerItemModel();
		 tungstenPickaxe.registerItemModel();
		 tungstenSpade.registerItemModel();
		 tungstenSword.registerItemModel();
		 tungstenAxe.registerItemModel();
		 helmetTungsten.registerItemModel();
		 chestplateTungsten.registerItemModel();
		 leggingsTungsten.registerItemModel();
		 bootsTungsten.registerItemModel();
		 
}
if(ConfigMain.platinumModule == true) {
 
		 ingot_platinum.registerItemModel();
		 platinumHoe.registerItemModel();
		 platinumPickaxe.registerItemModel();
		 platinumSpade.registerItemModel();
		 platinumSword.registerItemModel();
		 platinumAxe.registerItemModel();
		 helmetPlatinum.registerItemModel();
		 chestplatePlatinum.registerItemModel();
		 leggingsPlatinum.registerItemModel();
		 bootsPlatinum.registerItemModel();
		 
}
if(ConfigMain.cobaltModule == true) {
 
		 ingot_cobalt.registerItemModel();
		 cobaltHoe.registerItemModel();
		 cobaltPickaxe.registerItemModel();
		 cobaltSpade.registerItemModel();
		 cobaltSword.registerItemModel();
		 cobaltAxe.registerItemModel();
		 helmetCobalt.registerItemModel();
		 chestplateCobalt.registerItemModel();
		 leggingsCobalt.registerItemModel();
		 bootsCobalt.registerItemModel();
		 
}
if(ConfigMain.mythrillModule == true) {
 
		 ingot_mythrill.registerItemModel();
		 mythrillHoe.registerItemModel();
		 mythrillPickaxe.registerItemModel();
		 mythrillSpade.registerItemModel();
		 mythrillSword.registerItemModel();
		 mythrillAxe.registerItemModel();
		 helmetMythrill.registerItemModel();
		 chestplateMythrill.registerItemModel();
		 leggingsMythrill.registerItemModel();
		 bootsMythrill.registerItemModel();
		 
}
if(ConfigMain.titaniumModule == true) {
 
		 ingot_titanium.registerItemModel();
		 titaniumHoe.registerItemModel();
		 titaniumPickaxe.registerItemModel();
		 titaniumSpade.registerItemModel();
		 titaniumSword.registerItemModel();
		 titaniumAxe.registerItemModel();
		 helmetTitanium.registerItemModel();
		 chestplateTitanium.registerItemModel();
		 leggingsTitanium.registerItemModel();
		 bootsTitanium.registerItemModel();
		 
}
if(ConfigMain.luminiteModule == true) {
 
		 ingot_luminite.registerItemModel();
		 luminiteHoe.registerItemModel();
		 luminitePickaxe.registerItemModel();
		 luminiteSpade.registerItemModel();
		 luminiteSword.registerItemModel();
		 luminiteAxe.registerItemModel();
		 helmetLuminite.registerItemModel();
		 chestplateLuminite.registerItemModel();
		 leggingsLuminite.registerItemModel();
		 bootsLuminite.registerItemModel();
		 
}
if(ConfigMain.uraniumModule == true) {
 
		 ingot_uranium.registerItemModel();
		 helmetUranium.registerItemModel();
		 chestplateUranium.registerItemModel();
		 leggingsUranium.registerItemModel();
		 bootsUranium.registerItemModel();
		 
}
if(ConfigMain.nickelModule == true) {
 
		 ingot_nickel.registerItemModel();
		 nickelHoe.registerItemModel();
		 nickelPickaxe.registerItemModel();
		 nickelSpade.registerItemModel();
		 nickelSword.registerItemModel();
		 nickelAxe.registerItemModel();
		 helmetNickel.registerItemModel();
		 chestplateNickel.registerItemModel();
		 leggingsNickel.registerItemModel();
		 bootsNickel.registerItemModel();
}
if(ConfigMain.steelModule == true) {
 
		 ingot_steel.registerItemModel();
		 steelHoe.registerItemModel();
		 steelPickaxe.registerItemModel();
		 steelSpade.registerItemModel();
		 steelSword.registerItemModel();
		 steelAxe.registerItemModel();
		 helmetSteel.registerItemModel();
		 chestplateSteel.registerItemModel();
		 leggingsSteel.registerItemModel();
		 bootsSteel.registerItemModel();
		 
}
if(ConfigMain.osmiumModule == true) {
 
		 ingot_osmium.registerItemModel();
		 osmiumHoe.registerItemModel();
		 osmiumPickaxe.registerItemModel();
		 osmiumSpade.registerItemModel();
		 osmiumSword.registerItemModel();
		 osmiumAxe.registerItemModel();
		 helmetOsmium.registerItemModel();
		 chestplateOsmium.registerItemModel();
		 leggingsOsmium.registerItemModel();
		 bootsOsmium.registerItemModel();
}
	}
}