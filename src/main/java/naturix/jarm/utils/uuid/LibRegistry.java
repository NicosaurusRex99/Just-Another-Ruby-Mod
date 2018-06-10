package naturix.jarm.utils.uuid;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.google.common.collect.Maps;

import net.minecraft.item.ItemStack;

/**
 * @author p455w0rd
 * Modded by NicosaurusRex99
 */
public class LibRegistry {
	
	public static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(0, 2, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());

	private static Map<UUID, String> NAME_REGISTRY = Maps.newHashMap();
	private static Map<String, UUID> UUID_REGISTRY = Maps.newHashMap();
	private static Map<String, ItemStack> SKULL_REGISTRY = Maps.newHashMap();

	public static Map<String, ItemStack> getSkullRegistry() {
		return SKULL_REGISTRY;
	}

	public static Map<UUID, String> getNameRegistry() {
		return NAME_REGISTRY;
	}

	public static Map<String, UUID> getUUIDRegistry() {
		return UUID_REGISTRY;
	}

	public static String getPlayerName(UUID uuid) {
		return NAME_REGISTRY.get(uuid);
	}

	public static boolean registerName(UUID uuid, String name) {
		boolean hasChanged = false;
		if (!NAME_REGISTRY.containsKey(uuid)) {
			NAME_REGISTRY.put(uuid, name);
			hasChanged = true;
		}
		if (!UUID_REGISTRY.containsKey(name)) {
			UUID_REGISTRY.put(name, uuid);
		}
		return hasChanged;
	}

	public static void registerUUID(String name, UUID uuid) {
		registerName(uuid, name);
	}

	public static void clearNameRegistry() {
		NAME_REGISTRY = new HashMap<UUID, String>();
		UUID_REGISTRY = new HashMap<String, UUID>();
	}
}