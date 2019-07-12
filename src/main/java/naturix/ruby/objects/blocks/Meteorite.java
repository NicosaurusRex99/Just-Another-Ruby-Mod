package naturix.ruby.objects.blocks;

import naturix.ruby.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class Meteorite extends FallingBlock {
    public Meteorite(String name) {
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5.0f, 8.0f)
                .harvestLevel(2));
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
