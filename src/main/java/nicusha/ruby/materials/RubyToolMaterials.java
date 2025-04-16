package nicusha.ruby.materials;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import nicusha.ruby.*;

import java.util.List;

public record RubyToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Item> repairItems) {

    public static final ToolMaterial OPAL;
    public static final ToolMaterial RUBY;
    public static final ToolMaterial METEORITE;
    public static final ToolMaterial AMETHYST;
    public static final ToolMaterial BRAUNITE;

    public RubyToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Item> repairItems) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.durability = durability;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairItems = repairItems;
    }

    static {
        OPAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1200, 5.8F, 1.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal_repair")));
        RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4096, 10.3F, 5.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby_repair")));
        METEORITE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 8521, 8.8F, 4.0F, 12, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite_gem")));
        AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 6.6F, 4.0F, 30, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst_repair")));
        BRAUNITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 9.3F, 2.0F, 15, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite_gem")));
    }
}
