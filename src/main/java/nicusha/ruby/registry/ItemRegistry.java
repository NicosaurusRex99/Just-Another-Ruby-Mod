package nicusha.ruby.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.enums.RubyToolMaterials;

import static nicusha.ruby.registry.ArmourMaterialRegistry.*;
import static nicusha.ruby.Ruby.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // ===== Gems =====
    public static final DeferredItem<Item> BRAUNITE_GEM = item("braunite_gem");
    public static final DeferredItem<Item> METEORITE_GEM = fireItem("meteorite_gem");
    public static final DeferredItem<Item> OPAL_GEM = item("opal_gem");
    public static final DeferredItem<Item> RUBY_GEM = item("ruby_gem");

    // ===== Tools =====
    public static final DeferredItem<Item> AMETHYST_SWORD = sword("amethyst_sword", RubyToolMaterials.AMETHYST);
    public static final DeferredItem<Item> BRAUNITE_SWORD = sword("braunite_sword", RubyToolMaterials.BRAUNITE);
    public static final DeferredItem<Item> METEORITE_SWORD = fireSword("meteorite_sword", RubyToolMaterials.METEORITE);
    public static final DeferredItem<Item> OPAL_SWORD = sword("opal_sword", RubyToolMaterials.OPAL);
    public static final DeferredItem<Item> RUBY_SWORD = sword("ruby_sword", RubyToolMaterials.RUBY);

    public static final DeferredItem<Item> AMETHYST_PICKAXE = pickaxe("amethyst_pickaxe", RubyToolMaterials.AMETHYST);
    public static final DeferredItem<Item> BRAUNITE_PICKAXE = pickaxe("braunite_pickaxe", RubyToolMaterials.BRAUNITE);
    public static final DeferredItem<Item> METEORITE_PICKAXE = firePickaxe("meteorite_pickaxe", RubyToolMaterials.METEORITE);
    public static final DeferredItem<Item> OPAL_PICKAXE = pickaxe("opal_pickaxe", RubyToolMaterials.OPAL);
    public static final DeferredItem<Item> RUBY_PICKAXE = pickaxe("ruby_pickaxe", RubyToolMaterials.RUBY);

    public static final DeferredItem<Item> AMETHYST_AXE = axe("amethyst_axe", RubyToolMaterials.AMETHYST);
    public static final DeferredItem<Item> BRAUNITE_AXE = axe("braunite_axe", RubyToolMaterials.BRAUNITE);
    public static final DeferredItem<Item> METEORITE_AXE = fireAxe("meteorite_axe", RubyToolMaterials.METEORITE);
    public static final DeferredItem<Item> OPAL_AXE = axe("opal_axe", RubyToolMaterials.OPAL);
    public static final DeferredItem<Item> RUBY_AXE = axe("ruby_axe", RubyToolMaterials.RUBY);

    public static final DeferredItem<Item> AMETHYST_SHOVEL = shovel("amethyst_shovel", RubyToolMaterials.AMETHYST);
    public static final DeferredItem<Item> BRAUNITE_SHOVEL = shovel("braunite_shovel", RubyToolMaterials.BRAUNITE);
    public static final DeferredItem<Item> METEORITE_SHOVEL = fireShovel("meteorite_shovel", RubyToolMaterials.METEORITE);
    public static final DeferredItem<Item> OPAL_SHOVEL = shovel("opal_shovel", RubyToolMaterials.OPAL);
    public static final DeferredItem<Item> RUBY_SHOVEL = shovel("ruby_shovel", RubyToolMaterials.RUBY);

    public static final DeferredItem<Item> AMETHYST_HOE = hoe("amethyst_hoe", RubyToolMaterials.AMETHYST);
    public static final DeferredItem<Item> BRAUNITE_HOE = hoe("braunite_hoe", RubyToolMaterials.BRAUNITE);
    public static final DeferredItem<Item> METEORITE_HOE = fireHoe("meteorite_hoe", RubyToolMaterials.METEORITE);
    public static final DeferredItem<Item> OPAL_HOE = hoe("opal_hoe", RubyToolMaterials.OPAL);
    public static final DeferredItem<Item> RUBY_HOE = hoe("ruby_hoe", RubyToolMaterials.RUBY);

    // ===== Armor =====
    public static final DeferredItem<Item> AMETHYST_HELMET = armor("amethyst_helmet", AMETHYST, ArmorItem.Type.HELMET, 350);
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = armor("amethyst_chestplate", AMETHYST, ArmorItem.Type.CHESTPLATE, 500);
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = armor("amethyst_leggings", AMETHYST, ArmorItem.Type.LEGGINGS, 455);
    public static final DeferredItem<Item> AMETHYST_BOOTS = armor("amethyst_boots", AMETHYST, ArmorItem.Type.BOOTS, 325);

    public static final DeferredItem<Item> BRAUNITE_HELMET = armor("braunite_helmet", BRAUNITE, ArmorItem.Type.HELMET, 555);
    public static final DeferredItem<Item> BRAUNITE_CHESTPLATE = armor("braunite_chestplate", BRAUNITE, ArmorItem.Type.CHESTPLATE, 750);
    public static final DeferredItem<Item> BRAUNITE_LEGGINGS = armor("braunite_leggings", BRAUNITE, ArmorItem.Type.LEGGINGS, 700);
    public static final DeferredItem<Item> BRAUNITE_BOOTS = armor("braunite_boots", BRAUNITE, ArmorItem.Type.BOOTS, 525);

    public static final DeferredItem<Item> METEORITE_HELMET = armor("meteorite_helmet", METEORITE, ArmorItem.Type.HELMET, 4050);
    public static final DeferredItem<Item> METEORITE_CHESTPLATE = armor("meteorite_chestplate", METEORITE, ArmorItem.Type.CHESTPLATE, 6250);
    public static final DeferredItem<Item> METEORITE_LEGGINGS = armor("meteorite_leggings", METEORITE, ArmorItem.Type.LEGGINGS, 5800);
    public static final DeferredItem<Item> METEORITE_BOOTS = armor("meteorite_boots", METEORITE, ArmorItem.Type.BOOTS, 3750);

    public static final DeferredItem<Item> OPAL_HELMET = armor("opal_helmet", OPAL, ArmorItem.Type.HELMET, 350);
    public static final DeferredItem<Item> OPAL_CHESTPLATE = armor("opal_chestplate", OPAL, ArmorItem.Type.CHESTPLATE, 500);
    public static final DeferredItem<Item> OPAL_LEGGINGS = armor("opal_leggings", OPAL, ArmorItem.Type.LEGGINGS, 455);
    public static final DeferredItem<Item> OPAL_BOOTS = armor("opal_boots", OPAL, ArmorItem.Type.BOOTS, 325);

    public static final DeferredItem<Item> RUBY_HELMET = armor("ruby_helmet", RUBY, ArmorItem.Type.HELMET, 1020);
    public static final DeferredItem<Item> RUBY_CHESTPLATE = armor("ruby_chestplate", RUBY, ArmorItem.Type.CHESTPLATE, 1550);
    public static final DeferredItem<Item> RUBY_LEGGINGS = armor("ruby_leggings", RUBY, ArmorItem.Type.LEGGINGS, 1300);
    public static final DeferredItem<Item> RUBY_BOOTS = armor("ruby_boots", RUBY, ArmorItem.Type.BOOTS, 980);

    // ===== Helper methods =====
    private static DeferredItem<Item> item(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties()));
    }

    private static DeferredItem<Item> fireItem(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().fireResistant()));
    }

    // --- Normal tools ---
    private static DeferredItem<Item> sword(String id, Tier tier) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, 3, -2.4F))));
    }
    private static DeferredItem<Item> pickaxe(String id, Tier tier) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, 1, -2.8F))));
    }
    private static DeferredItem<Item> axe(String id, Tier tier) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, 5, -3.0F))));
    }
    private static DeferredItem<Item> shovel(String id, Tier tier) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, 1.5F, -3.0F))));
    }
    private static DeferredItem<Item> hoe(String id, Tier tier) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, -1, -2.0F))));
    }

    // --- Fireproof tools ---
    private static DeferredItem<Item> fireSword(String id, Tier tier) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .fireResistant()
                .attributes(SwordItem.createAttributes(tier, 3, -2.4F))));
    }
    private static DeferredItem<Item> firePickaxe(String id, Tier tier) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .fireResistant()
                .attributes(PickaxeItem.createAttributes(tier, 1, -2.8F))));
    }
    private static DeferredItem<Item> fireAxe(String id, Tier tier) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .fireResistant()
                .attributes(AxeItem.createAttributes(tier, 5, -3.0F))));
    }
    private static DeferredItem<Item> fireShovel(String id, Tier tier) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .fireResistant()
                .attributes(ShovelItem.createAttributes(tier, 1.5F, -3.0F))));
    }
    private static DeferredItem<Item> fireHoe(String id, Tier tier) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .fireResistant()
                .attributes(HoeItem.createAttributes(tier, -1, -2.0F))));
    }

    private static DeferredItem<Item> armor(String id, Holder<ArmorMaterial> material, ArmorItem.Type slot, int durability) {
        return ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties()
                .stacksTo(1).durability(durability)));
    }
}
