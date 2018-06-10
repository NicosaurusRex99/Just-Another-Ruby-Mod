package naturix.jarm.utils;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomMessage {
	@SideOnly(Side.CLIENT)
	public static void message(EntityJoinWorldEvent evt) {
		new TextComponentString(evt.getEntity().getDisplayName() + " is testing chat messages");
		
	}
}
