package naturix.jarm.items.tools;

import naturix.jarm.JARM;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe{
	protected String name;

	public HoeBase(ToolMaterial material, String name) {
		super(material);
		this.name = name;
		registerItem(name, this);
	}
		
//public static List<Item> JARMItemList = new ArrayList<>(30);

	public static void registerItem(String name, Item item)
	{
		item.setRegistryName(name);
		item.setCreativeTab(JARM.JARM);
		item.setUnlocalizedName(name);
		//ForgeRegistries.ITEMS.register(item);	
		//JARMItemList.add(item);
		}
	public void registerItemModel() {
		JARM.proxy.registerItemRenderer(this, 0, name);
	}
}