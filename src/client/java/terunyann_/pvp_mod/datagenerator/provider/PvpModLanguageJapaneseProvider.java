package terunyann_.pvp_mod.datagenerator.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import terunyann_.pvp_mod.registry.Blocks;
import terunyann_.pvp_mod.registry.Items;

import java.util.concurrent.CompletableFuture;

public class PvpModLanguageJapaneseProvider extends FabricLanguageProvider {
    public PvpModLanguageJapaneseProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ja_jp", registryLookup);
    }


    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(Items.AMETHYST_APPLE, "アメジストのリンゴ");
        translationBuilder.add(Items.DIAMOND_APPLE, "ダイヤモンドのリンゴ");
        translationBuilder.add(Items.EMERALD_APPLE, "エメラルドのリンゴ");
        translationBuilder.add(Items.ENCHANTED_DIAMOND_APPLE, "エンチャントされたダイヤモンドのリンゴ");
        translationBuilder.add(Items.ENCHANTED_NETHERITE_APPLE, "エンチャントされたネザライトのリンゴ");
        translationBuilder.add(Items.HAMBURGER, "ハンバーガー");
        translationBuilder.add(Items.KIWI, "キウイ");
        translationBuilder.add(Items.NETHERITE_APPLE, "ネザライトのリンゴ");
        translationBuilder.add(Items.SLICED_BREAD, "食パン");
        translationBuilder.add(Items.SOFTSERVE_ICECREAM, "ソフトクリーム(バニラ味)");
        translationBuilder.add(Items.MILK_BOTTLE, "ミルク瓶");
        translationBuilder.add(Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE, "岩盤の強化鍛冶型");
        translationBuilder.add(Items.BEDROCK_INGOT, "岩盤のインゴット");
        translationBuilder.add(Items.BRUSH, "トイレブラシ");
        translationBuilder.add(Items.GRAVITY_ADJUSTMENT_DEVICE, "重力調整デバイス");
        translationBuilder.add(Items.MILK_TRADER, "携帯型牛乳瓶交易村人");

        translationBuilder.add(Items.BEDROCK_AXE, "岩盤の斧");
        translationBuilder.add(Items.BEDROCK_BATTLEAXE, "岩盤のバトルアックス");
        translationBuilder.add(Items.BEDROCK_HOE, "岩盤のクワ");
        translationBuilder.add(Items.BEDROCK_PICKAXE, "岩盤のツルハシ");
        translationBuilder.add(Items.BEDROCK_SCYTHE, "岩盤の大鎌");
        translationBuilder.add(Items.BEDROCK_SHOVEL, "岩盤のシャベル");
        translationBuilder.add(Items.BEDROCK_SWORD, "岩盤の剣");
        translationBuilder.add(Items.ZAZAZAZAL_SWORD, "レッドソード");

        translationBuilder.add(Items.WOODEN_PAXEL, "木のパクセル");
        translationBuilder.add(Items.STONE_PAXEL, "石のパクセル");
        translationBuilder.add(Items.GOLDEN_PAXEL, "金のパクセル");
        translationBuilder.add(Items.IRON_PAXEL, "鉄のパクセル");
        translationBuilder.add(Items.DIAMOND_PAXEL, "ダイヤモンドのパクセル");
        translationBuilder.add(Items.NETHERITE_PAXEL, "ネザライトのパクセル");
        translationBuilder.add(Items.BEDROCK_PAXEL, "岩盤のパクセル");

        translationBuilder.add(Items.BEDROCK_HELMET, "岩盤のヘルメット");
        translationBuilder.add(Items.BEDROCK_CHESTPLATE, "岩盤のチェストプレート");
        translationBuilder.add(Items.BEDROCK_LEGGINGS, "岩盤のレギンス");
        translationBuilder.add(Items.BEDROCK_BOOTS, "岩盤のブーツ");
        translationBuilder.add(Items.INFESTED_BOOTS, "虫さんトコトコで草");
        translationBuilder.add(Items.FLEET_FOOTED, "俊足");

        translationBuilder.add(Items.NEW_BEACH_SPORTS, "新しいビーチスポーツ");
        translationBuilder.add(Items.OTHERWORLD_CONTACT_POINT, "異界接点");
        translationBuilder.add(Items.DESCENDING_GOD_HINOKAGUTSUCHI, "降神ヒノカグツチ");
        translationBuilder.add(Items.SHAMANIC_VOICE, "シャーマニックボイス");
        translationBuilder.add(Items.REIMU_PURIFICATION_ROD_SUPER, "霊夢のお祓い棒(レプリカ)");

        translationBuilder.add("item.pvp_mod.nazo_block", "？ブロック");
        translationBuilder.add("item.pvp_mod.border_block", "ボーダーブロック");

        translationBuilder.add("tooltip.pvp_mod.descending_god_hinokagutsuchi", "火炎耐性");
        translationBuilder.add("tooltip.pvp_mod.new_beach_sports_1", "移動速度低下I");
        translationBuilder.add("tooltip.pvp_mod.new_beach_sports_2", "攻撃力上昇I");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_1", "跳躍力上昇II");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_2", "移動速度上昇I");
        translationBuilder.add("tooltip.pvp_mod.otherworld_contact_point_3", "毒I");
        translationBuilder.add("tooltip.pvp_mod.reimu_purification_rod_super", "自身へ浮遊、低速落下を付与");
        translationBuilder.add("tooltip.pvp_mod.shamanic_voice", "採掘速度上昇I");

        translationBuilder.add("tooltip.pvp_mod.bedrock_battleaxe", "一定範囲内にダメージを与え、範囲内にいるMOBへ鈍足、弱体化を付与");
        translationBuilder.add("tooltip.pvp_mod.bedrock_scythe", "一定範囲内にいる自身を除くMOBへダメージと鈍足、衰弱、暗闇、毒を付与し、自身へはダメージを与え、鈍足、弱体化を付与");
        translationBuilder.add("tooltip.pvp_mod.brush_1", "全プレイヤーの火炎耐性を削除");
        translationBuilder.add("tooltip.pvp_mod.brush_2", "3回のみ使用可能");
        translationBuilder.add("tooltip.pvp_mod.fleet_footed", "移動速度上昇II");
        translationBuilder.add("tooltip.pvp_mod.gravity_adjustment_device", "自身の低速落下を削除");
        translationBuilder.add("tooltip.pvp_mod.infested_boots", "虫食い");
        translationBuilder.add("tooltip.pvp_mod.zazazazal_sword", "自身へ攻撃力上昇、耐性を付与");

        translationBuilder.add("tooltip.pvp_mod.Health_Boost", "体力増強");
        translationBuilder.add("tooltip.pvp_mod.Absorption", "衝撃吸収");
        translationBuilder.add("tooltip.pvp_mod.Regeneration", "再生");
        translationBuilder.add("tooltip.pvp_mod.Resistance", "耐性");
        translationBuilder.add("tooltip.pvp_mod.Strength", "攻撃力上昇");
        translationBuilder.add("tooltip.pvp_mod.Oozing", "滲出");
        translationBuilder.add("tooltip.pvp_mod.Speed", "移動速度上昇");
        translationBuilder.add("tooltip.pvp_mod.Fire_Resistance", "火炎耐性");

        translationBuilder.add(Blocks.NAZO_BLOCK, "？ブロック");
        translationBuilder.add(Blocks.BORDER_BLOCK, "ボーダーブロック");
    }
}