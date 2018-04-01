package naturix.jarm.registry;

import naturix.jarm.blocks.*;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre ore_ruby = new BlockOre(Material.ROCK, "ore_ruby");
	public static BeaconBase block_ruby = new BeaconBase("block_ruby");
	public static CustomModel block_amethyst = new CustomModel("block_amethyst", 4f, 5f);
	public static BlockOre ore_braunite = new BlockOre(Material.ROCK, "ore_braunite");
	public static BeaconBase block_braunite = new BeaconBase("block_braunite");
	public static BlockOre ore_amber = new BlockOre(Material.ROCK, "ore_amber");
	public static BlockOre ore_cinnibar = new BlockOre(Material.ROCK, "ore_cinnibar");
	public static BlockOre ore_cobalt = new BlockOre(Material.ROCK, "ore_cobalt");
	public static BlockOre ore_copper = new BlockOre(Material.ROCK, "ore_copper");
	public static BlockOre ore_fossil = new BlockOre(Material.ROCK, "ore_fossil");
	public static BlockOre ore_jade = new BlockOre(Material.ROCK, "ore_jade");
	public static BlockOre ore_lead = new BlockOre(Material.ROCK, "ore_lead");
	public static BlockOre ore_luminite = new BlockOre(Material.ROCK, "ore_luminite");
	public static BlockOre ore_mythrill = new BlockOre(Material.ROCK, "ore_mythrill");
	public static BlockOre ore_nickel = new BlockOre(Material.ROCK, "ore_nickel");
	public static BlockOre ore_opal = new BlockOre(Material.ROCK, "ore_opal");
	public static BlockOre ore_osmium = new BlockOre(Material.ROCK, "ore_osmium");
	public static BlockOre ore_platinum = new BlockOre(Material.ROCK, "ore_platinum");
	public static BlockOre ore_saphire = new BlockOre(Material.ROCK, "ore_saphire");
	public static BlockOre ore_silver = new BlockOre(Material.ROCK, "ore_silver");
	public static BlockOre ore_tin = new BlockOre(Material.ROCK, "ore_tin");
	public static BlockOre ore_titanium = new BlockOre(Material.ROCK, "ore_titanium");
	public static BlockOre ore_tungsten = new BlockOre(Material.ROCK, "ore_tungsten");
	public static BlockOre ore_uranium = new BlockOre(Material.ROCK, "ore_uranium");
	public static CustomModel ore_meteorite = new CustomModel("ore_meteorite", 6f, 7f);
	
	public static void register(IForgeRegistry<Block> registry) {
		if(ConfigMain.rubyModule == true) {
			registry.registerAll(
					ore_ruby,
					block_ruby
			);
		}
		if(ConfigMain.amethystModule == true) {
			registry.registerAll(
			block_amethyst
			);
		}
		if(ConfigMain.brauniteModule == true) {
			registry.registerAll(
					ore_braunite,
					block_braunite
			);
		}
		if(ConfigMain.amberModule == true) {
			registry.registerAll(
	ore_amber
	);
		}
	if(ConfigMain.cinnibarModule == true) {
			registry.registerAll(
	ore_cinnibar
	);
		}
	if(ConfigMain.cobaltModule == true) {
			registry.registerAll(
	ore_cobalt
	);
		}
	if(ConfigMain.copperModule == true) {
			registry.registerAll(
	ore_copper
	);
		}
	if(ConfigMain.fossilModule == true) {
			registry.registerAll(
	ore_fossil
	);
		}
	if(ConfigMain.jadeModule == true) {
			registry.registerAll(
	ore_jade
	);
		}
	if(ConfigMain.leadModule == true) {
			registry.registerAll(
	ore_lead
	);
		}
	if(ConfigMain.luminiteModule == true) {
			registry.registerAll(
	ore_luminite
	);
		}
	if(ConfigMain.mythrillModule == true) {
			registry.registerAll(
	ore_mythrill
	);
		}
	if(ConfigMain.nickelModule == true) {
			registry.registerAll(
	ore_nickel
	);
		}
	if(ConfigMain.opalModule == true) {
			registry.registerAll(
	ore_opal
	);
		}
	if(ConfigMain.osmiumModule == true) {
			registry.registerAll(
	ore_osmium
	);
		}
	if(ConfigMain.platinumModule == true) {
			registry.registerAll(
	ore_platinum
	);
		}
	if(ConfigMain.saphireModule == true) {
			registry.registerAll(
	ore_saphire
	);
		}
	if(ConfigMain.silverModule == true) {
			registry.registerAll(
	ore_silver
	);
		}
	if(ConfigMain.tinModule == true) {
			registry.registerAll(
	ore_tin
	);
		}
	if(ConfigMain.titaniumModule == true) {
			registry.registerAll(
	ore_titanium
	);
		}
	if(ConfigMain.tungstenModule == true) {
			registry.registerAll(
	ore_tungsten
	);
		}
	if(ConfigMain.uraniumModule == true) {
			registry.registerAll(
	ore_uranium
	);
		}
	if(ConfigMain.meteoriteModule == true) {
			registry.registerAll(
	ore_meteorite
	);
		}
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		if(ConfigMain.rubyModule == true) {
			registry.registerAll(
					ore_ruby.createItemBlock(),
					block_ruby.createItemBlock()
			);}
		if(ConfigMain.amethystModule == true) {
			registry.registerAll(
					block_amethyst.createItemBlock()
			);}
		if(ConfigMain.brauniteModule == true) {
			registry.registerAll(
					ore_braunite.createItemBlock(),
					block_braunite.createItemBlock()
			);
			if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_amber.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_cinnibar.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_cobalt.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_copper.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_fossil.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_jade.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_lead.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_luminite.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_mythrill.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_nickel.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_opal.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_osmium.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_platinum.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_saphire.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_silver.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_tin.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_titanium.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_tungsten.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_uranium.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_meteorite.createItemBlock()
		);
		}
		}
	}
	
	public static void registerModels() {
		if(ConfigMain.rubyModule == true) {
			ore_ruby.registerItemModel(Item.getItemFromBlock(ore_ruby));
			block_ruby.registerItemModel(Item.getItemFromBlock(block_ruby));
		}
		if(ConfigMain.amethystModule == true) {
			block_amethyst.registerItemModel(Item.getItemFromBlock(block_amethyst));
			}
		if(ConfigMain.brauniteModule == true) {
			ore_braunite.registerItemModel(Item.getItemFromBlock(ore_braunite));
			block_braunite.registerItemModel(Item.getItemFromBlock(block_braunite));
			}
		if(ConfigMain.amberModule == true) {
			ore_amber.registerItemModel(Item.getItemFromBlock(ore_amber));
				}
			if(ConfigMain.cinnibarModule == true) {
			ore_cinnibar.registerItemModel(Item.getItemFromBlock(ore_cinnibar));
				}
			if(ConfigMain.cobaltModule == true) {
			ore_cobalt.registerItemModel(Item.getItemFromBlock(ore_cobalt));
				}
			if(ConfigMain.copperModule == true) {
			ore_copper.registerItemModel(Item.getItemFromBlock(ore_copper));
				}
			if(ConfigMain.fossilModule == true) {
			ore_fossil.registerItemModel(Item.getItemFromBlock(ore_fossil));
				}
			if(ConfigMain.jadeModule == true) {
			ore_jade.registerItemModel(Item.getItemFromBlock(ore_jade));
				}
			if(ConfigMain.leadModule == true) {
			ore_lead.registerItemModel(Item.getItemFromBlock(ore_lead));
				}
			if(ConfigMain.luminiteModule == true) {
			ore_luminite.registerItemModel(Item.getItemFromBlock(ore_luminite));
				}
			if(ConfigMain.mythrillModule == true) {
			ore_mythrill.registerItemModel(Item.getItemFromBlock(ore_mythrill));
				}
			if(ConfigMain.nickelModule == true) {
			ore_nickel.registerItemModel(Item.getItemFromBlock(ore_nickel));
				}
			if(ConfigMain.opalModule == true) {
			ore_opal.registerItemModel(Item.getItemFromBlock(ore_opal));
				}
			if(ConfigMain.osmiumModule == true) {
			ore_osmium.registerItemModel(Item.getItemFromBlock(ore_osmium));
				}
			if(ConfigMain.platinumModule == true) {
			ore_platinum.registerItemModel(Item.getItemFromBlock(ore_platinum));
				}
			if(ConfigMain.saphireModule == true) {
			ore_saphire.registerItemModel(Item.getItemFromBlock(ore_saphire));
				}
			if(ConfigMain.silverModule == true) {
			ore_silver.registerItemModel(Item.getItemFromBlock(ore_silver));
				}
			if(ConfigMain.tinModule == true) {
			ore_tin.registerItemModel(Item.getItemFromBlock(ore_tin));
				}
			if(ConfigMain.titaniumModule == true) {
			ore_titanium.registerItemModel(Item.getItemFromBlock(ore_titanium));
				}
			if(ConfigMain.tungstenModule == true) {
			ore_tungsten.registerItemModel(Item.getItemFromBlock(ore_tungsten));
				}
			if(ConfigMain.uraniumModule == true) {
			ore_uranium.registerItemModel(Item.getItemFromBlock(ore_uranium));
				}
			if(ConfigMain.meteoriteModule == true) {
			ore_meteorite.registerItemModel(Item.getItemFromBlock(ore_meteorite));
				}
	}
}