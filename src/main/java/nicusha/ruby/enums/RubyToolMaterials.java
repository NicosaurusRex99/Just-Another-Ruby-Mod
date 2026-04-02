package nicusha.ruby.enums;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import nicusha.ruby.Ruby;

public enum RubyToolMaterials {

    OPAL(BlockTags.INCORRECT_FOR_IRON_TOOL,1200, 4.0F, 1.1F, 8, "opal_repair"),
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4096, 3.5F, 5.0F, 8, "ruby_repair"),
    METEORITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 8521, 8.0F, 4.0F, 12, "meteorite_gem"),
    AMETHYST(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 14.0F, 4.0F, 3,"amethyst_repair"),
    BRAUNITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 13.0F, 2.4F, 15, "braunite_gem");

    private final ToolMaterial material;

    RubyToolMaterials(TagKey<Block> incorrectBlockTag, int durability, float speed, float attackDamageBonus, int enchantmentValue, String repairTagName) {
        this.material = new ToolMaterial(incorrectBlockTag, durability, speed, attackDamageBonus, enchantmentValue, ItemTags.create(Identifier.fromNamespaceAndPath(Ruby.MODID, repairTagName)));
    }

    public ToolMaterial getMaterial() {
        return this.material;
    }

    public int durability() { return material.durability(); }
    public float speed() { return material.speed(); }
    public float attackDamageBonus() { return material.attackDamageBonus(); }
    public int enchantmentValue() { return material.enchantmentValue(); }
    public TagKey<Item> repairItems() { return material.repairItems(); }
}