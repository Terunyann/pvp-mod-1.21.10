package terunyann_.pvp_mod.registry.Specialblock;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class Border_Block extends Block {

    public static final BooleanProperty IS_BASE = BooleanProperty.of("is_base");

    public Border_Block(AbstractBlock.Settings settings) {
        super(settings
                .strength(-1.0F, 3600000.0F)
                .nonOpaque()
        );
        this.setDefaultState(this.stateManager.getDefaultState().with(IS_BASE, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(IS_BASE);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (world.isClient()) return;

        world.setBlockState(pos, state.with(IS_BASE, true), Block.NOTIFY_ALL);

        int topY = World.MAX_Y;

        for (int y = pos.getY() + 1; y < topY; y++) {
            BlockPos targetPos = new BlockPos(pos.getX(), y, pos.getZ());

            if (world.getBlockState(targetPos).isAir()) {
                world.setBlockState(
                        targetPos,
                        state.with(IS_BASE, false),
                        Block.NOTIFY_ALL
                );
            }
        }
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient()) {
            int bottomY = world.getBottomY();
            int topY = World.MAX_Y;

            for (int y = bottomY; y < topY; y++) {
                BlockPos targetPos = new BlockPos(pos.getX(), y, pos.getZ());

                if (world.getBlockState(targetPos).isOf(this)) {
                    world.setBlockState(targetPos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                }
            }
        }

        super.onBreak(world, pos, state, player);
        return state;
    }
}