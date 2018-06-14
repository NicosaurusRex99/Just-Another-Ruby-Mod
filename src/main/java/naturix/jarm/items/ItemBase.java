package naturix.jarm.items;

import naturix.jarm.JARM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBase extends Item {
	protected World world;
	static EntityPlayer player;
	static ItemStack itemStack;
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		registerItem(name, this);
	}
		
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
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