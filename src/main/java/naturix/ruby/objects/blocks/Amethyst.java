package naturix.ruby.objects.blocks;

import net.minecraft.util.BlockRenderLayer;

public class Amethyst extends BlockBase {
    public Amethyst(String name){
        super(name);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
