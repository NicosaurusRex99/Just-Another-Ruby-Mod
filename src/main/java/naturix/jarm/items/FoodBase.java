package naturix.JARM.items;
import naturix.JARM.JARM;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

	private String name;

	public FoodBase(String name) {
		super(3, 1.5f, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(JARM.JARM);
		this.name = name;
	}
	
	public void registerItemModel(Item item) {
		JARM.proxy.registerItemRenderer(this, 0, name);
	}
}
