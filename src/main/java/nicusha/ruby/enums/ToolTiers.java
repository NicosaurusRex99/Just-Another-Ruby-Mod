package nicusha.ruby.enums;

import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.block.Block;
import nicusha.ruby.*;

public enum ToolTiers implements Tier {

    OPAL(BlockTags.INCORRECT_FOR_IRON_TOOL, 1200, 4.0F, 1.1F, 8, Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal_repair")))),
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4096, 3.5F, 5.0F, 8, Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby_repair")))),
    METEORITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 8521, 8.0F, 4.0F, 12, Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite_gem")))),
    AMETHYST(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 14.0F, 4.0F, 3, Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst_repair")))),
    BRAUNITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 13.0F, 2.4F, 15, Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite_gem"))));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    public Ingredient repairMaterial;

    ToolTiers(TagKey<Block> incorrectBlocksForDrops, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn)
    {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
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
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
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