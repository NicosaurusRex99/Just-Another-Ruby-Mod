package naturix.jarm.registry;

import naturix.jarm.blocks.Amethyst;
import naturix.jarm.blocks.BeaconBase;
import naturix.jarm.blocks.BlockFalling;
import naturix.jarm.blocks.BlockOre;
import naturix.jarm.blocks.LeavesBase;
import naturix.jarm.blocks.LogBase;
import naturix.jarm.blocks.PlanksBase;
import naturix.jarm.blocks.SaplingBase;
import naturix.jarm.utils.config.ConfigMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre ore_ruby = new BlockOre(Material.ROCK, "ore_ruby", 3);
	public static BeaconBase block_ruby = new BeaconBase("block_ruby");
	public static Amethyst block_amethyst = new Amethyst("block_amethyst", 4f, 5f);
	public static BlockOre ore_braunite = new BlockOre(Material.ROCK, "ore_braunite", 3);
	public static BeaconBase block_braunite = new BeaconBase("block_braunite");
	public static BlockOre ore_amber = new BlockOre(Material.ROCK, "ore_amber", 2);
	public static BlockOre ore_cinnibar = new BlockOre(Material.ROCK, "ore_cinnibar", 2);
	public static BlockOre ore_cobalt = new BlockOre(Material.ROCK, "ore_cobalt", 3);
	public static BlockOre ore_copper = new BlockOre(Material.ROCK, "ore_copper", 1);
	public static BlockOre ore_fossil = new BlockOre(Material.ROCK, "ore_fossil", 3);
	public static BlockOre ore_jade = new BlockOre(Material.ROCK, "ore_jade", 3);
	public static BlockOre ore_lead = new BlockOre(Material.ROCK, "ore_lead", 2);
	public static BlockOre ore_luminite = new BlockOre(Material.ROCK, "ore_luminite", 4, 3);
	public static BlockOre ore_mythrill = new BlockOre(Material.ROCK, "ore_mythrill", 3);
	public static BlockOre ore_nickel = new BlockOre(Material.ROCK, "ore_nickel", 2);
	public static BlockOre ore_opal = new BlockOre(Material.ROCK, "ore_opal", 1);
	public static BlockOre ore_osmium = new BlockOre(Material.ROCK, "ore_osmium", 2);
	public static BlockOre ore_platinum = new BlockOre(Material.ROCK, "ore_platinum", 3);
	public static BlockOre ore_saphire = new BlockOre(Material.ROCK, "ore_saphire", 2);
	public static BlockOre ore_silver = new BlockOre(Material.ROCK, "ore_silver", 2);
	public static BlockOre ore_tin = new BlockOre(Material.ROCK, "ore_tin", 1);
	public static BlockOre ore_titanium = new BlockOre(Material.ROCK, "ore_titanium", 3);
	public static BlockOre ore_tungsten = new BlockOre(Material.ROCK, "ore_tungsten", 3);
	public static BlockOre ore_uranium = new BlockOre(Material.ROCK, "ore_uranium", 3);
	public static BlockFalling ore_meteorite = new BlockFalling("ore_meteorite");
	public static BeaconBase block_amber = new BeaconBase(Material.IRON, "block_amber");
	public static BeaconBase block_cinnibar = new BeaconBase(Material.IRON, "block_cinnibar");
	public static BeaconBase block_cobalt = new BeaconBase(Material.IRON, "block_cobalt");
	public static BeaconBase block_copper = new BeaconBase(Material.IRON, "block_copper");
	public static BeaconBase block_fossil = new BeaconBase(Material.IRON, "block_fossil");
	public static BeaconBase block_jade = new BeaconBase(Material.IRON, "block_jade");
	public static BeaconBase block_lead = new BeaconBase(Material.IRON, "block_lead");
	public static BeaconBase block_luminite = new BeaconBase(Material.IRON, "block_luminite", 4);
	public static BeaconBase block_mythrill = new BeaconBase(Material.IRON, "block_mythrill");
	public static BeaconBase block_nickel = new BeaconBase(Material.IRON, "block_nickel");
	public static BeaconBase block_opal = new BeaconBase(Material.IRON, "block_opal");
	public static BeaconBase block_osmium = new BeaconBase(Material.IRON, "block_osmium");
	public static BeaconBase block_platinum = new BeaconBase(Material.IRON, "block_platinum");
	public static BeaconBase block_saphire = new BeaconBase(Material.IRON, "block_saphire");
	public static BeaconBase block_silver = new BeaconBase(Material.IRON, "block_silver");
	public static BeaconBase block_tin = new BeaconBase(Material.IRON, "block_tin");
	public static BeaconBase block_titanium = new BeaconBase(Material.IRON, "block_titanium");
	public static BeaconBase block_tungsten = new BeaconBase(Material.IRON, "block_tungsten");
	public static BeaconBase block_uranium = new BeaconBase(Material.IRON, "block_uranium");
	public static BeaconBase block_steel = new BeaconBase(Material.IRON, "block_steel");
	public static LogBase log_dwarf = new LogBase("log_dwarf_apple");
	public static LeavesBase leaves_dwarf = new LeavesBase("leaves_dwarf_apple");
	public static SaplingBase sapling_dwarf = new SaplingBase();
	public static PlanksBase planks_dwarf = new PlanksBase("planks_dwarf");
	
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
			ore_amber,
			block_amber
	);
		}
	if(ConfigMain.cinnibarModule == true) {
		registry.registerAll(
			ore_cinnibar,
			block_cinnibar
	);
		}
	if(ConfigMain.cobaltModule == true) {
		registry.registerAll(
				ore_cobalt,
				block_cobalt
	);
		}
	if(ConfigMain.copperModule == true) {
		registry.registerAll(
				ore_copper,
				block_copper
	);
		}
	if(ConfigMain.fossilModule == true) {
		registry.registerAll(
				ore_fossil,
				block_fossil
	);
		}
	if(ConfigMain.jadeModule == true) {
		registry.registerAll(
				ore_jade,
				block_jade
	);
		}
	if(ConfigMain.leadModule == true) {
		registry.registerAll(
				ore_lead,
				block_lead
	);
		}
	if(ConfigMain.luminiteModule == true) {
		registry.registerAll(
				ore_luminite,
				block_luminite
	);
		}
	if(ConfigMain.mythrillModule == true) {
		registry.registerAll(
				ore_mythrill,
				block_mythrill
	);
		}
	if(ConfigMain.nickelModule == true) {
		registry.registerAll(
				ore_nickel,
				block_nickel
	);
		}
	if(ConfigMain.opalModule == true) {
		registry.registerAll(
				ore_opal,
				block_opal
	);
		}
	if(ConfigMain.osmiumModule == true) {
		registry.registerAll(
				ore_osmium,
				block_osmium
	);
		}
	if(ConfigMain.platinumModule == true) {
		registry.registerAll(
				ore_platinum,
				block_platinum
	);
		}
	if(ConfigMain.saphireModule == true) {
		registry.registerAll(
				ore_saphire,
				block_saphire
	);
		}
	if(ConfigMain.silverModule == true) {
		registry.registerAll(
				ore_silver,
				block_silver
	);
		}
	if(ConfigMain.tinModule == true) {
		registry.registerAll(
				ore_tin,
				block_tin
	);
		}
	if(ConfigMain.titaniumModule == true) {
		registry.registerAll(
				ore_titanium,
				block_titanium
	);
		}
	if(ConfigMain.tungstenModule == true) {
		registry.registerAll(
				ore_tungsten,
				block_tungsten
	);
		}
	if(ConfigMain.uraniumModule == true) {
		registry.registerAll(
			ore_uranium,
			block_uranium
	);
		}
	if(ConfigMain.meteoriteModule == true) {
		registry.registerAll(
					ore_meteorite
	);
		}
	if(ConfigMain.steelModule == true) {
		registry.registerAll(
				block_steel
				);
	}
	if(ConfigMain.woodModule == true) {
		registry.registerAll(
				log_dwarf,
				leaves_dwarf,
				sapling_dwarf,
				planks_dwarf
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
			if(ConfigMain.amberModule == true) {
				registry.registerAll(
		ore_amber.createItemBlock(),
		block_amber.createItemBlock()
		);
			}
		if(ConfigMain.cinnibarModule == true) {
				registry.registerAll(
		ore_cinnibar.createItemBlock(),
		block_cinnibar.createItemBlock()
		);
			}
		if(ConfigMain.cobaltModule == true) {
				registry.registerAll(
		ore_cobalt.createItemBlock(),
		block_cobalt.createItemBlock()
		);
			}
		if(ConfigMain.copperModule == true) {
				registry.registerAll(
		ore_copper.createItemBlock(),
		block_copper.createItemBlock()
		);
			}
		if(ConfigMain.fossilModule == true) {
				registry.registerAll(
		ore_fossil.createItemBlock(),
		block_fossil.createItemBlock()
		);
			}
		if(ConfigMain.jadeModule == true) {
				registry.registerAll(
		ore_jade.createItemBlock(),
		block_jade.createItemBlock()
		);
			}
		if(ConfigMain.leadModule == true) {
				registry.registerAll(
		ore_lead.createItemBlock(),
		block_lead.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_luminite.createItemBlock(),
		block_luminite.createItemBlock()
		);
			}
		if(ConfigMain.mythrillModule == true) {
				registry.registerAll(
		ore_mythrill.createItemBlock(),
		block_mythrill.createItemBlock()
		);
			}
		if(ConfigMain.nickelModule == true) {
				registry.registerAll(
		ore_nickel.createItemBlock(),
		block_nickel.createItemBlock()
		);
			}
		if(ConfigMain.opalModule == true) {
				registry.registerAll(
		ore_opal.createItemBlock(),
		block_opal.createItemBlock()
		);
			}
		if(ConfigMain.osmiumModule == true) {
				registry.registerAll(
		ore_osmium.createItemBlock(),
		block_osmium.createItemBlock()
		);
			}
		if(ConfigMain.platinumModule == true) {
				registry.registerAll(
		ore_platinum.createItemBlock(),
		block_platinum.createItemBlock()
		);
			}
		if(ConfigMain.saphireModule == true) {
				registry.registerAll(
		ore_saphire.createItemBlock(),
		block_saphire.createItemBlock()
		);
			}
		if(ConfigMain.silverModule == true) {
				registry.registerAll(
		ore_silver.createItemBlock(),
		block_silver.createItemBlock()
		);
			}
		if(ConfigMain.tinModule == true) {
				registry.registerAll(
		ore_tin.createItemBlock(),
		block_tin.createItemBlock()
		);
			}
		if(ConfigMain.titaniumModule == true) {
				registry.registerAll(
		ore_titanium.createItemBlock(),
		block_titanium.createItemBlock()
		);
			}
		if(ConfigMain.tungstenModule == true) {
				registry.registerAll(
		ore_tungsten.createItemBlock(),
		block_tungsten.createItemBlock()
		);
			}
		if(ConfigMain.uraniumModule == true) {
				registry.registerAll(
		ore_uranium.createItemBlock(),
		block_uranium.createItemBlock()
		);
			}
		if(ConfigMain.rubyModule == true) {
				registry.registerAll(
		ore_meteorite.createItemBlock()
		);
		}
		if(ConfigMain.steelModule == true) {
			registry.registerAll(
					block_steel.createItemBlock()
					);
		}
		if(ConfigMain.woodModule == true) {
			registry.registerAll(
		log_dwarf.createItemBlock(),
		leaves_dwarf.createItemBlock(),
		sapling_dwarf.createItemBlock(),
		planks_dwarf.createItemBlock()
		);}
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
			block_amber.registerItemModel(Item.getItemFromBlock(block_amber));
				}
			if(ConfigMain.cinnibarModule == true) {
			ore_cinnibar.registerItemModel(Item.getItemFromBlock(ore_cinnibar));
			block_cinnibar.registerItemModel(Item.getItemFromBlock(block_cinnibar));
				}
			if(ConfigMain.cobaltModule == true) {
			ore_cobalt.registerItemModel(Item.getItemFromBlock(ore_cobalt));
			block_cobalt.registerItemModel(Item.getItemFromBlock(block_cobalt));
				}
			if(ConfigMain.copperModule == true) {
			ore_copper.registerItemModel(Item.getItemFromBlock(ore_copper));
			block_copper.registerItemModel(Item.getItemFromBlock(block_copper));
				}
			if(ConfigMain.fossilModule == true) {
			ore_fossil.registerItemModel(Item.getItemFromBlock(ore_fossil));
			block_fossil.registerItemModel(Item.getItemFromBlock(block_fossil));
				}
			if(ConfigMain.jadeModule == true) {
			ore_jade.registerItemModel(Item.getItemFromBlock(ore_jade));
			block_jade.registerItemModel(Item.getItemFromBlock(block_jade));
				}
			if(ConfigMain.leadModule == true) {
			ore_lead.registerItemModel(Item.getItemFromBlock(ore_lead));
			block_lead.registerItemModel(Item.getItemFromBlock(block_lead));
				}
			if(ConfigMain.luminiteModule == true) {
			ore_luminite.registerItemModel(Item.getItemFromBlock(ore_luminite));
			block_luminite.registerItemModel(Item.getItemFromBlock(block_luminite));
				}
			if(ConfigMain.mythrillModule == true) {
			ore_mythrill.registerItemModel(Item.getItemFromBlock(ore_mythrill));
			block_mythrill.registerItemModel(Item.getItemFromBlock(block_mythrill));
				}
			if(ConfigMain.nickelModule == true) {
			ore_nickel.registerItemModel(Item.getItemFromBlock(ore_nickel));
			block_nickel.registerItemModel(Item.getItemFromBlock(block_nickel));
				}
			if(ConfigMain.opalModule == true) {
			ore_opal.registerItemModel(Item.getItemFromBlock(ore_opal));
			block_opal.registerItemModel(Item.getItemFromBlock(block_opal));
				}
			if(ConfigMain.osmiumModule == true) {
			ore_osmium.registerItemModel(Item.getItemFromBlock(ore_osmium));
			block_osmium.registerItemModel(Item.getItemFromBlock(block_osmium));
				}
			if(ConfigMain.platinumModule == true) {
			ore_platinum.registerItemModel(Item.getItemFromBlock(ore_platinum));
			block_platinum.registerItemModel(Item.getItemFromBlock(block_platinum));
				}
			if(ConfigMain.saphireModule == true) {
			ore_saphire.registerItemModel(Item.getItemFromBlock(ore_saphire));
			block_saphire.registerItemModel(Item.getItemFromBlock(block_saphire));
				}
			if(ConfigMain.silverModule == true) {
			ore_silver.registerItemModel(Item.getItemFromBlock(ore_silver));
			block_silver.registerItemModel(Item.getItemFromBlock(block_silver));
				}
			if(ConfigMain.tinModule == true) {
			ore_tin.registerItemModel(Item.getItemFromBlock(ore_tin));
			block_tin.registerItemModel(Item.getItemFromBlock(block_tin));
				}
			if(ConfigMain.titaniumModule == true) {
			ore_titanium.registerItemModel(Item.getItemFromBlock(ore_titanium));
			block_titanium.registerItemModel(Item.getItemFromBlock(block_titanium));
				}
			if(ConfigMain.tungstenModule == true) {
			ore_tungsten.registerItemModel(Item.getItemFromBlock(ore_tungsten));
			block_tungsten.registerItemModel(Item.getItemFromBlock(block_tungsten));
				}
			if(ConfigMain.uraniumModule == true) {
			ore_uranium.registerItemModel(Item.getItemFromBlock(ore_uranium));
			block_uranium.registerItemModel(Item.getItemFromBlock(block_uranium));
				}
			if(ConfigMain.meteoriteModule == true) {
			ore_meteorite.registerItemModel(Item.getItemFromBlock(ore_meteorite));
				}
			if(ConfigMain.steelModule == true) {
				block_steel.registerItemModel(Item.getItemFromBlock(block_steel));
			}
			if(ConfigMain.woodModule == true) {
				log_dwarf.registerItemModel(Item.getItemFromBlock(log_dwarf));
				leaves_dwarf.registerItemModel(Item.getItemFromBlock(leaves_dwarf));
				sapling_dwarf.registerItemModel(Item.getItemFromBlock(sapling_dwarf));
				planks_dwarf.registerItemModel(Item.getItemFromBlock(planks_dwarf));
			}
	}
}