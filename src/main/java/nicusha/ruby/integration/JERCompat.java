package nicusha.ruby.integration;

import jeresources.api.*;
import jeresources.api.distributions.DistributionSquare;
import jeresources.compatibility.api.JERAPI;
import net.minecraft.world.item.ItemStack;
import nicusha.ruby.registry.BlockRegistry;

public class JERCompat {

    public static void init() {
        IJERAPI jerApi = JERAPI.getInstance();

        IWorldGenRegistry worldGenRegistry = jerApi.getWorldGenRegistry();
        if (worldGenRegistry != null) {
            worldGenRegistry.register(new ItemStack(BlockRegistry.AMETHYST.get()), new DistributionSquare(2, 5, -64, 48));
            worldGenRegistry.register(new ItemStack(BlockRegistry.BRAUNITE_ORE.get()), new DistributionSquare(3, 8, -64, -10));
            worldGenRegistry.register(new ItemStack(BlockRegistry.METEORITE_ORE.get()), new DistributionSquare(3, 8, 80, 256));
            worldGenRegistry.register(new ItemStack(BlockRegistry.OPAL_ORE.get()), new DistributionSquare(3, 8, 16, 64));
            worldGenRegistry.register(new ItemStack(BlockRegistry.RUBY_ORE.get()), new DistributionSquare(2, 6, 4, 48));
        }
    }
}
