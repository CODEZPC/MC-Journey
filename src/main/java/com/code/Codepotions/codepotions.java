package com.code.Codepotions;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import com.code.Codeitems.codeitems;

/*
忽略：
对于getEntry(Item), 找不到合适的方法
    方法 Registry.getEntry(int)不适用
      (参数不匹配; Item无法转换为int)
    方法 Registry.getEntry(Identifier)不适用
      (参数不匹配; Item无法转换为Identifier)
    方法 Registry.getEntry(RegistryKey<Potion>)不适用
      (参数不匹配; Item无法转换为RegistryKey<Potion>)
    方法 Registry.getEntry(Potion)不适用
      (参数不匹配; Item无法转换为Potion)
*/ */

public class codepotions {
    public static void Registry_Potions() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.TOTEM_OF_UNDYING,
                    Registries.POTION.getEntry(codeitems.Effect_Undying)
            );
        });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.IRON_SWORD,
                    Registries.POTION.getEntry(codeitems.Effect_Blood_Cloth_1)
            );
        });
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.AWKWARD,
                    Items.DIAMOND_SWORD,
                    Registries.POTION.getEntry(codeitems.Effect_Blood_Cloth_2)
            );
        });
    }
}
