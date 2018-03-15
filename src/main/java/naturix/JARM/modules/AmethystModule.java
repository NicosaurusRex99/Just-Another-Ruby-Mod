package naturix.JARM.modules;

import naturix.JARM.ModBlocks;
import naturix.JARM.armor.AmethystBoots;
import naturix.JARM.armor.AmethystChestplate;
import naturix.JARM.armor.AmethystHelmet;
import naturix.JARM.armor.AmethystLeggings;
import naturix.JARM.items.AxeAmethyst;
import naturix.JARM.items.HoeAmethyst;
import naturix.JARM.items.PickaxeAmethyst;
import naturix.JARM.items.ShovelAmethyst;
import naturix.JARM.items.SwordAmethyst;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class AmethystModule {
	@GameRegistry.ObjectHolder("JARM:amethysthelmet")
    public static AmethystHelmet amethysthelmet;
    @GameRegistry.ObjectHolder("JARM:amethystchestplate")
    public static AmethystChestplate amethystchestplate;
    @GameRegistry.ObjectHolder("JARM:amethystleggings")
    public static AmethystLeggings amethystleggings;
    @GameRegistry.ObjectHolder("JARM:amethystboots")
    public static AmethystBoots amethystboots;
    @GameRegistry.ObjectHolder("JARM:axeamethyst")
    public static AxeAmethyst axeamethyst;
    @GameRegistry.ObjectHolder("JARM:hoeamethyst")
    public static HoeAmethyst hoeamethyst;
    @GameRegistry.ObjectHolder("JARM:pickaxeamethyst")
    public static PickaxeAmethyst pickaxeamethyst;
    @GameRegistry.ObjectHolder("JARM:swordamethyst")
    public static SwordAmethyst swordamethyst;
    @GameRegistry.ObjectHolder("JARM:shovelamethyst")
    public static ShovelAmethyst shovelamethyst;
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        pickaxeamethyst.initModel();
        amethystleggings.initModel();
        amethystchestplate.initModel();
        amethysthelmet.initModel();
        amethystboots.initModel();
        axeamethyst.initModel();
        hoeamethyst.initModel();
        swordamethyst.initModel();
        shovelamethyst.initModel(); 
    }
    public static void initOreDict() {
    	{
    			OreDictionary.registerOre("gemAmethyst", ModBlocks.amethystrock);
    	}
}}
