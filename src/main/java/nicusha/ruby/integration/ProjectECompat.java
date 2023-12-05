package nicusha.ruby.integration;


import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import moze_intel.projecte.api.mapper.*;
import moze_intel.projecte.api.mapper.collector.IMappingCollector;
import moze_intel.projecte.api.nss.*;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.ReloadableServerResources;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemStack;
import nicusha.ruby.registry.*;

import javax.annotation.Nonnull;
import java.util.*;

@EMCMapper
public class ProjectECompat
        implements IEMCMapper<NormalizedSimpleStack, Long>
{

    private static final Map<NormalizedSimpleStack, Long> CUSTOM_EMC_VALUES = new HashMap<>();

    public static void init() {
        register(NSSItem.createItem(new ItemStack(ItemRegistry.OPAL_GEM.get(), 1)), 1024L);
        register(NSSItem.createItem(new ItemStack(BlockRegistry.AMETHYST.get(), 1)), 4096L);
        register(NSSItem.createItem(new ItemStack(BlockRegistry.METEORITE_ORE.get(), 1)), 4785L);
        register(NSSItem.createItem(new ItemStack(ItemRegistry.BRAUNITE_GEM.get(), 1)), 2468L);
        register(NSSItem.createItem(new ItemStack(ItemRegistry.RUBY_GEM.get(), 1)), 2048L);
    }
    public static void register(@Nonnull NormalizedSimpleStack stack, long emcValue) {
        CUSTOM_EMC_VALUES.put(stack, emcValue);
    }
    @Override
    public String getName() {
        return "RubyMapper";
    }

    @Override
    public String getDescription() {
        return "Adds EMC to Just another ruby mod!";
    }

    @Override
    public void addMappings(IMappingCollector<NormalizedSimpleStack, Long> iMappingCollector, CommentedFileConfig commentedFileConfig, ReloadableServerResources reloadableServerResources, RegistryAccess registryAccess, ResourceManager resourceManager) {
        for (Map.Entry<NormalizedSimpleStack, Long> entry : CUSTOM_EMC_VALUES.entrySet()) {
            NormalizedSimpleStack normStack = entry.getKey();
            long value = entry.getValue();
            iMappingCollector.setValueBefore(normStack, value);
        }
    }

}