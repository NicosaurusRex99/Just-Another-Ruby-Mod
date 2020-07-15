package naturix.ruby.objects.items;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ArmorBase extends ArmorItem {
    public IArmorMaterial mat;
    public ArmorBase(String name, IArmorMaterial materialIn, EquipmentSlotType slot) {
        super(materialIn, slot, new Item.Properties().group(Ruby.setup.itemGroup));
        setRegistryName(Ruby.MODID, name);
        this.mat = materialIn;
    }

    public int getItemEnchantability() {
        return mat.getEnchantability();
    }
}
