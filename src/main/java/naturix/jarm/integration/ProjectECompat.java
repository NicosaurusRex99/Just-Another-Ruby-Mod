package naturix.jarm.integration;

import moze_intel.projecte.api.ProjectEAPI;
import naturix.jarm.registry.ModBlocks;
import naturix.jarm.registry.ModItems;
import net.minecraft.item.ItemStack;

public class ProjectECompat {
	public static void init() {
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemCinnibar, 1, 0), (int) 128);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemJade, 1, 0), (int) 256);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemOpal, 1, 0), (int) 1024);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemCinnibar, 1, 0), (int) 256);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.ingot_tungsten, 1, 0), (int) 512);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.ingot_mythrill, 1, 0), (int) 1024);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.ingot_titanium, 1, 0), (int) 248);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.block_amethyst, 1, 0), (int) 5120);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.ore_meteorite, 1, 0), (int) 4785);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.dwarfApple, 1, 0), (int) 16);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemBraunite, 1, 0), (int) 2468);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemAmber, 1, 0), (int) 128);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.gemSaphire, 1, 0), (int) 128);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.log_dwarf, 1, 0), (int) 32);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.ingot_aluminium, 1, 0), (int) 128);
		} 
}
