package terunyann_.pvp_mod.registry.Special_Item.Sakura_Items;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class Otherworld_Contact_Point extends Item {
    public Otherworld_Contact_Point(Settings settings) {
        super(settings);
    }

    public void inventoryTick(ItemStack stack, ServerWorld world, Entity user, EquipmentSlot slot) {
        super.inventoryTick(stack, world, user, slot);

        if (world.isClient()) return;

        if (!(user instanceof PlayerEntity player)) return;

        if (player.getEquippedStack(EquipmentSlot.FEET) != stack) return;

        player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 1, false, false, true));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 1, false, false, true));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20, 0, false, false, true));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.otherworld_contact_point_1"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.otherworld_contact_point_2"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.otherworld_contact_point_3"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}