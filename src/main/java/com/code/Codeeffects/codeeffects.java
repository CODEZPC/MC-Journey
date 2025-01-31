package com.code.Codeeffects;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

class Undying extends StatusEffect {
    private LivingEntity ent;
    private Map<LivingEntity, Double> originalHealth = new HashMap<>();
    public Undying() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ent = entity;
        if (!originalHealth.containsKey(entity)){
            double hp = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue();
            originalHealth.put(entity, hp);
        }
        entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(500.0F);
        entity.setHealth(500.0F);
        return true;
    }
    @Override
    public void onRemoved(AttributeContainer attributes) {
        if (originalHealth.containsKey(ent)) {
            double hp = originalHealth.get(ent);
            ent.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(hp);
            originalHealth.remove(ent);
        }
        super.onRemoved(attributes);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

class BloodCloth extends StatusEffect {
    private int ticks = 0;
    public BloodCloth() {
        super(StatusEffectCategory.BENEFICIAL, 0x3B0402);
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ticks++;
        if (ticks >= 120 / (amplifier + 1) && entity.getHealth() > entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4) {
            entity.setHealth(entity.getHealth() - (float) entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 20 * (amplifier + 1));
            ticks = 0;
        }
        int examp = (int) Math.ceil((entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() - entity.getHealth()) / (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        return true;
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

public class codeeffects implements ModInitializer{
    public static final RegistryEntry<StatusEffect> UNDYING;
    public static final RegistryEntry<StatusEffect> BLOOD_CLOTH;
    static {
        UNDYING = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "undying"), new Undying());
        BLOOD_CLOTH = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "blood_cloth"), new BloodCloth());
    }
    @Override
	public void onInitialize(){
        //Nothing
    }
}