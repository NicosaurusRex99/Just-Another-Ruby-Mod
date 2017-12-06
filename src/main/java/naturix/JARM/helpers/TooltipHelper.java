package naturix.JARM.helpers;

import java.util.List;

import cofh.api.item.IMultiModeItem;
import cofh.core.key.KeyBindingItemMultiMode;
import cofh.core.util.helpers.StringHelper;
import net.minecraft.item.ItemStack;

public class TooltipHelper {
	public static void addEmpoweredTip(IMultiModeItem item, ItemStack stack, List<String> tooltip) {

		if (item.getMode(stack) == 1) {
			tooltip.add(StringHelper.localizeFormat("info.jarm.tool.chargeOff", StringHelper.getKeyName(KeyBindingItemMultiMode.INSTANCE.getKey())));
		} else {
			tooltip.add(StringHelper.localizeFormat("info.jarm.tool.chargeOn", StringHelper.getKeyName(KeyBindingItemMultiMode.INSTANCE.getKey())));
		}
	}
	public static boolean showToolCharge = true;
}
