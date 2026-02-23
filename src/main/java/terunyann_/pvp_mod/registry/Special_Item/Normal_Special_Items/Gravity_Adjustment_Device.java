package terunyann_.pvp_mod.registry.Special_Item.Normal_Special_Items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


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

}