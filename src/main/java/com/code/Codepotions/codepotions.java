package com.code.Codepotions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import com.code.Codeitems.codeitems;

public class codepotions {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/potons");

    public static void Registry_Potions() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, codeitems.Undying_dust, Registries.POTION.getEntry(codeitems.Effect_Undying));
        });
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, Items.IRON_SWORD, Registries.POTION.getEntry(codeitems.Effect_Blood_Cloth_1));
        });
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, Items.DIAMOND_SWORD, Registries.POTION.getEntry(codeitems.Effect_Blood_Cloth_2));
        });
    }
}
