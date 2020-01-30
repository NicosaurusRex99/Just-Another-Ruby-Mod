package naturix.JARM.utils.handlers;

import java.util.Random;

import naturix.JARM.registry.ModBlocks;
import naturix.JARM.utils.config.Config;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandlerTree implements EntityVillager.ITradeList
{
   @Override
   public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
   {
	   if(Config.woodModule == true) {
      recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 3 + random.nextInt(2)),new ItemStack(ModBlocks.sapling_dwarf,1)));
   }
	   
   }
}