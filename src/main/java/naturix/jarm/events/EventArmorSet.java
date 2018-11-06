package naturix.jarm.events;

import naturix.jarm.registry.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventArmorSet{


	private ModItems item = new ModItems();
	private Item boots = null, body = null, legs = null, helmet = null;

	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
		ItemStack stackBoots = event.player.inventory.armorItemInSlot(0);
		ItemStack stackLegs = event.player.inventory.armorItemInSlot(1);
		ItemStack stackBody = event.player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = event.player.inventory.armorItemInSlot(3);
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
		}else {
			if(event.player.isCreative() != true) {
			event.player.capabilities.isFlying = false;
			event.player.capabilities.allowFlying = false;
		}
		}
	}
	

		@SubscribeEvent
		public void onJump(LivingJumpEvent event) {

		}

		@SubscribeEvent
		public void onLivingHurtEvent(LivingHurtEvent e) {

		}

}