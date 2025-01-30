package com.code.Codeitems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.code.Codeeffects.codeeffects;


public class codeitems {
    public static final Logger LOGGER = LoggerFactory.getLogger("code");
    //定义物品 - 技能点
    //Define items - skill points
    public static final Item Skill_Point = new Item((new Item.Settings()).maxCount(99));
    //定义物品 - 奖牌组
    //Define items - medals group
    public static final Item Gold_Medal = new Item((new Item.Settings()).maxCount(1));
    public static final Item Iron_Medal = new Item((new Item.Settings()).maxCount(1));
    public static final Item Copper_Medal = new Item((new Item.Settings()).maxCount(1));
    public static final Item Diamond_Medal = new Item((new Item.Settings()).maxCount(1));
    public static final Item Netherite_Medal = new Item((new Item.Settings()).maxCount(1));
    //定义物品 - 数据碎片组
    //Define items - data fragments group
    public static final Item Data_UL = new Item((new Item.Settings()).maxCount(64));
    public static final Item Data_1B = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4B = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16B = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64B = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256B = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1KB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4KB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16KB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64KB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256KB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1MB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4MB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16MB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64MB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256MB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1GB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4GB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16GB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64GB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256GB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1TB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4TB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16TB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64TB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256TB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1PB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_4PB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_16PB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_64PB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_256PB = new Item((new Item.Settings()).maxCount(96));
    public static final Item Data_1EB = new Item((new Item.Settings()).maxCount(96));
    //定义材料 - 不朽粉
    public static final Item Undying_dust = new Item((new Item.Settings()).maxCount(64));
    //定义药水
    public static final Potion Effect_Undying = Registry.register(Registries.POTION, Identifier.of("code", "effect_undying"), new Potion(new StatusEffectInstance(codeeffects.UNDYING, 2000, 0)));
    public static final Potion Effect_Blood_Cloth_1 = Registry.register(Registries.POTION, Identifier.of("code", "effect_blood_cloth_1"), new Potion(new StatusEffectInstance(codeeffects.BLOOD_CLOTH, 2000, 0)));
    public static final Potion Effect_Blood_Cloth_2 = Registry.register(Registries.POTION, Identifier.of("code", "effect_blood_cloth_2"), new Potion(new StatusEffectInstance(codeeffects.BLOOD_CLOTH, 2000, 1)));
    //定义物品组 - 奖牌组
    //Define item groups - medals group
    public static final ItemGroup Medals = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Gold_Medal))
        .displayName(Text.translatable("itemGroup.code.medal"))
        .entries((context, entries) -> {
            entries.add(Copper_Medal);
            entries.add(Iron_Medal);
            entries.add(Gold_Medal);
            entries.add(Diamond_Medal);
            entries.add(Netherite_Medal);
        })
        .build();
    //定义物品组 - 数据碎片组
    //Define item groups - data fragments group
    public static final ItemGroup Data = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Data_UL))
        .displayName(Text.translatable("itemGroup.code.data"))
        .entries((context, entries) -> {
            entries.add(Data_UL);
            entries.add(Data_1B);
            entries.add(Data_4B);
            entries.add(Data_16B);
            entries.add(Data_64B);
            entries.add(Data_256B);
            entries.add(Data_1KB);
            entries.add(Data_4KB);
            entries.add(Data_16KB);
            entries.add(Data_64KB);
            entries.add(Data_256KB);
            entries.add(Data_1MB);
            entries.add(Data_4MB);
            entries.add(Data_16MB);
            entries.add(Data_64MB);
            entries.add(Data_256MB);
            entries.add(Data_1GB);
            entries.add(Data_4GB);
            entries.add(Data_16GB);
            entries.add(Data_64GB);
            entries.add(Data_256GB);
            entries.add(Data_1TB);
            entries.add(Data_4TB);
            entries.add(Data_16TB);
            entries.add(Data_64TB);
            entries.add(Data_256TB);
            entries.add(Data_1PB);
            entries.add(Data_4PB);
            entries.add(Data_16PB);
            entries.add(Data_64PB);
            entries.add(Data_256PB);
            entries.add(Data_1EB);
        })
        .build();

    public static void Registry_Items() {
        //注册物品 - 技能点
        //Register items - skill points
        LOGGER.info("[CODE/ITEMS]:Starting to register items...");
        Registry.register(Registries.ITEM, Identifier.of("code", "skill_point"), Skill_Point);
        //注册物品 - 不朽粉
        Registry.register(Registries.ITEM, Identifier.of("code", "undying_dust"), Undying_dust);
        //注册物品 - 奖牌
        //Register items - medals
        Registry.register(Registries.ITEM, Identifier.of("code", "gold_medal"), Gold_Medal);
        Registry.register(Registries.ITEM, Identifier.of("code", "iron_medal"), Iron_Medal);
        Registry.register(Registries.ITEM, Identifier.of("code", "copper_medal"), Copper_Medal);
        Registry.register(Registries.ITEM, Identifier.of("code", "diamond_medal"), Diamond_Medal);
        Registry.register(Registries.ITEM, Identifier.of("code", "netherite_medal"), Netherite_Medal);
        //注册物品 - 数据碎片
        //Register items - data fragments
        Registry.register(Registries.ITEM, Identifier.of("code", "data_ul"), Data_UL);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1b"), Data_1B);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4b"), Data_4B);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16b"), Data_16B);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64b"), Data_64B);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256b"), Data_256B);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1kb"), Data_1KB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4kb"), Data_4KB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16kb"), Data_16KB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64kb"), Data_64KB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256kb"), Data_256KB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1mb"), Data_1MB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4mb"), Data_4MB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16mb"), Data_16MB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64mb"), Data_64MB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256mb"), Data_256MB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1gb"), Data_1GB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4gb"), Data_4GB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16gb"), Data_16GB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64gb"), Data_64GB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256gb"), Data_256GB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1tb"), Data_1TB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4tb"), Data_4TB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16tb"), Data_16TB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64tb"), Data_64TB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256tb"), Data_256TB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1pb"), Data_1PB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_4pb"), Data_4PB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_16pb"), Data_16PB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_64pb"), Data_64PB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_256pb"), Data_256PB);
        Registry.register(Registries.ITEM, Identifier.of("code", "data_1eb"), Data_1EB);
        //注册物品组
        //Register item groups
        Registry.register(Registries.ITEM_GROUP, Identifier.of("code", "medals"), Medals);
        Registry.register(Registries.ITEM_GROUP, Identifier.of("code", "data"), Data);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(Skill_Point);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(Undying_dust);
        });
        LOGGER.info("[CODE/ITEMS]: Items registering completed.");
    }
}
/*
ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
    LOGGER.info(String.format("[CODE/BLOCKS]: Registering/Sorting item groups...(1/%d) [TMP_BLOCK -> BUILDING_BLOCKS[ItemGroup]]", TOTALIG));
    content.add(TMP_BLOCK);
});
*/