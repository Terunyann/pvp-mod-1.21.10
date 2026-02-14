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
        translationBuilder.add(Items.MILK_TRADER, "Portable Milk Bottle Trading Villager");

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
        translationBuilder.add(Items.FLEET_FOOTED, "fleet footed");

        translationBuilder.add(Items.NEW_BEACH_SPORTS, "new beach sports");
        translationBuilder.add(Items.OTHERWORLD_CONTACT_POINT, "otherworld contact point");
        translationBuilder.add(Items.DESCENDING_GOD_HINOKAGUTSUCHI, "descending god hinokagutsuchi");
        translationBuilder.add(Items.SHAMANIC_VOICE, "shamanic voice");
        translationBuilder.add(Items.REIMU_PURIFICATION_ROD_SUPER, "reimu purification rod");

        translationBuilder.add("item.pvp_mod.nazo_block", "Nazo Block");
        translationBuilder.add("item.pvp_mod.border_block", "Border Block");

        translationBuilder.add("tooltip.pvp_mod.descending_god_hinokagutsuchi", "Fire_Resistance");
        translationBuilder.add("tooltip.pvp_mod.new_beach_sports_1", "SlownessI");
        translationBuilder.add("tooltip.pvp_mod.new_beach_sports_2", "StrengthI");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_1", "Jump BoostII");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_2", "SpeedI");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_3", "PoisonI");
        translationBuilder.add("tooltip.pvp_mod.reimu_purification_rod_super", "自身へLevitation、Slow Fallingを付与");
        translationBuilder.add("tooltip.pvp_mod.shamanic_voice", "HasteI");

        translationBuilder.add("tooltip.pvp_mod.bedrock_battleaxe", "Deals damage within a certain range and inflicts Slowness and Weakness on mobs within the area.");
        translationBuilder.add("tooltip.pvp_mod.bedrock_scythe", "Inflicts damage and applies Slowness, Wither, Darkness, and Poison to all mobs within range except yourself. Inflicts damage and applies Slowness and Weakness to yourself.");
        translationBuilder.add("tooltip.pvp_mod.brush_1", "Remove fire Resistance from all players");
        translationBuilder.add("tooltip.pvp_mod.brush_2", "Can be used only 3 times");
        translationBuilder.add("tooltip.pvp_mod.fleet_footed", "SpeedII");
        translationBuilder.add("tooltip.pvp_mod.gravity_adjustment_device", "Remove your own slow fall");
        translationBuilder.add("tooltip.pvp_mod.infested_boots", "Infested");
        translationBuilder.add("tooltip.pvp_mod.zazazazal_sword", "Increases Strength and grants resistance to oneself");

        translationBuilder.add("tooltip.pvp_mod.Health_Boost", "Health_Boost");
        translationBuilder.add("tooltip.pvp_mod.Absorption", "Absorption");
        translationBuilder.add("tooltip.pvp_mod.Regeneration", "Regeneration");
        translationBuilder.add("tooltip.pvp_mod.Resistance", "Resistance");
        translationBuilder.add("tooltip.pvp_mod.Strength", "Strength");
        translationBuilder.add("tooltip.pvp_mod.Oozing", "Oozing");
        translationBuilder.add("tooltip.pvp_mod.Speed", "Speed");
        translationBuilder.add("tooltip.pvp_mod.Fire_Resistance", "Fire_Resistance");

        translationBuilder.add(Blocks.NAZO_BLOCK, "Nazo Block");
        translationBuilder.add(Blocks.BORDER_BLOCK, "Border Block");
    }
}
