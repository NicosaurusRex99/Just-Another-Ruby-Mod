package naturix.jarm.utils.handlers;

import java.util.Random;

import naturix.jarm.registry.ModBlocks;
import naturix.jarm.registry.ModItems;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandler implements EntityVillager.ITradeList
{
   @Override
   public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
   {
	   if(ConfigMain.amethystModule == true) {
      recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 10 + random.nextInt(15)),new ItemStack(ModBlocks.block_amethyst,1 + random.nextInt(2))));
   }
	   if(ConfigMain.rubyModule == true) {
		   recipeList.add(new MerchantRecipe(new ItemStack(Items.REDSTONE, 5 + random.nextInt(20)),new ItemStack(ModItems.gemRuby, 1+ random.nextInt(8))));
	   }
	   
	   /*
	   gemBraunite
	   gemAmber
	   gemCinnibar
	   gemFossil
	   gemJade
	   gemMeteorite
	   gemOpal
	   gemSaphire
	   ingot_tin
	   ingot_copper
	   ingot_lead
	   ingot_silver
	   ingot_tungsten
	   ingot_platinum
	   ingot_cobalt
	   ingot_mythrill
	   ingot_titanium
	   ingot_luminite
	   ingot_uranium
	   ingot_nickel
	   ingot_steel
	   ingot_osmium*/
   }
}