package naturix.JARM.modules;

import naturix.JARM.armor.LapisBoots;
import naturix.JARM.armor.LapisChestplate;
import naturix.JARM.armor.LapisHelmet;
import naturix.JARM.armor.LapisLeggings;
import naturix.JARM.items.AxeLapis;
import naturix.JARM.items.HoeLapis;
import naturix.JARM.items.PickaxeLapis;
import naturix.JARM.items.ShovelLapis;
import naturix.JARM.items.SwordLapis;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LapisModule {
	@GameRegistry.ObjectHolder("jarm:lapisboots")
    public static LapisBoots lapisboots;
    @GameRegistry.ObjectHolder("jarm:lapisleggings")
    public static LapisLeggings lapisleggings;
    @GameRegistry.ObjectHolder("jarm:lapischestplate")
    public static LapisChestplate lapischestplate;
    @GameRegistry.ObjectHolder("jarm:lapishelmet")
    public static LapisHelmet lapishelmet;
    @GameRegistry.ObjectHolder("jarm:axelapis")
    public static AxeLapis axelapis;
    @GameRegistry.ObjectHolder("jarm:swordlapis")
    public static SwordLapis swordlapis;
    @GameRegistry.ObjectHolder("jarm:hoelapis")
    public static HoeLapis hoelapis;
    @GameRegistry.ObjectHolder("jarm:pickaxelapis")
    public static PickaxeLapis pickaxelapis;
    @GameRegistry.ObjectHolder("jarm:shovellapis")
    public static ShovelLapis shovellapis;
    
@SideOnly(Side.CLIENT)
public static void initModels() {
    lapisboots.initModel();
    lapisleggings.initModel();
    lapischestplate.initModel();
    lapishelmet.initModel();
    axelapis.initModel();
    swordlapis.initModel();
    hoelapis.initModel();
    pickaxelapis.initModel();
    shovellapis.initModel();
}
}
