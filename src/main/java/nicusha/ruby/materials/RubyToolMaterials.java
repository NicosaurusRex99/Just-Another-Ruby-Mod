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

    private Item.Properties applyCommonProperties(Item.Properties properties) {
        return properties.durability(this.durability).repairable(this.repairItems).enchantable(this.enchantmentValue);
    }

    public Item.Properties applyToolProperties(Item.Properties properties, TagKey<Block> mineableBlocks, float attackDamage, float attackSpeed) {
        HolderGetter<Block> holdergetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return this.applyCommonProperties(properties).component(DataComponents.TOOL, new Tool(List.of(Tool.Rule.deniesDrops(holdergetter.getOrThrow(this.incorrectBlocksForDrops)), Tool.Rule.minesAndDrops(holdergetter.getOrThrow(mineableBlocks), this.speed)), 1.0F, 1)).attributes(this.createToolAttributes(attackDamage, attackSpeed));
    }

    private ItemAttributeModifiers createToolAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + this.attackDamageBonus), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    public Item.Properties applySwordProperties(Item.Properties properties, float attackDamage, float attackSpeed) {
        HolderGetter<Block> holdergetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return this.applyCommonProperties(properties).component(DataComponents.TOOL, new Tool(List.of(Tool.Rule.minesAndDrops(HolderSet.direct(new Holder[]{Blocks.COBWEB.builtInRegistryHolder()}), 15.0F), Tool.Rule.overrideSpeed(holdergetter.getOrThrow(BlockTags.SWORD_EFFICIENT), 1.5F)), 1.0F, 2)).attributes(this.createSwordAttributes(attackDamage, attackSpeed));
    }

    private ItemAttributeModifiers createSwordAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + this.attackDamageBonus), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    public TagKey<Block> incorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    public int durability() {
        return this.durability;
    }

    public float speed() {
        return this.speed;
    }

    public float attackDamageBonus() {
        return this.attackDamageBonus;
    }

    public int enchantmentValue() {
        return this.enchantmentValue;
    }

    public TagKey<Item> repairItems() {
        return this.repairItems;
    }

    static {
        OPAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1200, 1.8F, 1.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "opal_repair")));
        RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4096, 1.3F, 5.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "ruby_repair")));
        METEORITE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 8521, 0.8F, 4.0F, 12, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "meteorite_gem")));
        AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 1.6F, 4.0F, 30, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "amethyst_repair")));
        BRAUNITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 6723, 1.0F, 2.0F, 15, ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ruby.MODID, "braunite_gem")));
    }
}
