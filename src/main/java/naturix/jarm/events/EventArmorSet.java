package naturix.jarm.events;

import naturix.jarm.registry.ModItems;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventArmorSet{


	private ModItems item = new ModItems();
	private Item boots = null, body = null, legs = null, helmet = null;
	boolean isDone, isDone2, isDone3;
	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
		//Literally the same thing that armorItemInSlot does, but not set as client-sided. WTF Forge.
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
				ModItems.bootsAmethyst) 
		{
		event.player.fallDistance = 0;
		event.player.capabilities.allowFlying = true;
		isDone=false;
		}else {
			if(event.player.isCreative() != true && event.player.capabilities.allowFlying || event.player.capabilities.isFlying
					|| helmet == ModItems.helmetAmethyst || body == ModItems.chestplateAmethyst || legs == ModItems.leggingsAmethyst || boots == ModItems.bootsAmethyst
					) {
				if(isDone==false) {
				event.player.capabilities.isFlying = false;
				event.player.capabilities.allowFlying = false;
				isDone=true;
				}
		}
		}
		if(helmet == 
				ModItems.helmetBraunite&& body == 
				ModItems.chestplateBraunite && legs ==
				ModItems.leggingsBraunite && boots == 
				ModItems.bootsBraunite) 
		{
		event.player.fallDistance = 0;
		event.player.capabilities.allowFlying = true;
		isDone2=false;
		}else {
			if(event.player.isCreative() != true && event.player.capabilities.allowFlying || event.player.capabilities.isFlying
					|| helmet == ModItems.helmetBraunite || body == ModItems.chestplateBraunite || legs == ModItems.leggingsBraunite || boots == ModItems.bootsBraunite
					) {
				if(isDone2==false) {
				event.player.capabilities.isFlying = false;
				event.player.capabilities.allowFlying = false;
				isDone2=true;
				}
		}
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
		isDone3=false;
		}else {
			if(event.player.isCreative() != true && event.player.capabilities.allowFlying || event.player.capabilities.isFlying
					|| helmet == ModItems.helmetOpal || body == ModItems.chestplateOpal || legs == ModItems.leggingsOpal || boots == ModItems.bootsOpal
					) {
				if(isDone3==false) {
				event.player.capabilities.isFlying = false;
				event.player.capabilities.allowFlying = false;
				isDone3=true;
				}
		}
		}
		if(event.player.isCreative() == true) {
			event.player.capabilities.allowFlying = true;
		}
	}
	

		@SubscribeEvent
		public void onJump(LivingJumpEvent event) {

		}

		@SubscribeEvent
		public void onLivingHurtEvent(LivingHurtEvent e) {
			
		}

}