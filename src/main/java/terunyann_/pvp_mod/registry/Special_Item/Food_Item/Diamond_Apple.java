package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class Diamond_Apple extends Item {
    public Diamond_Apple(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Absorption").append("IV, 180s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Regeneration").append("II, 15s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Strength").append("I, 100s"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}