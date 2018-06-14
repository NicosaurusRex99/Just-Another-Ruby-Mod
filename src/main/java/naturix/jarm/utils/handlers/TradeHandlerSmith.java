package naturix.jarm.utils.handlers;

import java.util.Random;

import naturix.jarm.registry.ModBlocks;
import naturix.jarm.registry.ModItems;
import naturix.jarm.utils.config.Config;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandlerSmith implements EntityVillager.ITradeList
{
   @Override
   public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
   {
	   if(Config.amethystModule == true) {
      recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 10 + random.nextInt(15)),new ItemStack(ModBlocks.block_amethyst,1 + random.nextInt(2))));
   }
	   if(Config.rubyModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(ModBlocks.block_amethyst, 3 + random.nextInt(5)),new ItemStack(ModItems.gemRuby, 1+ random.nextInt(3))));
	   }
	   if(Config.jadeModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.DIAMOND, 2 + random.nextInt(15)), new ItemStack(ModItems.gemJade, 1 + random.nextInt(8))));
	   }
	   if(Config.meteoriteModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.DIAMOND, 10 + random.nextInt(15)), new ItemStack(ModItems.gemMeteorite, 1 + random.nextInt(4))));
	   }
	   if(Config.opalModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 5 + random.nextInt(15)), new ItemStack(ModItems.gemOpal, 1 + random.nextInt(8))));
	   }
	   if(Config.jadeModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.GOLD_INGOT, 2 + random.nextInt(15)), new ItemStack(ModItems.gemSaphire, 1 + random.nextInt(8))));
	   }
	   if(Config.platinumModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.GOLD_INGOT, 2 + random.nextInt(15)), new ItemStack(ModItems.ingot_platinum, 1 + random.nextInt(2))));
	   }
	   if(Config.steelModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.IRON_INGOT, 2 + random.nextInt(15)), new ItemStack(ModItems.ingot_steel, 1 + random.nextInt(3))));
	   }
	   if(Config.osmiumModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.IRON_INGOT, 2 + random.nextInt(15)), new ItemStack(ModItems.ingot_osmium, 1 + random.nextInt(3))));
	   }
   }
}