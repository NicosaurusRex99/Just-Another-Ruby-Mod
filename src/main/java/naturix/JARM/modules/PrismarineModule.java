package naturix.JARM.modules;

import naturix.JARM.armor.PrismarineHelmet;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PrismarineModule {
	@GameRegistry.ObjectHolder("JARM:prismarinehelmet")
    public static PrismarineHelmet prismarinehelmet;
	@SideOnly(Side.CLIENT)
	public static void initModels() {
	    prismarinehelmet.initModel();
	}
}
