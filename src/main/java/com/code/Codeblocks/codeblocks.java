package com.code.Codeblocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class codeblocks {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/blocks");
    // 定义方块 - 临时方块
    public static final Block TMP_BLOCK = new Block(Block.Settings.create().strength(0.0f));

    public static void Registry_Blocks() {
        // 注册方块
        Registry.register(Registries.BLOCK, Identifier.of("code", "tmp_block"), TMP_BLOCK);
        // 注册方块对应的物品
        Registry.register(Registries.ITEM, Identifier.of("code", "tmp_block"), new BlockItem(TMP_BLOCK, new Item.Settings()));
        // 注册物品组
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(TMP_BLOCK);
        });
        LOGGER.info("Blocks registering completed.");
    }
}
