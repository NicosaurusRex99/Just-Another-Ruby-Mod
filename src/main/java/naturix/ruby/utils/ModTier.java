package naturix.ruby.utils;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum ModTier implements IItemTier
{
    OPAL(2, 1200, 4.0F, 1.1F, 8, ModItems.opalGem),
    RUBY(3, 4096, 3.5F, 5.0F, 8, ModItems.rubyGem),
    METEORITE(2, 8521, 8.0F, 4.0F, 12, ModItems.meteoriteGem),
    AMETHYST(4, 6723, 14.0F, 4.0F, 3, ModItems.rubyGem),
    BRAUNITE(4, 6723, 13.0F, 2.4F, 15, ModItems.brauniteGem);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    public Item repairMaterial;

    ModTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
            Item repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }
}