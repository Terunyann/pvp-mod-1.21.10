package terunyann_.pvp_mod.registry.Special_Item.Normal_Special_Items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Milk_Trader extends Item {
    public Milk_Trader(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {

        if (world.isClient()) {
            return ActionResult.PASS;
        }

        PlayerInventory inv = user.getInventory();

        int slot = inv.getSlotWithStack(new ItemStack(Items.MILK_BUCKET));
        if (slot == -1) {
            return ActionResult.FAIL;
        }

        inv.removeStack(slot, 1);

        ItemStack milk_bottle = new ItemStack(terunyann_.pvp_mod.registry.Items.MILK_BOTTLE);
        if (!inv.insertStack(milk_bottle)) {
            user.dropItem(milk_bottle, false);
        }

        return ActionResult.SUCCESS;
    }
}