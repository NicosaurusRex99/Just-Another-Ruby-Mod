package naturix.JARM.modules;

import naturix.JARM.armor.ShulkerBoots;
import naturix.JARM.armor.ShulkerChestplate;
import naturix.JARM.armor.ShulkerHelmet;
import naturix.JARM.armor.ShulkerLeggings;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ShulkerModule {
    @GameRegistry.ObjectHolder("jarm:shulkerboots")
    public static ShulkerBoots shulkerboots;
    @GameRegistry.ObjectHolder("jarm:shulkerleggings")
    public static ShulkerLeggings shulkerleggings;
    @GameRegistry.ObjectHolder("jarm:shulkerhelmet")
    public static ShulkerHelmet shulkerhelmet;
    @GameRegistry.ObjectHolder("jarm:shulkerchestplate")
    public static ShulkerChestplate shulkerchestplate;
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        shulkerboots.initModel();
        shulkerleggings.initModel();
        shulkerhelmet.initModel();
        shulkerchestplate.initModel();
        }
}
