package naturix.JARM;

import naturix.JARM.blocks.Amethyst;
import naturix.JARM.blocks.BrauniteBlock;
import naturix.JARM.blocks.BrauniteOre;
import naturix.JARM.blocks.RubyBlock;
import naturix.JARM.blocks.RubyOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{

	@GameRegistry.ObjectHolder("jarm:rubyblock")
    public static RubyBlock rubyblock;
	@GameRegistry.ObjectHolder("jarm:rubyore")
    public static RubyOre rubyore;
	@GameRegistry.ObjectHolder("jarm:amethystrock")
	public static Amethyst amethystrock = new Amethyst(null);
	@GameRegistry.ObjectHolder("jarm:brauniteblock")
    public static BrauniteBlock brauniteblock;
	@GameRegistry.ObjectHolder("jarm:brauniteore")
    public static BrauniteOre brauniteore;
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        rubyblock.initModel();
        rubyore.initModel();
        amethystrock.initModel();
        brauniteblock.initModel();
        brauniteore.initModel();
	}
	public static void registerBlocks() {
		rubyblock.registerBlocks();
	}
}
