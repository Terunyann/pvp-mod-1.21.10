package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Enchanted_Netherite_Apple extends Item {
    public Enchanted_Netherite_Apple(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}