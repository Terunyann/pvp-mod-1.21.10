package terunyann_.pvp_mod.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import terunyann_.pvp_mod.PvpMod;

public class BlockTags {
    public static final TagKey<Block> PAXEL_MINEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of("pvp_mod", "paxel_mineable"));
    public static final TagKey<Block> INCORRECT_FOR_BEDROCK_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, "incorrect_for_bedrock_tool"));
    public static final TagKey<Block> INCORRECT_FOR_WOODEN_PAXEL_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, "incorrect_for_wooden_paxel_tool"));
}