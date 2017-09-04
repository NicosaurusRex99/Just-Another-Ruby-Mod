package naturix.JARM;

import naturix.JARM.blocks.RubyBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks 
{

	@GameRegistry.ObjectHolder("JARM:rubyblock")
    public static RubyBlock rubyblock;
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        rubyblock.initModel();
	}
}
