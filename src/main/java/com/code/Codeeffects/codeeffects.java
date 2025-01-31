package com.code.Codeeffects;

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
    private double hp = -1.0F;
    public Undying() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ent = entity;
        if (hp == -1.0F){
            hp = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue();
        }
        entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(500.0F);
        entity.setHealth(500.0F);
        return true;
    }
    @Override
    public void onRemoved(AttributeContainer attributes) {
        ent.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(hp);
        hp = -1.0F;
        //while (ent.getHealth() > hp) ent.setHealth(ent.getHealth() - 1.0F);
        super.onRemoved(attributes);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

class BloodCloth extends StatusEffect {
    private int ticks = 0;
    public static final Logger L= LoggerFactory.getLogger("bloodcloth");
    public BloodCloth() {
        super(StatusEffectCategory.BENEFICIAL, 0x3B0402);
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
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        }
        EntityAttributeInstance strength = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (strength != null) {
            int examp = (int) (20.0F - entity.getHealth()) / 5;
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        }
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