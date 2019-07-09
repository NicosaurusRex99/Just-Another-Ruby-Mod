package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class AxeBase extends AxeItem
{
    public AxeBase(String name, IItemTier tier, float attackDamageIn, float attackSpeedIn)
    {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(Ruby.setup.itemGroup));
    setRegistryName(name);
    ModItems.ITEMS.add(this);
    }
}