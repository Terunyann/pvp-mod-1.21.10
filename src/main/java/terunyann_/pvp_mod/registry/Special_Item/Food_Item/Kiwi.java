package terunyann_.pvp_mod.registry.Special_Item.Food_Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Kiwi extends Item {
    public Kiwi(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}