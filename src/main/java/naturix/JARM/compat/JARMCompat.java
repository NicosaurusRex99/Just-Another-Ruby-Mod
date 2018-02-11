package naturix.JARM.compat;

import naturix.JARM.JARM;
import naturix.JARM.ModItems;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.ArrowShaftMaterialStats;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerTraits;

@Optional.InterfaceList({
    @Optional.Interface(modid = "chisel", iface = "team.chisel.api.ChiselAPIProps"),
    @Optional.Interface(modid = "chisel", iface = "team.chisel.api.IMC"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.TinkerRegistry"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.client.material.MaterialRenderInfoLoader"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.ArrowShaftMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.BowMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.ExtraMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.HandleMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.HeadMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.FletchingMaterialStats"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.materials.Material"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.utils.HarvestLevels"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.tools.TinkerTraits"),
    @Optional.Interface(modid = "tconstruct", iface = "slimeknights.tconstruct.library.traits.ITrait")
})
public enum JARMCompat {
JEI("Just Enough Items") {

},
@SuppressWarnings("WeakerAccess")
TCONSTRUCT("Tinkers' Construct") {
    @Optional.Method(modid = "tconstruct")
    @Override
    protected void preInit() {
        TinkerRegistry.addMaterialStats(TConObjects.rubymaterial,
                new HeadMaterialStats(460, 8.9f, 4.3f, HarvestLevels.IRON),
                new BowMaterialStats(0.6f, 2f, 0),
                new ArrowShaftMaterialStats(1.4f, 20));
        TinkerRegistry.integrate(TConObjects.rubymaterial).preInit();
    }

    @Optional.Method(modid = "tconstruct")
    @Override
    protected void init() {
        TConObjects.rubymaterial.addCommonItems("Ruby");
        TConObjects.rubymaterial
                .addTrait(TConObjects.ruby)
                .addTrait(TinkerTraits.holy)
                .setCraftable(true).setCastable(false)
                .setRepresentativeItem(ModItems.gemruby);

    }
};
protected void preInit() {}
protected void init() {}
protected void postInit() {}

final private String modName;

private boolean isActivated = false;

JARMCompat(String modName) {
    this.modName = modName;
}

public static void preInitCompat() {
    for (JARMCompat compat : JARMCompat.values()) {
        if (Loader.isModLoaded(compat.name().toLowerCase())) {
            try {
                compat.preInit();
                compat.isActivated = true;
                JARM.logger.info(JARM.MODID + " has loaded compatibility for mod " + compat.modName + ".");
            } catch (Exception e) {
                compat.isActivated = false;
                JARM.logger.info(JARM.MODID + " had an error loading " + compat.modName + " compatibility!");
                JARM.logger.catching(e.fillInStackTrace());
            }
        } else {
            compat.isActivated = false;
            JARM.logger.info(JARM.MODID + " has skipped compatibility for mod " + compat.modName + ".");
        }
    }
}

public static void initCompat() {
    for (JARMCompat compat : JARMCompat.values()) {
        if (compat.isActivated) {
            try {
                compat.init();
            } catch (Exception e) {
                compat.isActivated = false;
                JARM.logger.info(JARM.MODID + " had an error loading " + compat.modName + " compatibility in init!");
                JARM.logger.catching(e.fillInStackTrace());
            }
        }
    }
}

public static void postInitCompat() {
    for (JARMCompat compat : JARMCompat.values()) {
        if (compat.isActivated) {
            try {
                compat.postInit();
            } catch (Exception e) {
                compat.isActivated = false;
                JARM.logger.info(JARM.MODID + " had an error loading " + compat.modName + " compatibility in postInit!");
                JARM.logger.catching(e.fillInStackTrace());
            }
        }
    }
}
}