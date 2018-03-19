package naturix.jarm.items.tools.hammers;

import naturix.jarm.JARM;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HammerBase extends ItemHammerCore {
	public String name;
	    public HammerBase(ToolMaterial material, String name) {
	    	super(11, 4, material);
	        setRegistryName(name);
	        setUnlocalizedName(JARM.MODID + "." + name);
	        setCreativeTab(JARM.JARM);
	        setMaxStackSize(1);
	        setMaxDamage(8420);
	        setHarvestLevel(getUnlocalizedName(), 4);
	        getItemEnchantability();
	        this.name = name;
	    }
	    public void registerItemModel() {
			JARM.proxy.registerItemRenderer(this, 0, name);
		}
	}