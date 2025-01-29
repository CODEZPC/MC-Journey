package com.code.Codeeffects;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
/*
RegistryEntry<StatusEffect> undyingStatusEffectEntry = Registry.STATUS_EFFECT.getEntry(Identifier.of("code", "undying")).orElseThrow();
entity.removeStatusEffect(undyingStatusEffectEntry);
*/

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
// import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

class UndyingStatusEffect extends StatusEffect {
    public UndyingStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setHealth(20.0F);
        return true;
    }
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

public class codeeffects {
    public static final StatusEffect UNDYING = new UndyingStatusEffect();
    public static void Registry_Effects() {
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("code", "undying"), UNDYING);
    }
}