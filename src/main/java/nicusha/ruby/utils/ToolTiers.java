package nicusha.ruby.utils;

import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import nicusha.ruby.*;
import nicusha.ruby.registry.*;

public enum ToolTiers implements Tier {

    OPAL(2, 1200, 4.0F, 1.1F, 8, Ingredient.of(ItemTags.create(new ResourceLocation(Ruby.MODID, "opal_repair")))),
    RUBY(3, 4096, 3.5F, 5.0F, 8, Ingredient.of(ItemTags.create(new ResourceLocation(Ruby.MODID, "ruby_repair")))),
    METEORITE(2, 8521, 8.0F, 4.0F, 12, Ingredient.of(ItemTags.create(new ResourceLocation(Ruby.MODID, "meteorite_repair")))),
    AMETHYST(4, 6723, 14.0F, 4.0F, 3, Ingredient.of(ItemTags.create(new ResourceLocation(Ruby.MODID, "amethyst_repair")))),
    BRAUNITE(4, 6723, 13.0F, 2.4F, 15, Ingredient.of(ItemTags.create(new ResourceLocation(Ruby.MODID, "braunite_repair"))));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    public Ingredient repairMaterial;

    ToolTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }
}
