package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {

    public SwordBase(String name, IItemTier tier)
    {
        super(tier, (int)tier.getAttackDamage(), -2.1F, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(Ruby.MODID, name);
    }
}