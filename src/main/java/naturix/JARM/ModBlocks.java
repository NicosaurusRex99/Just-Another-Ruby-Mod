package naturix.JARM;

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
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        rubyblock.initModel();
        rubyore.initModel();
	}
}
