package terunyann_.pvp_mod.registry.Special_Item.Sakura_Items;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.function.Consumer;


public class Reimu_Purification_Rod_Surer extends Item {
    public Reimu_Purification_Rod_Surer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient()) return ActionResult.PASS;
        ServerWorld serverWorld = (ServerWorld) world;

        serverWorld.spawnParticles(
                ParticleTypes.TRIAL_SPAWNER_DETECTION,
                user.getX() - 0.5, user.getY(), user.getZ() - 0.5,
                10, 0.2, 0.2, 0.2, 0.01
        );

        serverWorld.playSound(
                null, user.getBlockPos(),
                SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.PLAYERS,
                1.0f, 1.0f
        );

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 255, true, true));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3 * 20, 0, true, true));

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.reimu_purification_rod_super"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}