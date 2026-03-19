package terunyann_.pvp_mod.list.enums;

import net.minecraft.item.ToolMaterial;
import terunyann_.pvp_mod.tag.BlockTags;
import terunyann_.pvp_mod.tag.ItemTags;

public class PvpModToolMaterial {

    public static final ToolMaterial BEDROCK = new ToolMaterial(
            BlockTags.INCORRECT_FOR_BEDROCK_TOOL,
            2100000000,
            10.0F,
            5.0F,
            30,
            ItemTags.BEDROCK_TOOL_MATERIALS
    );

    public static final ToolMaterial WOODEN_PAXEL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_PAXEL_TOOL,
            59,
            2.0F,
            0.0F,
            15,
            net.minecraft.registry.tag.ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static void load() {
    }
}