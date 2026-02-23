package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Amethyst_Apple extends Item {
    public Amethyst_Apple(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}