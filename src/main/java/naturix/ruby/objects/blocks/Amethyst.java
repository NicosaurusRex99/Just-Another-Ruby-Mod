package naturix.ruby.objects.blocks;

import net.minecraft.util.BlockRenderLayer;

public class Amethyst extends BlockBase {
    public Amethyst(String name, int lvl){
        super(name, lvl);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
