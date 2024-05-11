package nicusha.ruby.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.enums.ToolTiers;

import static nicusha.ruby.registry.ArmourMaterialRegistry.*;
import static nicusha.ruby.Ruby.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> BRAUNITE_GEM = createItem("braunite_gem", false);
    public static final DeferredItem<Item> METEORITE_GEM = createItem("meteorite_gem", true);
    public static final DeferredItem<Item> OPAL_GEM = createItem("opal_gem", false);
    public static final DeferredItem<Item> RUBY_GEM = createItem("ruby_gem", false);

    public static final DeferredItem<Item> AMETHYST_SWORD = createSwordItem("amethyst_sword", ToolTiers.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_SWORD = createSwordItem("braunite_sword", ToolTiers.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_SWORD = createSwordItem("meteorite_sword", ToolTiers.METEORITE, false);
    public static final DeferredItem<Item> OPAL_SWORD = createSwordItem("opal_sword", ToolTiers.OPAL, false);
    public static final DeferredItem<Item> RUBY_SWORD = createSwordItem("ruby_sword", ToolTiers.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_PICKAXE = createPickaxeItem("amethyst_pickaxe", ToolTiers.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_PICKAXE = createPickaxeItem("braunite_pickaxe", ToolTiers.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_PICKAXE = createPickaxeItem("meteorite_pickaxe", ToolTiers.METEORITE, false);
    public static final DeferredItem<Item> OPAL_PICKAXE = createPickaxeItem("opal_pickaxe", ToolTiers.OPAL, false);
    public static final DeferredItem<Item> RUBY_PICKAXE = createPickaxeItem("ruby_pickaxe", ToolTiers.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_AXE = createAxeItem("amethyst_axe", ToolTiers.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_AXE = createAxeItem("braunite_axe", ToolTiers.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_AXE = createAxeItem("meteorite_axe", ToolTiers.METEORITE, false);
    public static final DeferredItem<Item> OPAL_AXE = createAxeItem("opal_axe", ToolTiers.OPAL, false);
    public static final DeferredItem<Item> RUBY_AXE = createAxeItem("ruby_axe", ToolTiers.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_SHOVEL = createShovelItem("amethyst_shovel", ToolTiers.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_SHOVEL = createShovelItem("braunite_shovel", ToolTiers.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_SHOVEL = createShovelItem("meteorite_shovel", ToolTiers.METEORITE, false);
    public static final DeferredItem<Item> OPAL_SHOVEL = createShovelItem("opal_shovel", ToolTiers.OPAL, false);
    public static final DeferredItem<Item> RUBY_SHOVEL = createShovelItem("ruby_shovel", ToolTiers.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_HOE = createHoeItem("amethyst_hoe", ToolTiers.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_HOE = createHoeItem("braunite_hoe", ToolTiers.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_HOE = createHoeItem("meteorite_hoe", ToolTiers.METEORITE, false);
    public static final DeferredItem<Item> OPAL_HOE = createHoeItem("opal_hoe", ToolTiers.OPAL, false);
    public static final DeferredItem<Item> RUBY_HOE = createHoeItem("ruby_hoe", ToolTiers.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_HELMET = createArmorItem("amethyst_helmet", AMETHYST, ArmorItem.Type.HELMET, false, 350);
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = createArmorItem("amethyst_chestplate", AMETHYST, ArmorItem.Type.CHESTPLATE, false, 500);
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = createArmorItem("amethyst_leggings", AMETHYST, ArmorItem.Type.LEGGINGS, false, 455);
    public static final DeferredItem<Item> AMETHYST_BOOTS = createArmorItem("amethyst_boots", AMETHYST, ArmorItem.Type.BOOTS, false, 325);

    public static final DeferredItem<Item> BRAUNITE_HELMET = createArmorItem("braunite_helmet", BRAUNITE, ArmorItem.Type.HELMET, false, 555);
    public static final DeferredItem<Item> BRAUNITE_CHESTPLATE = createArmorItem("braunite_chestplate", BRAUNITE, ArmorItem.Type.CHESTPLATE, false, 750);
    public static final DeferredItem<Item> BRAUNITE_LEGGINGS = createArmorItem("braunite_leggings", BRAUNITE, ArmorItem.Type.LEGGINGS, false, 700);
    public static final DeferredItem<Item> BRAUNITE_BOOTS = createArmorItem("braunite_boots", BRAUNITE, ArmorItem.Type.BOOTS, false, 525);

    public static final DeferredItem<Item> METEORITE_HELMET = createArmorItem("meteorite_helmet", METEORITE, ArmorItem.Type.HELMET, false, 4050);
    public static final DeferredItem<Item> METEORITE_CHESTPLATE = createArmorItem("meteorite_chestplate", METEORITE, ArmorItem.Type.CHESTPLATE, false, 6250);
    public static final DeferredItem<Item> METEORITE_LEGGINGS = createArmorItem("meteorite_leggings", METEORITE, ArmorItem.Type.LEGGINGS, false, 5800);
    public static final DeferredItem<Item> METEORITE_BOOTS = createArmorItem("meteorite_boots", METEORITE, ArmorItem.Type.BOOTS, false, 3750);

    public static final DeferredItem<Item> OPAL_HELMET = createArmorItem("opal_helmet", OPAL, ArmorItem.Type.HELMET, false, 350);
    public static final DeferredItem<Item> OPAL_CHESTPLATE = createArmorItem("opal_chestplate", OPAL, ArmorItem.Type.CHESTPLATE, false, 500);
    public static final DeferredItem<Item> OPAL_LEGGINGS = createArmorItem("opal_leggings", OPAL, ArmorItem.Type.LEGGINGS, false, 455);
    public static final DeferredItem<Item> OPAL_BOOTS = createArmorItem("opal_boots", OPAL, ArmorItem.Type.BOOTS, false, 325);

    public static final DeferredItem<Item> RUBY_HELMET = createArmorItem("ruby_helmet", RUBY, ArmorItem.Type.HELMET, false, 1020);
    public static final DeferredItem<Item> RUBY_CHESTPLATE = createArmorItem("ruby_chestplate", RUBY, ArmorItem.Type.CHESTPLATE, false, 1550);
    public static final DeferredItem<Item> RUBY_LEGGINGS = createArmorItem("ruby_leggings", RUBY, ArmorItem.Type.LEGGINGS, false, 1300);
    public static final DeferredItem<Item> RUBY_BOOTS = createArmorItem("ruby_boots", RUBY, ArmorItem.Type.BOOTS, false, 980);


    private static DeferredItem<Item> createItem(String id, boolean isFireProof){
        if(isFireProof){
            return ITEMS.register(id, () -> new Item(new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new Item(new Item.Properties()));
    }

    private static DeferredItem<Item> createSwordItem(String id, Tier tier, boolean isFireProof) {
        if (isFireProof) {
            return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, ()-> new SwordItem(tier, new Item.Properties()));
    }

    private static DeferredItem<Item> createPickaxeItem(String id, Tier tier, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()));
    }

    private static DeferredItem<Item> createAxeItem(String id, Tier tier, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()));
    }

    private static DeferredItem<Item> createShovelItem(String id, Tier tier, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties().fireResistant()));
        }

        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()));
    }

    private static DeferredItem<Item> createHoeItem(String id, Tier tier, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()));
    }

    private static DeferredItem<Item> createArmorItem(String id, Holder<ArmorMaterial> material, ArmorItem.Type slot, boolean isFireProof, int durability){
        if (isFireProof) {
            return ItemRegistry.ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties().fireResistant().stacksTo(1).durability(durability)));
        }
        return ItemRegistry.ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties().stacksTo(1).durability(durability)));
    }

}
