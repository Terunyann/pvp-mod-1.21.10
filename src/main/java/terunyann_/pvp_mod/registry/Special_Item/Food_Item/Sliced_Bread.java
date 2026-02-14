package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class Sliced_Bread extends Item {
    public Sliced_Bread(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Regeneration").append("II, 7s"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}