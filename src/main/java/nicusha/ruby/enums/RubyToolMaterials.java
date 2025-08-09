package nicusha.ruby.enums;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import nicusha.ruby.Ruby;

import java.util.function.Supplier;

public enum RubyToolMaterials implements Tier {

    OPAL(2, 1200, 4.0F, 1.1F, 8, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal_repair"))), BlockTags.INCORRECT_FOR_IRON_TOOL),

    RUBY(3, 4096, 3.5F, 5.0F, 8, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby_repair"))), BlockTags.INCORRECT_FOR_DIAMOND_TOOL),

    METEORITE(2, 8521, 8.0F, 4.0F, 12, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite_gem"))), BlockTags.INCORRECT_FOR_IRON_TOOL),

    AMETHYST(4, 6723, 14.0F, 4.0F, 3, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst_repair"))), BlockTags.INCORRECT_FOR_NETHERITE_TOOL),

    BRAUNITE(4, 6723, 13.0F, 2.4F, 15, () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite_gem"))), BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    private final TagKey<Block> incorrectBlocksForDrops;

    RubyToolMaterials(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
                      Supplier<Ingredient> repairMaterial, TagKey<Block> incorrectBlocksForDrops) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocksForDrops;
    }
}
