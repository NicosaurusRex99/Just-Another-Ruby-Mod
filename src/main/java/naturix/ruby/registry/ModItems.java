package naturix.ruby.registry;

import naturix.ruby.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item rubyGem = new ItemBase("ruby_gem");
    public static Item brauniteGem = new ItemBase("braunite_gem");
    public static Item meteoriteGem = new ItemBase("meteorite_gem");
    public static Item opalGem = new ItemBase("opal_gem");
}