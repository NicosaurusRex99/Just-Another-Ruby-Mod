package nicusha.ruby.materials;

import net.minecraft.core.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.*;

import static nicusha.ruby.Ruby.MODID;

public interface RubyArmorMaterials {

    ArmorMaterial RUBY = registerArmorMaterial(
            "ruby", 650,
            createDefenseMap(2, 5, 6, 2, 5),
            20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F,
            ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "ruby_repair"))
    );

    ArmorMaterial AMETHYST = registerArmorMaterial(
            "amethyst", 750,
            createDefenseMap(2, 5, 6, 2, 5),
            20, SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F, 0.0F,
            ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "amethyst_repair"))
    );

    ArmorMaterial BRAUNITE = registerArmorMaterial(
            "braunite", 1250,
            createDefenseMap(2, 5, 6, 2, 5),
            20, SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0F, 0.0F,
            ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "netherite_repair"))
    );

    ArmorMaterial OPAL = registerArmorMaterial(
            "opal", 250,
            createDefenseMap(2, 5, 6, 2, 5),
            30, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F,
            ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "opal_repair"))
    );

    ArmorMaterial METEORITE = registerArmorMaterial(
            "meteorite", 1150,
            createDefenseMap(2, 5, 6, 2, 5),
            20, SoundEvents.ARMOR_EQUIP_IRON,
            0.0F, 0.0F,
            ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "meteorite_repair"))
    );

    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(MODID, name));
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

    private static ArmorMaterial registerArmorMaterial(
            String name,
            int durability,
            EnumMap<ArmorType, Integer> defenseMap,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient
    ) {
        return createArmorMaterial(
                durability,
                defenseMap,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                createId(name)
        );
    }

    private static ArmorMaterial createArmorMaterial(
            int durability,
            EnumMap<ArmorType, Integer> defenseMap,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient,
            ResourceKey<EquipmentAsset> assetKey
    ) {
        EnumMap<ArmorType, Integer> mappedDefense = new EnumMap<>(ArmorType.class);

        for (ArmorType type : ArmorType.values()) {
            mappedDefense.put(type, defenseMap.get(type));
        }

        return new ArmorMaterial(
                durability,
                mappedDefense,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                assetKey
        );
    }
}
