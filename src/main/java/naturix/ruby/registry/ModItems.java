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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Ruby.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @ObjectHolder("ruby:ruby_gem")
    public static Item rubyGem = null;
    @ObjectHolder("ruby:braunite_gem")
    public static Item brauniteGem = null;
    @ObjectHolder("ruby:meteorite_gem")
    public static Item meteoriteGem = null;
    @ObjectHolder("ruby:opal_gem")
    public static Item opalGem = null;

    @ObjectHolder("ruby:ruby_axe")
    public static Item rubyAxe = null;
    @ObjectHolder("ruby:braunite_axe")
    public static Item brauniteAxe = null;
    @ObjectHolder("ruby:meteorite_axe")
    public static Item meteoriteAxe = null;
    @ObjectHolder("ruby:opal_axe")
    public static Item opalAxe = null;
    @ObjectHolder("ruby:amethyst_axe")
    public static Item amethystAxe = null;

    @ObjectHolder("ruby:ruby_pickaxe")
    public static Item rubyPickaxe = null;
    @ObjectHolder("ruby:braunite_pickaxe")
    public static Item braunitePickaxe = null;
    @ObjectHolder("ruby:meteorite_pickaxe")
    public static Item meteoritePickaxe = null;
    @ObjectHolder("ruby:opal_pickaxe")
    public static Item opalPickaxe = null;
    @ObjectHolder("ruby:amethyst_pickaxe")
    public static Item amethystPickaxe = null;

    @ObjectHolder("ruby:ruby_shovel")
    public static Item rubyShovel = null;
    @ObjectHolder("ruby:braunite_shovel")
    public static Item brauniteShovel = null;
    @ObjectHolder("ruby:meteorite_shovel")
    public static Item meteoriteShovel = null;
    @ObjectHolder("ruby:opal_shovel")
    public static Item opalShovel = null;
    @ObjectHolder("ruby:amethyst_shovel")
    public static Item amethystShovel = null;

    @ObjectHolder("ruby:ruby_hoe")
    public static Item rubyHoe = null;
    @ObjectHolder("ruby:braunite_hoe")
    public static Item brauniteHoe = null;
    @ObjectHolder("ruby:meteorite_hoe")
    public static Item meteoriteHoe = null;
    @ObjectHolder("ruby:opal_hoe")
    public static Item opalHoe = null;
    @ObjectHolder("ruby:amethyst_hoe")
    public static Item amethystHoe = null;

    @ObjectHolder("ruby:ruby_sword")
    public static Item rubySword = null;
    @ObjectHolder("ruby:braunite_sword")
    public static Item brauniteSword = null;
    @ObjectHolder("ruby:meteorite_sword")
    public static Item meteoriteSword = null;
    @ObjectHolder("ruby:opal_sword")
    public static Item opalSword = null;
    @ObjectHolder("ruby:amethyst_sword")
    public static Item amethystSword = null;

    @ObjectHolder("ruby:amethyst_helmet")
    public static Item amethystHelmet = null;
    @ObjectHolder("ruby:amethyst_chestplate")
    public static Item amethystChestplate = null;
    @ObjectHolder("ruby:amethyst_leggings")
    public static Item amethystLeggings = null;
    @ObjectHolder("ruby:amethyst_boots")
    public static Item amethystBoots = null;

    @ObjectHolder("ruby:braunite_helmet")
    public static Item brauniteHelmet = null;
    @ObjectHolder("ruby:braunite_chestplate")
    public static Item brauniteChestplate = null;
    @ObjectHolder("ruby:braunite_leggings")
    public static Item brauniteLeggings = null;
    @ObjectHolder("ruby:braunite_boots")
    public static Item brauniteBoots = null;

    @ObjectHolder("ruby:meteorite_helmet")
    public static Item meteoriteHelmet = null;
    @ObjectHolder("ruby:meteorite_chestplate")
    public static Item meteoriteChestplate = null;
    @ObjectHolder("ruby:meteorite_leggings")
    public static Item meteoriteLeggings = null;
    @ObjectHolder("ruby:meteorite_boots")
    public static Item meteoriteBoots = null;

    @ObjectHolder("ruby:opal_helmet")
    public static Item opalHelmet = null;
    @ObjectHolder("ruby:opal_chestplate")
    public static Item opalChestplate = null;
    @ObjectHolder("ruby:opal_leggings")
    public static Item opalLeggings = null;
    @ObjectHolder("ruby:opal_boots")
    public static Item opalBoots = null;

    @ObjectHolder("ruby:ruby_helmet")
    public static Item rubyHelmet = null;
    @ObjectHolder("ruby:ruby_chestplate")
    public static Item rubyChestplate = null;
    @ObjectHolder("ruby:ruby_leggings")
    public static Item rubyLeggings = null;
    @ObjectHolder("ruby:ruby_boots")
    public static Item rubyBoots = null;

    //ARMOR
    public static ModMaterials rubyMat = new ModMaterials("ruby", 1545, new int[]{5, 9, 12, 5}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(rubyGem)));
    public static ModMaterials amethystMat = new ModMaterials("amethyst", 500, new int[]{6, 10, 13, 6}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(ModBlocks.amethyst)));
    public static ModMaterials brauniteMat = new ModMaterials("braunite", 500, new int[]{5, 8, 10, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(brauniteGem)));
    public static ModMaterials opalMat = new ModMaterials("opal", 500, new int[]{2, 3, 2, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(opalGem)));
    public static ModMaterials meteoriteMat = new ModMaterials("meteorite", 6546, new int[]{5, 8, 7, 4}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(meteoriteGem)));

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {

        register(e, new ItemBase("ruby_gem"));
        register(e, new ItemBase("meteorite_gem"));
        register(e, new ItemBase("opal_gem"));
        register(e, new ItemBase("braunite_gem"));

        register(e, new AxeBase("ruby_axe", ModTier.RUBY));
        register(e, new AxeBase("braunite_axe", ModTier.BRAUNITE));
        register(e, new AxeBase("meteorite_axe", ModTier.METEORITE));
        register(e, new AxeBase("opal_axe", ModTier.OPAL));
        register(e, new AxeBase("amethyst_axe", ModTier.AMETHYST));

        register(e, new PickaxeBase("ruby_pickaxe", ModTier.RUBY));
        register(e, new PickaxeBase("braunite_pickaxe", ModTier.BRAUNITE));
        register(e, new PickaxeBase("meteorite_pickaxe", ModTier.METEORITE));
        register(e, new PickaxeBase("opal_pickaxe", ModTier.OPAL));
        register(e, new PickaxeBase("amethyst_pickaxe", ModTier.AMETHYST));

        register(e, new ShovelBase("ruby_shovel", ModTier.RUBY));
        register(e, new ShovelBase("braunite_shovel", ModTier.BRAUNITE));
        register(e, new ShovelBase("meteorite_shovel", ModTier.METEORITE));
        register(e, new ShovelBase("opal_shovel", ModTier.OPAL));
        register(e, new ShovelBase("amethyst_shovel", ModTier.AMETHYST));

        register(e, new HoeBase("ruby_hoe", ModTier.RUBY));
        register(e, new HoeBase("braunite_hoe", ModTier.BRAUNITE));
        register(e, new HoeBase("meteorite_hoe", ModTier.METEORITE));
        register(e, new HoeBase("opal_hoe", ModTier.OPAL));
        register(e, new HoeBase("amethyst_hoe", ModTier.AMETHYST));

        register(e, new SwordBase("ruby_sword", ModTier.RUBY));
        register(e, new SwordBase("braunite_sword", ModTier.BRAUNITE));
        register(e, new SwordBase("meteorite_sword", ModTier.METEORITE));
        register(e, new SwordBase("opal_sword", ModTier.OPAL));
        register(e, new SwordBase("amethyst_sword", ModTier.AMETHYST));

        register(e, new ArmorBase("ruby_helmet", rubyMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("ruby_chestplate", rubyMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("ruby_leggings", rubyMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("ruby_boots", rubyMat, EquipmentSlotType.FEET));

        register(e, new ArmorBase("amethyst_helmet", amethystMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("amethyst_chestplate", amethystMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("amethyst_leggings", amethystMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("amethyst_boots", amethystMat, EquipmentSlotType.FEET));

        register(e, new ArmorBase("braunite_helmet", brauniteMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("braunite_chestplate", brauniteMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("braunite_leggings", brauniteMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("braunite_boots", brauniteMat, EquipmentSlotType.FEET));

        register(e, new ArmorBase("opal_helmet", opalMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("opal_chestplate", opalMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("opal_leggings", opalMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("opal_boots", opalMat, EquipmentSlotType.FEET));

        register(e, new ArmorBase("meteorite_helmet", meteoriteMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("meteorite_chestplate", meteoriteMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("meteorite_leggings", meteoriteMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("meteorite_boots", meteoriteMat, EquipmentSlotType.FEET));
        }


    private static void register(RegistryEvent.Register<Item> event, Item item) {
        event.getRegistry().register(item);
    }
}