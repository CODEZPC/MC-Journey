package com.code.Codeattributes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;


public class codeattributes implements ModInitializer {
    public static final RegistryEntry<EntityAttribute> RUST = Registry.registerReference(Registries.ATTRIBUTE, Identifier.of("code", "rust"), new ClampedEntityAttribute("attribute.rust", 0.0, 0.0, 4.0).setTracked(true));

    @Override
    public void onInitialize() {}
}
