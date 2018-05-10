package naturix.jarm.registry;

import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {
	public static void initOreDict() {
		if(ConfigMain.amethystModule == true) {
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModBlocks.block_amethyst));
		}
		if(ConfigMain.brauniteModule == true) {
		OreDictionary.registerOre("gemBraunite", ModItems.gemBraunite);
		OreDictionary.registerOre("oreBraunite", ModBlocks.ore_braunite);
		}
		if (ConfigMain.rubyModule == true) {
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		OreDictionary.registerOre("oreRuby", ModBlocks.ore_ruby);
		}
		if(ConfigMain.amberModule == true) {
			OreDictionary.registerOre("gemAmber", ModItems.gemAmber);
			OreDictionary.registerOre("oreAmber", ModBlocks.ore_amber);
		 }
		if(ConfigMain.cinnibarModule == true) {
			 OreDictionary.registerOre("gemCinnibar", ModItems.gemCinnibar);
			 OreDictionary.registerOre("gemMercury", ModItems.gemCinnibar);
			 OreDictionary.registerOre("oreCinnibar", ModBlocks.ore_cinnibar);
			 OreDictionary.registerOre("oreMercury", ModBlocks.ore_cinnibar);
		 }
		if(ConfigMain.fossilModule == true) {
			 OreDictionary.registerOre("gemFossil", ModItems.gemFossil);
			 OreDictionary.registerOre("oreFossil", ModBlocks.ore_fossil);
		 }
		if(ConfigMain.jadeModule == true) {
			 OreDictionary.registerOre("gemJade", ModItems.gemJade);
			 OreDictionary.registerOre("oreJade", ModBlocks.ore_jade);
		 }
		if(ConfigMain.opalModule == true) {
			 OreDictionary.registerOre("gemOpal", ModItems.gemOpal);
			 OreDictionary.registerOre("oreOpal", ModBlocks.ore_opal);
		 }
		if(ConfigMain.saphireModule == true) {
			OreDictionary.registerOre("oreSaphire", ModBlocks.ore_saphire);
			OreDictionary.registerOre("gemSaphire", ModItems.gemSaphire);
		 }
		if(ConfigMain.meteoriteModule == true) {
			 OreDictionary.registerOre("gemMeteorite", ModItems.gemMeteorite);
			 OreDictionary.registerOre("gemMeteor", ModItems.gemMeteorite);
			 OreDictionary.registerOre("oreMeteor", ModBlocks.ore_meteorite);
			 OreDictionary.registerOre("oreMeteorite", ModBlocks.ore_meteorite);
			 }
		if(ConfigMain.tinModule == true) {
			 OreDictionary.registerOre("ingotTin", ModItems.ingot_tin);
			 OreDictionary.registerOre("oreTin", ModBlocks.ore_tin);
			 	 }
		if(ConfigMain.copperModule == true) {
			 OreDictionary.registerOre("ingotCopper", ModItems.ingot_copper);
			 OreDictionary.registerOre("oreCopper", ModBlocks.ore_copper);
			 	 }
		if(ConfigMain.leadModule == true) {
			 OreDictionary.registerOre("ingotLead", ModItems.ingot_lead);
			 OreDictionary.registerOre("oreLead", ModBlocks.ore_lead);
			 	 }
		if(ConfigMain.silverModule == true) {
			 OreDictionary.registerOre("ingotSilver", ModItems.ingot_silver);
			 OreDictionary.registerOre("oreSilver", ModBlocks.ore_silver);
		}
		if(ConfigMain.tungstenModule == true) {
			 OreDictionary.registerOre("ingotTungsten", ModItems.ingot_tungsten);
			 OreDictionary.registerOre("oreTungsten", ModBlocks.ore_tungsten);
			 	 }
		if(ConfigMain.platinumModule == true) {
			 OreDictionary.registerOre("ingotPlatinum", ModItems.ingot_platinum);
			 OreDictionary.registerOre("orePlatinum", ModBlocks.ore_platinum);
			 	 }
		if(ConfigMain.cobaltModule == true) {
			 OreDictionary.registerOre("ingotCobalt", ModItems.ingot_cobalt);
			 OreDictionary.registerOre("oreCobalt", ModBlocks.ore_cobalt);
			 	 }
		if(ConfigMain.mythrillModule == true) {
			 OreDictionary.registerOre("ingotMythrill", ModItems.ingot_mythrill);
			 OreDictionary.registerOre("oreMythrill", ModBlocks.ore_mythrill);
			 	 }
		if(ConfigMain.titaniumModule == true) {
			 OreDictionary.registerOre("ingotTitanium", ModItems.ingot_titanium);
			 OreDictionary.registerOre("oreTitanium", ModBlocks.ore_titanium);
			 	 }
		if(ConfigMain.luminiteModule == true) {
			 OreDictionary.registerOre("ingotLuminite", ModItems.ingot_luminite);
			 OreDictionary.registerOre("ingotLumium", ModItems.ingot_luminite);
			 OreDictionary.registerOre("oreLuminite", ModBlocks.ore_luminite);
			 OreDictionary.registerOre("oreLumium", ModBlocks.ore_luminite);	 	 
		}
		if(ConfigMain.uraniumModule == true) { 
			 OreDictionary.registerOre("ingotUranium", ModItems.ingot_uranium);
			 OreDictionary.registerOre("oreUranium", ModBlocks.ore_uranium);
			 	 }
		if(ConfigMain.nickelModule == true) {
			 OreDictionary.registerOre("ingotNickel", ModItems.ingot_nickel);
			 OreDictionary.registerOre("oreNickel", ModBlocks.ore_nickel);
			 	 }
		if(ConfigMain.steelModule == true) {
			 OreDictionary.registerOre("ingotSteel", ModItems.ingot_steel);
			 OreDictionary.registerOre("gemCoal", Items.COAL);
			 	 }
		if(ConfigMain.osmiumModule == true) {
			 OreDictionary.registerOre("ingotOsmium", ModItems.ingot_osmium);
			 OreDictionary.registerOre("oreOsmium", ModBlocks.ore_osmium);
			 	 }
		if(ConfigMain.woodModule == true) {
			 OreDictionary.registerOre("plankWood", ModBlocks.planks_dwarf);
			 OreDictionary.registerOre("treeWood", ModBlocks.log_dwarf);
			 OreDictionary.registerOre("treeLeaves", ModBlocks.leaves_dwarf);
			 OreDictionary.registerOre("treeSapling", ModBlocks.sapling_dwarf);
		 }
	    
	}
}