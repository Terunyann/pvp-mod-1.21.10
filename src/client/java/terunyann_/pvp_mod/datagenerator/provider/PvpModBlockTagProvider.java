package terunyann_.pvp_mod.datagenerator.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import terunyann_.pvp_mod.PvpMod;

import java.util.concurrent.CompletableFuture;

public class PvpModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public PvpModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> PAXEL_MINEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, "paxel_mineable"));
    public static final TagKey<Block> INCORRECT_FOR_BEDROCK_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, "incorrect_for_bedrock_tool"));
    public static final TagKey<Block> INCORRECT_FOR_WOODEN_PAXEL_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, "incorrect_for_wooden_paxel_tool"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(PAXEL_MINEABLE)
                .addOptionalTag(BlockTags.AXE_MINEABLE)
                .addOptionalTag(BlockTags.HOE_MINEABLE)
                .addOptionalTag(BlockTags.PICKAXE_MINEABLE)
                .addOptionalTag(BlockTags.SHOVEL_MINEABLE);

        valueLookupBuilder(INCORRECT_FOR_BEDROCK_TOOL)
                .addOptionalTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .addOptional(Blocks.REINFORCED_DEEPSLATE);

        valueLookupBuilder(INCORRECT_FOR_WOODEN_PAXEL_TOOL)
                .addOptionalTag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(Blocks.GOLD_BLOCK);
    }
}