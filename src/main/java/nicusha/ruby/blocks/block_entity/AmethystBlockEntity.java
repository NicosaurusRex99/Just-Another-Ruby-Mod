package nicusha.ruby.blocks.block_entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.*;
import nicusha.ruby.registry.BlockEntityRegistry;

import javax.annotation.Nullable;
import java.util.*;

public class AmethystBlockEntity extends BlockEntity {

    public AmethystBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.AMETHYST.get(), pos, state);
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, AmethystBlockEntity block) {
        List<Phantom> phantomList = level.getEntitiesOfClass(Phantom.class, AABB.of(new BoundingBox(-48, -48, -48, 48, 48, 48)));
        for (int i = 0; i < phantomList.size(); i++) {
            Phantom phantom = phantomList.get(i);
            phantom.goalSelector.removeAllGoals((goal) -> {
                return true;
            });

        }
    }
}
