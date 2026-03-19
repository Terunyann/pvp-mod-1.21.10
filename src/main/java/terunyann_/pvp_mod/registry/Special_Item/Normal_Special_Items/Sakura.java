package terunyann_.pvp_mod.registry.Special_Item.Normal_Special_Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

public class Sakura extends Item {
    private static final Identifier HEALTH = Identifier.of("pvp_mod", "wear_health_down");

    public Sakura(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerWorld world, Entity user, EquipmentSlot slot) {
        super.inventoryTick(stack, world, user, slot);

        if (world.isClient()) return;

        if (!(user instanceof PlayerEntity player)) return;

        var attr = player.getAttributeInstance(EntityAttributes.MAX_HEALTH);

        if (attr == null) return;

        boolean isWearing = player.getEquippedStack(EquipmentSlot.FEET) == stack;

        if (isWearing) {
            player.fallDistance = 0;

            if (attr.getModifier(HEALTH) == null) {
                attr.addTemporaryModifier(new EntityAttributeModifier(HEALTH, -19.0, EntityAttributeModifier.Operation.ADD_VALUE));
            }

            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20, 0, false, false, true));

            if (player.getHealth() > 1.0F) {
                player.setHealth(1.0F);
            }
        } else {
            var mod = attr.getModifier(HEALTH);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 255, false, false, true));
            if (mod != null) {
                attr.removeModifier(HEALTH);
            }
        }
    }
}