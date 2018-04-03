package naturix.jarm.utils;

import java.util.Random;

import naturix.jarm.registry.ModBlocks;
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
      recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD, 10 + random.nextInt(15)),new ItemStack(ModBlocks.block_amethyst,1 + random.nextInt(2))));
   }
}