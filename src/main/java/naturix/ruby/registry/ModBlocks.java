package naturix.ruby.registry;

import naturix.ruby.Ruby;
import naturix.ruby.objects.blocks.*;
import naturix.ruby.world.tree.DwarfAppleTree;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase ruby_ore = new BlockBase("ruby_ore", 3, ToolType.PICKAXE);
    public static BlockBase braunite_ore = new BlockBase("braunite_ore", 3, ToolType.PICKAXE);
    public static BlockBase opal_ore = new BlockBase("opal_ore", 1, ToolType.PICKAXE);
    public static Meteorite amethyst = new Meteorite("amethyst");
    public static Meteorite meteorite_ore = new Meteorite("meteorite_ore");

    public static BlockBase braunite_block = new BlockBase("braunite_block", 2, ToolType.PICKAXE);
    public static BlockBase opal_block = new BlockBase("opal_block", 1, ToolType.PICKAXE);
    public static BlockBase ruby_block = new BlockBase("ruby_block", 2, ToolType.PICKAXE);

    public static Block bomb = new Bomb("bomb");
    public static Block leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.EMERALD).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "dwarf_apple_leaves");
    public static Block log = registerBlock(new LogBlock(MaterialColor.EMERALD, Block.Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "dwarf_apple_log");
    public static SaplingBase sapling = new SaplingBase("dwarf_apple_sapling", new DwarfAppleTree());
    public static BlockBase planks = new BlockBase("dwarf_apple_planks", ToolType.AXE);



    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(Ruby.setup.itemGroup));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}
