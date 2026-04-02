package nicusha.ruby.registry;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;

import static nicusha.ruby.Ruby.MODID;

public interface ArmourMaterialRegistry {

    ArmorMaterial RUBY = registerArmorMaterial("ruby", 33, createDefenseMap(5, 9, 12, 5, 12), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "ruby_repair")));
    ArmorMaterial AMETHYST = registerArmorMaterial("amethyst", 37, createDefenseMap(6, 10, 13, 6, 13), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "amethyst_repair")));
    ArmorMaterial BRAUNITE = registerArmorMaterial("braunite", 37, createDefenseMap(5, 8, 10, 4, 10), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "braunite_gem")));
    ArmorMaterial OPAL = registerArmorMaterial("opal", 15, createDefenseMap(2, 3, 2, 1, 2), 9, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "opal_repair")));
    ArmorMaterial METEORITE = registerArmorMaterial("meteorite", 75, createDefenseMap(5, 8, 7, 4, 7), 12, SoundEvents.ARMOR_EQUIP_IRON,0.0F, 0.0F, ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "meteorite_gem")));

    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(MODID, name));
    }

    static EnumMap<ArmorType, Integer> createDefenseMap(int boots, int leggings, int chestplate, int helmet, int body) {
        EnumMap<ArmorType, Integer> defenseMap = new EnumMap<>(ArmorType.class);
        defenseMap.put(ArmorType.BOOTS, boots);
        defenseMap.put(ArmorType.LEGGINGS, leggings);
        defenseMap.put(ArmorType.CHESTPLATE, chestplate);
        defenseMap.put(ArmorType.HELMET, helmet);
        defenseMap.put(ArmorType.BODY, body);
        return defenseMap;
    }

    private static ArmorMaterial registerArmorMaterial(String name, int durability, EnumMap<ArmorType, Integer> defenseMap, int enchantmentValue, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, TagKey<Item> repairIngredient) {
        return new ArmorMaterial(durability, defenseMap, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, createId(name));
    }
}