package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn)
    {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }
}