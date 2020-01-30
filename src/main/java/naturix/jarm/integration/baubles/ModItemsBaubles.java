package naturix.JARM.integration.baubles;

import naturix.JARM.integration.baubles.rings.AmethystMeteorRing;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItemsBaubles {
	public static AmethystMeteorRing meteorring = new AmethystMeteorRing("ring_amethyst");
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
		meteorring
		);
	}
	public static void registerModels() {
		meteorring.registerItemModel();
	}
}
