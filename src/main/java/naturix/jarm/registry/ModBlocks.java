package naturix.jarm.registry;

import naturix.jarm.Config;
import naturix.jarm.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre ore_ruby = new BlockOre(Material.ROCK, "ore_ruby");
	public static BeaconBase block_ruby = new BeaconBase("block_ruby");
	public static Amethyst block_amethyst = new Amethyst();
	public static BlockOre ore_braunite = new BlockOre(Material.ROCK, "ore_braunite");
	public static BeaconBase block_braunite = new BeaconBase("block_braunite");
	
	public static void register(IForgeRegistry<Block> registry) {
		if(Config.rubyModule == true) {
			registry.registerAll(
					ore_ruby,
					block_ruby
			);
		}
		if(Config.amethystModule == true) {
			registry.registerAll(
			block_amethyst
			);
		}
		if(Config.brauniteModule == true) {
			registry.registerAll(
					ore_braunite,
					block_braunite
			);
		}
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		if(Config.rubyModule == true) {
			registry.registerAll(
					ore_ruby.createItemBlock(),
					block_ruby.createItemBlock()
			);}
		if(Config.amethystModule == true) {
			registry.registerAll(
					block_amethyst.createItemBlock()
			);}
		if(Config.brauniteModule == true) {
			registry.registerAll(
					ore_braunite.createItemBlock(),
					block_braunite.createItemBlock()
			);}
	}
	
	public static void registerModels() {
		if(Config.rubyModule == true) {
			ore_ruby.registerItemModel(Item.getItemFromBlock(ore_ruby));
			block_ruby.registerItemModel(Item.getItemFromBlock(block_ruby));
		}
		if(Config.amethystModule == true) {
			block_amethyst.registerItemModel(Item.getItemFromBlock(block_amethyst));
			}
		if(Config.brauniteModule == true) {
			ore_braunite.registerItemModel(Item.getItemFromBlock(ore_braunite));
			block_braunite.registerItemModel(Item.getItemFromBlock(block_braunite));
			}
	
	}
}