package naturix.jarm.items.tools;

import naturix.jarm.JARM;
import naturix.jarm.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AxeBase extends ModItemAxe {

	protected String name;

	public AxeBase(ToolMaterial material, String name) {
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