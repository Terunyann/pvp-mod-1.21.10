package terunyann_.pvp_mod.datagenerator.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import terunyann_.pvp_mod.registry.Blocks;
import terunyann_.pvp_mod.registry.Items;

import java.util.concurrent.CompletableFuture;

public class PvpModLanguageEnglishProvider extends FabricLanguageProvider {
    public PvpModLanguageEnglishProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(Items.AMETHYST_APPLE, "amethyst apple");
        translationBuilder.add(Items.DIAMOND_APPLE, "diamond apple");
        translationBuilder.add(Items.EMERALD_APPLE, "emerald apple");
        translationBuilder.add(Items.ENCHANTED_DIAMOND_APPLE, "enchanted diamond apple");
        translationBuilder.add(Items.ENCHANTED_NETHERITE_APPLE, "enchanted netherite apple");
        translationBuilder.add(Items.HAMBURGER, "hamburger");
        translationBuilder.add(Items.KIWI, "kiwi");
        translationBuilder.add(Items.NETHERITE_APPLE, "netherite apple");
        translationBuilder.add(Items.SLICED_BREAD, "sliced bread");
        translationBuilder.add(Items.SOFTSERVE_ICECREAM, "softserve icecream");
        translationBuilder.add(Items.MILK_BOTTLE, "milk bottle");
        translationBuilder.add(Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE, "bedrock　upgrade　smithing　template");
        translationBuilder.add(Items.BEDROCK_INGOT, "bedrock　ingot");
        translationBuilder.add(Items.BRUSH, "Toilet Brush");
        translationBuilder.add(Items.GRAVITY_ADJUSTMENT_DEVICE, "gravity adjustment device");

        translationBuilder.add(Items.BEDROCK_AXE, "bedrock　axe");
        translationBuilder.add(Items.BEDROCK_BATTLEAXE, "bedrock　battleaxe");
        translationBuilder.add(Items.BEDROCK_HOE, "bedrock　hoe");
        translationBuilder.add(Items.BEDROCK_PICKAXE, "bedrock　pickaxe");
        translationBuilder.add(Items.BEDROCK_SCYTHE, "bedrock　scythe");
        translationBuilder.add(Items.BEDROCK_SHOVEL, "bedrock　shovel");
        translationBuilder.add(Items.BEDROCK_SWORD, "bedrock　sword");
        translationBuilder.add(Items.ZAZAZAZAL_SWORD, "red sword");

        translationBuilder.add(Items.WOODEN_PAXEL, "wooden PAXEL");
        translationBuilder.add(Items.STONE_PAXEL, "stone paxel");
        translationBuilder.add(Items.GOLDEN_PAXEL, "golden paxel");
        translationBuilder.add(Items.IRON_PAXEL, "iron paxel");
        translationBuilder.add(Items.DIAMOND_PAXEL, "diamond paxel");
        translationBuilder.add(Items.NETHERITE_PAXEL, "netherite paxel");
        translationBuilder.add(Items.BEDROCK_PAXEL, "bedrock paxel");

        translationBuilder.add(Items.BEDROCK_HELMET, "bedrock helmet");
        translationBuilder.add(Items.BEDROCK_CHESTPLATE, "bedrock chestplate");
        translationBuilder.add(Items.BEDROCK_LEGGINGS, "bedrock leggings");
        translationBuilder.add(Items.BEDROCK_BOOTS, "bedrock boots");
        translationBuilder.add(Items.INFESTED_BOOTS, "infested boots");

        translationBuilder.add(Items.NEW_BEACH_SPORTS, "new beach sports");
        translationBuilder.add(Items.OTHERWORLD_CONTACT_POINT, "otherworld contact point");
        translationBuilder.add(Items.DESCENDING_GOD_HINOKAGUTSUCHI, "descending god hinokagutsuchi");
        translationBuilder.add(Items.SHAMANIC_VOICE, "shamanic voice");
        translationBuilder.add(Items.REIMU_PURIFICATION_ROD, "reimu purification rod");

        translationBuilder.add("item.pvp_mod.nazo_block", "Nazo Block");
        translationBuilder.add("item.pvp_mod.border_block", "Border Block");

        translationBuilder.add(Blocks.NAZO_BLOCK, "Nazo Block");
        translationBuilder.add(Blocks.BORDER_BLOCK, "Border Block");
    }
}
