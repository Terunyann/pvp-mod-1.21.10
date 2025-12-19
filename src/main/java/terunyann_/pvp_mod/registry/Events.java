package terunyann_.pvp_mod.registry;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import terunyann_.pvp_mod.PvpMod;

public class Events {
    public static void bedrock_brake() {
        AttackBlockCallback.EVENT.register((user, world, hand, pos, direction) -> {

            if (world.isClient()) return ActionResult.PASS;
            if (!(user instanceof PlayerEntity)) return ActionResult.PASS;

            BlockState state = world.getBlockState(pos);
            if (!state.isOf(Blocks.BEDROCK)) {
                return ActionResult.PASS;
            }

            ItemStack stack = user.getStackInHand(hand);
            if (stack.isEmpty()) return ActionResult.PASS;

            Item item = stack.getItem();

            boolean allowed =
                    item == Registries.ITEM.get(Identifier.of(PvpMod.MOD_ID, "bedrock_paxel")) ||
                            item == Registries.ITEM.get(Identifier.of(PvpMod.MOD_ID, "bedrock_pickaxe"));

            if (!allowed) {
                return ActionResult.PASS;
            }

            System.out.println("aa");
            world.breakBlock(pos, false, user);

            return ActionResult.SUCCESS;
        });
    }

    public static void load() {
    }
}
