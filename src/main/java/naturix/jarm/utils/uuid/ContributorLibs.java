package naturix.jarm.utils.uuid;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author p455w0rd
 *
 */
@SideOnly(Side.CLIENT)
public class ContributorLibs {
	private static List<String> PATRON_LIST = new ArrayList<String>();

	public static Map<AbstractClientPlayer, ModelHat> REGISTRY = new LinkedHashMap<>();
	public static void queuePlayerCosmetics(AbstractClientPlayer player) {
		LibRegistry.THREAD_POOL.submit(() -> {
			try {
				PATRON_LIST = ContributorLibs.getPatronList();
				if (PATRON_LIST.size() <= 0) {
					return;
				}
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				return;
			}
			Minecraft.getMinecraft().addScheduledTask(() -> {
				ContributorLibs.addCosmetic(player);
			});
		});
	}

	private static void addCosmetic(AbstractClientPlayer player) {
		
	}
	public static ModelHat hat;
	public static void registerContributor(AbstractClientPlayer player) {
		if (player != null) {
			if (!REGISTRY.containsKey(player)) {
				REGISTRY.put(player, hat);
			}
		}
	}

	public static boolean isContributor(AbstractClientPlayer player) {
		return player != null && REGISTRY.containsKey(player);
	}

	static List<String> getPatronList() {
		try {
			List<String> entries = new ArrayList<String>();
			HttpURLConnection con;
			con = (HttpURLConnection) new URL("https://raw.githubusercontent.com/NicosaurusRex99/JARMGit/1.12.2/secrets.txt").openConnection();
			con.setConnectTimeout(1000);
			InputStream in2 = con.getInputStream();
			entries = IOUtils.readLines(in2);
			if (!entries.isEmpty()) {
				con.disconnect();
				return entries;
			}
		}
		catch (IOException e) {
		}
		return null;
	}

	/*
		public static boolean doesPlayerHaveCape(AbstractClientPlayer player) {
			for (int i = 0; i < PATRON_LIST.size(); ++i) {
				String uuid = player.getUniqueID().toString();
				if (!uuid.equals(PATRON_LIST.get(i))) {
					continue;
				}
				return true;
			}
			return false;
		}
		public static boolean doesPlayerHaveMMDCape(AbstractClientPlayer player) {
			for (int i = 0; i < PATRON_LIST.size(); ++i) {
				String uuid = player.getUniqueID().toString() + "_MMD";
				if (!uuid.equals(PATRON_LIST.get(i))) {
					continue;
				}
				return true;
			}
			return false;
		}
	*/
	public static boolean doesPlayerHaveEmeraldWings(AbstractClientPlayer player) {
		for (int i = 0; i < PATRON_LIST.size(); ++i) {
			String uuid = player.getUniqueID().toString() + "_EWINGS";
			if (!uuid.equals(PATRON_LIST.get(i))) {
				continue;
			}
			return true;
		}
		return false;
	}

	public static boolean doesPlayerHaveBloodWings(AbstractClientPlayer player) {
		for (int i = 0; i < PATRON_LIST.size(); ++i) {
			String uuid = player.getUniqueID().toString() + "_RWINGS";
			if (!uuid.equals(PATRON_LIST.get(i))) {
				continue;
			}
			return true;
		}
		return false;
	}

	public static boolean doesPlayerHaveBlueWings(AbstractClientPlayer player) {
		for (int i = 0; i < PATRON_LIST.size(); ++i) {
			String uuid = player.getUniqueID().toString() + "_BWINGS";
			if (!uuid.equals(PATRON_LIST.get(i))) {
				continue;
			}
			return true;
		}
		return false;
	}
}