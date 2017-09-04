package naturix.JARM.armor;

import java.util.ArrayList;
import java.util.List;

import naturix.JARM.JARM;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemBase extends Item
{
	public static List<Item> rtItemList = new ArrayList<>(30);
	
	public ItemBase(String name)
	{
		registerItem(name, this);
		
	}

	public static void registerItem(String name, Item item)
	{
		item.setRegistryName(name);
		item.setCreativeTab(JARM.JustAnotherRubyMod);
		item.setUnlocalizedName(name);

		ForgeRegistries.ITEMS.register(item);
		
		rtItemList.add(item);
	}
}
