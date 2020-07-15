package naturix.ruby.objects.blocks;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockBase extends Block {

    public BlockBase(String name, int lvl){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f)
                .func_235861_h_()
                .harvestLevel(lvl)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName(Ruby.MODID, name);
    }
}