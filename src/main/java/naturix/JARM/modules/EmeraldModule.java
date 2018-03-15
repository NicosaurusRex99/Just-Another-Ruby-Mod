package naturix.JARM.modules;

import naturix.JARM.armor.EmeraldBoots;
import naturix.JARM.armor.EmeraldChestplate;
import naturix.JARM.armor.EmeraldHelmet;
import naturix.JARM.armor.EmeraldLeggings;
import naturix.JARM.items.AxeEmerald;
import naturix.JARM.items.HoeEmerald;
import naturix.JARM.items.PickaxeEmerald;
import naturix.JARM.items.ShovelEmerald;
import naturix.JARM.items.SwordEmerald;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmeraldModule {
	@GameRegistry.ObjectHolder("JARM:emeraldboots")
    public static EmeraldBoots emeraldboots;
    @GameRegistry.ObjectHolder("JARM:emeraldleggings")
    public static EmeraldLeggings emeraldleggings;
    @GameRegistry.ObjectHolder("JARM:emeraldchestplate")
    public static EmeraldChestplate emeraldchestplate;
    @GameRegistry.ObjectHolder("JARM:emeraldhelmet")
    public static EmeraldHelmet emeraldhelmet;
    @GameRegistry.ObjectHolder("JARM:axeemerald")
    public static AxeEmerald emeraldaxe;
    @GameRegistry.ObjectHolder("JARM:hoeemerald")
    public static HoeEmerald emeraldhoe;
    @GameRegistry.ObjectHolder("JARM:pickaxeemerald")
    public static PickaxeEmerald emeraldpickaxe;
    @GameRegistry.ObjectHolder("JARM:shovelemerald")
    public static ShovelEmerald emeraldshovel;
    @GameRegistry.ObjectHolder("JARM:swordemerald")
    public static SwordEmerald emeraldsword;
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        emeraldboots.initModel();
        emeraldleggings.initModel();
        emeraldchestplate.initModel();
        emeraldhelmet.initModel();
        emeraldaxe.initModel();
        emeraldhoe.initModel();
        emeraldpickaxe.initModel();
        emeraldshovel.initModel();
        emeraldsword.initModel();
    }
}
