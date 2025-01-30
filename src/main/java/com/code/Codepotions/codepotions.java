package com.code.Codepotions;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.recipe.Ingredient;
import com.code.Codeitems.codeitems;

public class codepotions {
    public static void Registry_Potions() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(
                    Potions.WATER,
                    Items.POTATO,
                    Registries.POTION.getEntry(codeitems.Effect_Undying)
            );
        });
    }
}
