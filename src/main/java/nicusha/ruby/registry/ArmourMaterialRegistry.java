package nicusha.ruby.registry;
import net.minecraft.Util;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.ruby.Ruby;

import java.util.*;
import java.util.function.Supplier;

public class ArmourMaterialRegistry {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, Ruby.MODID);

    public static final Holder<ArmorMaterial> RUBY = register("ruby", Util.make(new EnumMap<>(ArmorItem.Type.class), armourType -> {armourType.put(ArmorItem.Type.BOOTS, 5);armourType.put(ArmorItem.Type.LEGGINGS, 9);armourType.put(ArmorItem.Type.CHESTPLATE, 12);armourType.put(ArmorItem.Type.HELMET, 5);armourType.put(ArmorItem.Type.BODY, 12);}), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby_repair"))), List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby"))));
    public static final Holder<ArmorMaterial> AMETHYST = register("amethyst", Util.make(new EnumMap<>(ArmorItem.Type.class), armourType -> {armourType.put(ArmorItem.Type.BOOTS, 6);armourType.put(ArmorItem.Type.LEGGINGS, 10);armourType.put(ArmorItem.Type.CHESTPLATE, 13);armourType.put(ArmorItem.Type.HELMET, 6);armourType.put(ArmorItem.Type.BODY, 13);}), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst_repair"))), List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst"))));
    public static final Holder<ArmorMaterial> BRAUNITE = register("braunite", Util.make(new EnumMap<>(ArmorItem.Type.class), armourType -> {armourType.put(ArmorItem.Type.BOOTS, 5);armourType.put(ArmorItem.Type.LEGGINGS, 8);armourType.put(ArmorItem.Type.CHESTPLATE, 10);armourType.put(ArmorItem.Type.HELMET, 4);armourType.put(ArmorItem.Type.BODY, 10);}), 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite_repair"))), List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite"))));
    public static final Holder<ArmorMaterial> OPAL = register("opal", Util.make(new EnumMap<>(ArmorItem.Type.class), armourType -> {armourType.put(ArmorItem.Type.BOOTS, 2);armourType.put(ArmorItem.Type.LEGGINGS, 3);armourType.put(ArmorItem.Type.CHESTPLATE, 2);armourType.put(ArmorItem.Type.HELMET, 1);armourType.put(ArmorItem.Type.BODY, 2);}), 9, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal_repair"))), List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal"))));
    public static final Holder<ArmorMaterial> METEORITE = register("meteorite", Util.make(new EnumMap<>(ArmorItem.Type.class), armourType -> {armourType.put(ArmorItem.Type.BOOTS, 5);armourType.put(ArmorItem.Type.LEGGINGS, 8);armourType.put(ArmorItem.Type.CHESTPLATE, 7);armourType.put(ArmorItem.Type.HELMET, 4);armourType.put(ArmorItem.Type.BODY, 7);}), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite_repair"))), List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite"))));

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> armourType, int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repair, List<ArmorMaterial.Layer> pLayers) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, armourType.get(armoritem$type));
        }
        return ARMOR_MATERIALS.register(name, ()-> new ArmorMaterial(enummap, enchantability, equipSound, repair, pLayers, toughness, knockbackResistance));
    }
}