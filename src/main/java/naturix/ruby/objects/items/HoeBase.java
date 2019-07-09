package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

public class HoeBase extends HoeItem {

    public HoeBase(String name, IItemTier tier, float attackSpeedIn)
    {
        super(tier, attackSpeedIn, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }
}