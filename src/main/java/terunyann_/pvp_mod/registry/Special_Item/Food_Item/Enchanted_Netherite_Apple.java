package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class Enchanted_Netherite_Apple extends Item {
    public Enchanted_Netherite_Apple(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Health_Boost").append("IV, 250s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Absorption").append("II, 200s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Regeneration").append("VI, 10s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Resistance").append("I, 140s"));
        textConsumer.accept(Text.translatable("tooltip.pvp_mod.Fire_Resistance").append(", 250s"));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}