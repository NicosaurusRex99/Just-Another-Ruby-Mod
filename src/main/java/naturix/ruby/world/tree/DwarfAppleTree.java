package naturix.ruby.world.tree;

import naturix.ruby.world.ModOreFeature;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class DwarfAppleTree extends Tree
{
    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random)
    {
        return ModOreFeature.TREE;
    }
}