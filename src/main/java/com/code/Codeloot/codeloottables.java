package com.code.Codeloot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.code.Codeitems.codeitems;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class codeloottables {

    private static final Identifier ABADONED_MINESHAFT = Identifier.ofVanilla("chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY = Identifier.ofVanilla("chests/ancient_city");
    private static final Identifier ANCIENT_CITY_ICE_BOX = Identifier.ofVanilla("chests/ancient_city_ice_box");
    private static final Identifier BASTION_BRIDGE = Identifier.ofVanilla("chests/bastion_bridge");
    private static final Identifier BASTION_HOGLIN_STABLE = Identifier.ofVanilla("chests/bastion_hoglin_stable");
    private static final Identifier BASTION_OTHER = Identifier.ofVanilla("chests/bastion_other");
    private static final Identifier BASTION_TREASURE = Identifier.ofVanilla("chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE = Identifier.ofVanilla("chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID = Identifier.ofVanilla("chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE = Identifier.ofVanilla("chests/end_city_treasure");
    private static final Identifier IGLOO_CHEST = Identifier.ofVanilla("chests/igloo_chest");
    private static final Identifier JUNGLE_TEMPLE = Identifier.ofVanilla("chests/jungle_temple");
    private static final Identifier JUNGLE_TEMPLE_DISPENSER = Identifier.ofVanilla("chests/jungle_temple_dispenser");
    private static final Identifier NETHER_BRIDGE = Identifier.ofVanilla("chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST = Identifier.ofVanilla("chests/pillager_outpost");
    private static final Identifier RUINED_PORTAL = Identifier.ofVanilla("chests/ruined_portal");
    private static final Identifier SHIPWRECK_MAP = Identifier.ofVanilla("chests/shipwreck_map");
    private static final Identifier SHIPWRECK_SUPPLY = Identifier.ofVanilla("chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TREASURE = Identifier.ofVanilla("chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON = Identifier.ofVanilla("chests/simple_dungeon");
    private static final Identifier SPAWN_BONUS_CHEST = Identifier.ofVanilla("chests/spawn_bonus_chest");
    private static final Identifier STRONGHOLD_CORRIDOR = Identifier.ofVanilla("chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING = Identifier.ofVanilla("chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_LIBRARY = Identifier.ofVanilla("chests/stronghold_library");
    private static final Identifier UNDERWATER_RUIN_BIG = Identifier.ofVanilla("chests/underwater_ruin_big");
    private static final Identifier UNDERWATER_RUIN_SMALL = Identifier.ofVanilla("chests/underwater_ruin_small");
    private static final Identifier WOODLAND_MANSION = Identifier.ofVanilla("chests/woodland_mansion");
    private static final Identifier TRIAL_CHAMBERS_CORRIDOR = Identifier.ofVanilla("chests/trial_chambers/corridor");
    private static final Identifier TRIAL_CHAMBERS_ENTRANCE = Identifier.ofVanilla("chests/trial_chambers/entrance");
    private static final Identifier TRIAL_CHAMBERS_INTERSECTION = Identifier.ofVanilla("chests/trial_chambers/intersection");
    private static final Identifier TRIAL_CHAMBERS_INTERSECTION_BARREL = Identifier.ofVanilla("chests/trial_chambers/intersection_barrel");
    private static final Identifier TRIAL_CHAMBERS_REWARD = Identifier.ofVanilla("chests/trial_chambers/reward");
    private static final Identifier TRIAL_CHAMBERS_REWARD_COMMON = Identifier.ofVanilla("chests/trial_chambers/reward_common");
    private static final Identifier TRIAL_CHAMBERS_REWARD_OMINOUS = Identifier.ofVanilla("chests/trial_chambers/reward_ominous");
    private static final Identifier TRIAL_CHAMBERS_REWARD_OMINOUS_COMMON = Identifier.ofVanilla("chests/trial_chambers/reward_ominous_common");
    private static final Identifier TRIAL_CHAMBERS_REWARD_OMINOUS_RARE = Identifier.ofVanilla("chests/trial_chambers/reward_ominous_rare");
    private static final Identifier TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE = Identifier.ofVanilla("chests/trial_chambers/reward_ominous_unique");
    private static final Identifier TRIAL_CHAMBERS_REWARD_RARE = Identifier.ofVanilla("chests/trial_chambers/reward_rare");
    private static final Identifier TRIAL_CHAMBERS_REWARD_UNIQUE = Identifier.ofVanilla("chests/trial_chambers/reward_unique");
    private static final Identifier TRIAL_CHAMBERS_SUPPLY = Identifier.ofVanilla("chests/trial_chambers/supply");
    private static final Identifier VILLAGE_ARMORER = Identifier.ofVanilla("chests/village/village_armorer");
    private static final Identifier VILLAGE_BUTCHER = Identifier.ofVanilla("chests/village/village_butcher");
    private static final Identifier VILLAGE_CARTOGRAPHER = Identifier.ofVanilla("chests/village/village_cartographer");
    private static final Identifier VILLAGE_DESERT_HOUSE = Identifier.ofVanilla("chests/village/village_desert_house");
    private static final Identifier VILLAGE_FISHER = Identifier.ofVanilla("chests/village/village_fisher");
    private static final Identifier VILLAGE_FLETCHER = Identifier.ofVanilla("chests/village/village_fletcher");
    private static final Identifier VILLAGE_MASON = Identifier.ofVanilla("chests/village/village_mason");
    private static final Identifier VILLAGE_PLAINS_HOUSE = Identifier.ofVanilla("chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE = Identifier.ofVanilla("chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SHEPHERD = Identifier.ofVanilla("chests/village/village_shepherd");
    private static final Identifier VILLAGE_SNOWY_HOUSE = Identifier.ofVanilla("chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE = Identifier.ofVanilla("chests/village/village_taiga_house");
    private static final Identifier VILLAGE_TANNERY = Identifier.ofVanilla("chests/village/village_tannery");
    private static final Identifier VILLAGE_TEMPLE = Identifier.ofVanilla("chests/village/village_temple");
    private static final Identifier VILLAGE_TOOLSMITH = Identifier.ofVanilla("chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH = Identifier.ofVanilla("chests/village/village_weaponsmith");
    /*
    ENTITES LOOT TABLES
    Entity Translation roll chance min -> max
    BLAZE 烈焰人 1 0.8 1 -> 2
    BOGGED 沼骸 1 0.6 1 -> 1
    BREEZE 旋风人 1 0.8 1 -> 2
    CAVE_SPIDER 洞穴蜘蛛 1 0.6 1 -> 1
    CHICKEN 鸡 1 0.2 1 -> 1
    COD 鳕鱼 1 0.2 1 -> 1
    COW 牛 1 0.2 1 -> 1
    CREEPER 苦力怕 1 0.7 1 -> 2
    DROWNED 溺尸 1 0.6 1 -> 1
    ELDER_GUARDIAN 远古守卫者 1 1.0 2 -> 5
    ENDERMAN 末影人 1 0.6 1 -> 3
    ENDERMITE 末影螨 1 0.6 1 -> 1
    EVOKER 唤魔者 1 0.8 1 -> 2
    GHAST 恶魂 1 0.7 1 -> 2
    GUARDIAN 守卫者 1 0.8 1 -> 3
    HOGLIN 疣猪兽 1 0.4 1 -> 1
    HUSK 尸壳 1 0.6 1 -> 1
    MAGMA_CUBE 熔岩怪 1 0.5 1 -> 2
    MOOSHROOM 哞菇 1 0.2 1 -> 1
    PHANTOM 幻翼 1 0.8 1 -> 2
    PIG 猪 1 0.2 1 -> 1
    PIGLIN_BRUTE 猪灵蛮兵 1 0.8 2 -> 4
    PIGLIN 猪灵 1 0.6 1 -> 3
    PILLAGER 掠夺者 1 0.7 1 -> 2
    RABBIT 兔子 1 0.2 1 -> 1
    RAVAGER 劫掠兽 1 1.0 3 -> 6
    SALMON 鲑鱼 1 0.2 1 -> 1
    SHEEP 羊 1 0.2 1 -> 1
    SHULKER 潜影贝 1 0.7 1 -> 2
    SILVERFISH 蠹虫 1 0.3 1 -> 1
    SKELETON 骷髅 1 0.6 1 -> 1
    SLIME 史莱姆 1 0.5 1 -> 2
    SPIDER 蜘蛛 1 0.6 1 -> 1
    STRAY 流浪者 1 0.6 1 -> 1
    TROPICAL_FISH 热带鱼 1 0.2 1 -> 1
    VEX 脑鬼 1 0.5 1 -> 2
    VINDICATOR 卫道士 1 0.8 1 -> 2
    WARDEN 监守者 1 1.0 20 -> 40
    WITCH 女巫 1 0.6 1 -> 1
    WITHER_SKELETON 凋零骷髅 1 0.6 1 -> 1
    WITHER 凋零 1 1.0 15 -> 30
    ZOGLIN 僵尸疣猪兽 1 0.4 1 -> 1
    ZOMBIE 僵尸 1 0.6 1 -> 1
    ZOMBIFIED_PIGLIN 僵尸猪灵 1 0.5 1 -> 1
     */
    private static final Identifier BLAZE = Identifier.ofVanilla("entities/blaze");
    private static final Identifier BOGGED = Identifier.ofVanilla("entities/bogged");
    private static final Identifier BREEZE = Identifier.ofVanilla("entities/breeze");
    private static final Identifier CAVE_SPIDER = Identifier.ofVanilla("entities/cave_spider");
    private static final Identifier CHICKEN = Identifier.ofVanilla("entities/chicken");
    private static final Identifier COD = Identifier.ofVanilla("entities/cod");
    private static final Identifier COW = Identifier.ofVanilla("entities/cow");
    private static final Identifier CREEPER = Identifier.ofVanilla("entities/creeper");
    private static final Identifier DROWNED = Identifier.ofVanilla("entities/drowned");
    private static final Identifier ELDER_GUARDIAN = Identifier.ofVanilla("entities/elder_guardian");
    private static final Identifier ENDERMAN = Identifier.ofVanilla("entities/enderman");
    private static final Identifier ENDERMITE = Identifier.ofVanilla("entities/endermite");
    private static final Identifier EVOKER = Identifier.ofVanilla("entities/evoker");
    private static final Identifier GHAST = Identifier.ofVanilla("entities/ghast");
    private static final Identifier GUARDIAN = Identifier.ofVanilla("entities/guardian");
    private static final Identifier HOGLIN = Identifier.ofVanilla("entities/hoglin");
    private static final Identifier HUSK = Identifier.ofVanilla("entities/husk");
    private static final Identifier MAGMA_CUBE = Identifier.ofVanilla("entities/magma_cube");
    private static final Identifier MOOSHROOM = Identifier.ofVanilla("entities/mooshroom");
    private static final Identifier PHANTOM = Identifier.ofVanilla("entities/phantom");
    private static final Identifier PIG = Identifier.ofVanilla("entities/pig");
    private static final Identifier PIGLIN_BRUTE = Identifier.ofVanilla("entities/piglin_brute");
    private static final Identifier PIGLIN = Identifier.ofVanilla("entities/piglin");
    private static final Identifier PILLAGER = Identifier.ofVanilla("entities/pillager");
    private static final Identifier RABBIT = Identifier.ofVanilla("entities/rabbit");
    private static final Identifier RAVAGER = Identifier.ofVanilla("entities/ravager");
    private static final Identifier SALMON = Identifier.ofVanilla("entities/salmon");
    private static final Identifier SHEEP = Identifier.ofVanilla("entities/sheep");
    private static final Identifier SHULKER = Identifier.ofVanilla("entities/shulker");
    private static final Identifier SILVERFISH = Identifier.ofVanilla("entities/silverfish");
    private static final Identifier SKELETON = Identifier.ofVanilla("entities/skeleton");
    private static final Identifier SLIME = Identifier.ofVanilla("entities/slime");
    private static final Identifier SPIDER = Identifier.ofVanilla("entities/spider");
    private static final Identifier STRAY = Identifier.ofVanilla("entities/stray");
    private static final Identifier TROPICAL_FISH = Identifier.ofVanilla("entities/tropical_fish");
    private static final Identifier VEX = Identifier.ofVanilla("entities/vex");
    private static final Identifier VINDICATOR = Identifier.ofVanilla("entities/vindicator");
    private static final Identifier WARDEN = Identifier.ofVanilla("entities/warden");
    private static final Identifier WITCH = Identifier.ofVanilla("entities/witch");
    private static final Identifier WITHER_SKELETON = Identifier.ofVanilla("entities/wither_skeleton");
    private static final Identifier WITHER = Identifier.ofVanilla("entities/wither");
    private static final Identifier ZOGLIN = Identifier.ofVanilla("entities/zoglin");
    private static final Identifier ZOMBIE = Identifier.ofVanilla("entities/zombie");
    private static final Identifier ZOMBIFIED_PIGLIN = Identifier.ofVanilla("entities/zombified_piglin");
    public static final Logger LOGGER = LoggerFactory.getLogger("code");
    public static void modifyLootTables_STRUCTURES() {
        LOGGER.info("[CODE/LOOT TABLES]:Starting to edit loot tables for structures...");
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ABADONED_MINESHAFT.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ANCIENT_CITY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ANCIENT_CITY_ICE_BOX.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BASTION_BRIDGE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BASTION_HOGLIN_STABLE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BASTION_OTHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BASTION_TREASURE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BURIED_TREASURE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (DESERT_PYRAMID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (END_CITY_TREASURE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (IGLOO_CHEST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (JUNGLE_TEMPLE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (JUNGLE_TEMPLE_DISPENSER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (NETHER_BRIDGE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PILLAGER_OUTPOST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (RUINED_PORTAL.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SHIPWRECK_MAP.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SHIPWRECK_SUPPLY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SHIPWRECK_TREASURE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SIMPLE_DUNGEON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SPAWN_BONUS_CHEST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (STRONGHOLD_CORRIDOR.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (STRONGHOLD_CROSSING.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (STRONGHOLD_LIBRARY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (UNDERWATER_RUIN_BIG.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (UNDERWATER_RUIN_SMALL.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (WOODLAND_MANSION.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_CORRIDOR.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_ENTRANCE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_INTERSECTION.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_INTERSECTION_BARREL.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_COMMON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_OMINOUS.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_OMINOUS_COMMON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_OMINOUS_RARE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_RARE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_REWARD_UNIQUE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TRIAL_CHAMBERS_SUPPLY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_ARMORER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_BUTCHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_CARTOGRAPHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_DESERT_HOUSE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_FISHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_FLETCHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_MASON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_PLAINS_HOUSE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_SAVANNA_HOUSE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_SHEPHERD.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_SNOWY_HOUSE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_TAIGA_HOUSE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_TANNERY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_TEMPLE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_TOOLSMITH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VILLAGE_WEAPONSMITH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LOGGER.info("[CODE/LOOT TABLES]:End editing loot tables for structures.");
    }
    public static void modifyLootTables_ENTITIES() {
        LOGGER.info("[CODE/LOOT TABLES]:Starting to edit loot tables for entities...");
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BLAZE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BOGGED.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (BREEZE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (CAVE_SPIDER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (CHICKEN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (COD.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (COW.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (CREEPER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (DROWNED.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ELDER_GUARDIAN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ENDERMAN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ENDERMITE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (EVOKER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (GHAST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (GUARDIAN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (HOGLIN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (HUSK.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (MAGMA_CUBE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (MOOSHROOM.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PHANTOM.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PIG.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PIGLIN_BRUTE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PIGLIN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (PILLAGER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (RABBIT.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (RAVAGER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 6.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SALMON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SHEEP.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SHULKER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.7f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SILVERFISH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SKELETON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SLIME.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (SPIDER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (STRAY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (TROPICAL_FISH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VEX.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (VINDICATOR.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (WARDEN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(20.0f, 40.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (WITCH.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (WITHER_SKELETON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (WITHER.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(15.0f, 30.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ZOGLIN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ZOMBIE.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (ZOMBIFIED_PIGLIN.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(codeitems.Skill_Point))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
        });
        LOGGER.info("[CODE/LOOT TABLES]:End editing loot tables for entities.");
    }
}