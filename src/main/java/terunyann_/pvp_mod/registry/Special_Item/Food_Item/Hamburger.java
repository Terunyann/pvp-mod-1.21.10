package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class Hamburger extends Item {
    public Hamburger(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Health_Boost").append("I, 180s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Absorption").append("II, 180s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Regeneration").append("III, 10s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Fire_Resistance").append(", 180s"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}