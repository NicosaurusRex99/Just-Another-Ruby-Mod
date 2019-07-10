package naturix.ruby.registry;

import naturix.ruby.Ruby;
import naturix.ruby.objects.items.*;
import naturix.ruby.utils.ModTier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item rubyGem = new ItemBase("ruby_gem");
    public static Item brauniteGem = new ItemBase("braunite_gem");
    public static Item meteoriteGem = new ItemBase("meteorite_gem");
    public static Item opalGem = new ItemBase("opal_gem");

    public static Item rubyAxe = new AxeBase("ruby_axe", ModTier.RUBY, ModTier.RUBY.getAttackDamage()/2, ModTier.RUBY.getEfficiency());
    public static Item brauniteAxe = new AxeBase("braunite_axe", ModTier.BRAUNITE, ModTier.BRAUNITE.getAttackDamage()/2, ModTier.BRAUNITE.getEfficiency());
    public static Item meteoriteAxe = new AxeBase("meteorite_axe", ModTier.METEORITE, ModTier.METEORITE.getAttackDamage()/2, ModTier.METEORITE.getEfficiency());
    public static Item opalAxe = new AxeBase("opal_axe", ModTier.OPAL, ModTier.OPAL.getAttackDamage()/2, ModTier.OPAL.getEfficiency());
    public static Item amethystAxe = new AxeBase("amethyst_axe", ModTier.AMETHYST, ModTier.AMETHYST.getAttackDamage()/2, ModTier.AMETHYST.getEfficiency());

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

}