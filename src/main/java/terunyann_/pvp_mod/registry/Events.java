package terunyann_.pvp_mod.registry;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;

import java.util.Set;

public class Events {

    private static final Set<Item> BEDROCK_TOOLS = Set.of(
            Items.BEDROCK_PICKAXE,
            Items.BEDROCK_PAXEL);

    public static void load() {
        AttackBlockCallback.EVENT.register((user, world, hand, pos, direction) -> {

            if (world.isClient()) return ActionResult.PASS;

            BlockState state = world.getBlockState(pos);
            if (!state.isOf(Blocks.BEDROCK)) {
                return ActionResult.PASS;
            }

            ItemStack stack = user.getStackInHand(hand);

            if (!BEDROCK_TOOLS.contains(stack.getItem())) {
                return ActionResult.PASS;
            }

            world.breakBlock(pos, true, user);

            return ActionResult.SUCCESS;
        });
    }
}
