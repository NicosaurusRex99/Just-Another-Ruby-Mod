package naturix.jarm.utils.uuid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.io.Resources;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author p455w0rd
 * Modded by NicosaurusRex99
 */
public class UUIDGrabber {

	public static Map<AbstractClientPlayer, ModelHat> REGISTRY = new LinkedHashMap<>();
	public static String getPlayerName(final UUID uuid) {
		String retVal = "";
		try {
			retVal = LibRegistry.THREAD_POOL.submit(() -> fetchPlayerName(uuid)).get();
		}
		catch (InterruptedException | ExecutionException e) {
		}
		return retVal;
	};

	public static UUID getPlayerUUID(final String name) {
		try {
			return LibRegistry.THREAD_POOL.submit(() -> fetchPlayerUUID(name)).get();
		}
		catch (InterruptedException | ExecutionException e) {
		}
		return null;
	};

	public static EntityPlayer getPlayerFromWorld(World world, UUID player) {
		if (player == null || world == null) {
			return null;
		}
		return world.getPlayerEntityByUUID(player);
	}

	private static String fetchPlayerName(final UUID uuid) throws IOException {
		if (LibRegistry.getNameRegistry().containsKey(uuid)) {
			return LibRegistry.getNameRegistry().get(uuid);
		}
		String USERNAME_API_URL = "https://api.mojang.com/user/profiles/%s/names";
		CharMatcher DASH_MATCHER = CharMatcher.is('-');
		String uuidString = DASH_MATCHER.removeFrom(uuid.toString());
		try (BufferedReader reader = Resources.asCharSource(new URL(String.format(USERNAME_API_URL, uuidString)), StandardCharsets.UTF_8).openBufferedStream()) {
			JsonReader json = new JsonReader(reader);
			json.beginArray();

			String name = null;
			long when = 0;

			while (json.hasNext()) {
				String nameObj = null;
				long timeObj = 0;
				json.beginObject();
				while (json.hasNext()) {
					String key = json.nextName();
					switch (key) {
					case "name":
						nameObj = json.nextString();
						break;
					case "changedToAt":
						timeObj = json.nextLong();
						break;
					default:
						json.skipValue();
						break;
					}
				}
				json.endObject();

				if (nameObj != null && timeObj >= when) {
					name = nameObj;
				}
			}

			json.endArray();
			json.close();
			name = name == null ? "" : name;
			LibRegistry.registerName(uuid, name);
			return name;
		}
	}

	private static UUID fetchPlayerUUID(final String name) {
		if (LibRegistry.getUUIDRegistry().containsKey(name)) {
			return LibRegistry.getUUIDRegistry().get(name);
		}
		if (!UUIDGrabber.isSMP()) {
			if (UUIDGrabber.isClientSide() && UUIDGrabber.getWorld() != null && UUIDGrabber.getPlayer() != null) {
				UUID uuid = UUIDGrabber.getPlayer().getGameProfile().getId();
				LibRegistry.registerUUID(name, uuid);
				return uuid;
			}
		}
		if (!Strings.isNullOrEmpty(name)) {
			try {
				URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setUseCaches(false);
				connection.setDoInput(true);
				connection.setDoOutput(true);
				JsonObject profile = (JsonObject) (new JsonParser()).parse(new InputStreamReader(connection.getInputStream()));
				UUID uuid = UUID.fromString(fullUUID(profile.get("id").toString()));
				LibRegistry.registerUUID(name, uuid);
				return uuid;
			}
			catch (Exception e) {
			}
		}
		return null;
	}

	private static String fullUUID(String uuid) {
		uuid = uuid.replaceAll("[^a-zA-Z0-9]", "");
		uuid = (uuid.substring(0, 8) + "-" + uuid.substring(8, 12) + "-" + uuid.substring(12, 16) + "-" + uuid.substring(16, 20) + "-" + uuid.substring(20, 32));
		return uuid;
	}

	
	public static boolean isSMP() {
		return FMLCommonHandler.instance().getMinecraftServerInstance() != null && FMLCommonHandler.instance().getMinecraftServerInstance().isDedicatedServer();
	}
	public static World getWorld() {
		return null;
	}

	public static EntityPlayer getPlayer() {
		return null;
	}

	public static EntityPlayer getPlayer(MessageContext context) {
		return null;
	}

	public static boolean isClientSide() {
		return FMLCommonHandler.instance().getSide() == Side.CLIENT;
	}

	public static Object getServer() {
		return FMLCommonHandler.instance().getMinecraftServerInstance();
	}
	public static void registerContributor(AbstractClientPlayer player, ModelHat type) {
		if (player != null && type != null) {
			if (!REGISTRY.containsKey(player)) {
				REGISTRY.put(player, type);
			}
		}
	}

	public static boolean isContributor(AbstractClientPlayer player) {
		return player != null && REGISTRY.containsKey(player);
	}
}
