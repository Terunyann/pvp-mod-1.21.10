package terunyann_.pvp_mod.registry.Special_Item.Normal_Special_Items;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.function.Consumer;


public class Gravity_Adjustment_Device extends Item {
    public Gravity_Adjustment_Device(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient()) return ActionResult.PASS;

        if (world instanceof ServerWorld serverWorld) {

            world.getServer();
            user.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SLOW_FALLING, -2100000000, 255
            ));

            serverWorld.spawnParticles(
                    ParticleTypes.BUBBLE_POP,
                    user.getX(), user.getY() + 1, user.getZ(),
                    10,
                    0.5, 0.5, 0.5,
                    0.1
                );
            }
        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.gravity_adjustment_device"));

        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}