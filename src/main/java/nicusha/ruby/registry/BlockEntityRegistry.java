package nicusha.ruby.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.*;
import net.minecraftforge.registries.*;
import nicusha.ruby.Ruby;
import nicusha.ruby.blocks.block_entity.AmethystBlockEntity;

import java.util.function.Supplier;

import static nicusha.ruby.Ruby.MODID;

public class BlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);


    public static final RegistryObject<BlockEntityType<AmethystBlockEntity>> AMETHYST = register("amethyst",
            () -> BlockEntityType.Builder.of(AmethystBlockEntity::new, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(Ruby.MODID, "amethyst"))).build(null));

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryName, Supplier<BlockEntityType<T>> blockEntity) {
        return BLOCK_ENTITY.register(registryName, blockEntity);
    }
}
