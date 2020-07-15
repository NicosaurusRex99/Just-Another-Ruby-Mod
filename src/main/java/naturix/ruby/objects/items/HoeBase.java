package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

public class HoeBase extends HoeItem {

    public HoeBase(String name, IItemTier tier)
    {
        super(tier, -1,-1.8F, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(Ruby.MODID, name);
    }
}