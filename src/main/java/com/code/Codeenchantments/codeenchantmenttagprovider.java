package com.code.Codeenchantments;

import net.fabricmc.api.ModInitializer;
import net.minecraft.data.DataOutput;
import java.util.concurrent.CompletableFuture;
import net.minecraft.data.server.tag.EnchantmentTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EnchantmentTags;

public class codeenchantmenttagprovider extends EnchantmentTagProvider implements ModInitializer {
    public codeenchantmenttagprovider(DataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        this.getOrCreateTagBuilder(EnchantmentTags.CURSE).add(codeenchantments.EASY_BREAKING);
    }

    @Override
    public void onInitialize() {
        // Nothing
    }
}
