package naturix.JARM;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting 
{

	public static void initCrafting() {
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ModItems.gemruby), 1.0F);
	}
	
}
