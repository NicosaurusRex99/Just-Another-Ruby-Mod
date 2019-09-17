package naturix.ruby.registry;

import naturix.ruby.Ruby;
import naturix.ruby.objects.items.*;
import naturix.ruby.utils.ModMaterials;
import naturix.ruby.utils.ModTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item rubyGem = new ItemBase("ruby_gem");
    public static Item brauniteGem = new ItemBase("braunite_gem");
    public static Item meteoriteGem = new ItemBase("meteorite_gem");
    public static Item opalGem = new ItemBase("opal_gem");

    public static Item rubyAxe = new AxeBase("ruby_axe", ModTier.RUBY, ModTier.RUBY.getAttackDamage()/2, ModTier.RUBY.getEfficiency()*1.25f);
    public static Item brauniteAxe = new AxeBase("braunite_axe", ModTier.BRAUNITE, ModTier.BRAUNITE.getAttackDamage()/2, ModTier.BRAUNITE.getEfficiency()*1.25f);
    public static Item meteoriteAxe = new AxeBase("meteorite_axe", ModTier.METEORITE, ModTier.METEORITE.getAttackDamage()/2, ModTier.METEORITE.getEfficiency()*1.25f);
    public static Item opalAxe = new AxeBase("opal_axe", ModTier.OPAL, ModTier.OPAL.getAttackDamage()/2, ModTier.OPAL.getEfficiency()*1.25f);
    public static Item amethystAxe = new AxeBase("amethyst_axe", ModTier.AMETHYST, ModTier.AMETHYST.getAttackDamage()/2, ModTier.AMETHYST.getEfficiency()*1.25f);

    public static Item rubyPickaxe = new PickaxeBase("ruby_pickaxe", ModTier.RUBY, 3, ModTier.RUBY.getEfficiency());
    public static Item braunitePickaxe = new PickaxeBase("braunite_pickaxe", ModTier.BRAUNITE, 4, ModTier.BRAUNITE.getEfficiency());
    public static Item meteoritePickaxe = new PickaxeBase("meteorite_pickaxe", ModTier.METEORITE, 3, ModTier.METEORITE.getEfficiency());
    public static Item opalPickaxe = new PickaxeBase("opal_pickaxe", ModTier.OPAL, 1, ModTier.OPAL.getEfficiency());
    public static Item amethystPickaxe = new PickaxeBase("amethyst_pickaxe", ModTier.AMETHYST, 2, ModTier.AMETHYST.getEfficiency());

    public static Item rubyShovel = new ShovelBase("ruby_shovel", ModTier.RUBY, 3, ModTier.RUBY.getEfficiency());
    public static Item brauniteShovel = new ShovelBase("braunite_shovel", ModTier.BRAUNITE, 4, ModTier.BRAUNITE.getEfficiency());
    public static Item meteoriteShovel = new ShovelBase("meteorite_shovel", ModTier.METEORITE, 3, ModTier.METEORITE.getEfficiency());
    public static Item opalShovel = new ShovelBase("opal_shovel", ModTier.OPAL, 1, ModTier.OPAL.getEfficiency());
    public static Item amethystShovel = new ShovelBase("amethyst_shovel", ModTier.AMETHYST, 2, ModTier.AMETHYST.getEfficiency());

    public static Item rubyHoe = new HoeBase("ruby_hoe", ModTier.RUBY, ModTier.RUBY.getEfficiency());
    public static Item brauniteHoe = new HoeBase("braunite_hoe", ModTier.BRAUNITE, ModTier.BRAUNITE.getEfficiency());
    public static Item meteoriteHoe = new HoeBase("meteorite_hoe", ModTier.METEORITE, ModTier.METEORITE.getEfficiency());
    public static Item opalHoe = new HoeBase("opal_hoe", ModTier.OPAL, ModTier.OPAL.getEfficiency());
    public static Item amethystHoe = new HoeBase("amethyst_hoe", ModTier.AMETHYST, ModTier.AMETHYST.getEfficiency());

    public static Item rubySword = new SwordBase("ruby_sword", ModTier.RUBY, 7, ModTier.RUBY.getEfficiency());
    public static Item brauniteSword = new SwordBase("braunite_sword", ModTier.BRAUNITE, 4, ModTier.BRAUNITE.getEfficiency());
    public static Item meteoriteSword = new SwordBase("meteorite_sword", ModTier.METEORITE, 5, ModTier.METEORITE.getEfficiency());
    public static Item opalSword = new SwordBase("opal_sword", ModTier.OPAL, 1, ModTier.OPAL.getEfficiency());
    public static Item amethystSword = new SwordBase("amethyst_sword", ModTier.AMETHYST, 6, ModTier.AMETHYST.getEfficiency());


    public static Item amethystMulti = new MultiToolBase("amethyst_multitool", ModTier.AMETHYST, 6, ModTier.AMETHYST.getEfficiency(), new Item.Properties().group(Ruby.setup.itemGroup));
    public static Item brauniteMulti = new MultiToolBase("braunite_multitool", ModTier.BRAUNITE, 6, ModTier.BRAUNITE.getEfficiency(), new Item.Properties().group(Ruby.setup.itemGroup));
    public static Item meteoriteMulti = new MultiToolBase("meteorite_multitool", ModTier.METEORITE, 7, ModTier.METEORITE.getEfficiency(), new Item.Properties().group(Ruby.setup.itemGroup));
    public static Item opalMulti = new MultiToolBase("opal_multitool", ModTier.OPAL, 2, ModTier.OPAL.getEfficiency(), new Item.Properties().group(Ruby.setup.itemGroup));
    public static Item rubyMulti = new MultiToolBase("ruby_multitool", ModTier.RUBY, 4, ModTier.RUBY.getEfficiency(), new Item.Properties().group(Ruby.setup.itemGroup));



    //ARMOR
    public static ModMaterials rubyMat = new ModMaterials("ruby", 1545, new int[]{5, 9, 12, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(rubyGem)));
    public static ModMaterials amethystMat = new ModMaterials("amethyst", 500, new int[]{6, 10, 13, 6}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(ModBlocks.amethyst)));
    public static ModMaterials brauniteMat = new ModMaterials("braunite", 500, new int[]{5, 8, 10, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(brauniteGem)));
    public static ModMaterials opalMat = new ModMaterials("opal", 500, new int[]{2, 3, 2, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(opalGem)));
    public static ModMaterials meteoriteMat = new ModMaterials("meteorite", 6546, new int[]{5, 8, 7, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(meteoriteGem)));

    public static Item rubyHelmet = new ArmorBase("ruby_helmet", rubyMat, EquipmentSlotType.HEAD);
    public static Item rubyChestplate = new ArmorBase("ruby_chestplate", rubyMat, EquipmentSlotType.CHEST);
    public static Item rubyLeggings = new ArmorBase("ruby_leggings", rubyMat, EquipmentSlotType.LEGS);
    public static Item rubyBoots = new ArmorBase("ruby_boots", rubyMat, EquipmentSlotType.FEET);

    public static Item amethystHelmet = new ArmorBase("amethyst_helmet", amethystMat, EquipmentSlotType.HEAD);
    public static Item amethystChestplate = new ArmorBase("amethyst_chestplate", amethystMat, EquipmentSlotType.CHEST);
    public static Item amethystLeggings = new ArmorBase("amethyst_leggings", amethystMat, EquipmentSlotType.LEGS);
    public static Item amethystBoots = new ArmorBase("amethyst_boots", amethystMat, EquipmentSlotType.FEET);

    public static Item brauniteHelmet = new ArmorBase("braunite_helmet", brauniteMat, EquipmentSlotType.HEAD);
    public static Item brauniteChestplate = new ArmorBase("braunite_chestplate", brauniteMat, EquipmentSlotType.CHEST);
    public static Item brauniteLeggings = new ArmorBase("braunite_leggings", brauniteMat, EquipmentSlotType.LEGS);
    public static Item brauniteBoots = new ArmorBase("braunite_boots", brauniteMat, EquipmentSlotType.FEET);

    public static Item opalHelmet = new ArmorBase("opal_helmet", opalMat, EquipmentSlotType.HEAD);
    public static Item opalChestplate = new ArmorBase("opal_chestplate", opalMat, EquipmentSlotType.CHEST);
    public static Item opalLeggings = new ArmorBase("opal_leggings", opalMat, EquipmentSlotType.LEGS);
    public static Item opalBoots = new ArmorBase("opal_boots", opalMat, EquipmentSlotType.FEET);

    public static Item meteoriteHelmet = new ArmorBase("meteorite_helmet", meteoriteMat, EquipmentSlotType.HEAD);
    public static Item meteoriteChestplate = new ArmorBase("meteorite_chestplate", meteoriteMat, EquipmentSlotType.CHEST);
    public static Item meteoriteLeggings = new ArmorBase("meteorite_leggings", meteoriteMat, EquipmentSlotType.LEGS);
    public static Item meteoriteBoots = new ArmorBase("meteorite_boots", meteoriteMat, EquipmentSlotType.FEET);


    public static final Food APPLESTAT = (new Food.Builder()).hunger(3).saturation(0.4F).build();
    public static final Item apple = new ItemBase("dwarf_apple", (new Item.Properties()).group(Ruby.setup.itemGroup).food(APPLESTAT));

}