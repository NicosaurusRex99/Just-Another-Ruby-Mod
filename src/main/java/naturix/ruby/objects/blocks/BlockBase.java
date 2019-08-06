package naturix.ruby.objects.blocks;

import naturix.ruby.Ruby;
import naturix.ruby.registry.ModBlocks;
import naturix.ruby.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class BlockBase extends Block {
    Item.Properties properties;

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
    public BlockBase(String name, int level, ToolType tool){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(level)
                .harvestTool(tool));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }
    public BlockBase(String name, ToolType tool){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestTool(tool)
                .sound(SoundType.WOOD));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(Ruby.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }

}