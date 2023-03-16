package nicusha.ruby.registry;

import net.minecraft.resources.*;
import net.minecraft.sounds.*;
import net.minecraft.tags.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.registries.*;
import nicusha.ruby.*;
import nicusha.ruby.utils.*;

import static nicusha.ruby.Ruby.MODID;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    //ARMOR
    public static ArmorMaterial rubyMat = new ArmourMaterial("ruby", 1545, new int[]{5, 9, 12, 5}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, Ingredient.of(ItemTags.create(new ResourceLocation(MODID, "ruby_repair"))));
    public static ArmorMaterial amethystMat = new ArmourMaterial("amethyst", 500, new int[]{6, 10, 13, 6}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, Ingredient.of(ItemTags.create(new ResourceLocation(MODID, "amethyst_repair"))));
    public static ArmorMaterial brauniteMat = new ArmourMaterial("braunite", 750, new int[]{5, 8, 10, 4}, 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, Ingredient.of(ItemTags.create(new ResourceLocation(MODID, "braunite_repair"))));
    public static ArmorMaterial opalMat = new ArmourMaterial("opal", 500, new int[]{2, 3, 2, 1}, 9, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, Ingredient.of(ItemTags.create(new ResourceLocation(MODID, "opal_repair"))));
    public static ArmorMaterial meteoriteMat = new ArmourMaterial("meteorite", 6546, new int[]{5, 8, 7, 4}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, Ingredient.of(ItemTags.create(new ResourceLocation(MODID, "meteorite_repair"))));

    public static final RegistryObject<Item> BRAUNITE_GEM = createItem("braunite_gem", false);
    public static final RegistryObject<Item> METEORITE_GEM = createItem("meteorite_gem", true);
    public static final RegistryObject<Item> OPAL_GEM = createItem("opal_gem", false);
    public static final RegistryObject<Item> RUBY_GEM = createItem("ruby_gem", false);

    public static final RegistryObject<Item> AMETHYST_SWORD = createSwordItem("amethyst_sword", ToolTiers.AMETHYST, false);
    public static final RegistryObject<Item> BRAUNITE_SWORD = createSwordItem("braunite_sword", ToolTiers.BRAUNITE, false);
    public static final RegistryObject<Item> METEORITE_SWORD = createSwordItem("meteorite_sword", ToolTiers.METEORITE, false);
    public static final RegistryObject<Item> OPAL_SWORD = createSwordItem("opal_sword", ToolTiers.OPAL, false);
    public static final RegistryObject<Item> RUBY_SWORD = createSwordItem("ruby_sword", ToolTiers.RUBY, false);

    public static final RegistryObject<Item> AMETHYST_PICKAXE = createPickaxeItem("amethyst_pickaxe", ToolTiers.AMETHYST, false);
    public static final RegistryObject<Item> BRAUNITE_PICKAXE = createPickaxeItem("braunite_pickaxe", ToolTiers.BRAUNITE, false);
    public static final RegistryObject<Item> METEORITE_PICKAXE = createPickaxeItem("meteorite_pickaxe", ToolTiers.METEORITE, false);
    public static final RegistryObject<Item> OPAL_PICKAXE = createPickaxeItem("opal_pickaxe", ToolTiers.OPAL, false);
    public static final RegistryObject<Item> RUBY_PICKAXE = createPickaxeItem("ruby_pickaxe", ToolTiers.RUBY, false);

    public static final RegistryObject<Item> AMETHYST_AXE = createAxeItem("amethyst_axe", ToolTiers.AMETHYST, false);
    public static final RegistryObject<Item> BRAUNITE_AXE = createAxeItem("braunite_axe", ToolTiers.BRAUNITE, false);
    public static final RegistryObject<Item> METEORITE_AXE = createAxeItem("meteorite_axe", ToolTiers.METEORITE, false);
    public static final RegistryObject<Item> OPAL_AXE = createAxeItem("opal_axe", ToolTiers.OPAL, false);
    public static final RegistryObject<Item> RUBY_AXE = createAxeItem("ruby_axe", ToolTiers.RUBY, false);

    public static final RegistryObject<Item> AMETHYST_SHOVEL = createShovelItem("amethyst_shovel", ToolTiers.AMETHYST, false);
    public static final RegistryObject<Item> BRAUNITE_SHOVEL = createShovelItem("braunite_shovel", ToolTiers.BRAUNITE, false);
    public static final RegistryObject<Item> METEORITE_SHOVEL = createShovelItem("meteorite_shovel", ToolTiers.METEORITE, false);
    public static final RegistryObject<Item> OPAL_SHOVEL = createShovelItem("opal_shovel", ToolTiers.OPAL, false);
    public static final RegistryObject<Item> RUBY_SHOVEL = createShovelItem("ruby_shovel", ToolTiers.RUBY, false);

    public static final RegistryObject<Item> AMETHYST_HOE = createHoeItem("amethyst_hoe", ToolTiers.AMETHYST, false);
    public static final RegistryObject<Item> BRAUNITE_HOE = createHoeItem("braunite_hoe", ToolTiers.BRAUNITE, false);
    public static final RegistryObject<Item> METEORITE_HOE = createHoeItem("meteorite_hoe", ToolTiers.METEORITE, false);
    public static final RegistryObject<Item> OPAL_HOE = createHoeItem("opal_hoe", ToolTiers.OPAL, false);
    public static final RegistryObject<Item> RUBY_HOE = createHoeItem("ruby_hoe", ToolTiers.RUBY, false);

    public static final RegistryObject<Item> AMETHYST_HELMET = createArmorItem("amethyst_helmet", amethystMat, ArmorItem.Type.HELMET, false);
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = createArmorItem("amethyst_chestplate", amethystMat, ArmorItem.Type.CHESTPLATE, false);
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = createArmorItem("amethyst_leggings", amethystMat, ArmorItem.Type.LEGGINGS, false);
    public static final RegistryObject<Item> AMETHYST_BOOTS = createArmorItem("amethyst_boots", amethystMat, ArmorItem.Type.BOOTS, false);

    public static final RegistryObject<Item> BRAUNITE_HELMET = createArmorItem("braunite_helmet", brauniteMat, ArmorItem.Type.HELMET, false);
    public static final RegistryObject<Item> BRAUNITE_CHESTPLATE = createArmorItem("braunite_chestplate", brauniteMat, ArmorItem.Type.CHESTPLATE, false);
    public static final RegistryObject<Item> BRAUNITE_LEGGINGS = createArmorItem("braunite_leggings", brauniteMat, ArmorItem.Type.LEGGINGS, false);
    public static final RegistryObject<Item> BRAUNITE_BOOTS = createArmorItem("braunite_boots", brauniteMat, ArmorItem.Type.BOOTS, false);

    public static final RegistryObject<Item> METEORITE_HELMET = createArmorItem("meteorite_helmet", meteoriteMat, ArmorItem.Type.HELMET, false);
    public static final RegistryObject<Item> METEORITE_CHESTPLATE = createArmorItem("meteorite_chestplate", meteoriteMat, ArmorItem.Type.CHESTPLATE, false);
    public static final RegistryObject<Item> METEORITE_LEGGINGS = createArmorItem("meteorite_leggings", meteoriteMat, ArmorItem.Type.LEGGINGS, false);
    public static final RegistryObject<Item> METEORITE_BOOTS = createArmorItem("meteorite_boots", meteoriteMat, ArmorItem.Type.BOOTS, false);

    public static final RegistryObject<Item> OPAL_HELMET = createArmorItem("opal_helmet", opalMat, ArmorItem.Type.HELMET, false);
    public static final RegistryObject<Item> OPAL_CHESTPLATE = createArmorItem("opal_chestplate", opalMat, ArmorItem.Type.CHESTPLATE, false);
    public static final RegistryObject<Item> OPAL_LEGGINGS = createArmorItem("opal_leggings", opalMat, ArmorItem.Type.LEGGINGS, false);
    public static final RegistryObject<Item> OPAL_BOOTS = createArmorItem("opal_boots", opalMat, ArmorItem.Type.BOOTS, false);

    public static final RegistryObject<Item> RUBY_HELMET = createArmorItem("ruby_helmet", rubyMat, ArmorItem.Type.HELMET, false);
    public static final RegistryObject<Item> RUBY_CHESTPLATE = createArmorItem("ruby_chestplate", rubyMat, ArmorItem.Type.CHESTPLATE, false);
    public static final RegistryObject<Item> RUBY_LEGGINGS = createArmorItem("ruby_leggings", rubyMat, ArmorItem.Type.LEGGINGS, false);
    public static final RegistryObject<Item> RUBY_BOOTS = createArmorItem("ruby_boots", rubyMat, ArmorItem.Type.BOOTS, false);

    private static RegistryObject<Item> createItem(String id, boolean isFireProof){
        if(isFireProof){
            return ITEMS.register(id, () -> new Item(new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new Item(new Item.Properties()));
    }

    private static RegistryObject<Item> createSwordItem(String id, Tier tier, boolean isFireProof) {
        if (isFireProof) {
            return ITEMS.register(id, () -> new SwordItem(tier, tier.getLevel(), -2.4F, new Item.Properties().fireResistant()));
        }
    return ITEMS.register(id, ()-> new SwordItem(tier, tier.getLevel(), -2.4F, new Item.Properties()));
    }

    private static RegistryObject<Item> createPickaxeItem(String id, Tier tier, boolean isFireProof){
        if (isFireProof) {
            return ITEMS.register(id, () -> new PickaxeItem(tier, tier.getLevel(), -2.8F, new Item.Properties().fireResistant()));
        }
        return ITEMS.register(id, () -> new PickaxeItem(tier, tier.getLevel(), -2.8F, new Item.Properties()));
    }

    private static RegistryObject<Item> createAxeItem(String id, Tier tier, boolean isFireProof){
            if (isFireProof) {
                return ITEMS.register(id, () -> new AxeItem(tier, tier.getLevel(), -3.2F, new Item.Properties().fireResistant()));
            }
        return ITEMS.register(id, () -> new AxeItem(tier, tier.getLevel(), -3.2F, new Item.Properties()));
    }

    private static RegistryObject<Item> createShovelItem(String id, Tier tier, boolean isFireProof){
                if (isFireProof) {
                    return ITEMS.register(id, () -> new ShovelItem(tier, tier.getLevel(), -3F, new Item.Properties().fireResistant()));
                }

        return ITEMS.register(id, () -> new ShovelItem(tier, tier.getLevel(), -3F, new Item.Properties()));
    }

    private static RegistryObject<Item> createHoeItem(String id, Tier tier, boolean isFireProof){
                if (isFireProof) {
                    return ITEMS.register(id, () -> new HoeItem(tier, tier.getLevel(), -3F, new Item.Properties().fireResistant()));
                }
        return ITEMS.register(id, () -> new HoeItem(tier, tier.getLevel(), -3F, new Item.Properties()));
    }

    private static RegistryObject<Item> createArmorItem(String id, ArmorMaterial material, ArmorItem.Type slot, boolean isFireProof){
                if (isFireProof) {
                    return ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties().fireResistant()));
                }
        return ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties()));
    }
}
