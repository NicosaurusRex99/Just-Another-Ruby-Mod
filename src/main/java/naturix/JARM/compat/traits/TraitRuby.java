package naturix.JARM.compat.traits;

import naturix.JARM.ModBlocks;
import naturix.JARM.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.library.utils.ToolHelper;

public class TraitRuby extends AbstractTrait {
    public TraitRuby() {
        super("synergy", TextFormatting.GREEN);
    }

    private static final float REPAIR_DAMPENER = 64f/3f;

    @Override
    public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
        if(!world.isRemote && entity instanceof EntityPlayer && !(entity instanceof FakePlayer)) {
            if(!InventoryPlayer.isHotbar(itemSlot) && ((EntityPlayer) entity).getHeldItemOffhand() != tool) return;
            if (!needsRepair(tool)) return;

            int healPower = 0;

            NonNullList<ItemStack> playerInv = ((EntityPlayer) entity).inventory.mainInventory;

            for (int i = 0; i < 9; i++) {
                if (i != itemSlot) {
                    ItemStack stack = playerInv.get(i);
                    if (!stack.isEmpty() && stack.getItem() == ModItems.gemruby)
                        healPower += stack.getCount();
                    }
            }

            ToolHelper.healTool(tool, (int) (healPower / REPAIR_DAMPENER), (EntityLivingBase) entity);
        }
    }

    private boolean needsRepair(ItemStack itemStack) {
        return !itemStack.isEmpty() && itemStack.getItemDamage() > 0 && !ToolHelper.isBroken(itemStack);
    }
}
