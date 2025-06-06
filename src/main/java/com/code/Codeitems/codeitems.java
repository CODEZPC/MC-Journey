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
import com.code.Codeitems.items.Coppercoin;
import com.code.Codeitems.items.Diamondcoin;
import com.code.Codeitems.items.Dot;
import com.code.Codeitems.items.Goldcoin;
import com.code.Codeitems.items.Ironcoin;
import com.code.Codeitems.items.Netheritecoin;

public class codeitems {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/items");

    public static <T extends Item> T register(String path, T item) {
        return Registry.register(Registries.ITEM, Identifier.of("code", path), item);
    }

    // 定义物品 - 奖牌组
    public static final Item Gold_Medal = register("gold_medal", new Item(new Item.Settings().maxCount(1)));
    public static final Item Iron_Medal = register("iron_medal", new Item(new Item.Settings().maxCount(1)));
    public static final Item Copper_Medal = register("copper_medal", new Item(new Item.Settings().maxCount(1)));
    public static final Item Diamond_Medal = register("diamond_medal", new Item(new Item.Settings().maxCount(1)));
    public static final Item Netherite_Medal = register("netherite_medal", new Item(new Item.Settings().maxCount(1)));
    // 定义材料 - 不朽粉
    public static final Item Undying_dust = register("undying_dust", new Item(new Item.Settings()));
    // 定义 Coin&Point
    public static final Dot DOT = register("dot", new Dot(new Item.Settings().maxCount(80)));
    public static final Coppercoin COPPERCOIN = register("copper_coin", new Coppercoin(new Item.Settings().maxCount(80)));
    public static final Ironcoin IRONCOIN = register("iron_coin", new Ironcoin(new Item.Settings().maxCount(80)));
    public static final Goldcoin GOLDCOIN = register("gold_coin", new Goldcoin(new Item.Settings().maxCount(80)));
    public static final Diamondcoin DIAMONDCOIN = register("diamond_coin", new Diamondcoin(new Item.Settings().maxCount(80)));
    public static final Netheritecoin NETHERITECOIN = register("netherite_coin", new Netheritecoin(new Item.Settings().maxCount(80)));
    // 定义药水
    public static final Potion Effect_Undying = Registry.register(Registries.POTION, Identifier.of("code", "effect_undying"), new Potion(new StatusEffectInstance(codeeffects.UNDYING, 2000, 0)));
    public static final Potion Effect_Blood_Cloth_1 = Registry.register(Registries.POTION, Identifier.of("code", "effect_blood_cloth_1"), new Potion(new StatusEffectInstance(codeeffects.BLOOD_CLOTH, 2000, 0)));
    public static final Potion Effect_Blood_Cloth_2 = Registry.register(Registries.POTION, Identifier.of("code", "effect_blood_cloth_2"), new Potion(new StatusEffectInstance(codeeffects.BLOOD_CLOTH, 2000, 1)));
    // 定义物品组 - 奖牌组
    @SuppressWarnings("unused")
    public static final ItemGroup Medals = FabricItemGroup.builder().icon(() -> new ItemStack(Gold_Medal)).displayName(Text.translatable("itemGroup.code.medal")).entries((context, entries) -> {
        entries.add(Copper_Medal);
        entries.add(Iron_Medal);
        entries.add(Gold_Medal);
        entries.add(Diamond_Medal);
        entries.add(Netherite_Medal);
    }).build();
    @SuppressWarnings("unused")
    public static final ItemGroup Coins = FabricItemGroup.builder().icon(() -> new ItemStack(GOLDCOIN)).displayName(Text.translatable("itemGroup.code.coins")).entries((context, entries) -> {
        entries.add(DOT);
        entries.add(COPPERCOIN);
        entries.add(IRONCOIN);
        entries.add(GOLDCOIN);
        entries.add(DIAMONDCOIN);
        entries.add(NETHERITECOIN);
    }).build();

    public static void Registry_Items() {
        // 注册物品组
        Registry.register(Registries.ITEM_GROUP, Identifier.of("code", "medals"), Medals);
        Registry.register(Registries.ITEM_GROUP, Identifier.of("code", "coins"), Coins);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(Undying_dust);
        });
        LOGGER.info("Items registering completed.");
    }
}
