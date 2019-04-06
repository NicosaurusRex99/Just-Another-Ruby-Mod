package naturix.jarm.events;

import naturix.jarm.registry.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventArmorSet{


	private ModItems item = new ModItems();
	private Item boots = null, body = null, legs = null, helmet = null;
	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
		ItemStack stackBoots = event.player.inventory.armorInventory.get(0);
		ItemStack stackLegs = event.player.inventory.armorInventory.get(1);
		ItemStack stackBody = event.player.inventory.armorInventory.get(2);
		ItemStack stackHelmet = event.player.inventory.armorInventory.get(3);
		if(stackBoots != null) boots = stackBoots.getItem();
		else boots = null;
		if(stackBody != null) body = stackBody.getItem();
		else body = null;
		if(stackLegs != null) legs = stackLegs.getItem();
		else legs = null;
		if(stackHelmet != null) helmet = stackHelmet.getItem();
		else helmet = null;
		
		if(helmet == 
				ModItems.helmetAmethyst && body == 
				ModItems.chestplateAmethyst && legs ==
				ModItems.leggingsAmethyst && boots == 
				ModItems.bootsAmethyst && event.player.capabilities.allowFlying == false)
		{
		event.player.fallDistance = 0;
		}
		
		if(helmet == 
				ModItems.helmetBraunite&& body == 
				ModItems.chestplateBraunite && legs ==
				ModItems.leggingsBraunite && boots == 
				ModItems.bootsBraunite && event.player.capabilities.allowFlying == false)
		{
		event.player.fallDistance = 0;
		}
//		
		if(helmet == ModItems.helmetOpal) {
			event.player.heal(0.1f);
		}
		if(boots == ModItems.bootsMeteorite) {
			event.player.fallDistance = 0;
			
		}
		if(helmet == 
				ModItems.helmetOpal&& body == 
				ModItems.chestplateOpal && legs ==
				ModItems.leggingsOpal && boots == 
				ModItems.bootsOpal) 
		{
		
			event.player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("invisibility"), 2, 5));

		}
	}
	

		@SubscribeEvent
		public void onJump(LivingJumpEvent event) {

		}

		@SubscribeEvent
		public void onLivingHurtEvent(LivingHurtEvent event) {
			EntityPlayer player = (EntityPlayer)event.getEntity();
			ItemStack stackBoots = player.inventory.armorInventory.get(0);
			ItemStack stackLegs = player.inventory.armorInventory.get(1);
			ItemStack stackBody = player.inventory.armorInventory.get(2);
			ItemStack stackHelmet = player.inventory.armorInventory.get(3);
			if(stackBoots != null) boots = stackBoots.getItem();
			else boots = null;
			if(stackBody != null) body = stackBody.getItem();
			else body = null;
			if(stackLegs != null) legs = stackLegs.getItem();
			else legs = null;
			if(stackHelmet != null) helmet = stackHelmet.getItem();
			else helmet = null;
			
			if(helmet == 
					ModItems.helmetRuby && body == 
					ModItems.chestplateRuby && legs ==
					ModItems.leggingsRuby && boots == 
					ModItems.bootsRuby)
			{
				if(event.getSource() == DamageSource.GENERIC) {
					event.setCanceled(true);
				}
			}
		}

}