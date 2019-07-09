package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.Item;
public class ItemBase extends Item {

    public ItemBase(String name) {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(Ruby.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }
}