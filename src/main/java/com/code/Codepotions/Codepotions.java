package com.code.Codepotions;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.recipe.Ingredient;

public class codepotions {
    public static void Registry_Potions() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(
					Potions.WATER,
					Ingredient.ofItems(Items.IRON_SWORD),
					Registries.POTION.getEntry(Identifier.of("code:blood_cloth")).get()
			);
		});
    }
}