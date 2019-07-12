package naturix.ruby.registry;

import naturix.ruby.objects.blocks.Amethyst;
import naturix.ruby.objects.blocks.BlockBase;
import naturix.ruby.objects.blocks.Meteorite;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase ruby_ore = new BlockBase("ruby_ore", 3);
    public static BlockBase braunite_ore = new BlockBase("braunite_ore", 3);
    public static BlockBase opal_ore = new BlockBase("opal_ore", 1);
    public static Amethyst amethyst = new Amethyst("amethyst", 4);
    public static Meteorite meteorite_ore = new Meteorite("meteorite_ore");

}
