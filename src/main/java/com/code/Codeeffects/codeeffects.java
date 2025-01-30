package com.code.Codeeffects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectCategory;
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
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

class BloodClothStatusEffect extends StatusEffect {
    private int ticks = 0;
    public static final Logger L= LoggerFactory.getLogger("bloodcloth");
    public BloodClothStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF0000);
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ticks++;
        if (ticks >= 120 / (amplifier + 1) && entity.getHealth() > 5.0F) {
            entity.setHealth(entity.getHealth() - 1.0F);
            ticks = 0;
        }
        EntityAttributeInstance speed = entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (speed != null) {
            int examp = (int) (20.0F - entity.getHealth()) / 5;
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5, amplifier + examp, true, false, false));
        }
        EntityAttributeInstance strength = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (strength != null) {
            int examp = (int) (20.0F - entity.getHealth()) / 5;
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5, amplifier + examp, true, false, false));
        }
        return true;
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

public class codeeffects {
    public static final StatusEffect UNDYING = new UndyingStatusEffect();
    public static final StatusEffect BLOOD_CLOTH = new BloodClothStatusEffect();
    public static void Registry_Effects() {
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("code", "undying"), UNDYING);
        Registry.register(Registries.STATUS_EFFECT, Identifier.of("code", "blood_cloth"), BLOOD_CLOTH);
    }
}