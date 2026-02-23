package terunyann_.pvp_mod.registry.Special_Item.Normal_Special_Items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Bedrock_Hoe extends Item {
    public Bedrock_Hoe(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity user = context.getPlayer();

        if (world.isClient()) return ActionResult.SUCCESS;

        BlockState state = world.getBlockState(pos);

        if (state.isOf(Blocks.DIRT) || state.isOf(Blocks.GRASS_BLOCK)) {

            if (!world.getBlockState(pos.up()).isAir()) {
                return ActionResult.PASS;
            }

            world.setBlockState(pos, Blocks.FARMLAND.getDefaultState());

            world.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
