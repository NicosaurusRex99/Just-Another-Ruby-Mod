package naturix.jarm.registry;

import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	public static void initOreDict() {
		if(ConfigMain.amethystModule == true) {
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModBlocks.block_amethyst));
		}if(ConfigMain.brauniteModule == true) {
		OreDictionary.registerOre("gemBraunite", ModItems.gemBraunite);
		}if (ConfigMain.rubyModule == true) {
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		}if(ConfigMain.amberModule == true) {
			OreDictionary.registerOre("gemAmber", ModItems.gemAmber);
		 }
		 if(ConfigMain.cinnibarModule == true) {
			 OreDictionary.registerOre("gemCinnibar", ModItems.gemCinnibar);
			 OreDictionary.registerOre("gemMercury", ModItems.gemCinnibar);
		 }
		 if(ConfigMain.fossilModule == true) {
			 OreDictionary.registerOre("gemFossil", ModItems.gemFossil);
		 }
		 if(ConfigMain.jadeModule == true) {
			 OreDictionary.registerOre("gemJade", ModItems.gemJade);
		 }
		 if(ConfigMain.opalModule == true) {
			 OreDictionary.registerOre("gemOpal", ModItems.gemOpal);
		 }
		 if(ConfigMain.saphireModule == true) {
			 OreDictionary.registerOre("gemSaphire", ModItems.gemSaphire);
		 }
		 if(ConfigMain.meteoriteModule == true) {
			 OreDictionary.registerOre("gemMeteorite", ModItems.gemMeteorite);
			 OreDictionary.registerOre("gemMeteor", ModItems.gemMeteorite);
			 }
		 if(ConfigMain.tinModule == true) {
			 OreDictionary.registerOre("ingotTin", ModItems.ingot_tin);
			 	 }
		 if(ConfigMain.copperModule == true) {
			 OreDictionary.registerOre("ingotCopper", ModItems.ingot_copper);
			 	 }
		 if(ConfigMain.leadModule == true) {
			 OreDictionary.registerOre("ingotLead", ModItems.ingot_lead);
			 	 }
		 if(ConfigMain.silverModule == true) {
			 OreDictionary.registerOre("ingotSilver", ModItems.ingot_silver);
			 	 }
		 if(ConfigMain.tungstenModule == true) {
			 OreDictionary.registerOre("ingotTungsten", ModItems.ingot_tungsten);
			 	 }
		 if(ConfigMain.platinumModule == true) {
			 OreDictionary.registerOre("ingotPlatinum", ModItems.ingot_platinum);
			 	 }
		 if(ConfigMain.cobaltModule == true) {
			 OreDictionary.registerOre("ingotCobalt", ModItems.ingot_cobalt);
			 	 }
		 if(ConfigMain.mythrillModule == true) {
			 OreDictionary.registerOre("ingotMythrill", ModItems.ingot_mythrill);
			 	 }
		 if(ConfigMain.titaniumModule == true) {
			 OreDictionary.registerOre("ingotTitanium", ModItems.ingot_titanium);
			 	 }
		 if(ConfigMain.luminiteModule == true) {
			 OreDictionary.registerOre("ingotLuminite", ModItems.ingot_luminite);
			 OreDictionary.registerOre("ingotLumium", ModItems.ingot_luminite);
			 	 }
		 if(ConfigMain.uraniumModule == true) {
			 OreDictionary.registerOre("ingotUranium", ModItems.ingot_uranium);
			 	 }
		 if(ConfigMain.nickelModule == true) {
			 OreDictionary.registerOre("ingotNickel", ModItems.ingot_nickel);
			 	 }
		 if(ConfigMain.steelModule == true) {
			 OreDictionary.registerOre("ingotSteel", ModItems.ingot_steel);
			 	 }
		 if(ConfigMain.osmiumModule == true) {
			 OreDictionary.registerOre("ingotOsmium", ModItems.ingot_osmium);
			 	 }
	    
	}
}