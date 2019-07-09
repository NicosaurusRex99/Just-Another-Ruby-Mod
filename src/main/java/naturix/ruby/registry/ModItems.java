package naturix.ruby.registry;

import naturix.ruby.objects.items.AxeBase;
import naturix.ruby.objects.items.ItemBase;
import naturix.ruby.objects.items.PickaxeBase;
import naturix.ruby.utils.ModTier;
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

}