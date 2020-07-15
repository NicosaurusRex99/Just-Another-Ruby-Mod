package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ShovelBase extends ShovelItem {

    public ShovelBase(String name, IItemTier tier)
    {
        super(tier, tier.getAttackDamage()/4, -2.0F, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(Ruby.MODID, name);
    }
}