package nicusha.ruby.utils;

import net.minecraft.sounds.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;

public class ArmourMaterial implements ArmorMaterial {
    private final String name;
    private final int durability;
    private final float toughness;
    private final int[] damageReduction;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final Ingredient repairMaterial;


    public ArmourMaterial(String name, int durability, int[] damageReduction, int enchantability, SoundEvent soundEvent, float toughness, Ingredient repairMaterial) {
        this.name = name;
        this.durability = durability;
        this.toughness = toughness;
        this.damageReduction = damageReduction;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return damageReduction[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return enchantability;
    }
}
