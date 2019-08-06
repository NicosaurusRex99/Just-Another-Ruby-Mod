package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {

    public ItemBase(String name) {
        super(new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }
    public ItemBase(String name, Item.Properties props) {
        super(props);
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }


}