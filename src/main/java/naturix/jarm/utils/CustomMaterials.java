package naturix.jarm.utils;

import naturix.jarm.JARM;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CustomMaterials {
	public static String MODID = JARM.MODID;
    public static final ItemArmor.ArmorMaterial rubyArmorMaterial = EnumHelper.addArmorMaterial("ruby", MODID + ":ruby", 15, new int[]{ConfigMain.rubyHelm, ConfigMain.rubyChest, ConfigMain.rubyLeg, ConfigMain.rubyBoot}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial PrismarineArmorMaterial = EnumHelper.addArmorMaterial("prismarine", MODID + ":prismarine", 4, new int[]{ConfigMain.prismarineHelm, 5, 2, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial LapisArmorMaterial = EnumHelper.addArmorMaterial("lapis", MODID + ":lapis", 4, new int[]{ConfigMain.lapisHelm, ConfigMain.lapisChest, ConfigMain.lapisLeg, ConfigMain.lapisBoot}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", MODID + ":emerald", 4, new int[]{ConfigMain.emeraldHelm, ConfigMain.emeraldChest, ConfigMain.emeraldLeg, ConfigMain.emeraldBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    public static final ItemArmor.ArmorMaterial AmethystArmorMaterial = EnumHelper.addArmorMaterial("amethyst", MODID + ":emerald", 4, new int[]{ConfigMain.amethystHelm, ConfigMain.amethystChest, ConfigMain.amethystLeg, ConfigMain.amethystBoot}, 500, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial ShulkerArmorMaterial = EnumHelper.addArmorMaterial("SHULKER", MODID + ":shulker", 4, new int[]{ConfigMain.shulkerHelm, ConfigMain.shulkerChest, ConfigMain.shulkerLeg, ConfigMain.shulkerBoot}, 500, SoundEvents.ENTITY_SHULKER_AMBIENT, 0.0F); 
    public static final ItemArmor.ArmorMaterial brauniteArmorMaterial = EnumHelper.addArmorMaterial("braunite", MODID + ":shulker", 4, new int[]{ConfigMain.shulkerHelm, ConfigMain.shulkerChest, ConfigMain.shulkerLeg, ConfigMain.shulkerBoot}, 500, SoundEvents.ENTITY_SHULKER_AMBIENT, 0.0F); 
   
    public static final ToolMaterial brauniteToolMaterial = EnumHelper.addToolMaterial("BRAUNITE", 4, 6723, 13, 10, 500);
    public static final ToolMaterial LapisToolMaterial = EnumHelper.addToolMaterial("LAPIS", 1, 100, 2, 1, 50);
    public static final ToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("EMERALD", 3, 1300, 11, 7, 50);
    public static final ToolMaterial AmethystToolMaterial = EnumHelper.addToolMaterial("AMETHYST", 4, 6723, 13, 10, 500);
    public static final ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("RUBY", 4, 4096, 14, 9, 19);
      
}
