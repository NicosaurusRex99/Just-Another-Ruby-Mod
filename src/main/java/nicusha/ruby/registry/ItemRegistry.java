package nicusha.ruby.registry;

<<<<<<< Updated upstream
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
=======
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
>>>>>>> Stashed changes
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.materials.RubyArmorMaterials;
import nicusha.ruby.materials.RubyToolMaterials;

import static nicusha.ruby.materials.RubyArmorMaterials.*;
import static nicusha.ruby.Ruby.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

<<<<<<< Updated upstream
    public static final DeferredItem<Item> BRAUNITE_GEM = createItem("braunite_gem", false);
    public static final DeferredItem<Item> METEORITE_GEM = createItem("meteorite_gem", true);
    public static final DeferredItem<Item> OPAL_GEM = createItem("opal_gem", false);
    public static final DeferredItem<Item> RUBY_GEM = createItem("ruby_gem", false);

    public static final DeferredItem<Item> AMETHYST_SWORD = createSwordItem("amethyst_sword", RubyToolMaterials.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_SWORD = createSwordItem("braunite_sword", RubyToolMaterials.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_SWORD = createSwordItem("meteorite_sword", RubyToolMaterials.METEORITE, false);
    public static final DeferredItem<Item> OPAL_SWORD = createSwordItem("opal_sword", RubyToolMaterials.OPAL, false);
    public static final DeferredItem<Item> RUBY_SWORD = createSwordItem("ruby_sword", RubyToolMaterials.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_PICKAXE = createPickaxeItem("amethyst_pickaxe", RubyToolMaterials.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_PICKAXE = createPickaxeItem("braunite_pickaxe", RubyToolMaterials.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_PICKAXE = createPickaxeItem("meteorite_pickaxe", RubyToolMaterials.METEORITE, false);
    public static final DeferredItem<Item> OPAL_PICKAXE = createPickaxeItem("opal_pickaxe", RubyToolMaterials.OPAL, false);
    public static final DeferredItem<Item> RUBY_PICKAXE = createPickaxeItem("ruby_pickaxe", RubyToolMaterials.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_AXE = createAxeItem("amethyst_axe", RubyToolMaterials.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_AXE = createAxeItem("braunite_axe", RubyToolMaterials.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_AXE = createAxeItem("meteorite_axe", RubyToolMaterials.METEORITE, false);
    public static final DeferredItem<Item> OPAL_AXE = createAxeItem("opal_axe", RubyToolMaterials.OPAL, false);
    public static final DeferredItem<Item> RUBY_AXE = createAxeItem("ruby_axe", RubyToolMaterials.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_SHOVEL = createShovelItem("amethyst_shovel", RubyToolMaterials.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_SHOVEL = createShovelItem("braunite_shovel", RubyToolMaterials.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_SHOVEL = createShovelItem("meteorite_shovel", RubyToolMaterials.METEORITE, false);
    public static final DeferredItem<Item> OPAL_SHOVEL = createShovelItem("opal_shovel", RubyToolMaterials.OPAL, false);
    public static final DeferredItem<Item> RUBY_SHOVEL = createShovelItem("ruby_shovel", RubyToolMaterials.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_HOE = createHoeItem("amethyst_hoe", RubyToolMaterials.AMETHYST, false);
    public static final DeferredItem<Item> BRAUNITE_HOE = createHoeItem("braunite_hoe", RubyToolMaterials.BRAUNITE, false);
    public static final DeferredItem<Item> METEORITE_HOE = createHoeItem("meteorite_hoe", RubyToolMaterials.METEORITE, false);
    public static final DeferredItem<Item> OPAL_HOE = createHoeItem("opal_hoe", RubyToolMaterials.OPAL, false);
    public static final DeferredItem<Item> RUBY_HOE = createHoeItem("ruby_hoe", RubyToolMaterials.RUBY, false);

    public static final DeferredItem<Item> AMETHYST_HELMET = createArmorItem("amethyst_helmet", AMETHYST, ArmorType.HELMET, false, 350);
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = createArmorItem("amethyst_chestplate", AMETHYST, ArmorType.CHESTPLATE, false, 500);
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = createArmorItem("amethyst_leggings", AMETHYST, ArmorType.LEGGINGS, false, 455);
    public static final DeferredItem<Item> AMETHYST_BOOTS = createArmorItem("amethyst_boots", AMETHYST, ArmorType.BOOTS, false, 325);

    public static final DeferredItem<Item> BRAUNITE_HELMET = createArmorItem("braunite_helmet", BRAUNITE, ArmorType.HELMET, false, 555);
    public static final DeferredItem<Item> BRAUNITE_CHESTPLATE = createArmorItem("braunite_chestplate", BRAUNITE, ArmorType.CHESTPLATE, false, 750);
    public static final DeferredItem<Item> BRAUNITE_LEGGINGS = createArmorItem("braunite_leggings", BRAUNITE, ArmorType.LEGGINGS, false, 700);
    public static final DeferredItem<Item> BRAUNITE_BOOTS = createArmorItem("braunite_boots", BRAUNITE, ArmorType.BOOTS, false, 525);

    public static final DeferredItem<Item> METEORITE_HELMET = createArmorItem("meteorite_helmet", METEORITE, ArmorType.HELMET, false, 4050);
    public static final DeferredItem<Item> METEORITE_CHESTPLATE = createArmorItem("meteorite_chestplate", METEORITE, ArmorType.CHESTPLATE, false, 6250);
    public static final DeferredItem<Item> METEORITE_LEGGINGS = createArmorItem("meteorite_leggings", METEORITE, ArmorType.LEGGINGS, false, 5800);
    public static final DeferredItem<Item> METEORITE_BOOTS = createArmorItem("meteorite_boots", METEORITE, ArmorType.BOOTS, false, 3750);

    public static final DeferredItem<Item> OPAL_HELMET = createArmorItem("opal_helmet", OPAL, ArmorType.HELMET, false, 350);
    public static final DeferredItem<Item> OPAL_CHESTPLATE = createArmorItem("opal_chestplate", OPAL, ArmorType.CHESTPLATE, false, 500);
    public static final DeferredItem<Item> OPAL_LEGGINGS = createArmorItem("opal_leggings", OPAL, ArmorType.LEGGINGS, false, 455);
    public static final DeferredItem<Item> OPAL_BOOTS = createArmorItem("opal_boots", OPAL, ArmorType.BOOTS, false, 325);

    public static final DeferredItem<Item> RUBY_HELMET = createArmorItem("ruby_helmet", RubyArmorMaterials.RUBY, ArmorType.HELMET, false, 1020);
    public static final DeferredItem<Item> RUBY_CHESTPLATE = createArmorItem("ruby_chestplate", RUBY, ArmorType.CHESTPLATE, false, 1550);
    public static final DeferredItem<Item> RUBY_LEGGINGS = createArmorItem("ruby_leggings", RUBY, ArmorType.LEGGINGS, false, 1300);
    public static final DeferredItem<Item> RUBY_BOOTS = createArmorItem("ruby_boots", RUBY, ArmorType.BOOTS, false, 980);


    private static DeferredItem<Item> createItem(String name, boolean isFireProof){
        if(isFireProof){
            return ITEMS.register(name, () -> new Item(new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }
        return ITEMS.register(name, () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> createSwordItem(String name, ToolMaterial material, boolean isFireProof) {
        if (isFireProof) {
            return ITEMS.register(name, () -> new Item(new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name))).sword(material, material.attackDamageBonus(), material.speed())));
        }
        return ITEMS.register(name, ()-> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name))).sword(material, material.attackDamageBonus(), material.speed())));
    }

    private static DeferredItem<Item> createPickaxeItem(String name, ToolMaterial material, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(name, () -> new Item(new Item.Properties().pickaxe(material, material.attackDamageBonus(), material.speed()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }
        return ITEMS.register(name, () -> new Item(new Item.Properties().pickaxe(material, material.attackDamageBonus(), material.speed()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> createAxeItem(String name, ToolMaterial material, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(name, () -> new AxeItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }
        return ITEMS.register(name, () -> new AxeItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> createShovelItem(String name, ToolMaterial material, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(name, () -> new ShovelItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }

        return ITEMS.register(name, () -> new ShovelItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> createHoeItem(String name, ToolMaterial material, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(name, () -> new HoeItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }
        return ITEMS.register(name, () -> new HoeItem(material, material.attackDamageBonus(), material.speed(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> createArmorItem(String name, ArmorMaterial material, ArmorType armorType, boolean isFireProof, int durability){
        if (isFireProof) {
            return ItemRegistry.ITEMS.register(name, () -> new Item(new Item.Properties().humanoidArmor(material, armorType).fireResistant().stacksTo(1).durability(durability).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        }
        return ItemRegistry.ITEMS.register(name, () -> new Item(new Item.Properties().humanoidArmor(material, armorType).stacksTo(1).durability(durability).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

}
=======
    public static final DeferredItem<Item> BRAUNITE_GEM = item("braunite_gem");
    public static final DeferredItem<Item> METEORITE_GEM = fireItem("meteorite_gem");
    public static final DeferredItem<Item> OPAL_GEM = item("opal_gem");
    public static final DeferredItem<Item> RUBY_GEM = item("ruby_gem");

    public static final DeferredItem<Item> AMETHYST_SWORD = sword("amethyst_sword", RubyToolMaterials.AMETHYST.getMaterial());
    public static final DeferredItem<Item> BRAUNITE_SWORD = sword("braunite_sword", RubyToolMaterials.BRAUNITE.getMaterial());
    public static final DeferredItem<Item> METEORITE_SWORD = fireSword("meteorite_sword", RubyToolMaterials.METEORITE.getMaterial());
    public static final DeferredItem<Item> OPAL_SWORD = sword("opal_sword", RubyToolMaterials.OPAL.getMaterial());
    public static final DeferredItem<Item> RUBY_SWORD = sword("ruby_sword", RubyToolMaterials.RUBY.getMaterial());

    public static final DeferredItem<Item> AMETHYST_PICKAXE = pickaxe("amethyst_pickaxe", RubyToolMaterials.AMETHYST.getMaterial());
    public static final DeferredItem<Item> BRAUNITE_PICKAXE = pickaxe("braunite_pickaxe", RubyToolMaterials.BRAUNITE.getMaterial());
    public static final DeferredItem<Item> METEORITE_PICKAXE = firePickaxe("meteorite_pickaxe", RubyToolMaterials.METEORITE.getMaterial());
    public static final DeferredItem<Item> OPAL_PICKAXE = pickaxe("opal_pickaxe", RubyToolMaterials.OPAL.getMaterial());
    public static final DeferredItem<Item> RUBY_PICKAXE = pickaxe("ruby_pickaxe", RubyToolMaterials.RUBY.getMaterial());

    public static final DeferredItem<Item> AMETHYST_AXE = axe("amethyst_axe", RubyToolMaterials.AMETHYST.getMaterial());
    public static final DeferredItem<Item> BRAUNITE_AXE = axe("braunite_axe", RubyToolMaterials.BRAUNITE.getMaterial());
    public static final DeferredItem<Item> METEORITE_AXE = fireAxe("meteorite_axe", RubyToolMaterials.METEORITE.getMaterial());
    public static final DeferredItem<Item> OPAL_AXE = axe("opal_axe", RubyToolMaterials.OPAL.getMaterial());
    public static final DeferredItem<Item> RUBY_AXE = axe("ruby_axe", RubyToolMaterials.RUBY.getMaterial());

    public static final DeferredItem<Item> AMETHYST_SHOVEL = shovel("amethyst_shovel", RubyToolMaterials.AMETHYST.getMaterial());
    public static final DeferredItem<Item> BRAUNITE_SHOVEL = shovel("braunite_shovel", RubyToolMaterials.BRAUNITE.getMaterial());
    public static final DeferredItem<Item> METEORITE_SHOVEL = fireShovel("meteorite_shovel", RubyToolMaterials.METEORITE.getMaterial());
    public static final DeferredItem<Item> OPAL_SHOVEL = shovel("opal_shovel", RubyToolMaterials.OPAL.getMaterial());
    public static final DeferredItem<Item> RUBY_SHOVEL = shovel("ruby_shovel", RubyToolMaterials.RUBY.getMaterial());

    public static final DeferredItem<Item> AMETHYST_HOE = hoe("amethyst_hoe", RubyToolMaterials.AMETHYST.getMaterial());
    public static final DeferredItem<Item> BRAUNITE_HOE = hoe("braunite_hoe", RubyToolMaterials.BRAUNITE.getMaterial());
    public static final DeferredItem<Item> METEORITE_HOE = fireHoe("meteorite_hoe", RubyToolMaterials.METEORITE.getMaterial());
    public static final DeferredItem<Item> OPAL_HOE = hoe("opal_hoe", RubyToolMaterials.OPAL.getMaterial());
    public static final DeferredItem<Item> RUBY_HOE = hoe("ruby_hoe", RubyToolMaterials.RUBY.getMaterial());

    public static final DeferredItem<Item> AMETHYST_HELMET = armor("amethyst_helmet", AMETHYST, ArmorType.HELMET);
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = armor("amethyst_chestplate", AMETHYST, ArmorType.CHESTPLATE);
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = armor("amethyst_leggings", AMETHYST, ArmorType.LEGGINGS);
    public static final DeferredItem<Item> AMETHYST_BOOTS = armor("amethyst_boots", AMETHYST, ArmorType.BOOTS);

    public static final DeferredItem<Item> BRAUNITE_HELMET = armor("braunite_helmet", BRAUNITE, ArmorType.HELMET);
    public static final DeferredItem<Item> BRAUNITE_CHESTPLATE = armor("braunite_chestplate", BRAUNITE, ArmorType.CHESTPLATE);
    public static final DeferredItem<Item> BRAUNITE_LEGGINGS = armor("braunite_leggings", BRAUNITE, ArmorType.LEGGINGS);
    public static final DeferredItem<Item> BRAUNITE_BOOTS = armor("braunite_boots", BRAUNITE, ArmorType.BOOTS);

    public static final DeferredItem<Item> METEORITE_HELMET = armor("meteorite_helmet", METEORITE, ArmorType.HELMET);
    public static final DeferredItem<Item> METEORITE_CHESTPLATE = armor("meteorite_chestplate", METEORITE, ArmorType.CHESTPLATE);
    public static final DeferredItem<Item> METEORITE_LEGGINGS = armor("meteorite_leggings", METEORITE, ArmorType.LEGGINGS);
    public static final DeferredItem<Item> METEORITE_BOOTS = armor("meteorite_boots", METEORITE, ArmorType.BOOTS);

    public static final DeferredItem<Item> OPAL_HELMET = armor("opal_helmet", OPAL, ArmorType.HELMET);
    public static final DeferredItem<Item> OPAL_CHESTPLATE = armor("opal_chestplate", OPAL, ArmorType.CHESTPLATE);
    public static final DeferredItem<Item> OPAL_LEGGINGS = armor("opal_leggings", OPAL, ArmorType.LEGGINGS);
    public static final DeferredItem<Item> OPAL_BOOTS = armor("opal_boots", OPAL, ArmorType.BOOTS);

    public static final DeferredItem<Item> RUBY_HELMET = armor("ruby_helmet", RUBY, ArmorType.HELMET);
    public static final DeferredItem<Item> RUBY_CHESTPLATE = armor("ruby_chestplate", RUBY, ArmorType.CHESTPLATE);
    public static final DeferredItem<Item> RUBY_LEGGINGS = armor("ruby_leggings", RUBY, ArmorType.LEGGINGS);
    public static final DeferredItem<Item> RUBY_BOOTS = armor("ruby_boots", RUBY, ArmorType.BOOTS);

    private static ResourceKey<Item> key(String id) {
        return ResourceKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(MODID, id));
    }

    private static DeferredItem<Item> item(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id))));
    }

    private static DeferredItem<Item> fireItem(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant()));
    }

    private static DeferredItem<Item> sword(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).sword(material, 3.0F, -2.4F)));
    }

    private static DeferredItem<Item> pickaxe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).pickaxe(material, 1.0F, -2.8F)));
    }

    private static DeferredItem<Item> axe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).axe(material, 5.0F, -3.0F)));
    }

    private static DeferredItem<Item> shovel(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).shovel(material, 1.5F, -3.0F)));
    }

    private static DeferredItem<Item> hoe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).hoe(material, -1.0F, -2.0F)));
    }

    private static DeferredItem<Item> fireSword(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant().sword(material, 3.0F, -2.4F)));
    }

    private static DeferredItem<Item> firePickaxe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant().pickaxe(material, 1.0F, -2.8F)));
    }

    private static DeferredItem<Item> fireAxe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant().axe(material, 5.0F, -3.0F)));
    }

    private static DeferredItem<Item> fireShovel(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant().shovel(material, 1.5F, -3.0F)));
    }

    private static DeferredItem<Item> fireHoe(String id, ToolMaterial material) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).fireResistant().hoe(material, -1.0F, -2.0F)));
    }

    private static DeferredItem<Item> armor(String id, net.minecraft.world.item.equipment.ArmorMaterial material, ArmorType type) {
        return ITEMS.register(id, () -> new Item(new Item.Properties().setId(key(id)).humanoidArmor(material, type)));
    }
}
>>>>>>> Stashed changes
