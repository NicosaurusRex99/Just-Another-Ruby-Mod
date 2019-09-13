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
    Item.Properties properties;
    public int Level;
    private net.minecraftforge.common.ToolType Tool;

    public BlockBase(String name){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }
    public BlockBase(String name, ToolType tool){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        this.Tool = tool;
        ModItems.ITEMS.add(itemBlock);
    }
    public BlockBase(String name, int level, ToolType tool){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        this.Level = level;
        this.Tool = tool;
        ModItems.ITEMS.add(itemBlock);
    }
    @Override
    public int getHarvestLevel(BlockState state) {
        return Level; //TODO: RE-Evaluate
    }

    @Nullable
    @Override
    public net.minecraftforge.common.ToolType getHarvestTool(BlockState state) {
        return Tool;
    }
}