package com.code.Codeenchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class codeenchantments{
    public static final RegistryKey<Enchantment> EASY_BREAKING = of("easy_breaking");

    private static RegistryKey<Enchantment> of(String name) {
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of("code", name));
    }

    public static void Registry_Enchantments() {
        // Nothing
    }
}
