package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AxeBase extends AxeItem
{
    public AxeBase(String name, IItemTier tier, float attackDamageIn, float attackSpeedIn)
    {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(Ruby.setup.itemGroup));
    setRegistryName(name);
    ModItems.ITEMS.add(this);
    }
    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.TALL_PLANTS && material != Material.BAMBOO ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}