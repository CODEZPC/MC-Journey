package com.code.Codeeffects;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

// 不朽
class Undying extends StatusEffect {
    private LivingEntity ent;
    public Undying() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ent = entity;
        entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(500.0F);
        entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).addPersistentModifier(new EntityAttributeModifier(Identifier.of("code", "undying_modifier"), 500.0F - entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue(), EntityAttributeModifier.Operation.ADD_VALUE));
        entity.setHealth(500.0F);
        return true;
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        ent.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).removeModifier(Identifier.of("code", "undying_modifier"));
        super.onRemoved(attributes);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

// 血衣
class BloodCloth extends StatusEffect {
    private int ticks = 0;
    private LivingEntity ent;
    private Map<LivingEntity, Double> originalSpeed = new HashMap<>();
    private Map<LivingEntity, Double> originalAttack = new HashMap<>();

    public BloodCloth() {
        super(StatusEffectCategory.BENEFICIAL, 0x3B0402);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        ent = entity;
        ticks++;
        if (ticks >= 120 / (amplifier + 1) && entity.getHealth() > entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4) {
            entity.setHealth(entity.getHealth() - (float) entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 20 * (amplifier + 1));
            ticks = 0;
        }
        // int examp = (int) Math.ceil((entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() - entity.getHealth()) / (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4));
        // entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        // entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5, amplifier + (amplifier + 1) * examp, true, false, false));
        if (!originalSpeed.containsKey(entity)) {
            double speed = entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).getBaseValue();
            originalSpeed.put(entity, speed);
        }
        if (!originalAttack.containsKey(entity)) {
            double attack = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).getBaseValue();
            originalAttack.put(entity, attack);
        }
        entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).setBaseValue((amplifier + 1) * originalSpeed.get(entity) * (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() - entity.getHealth()) / (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4));
        entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue((amplifier + 1) * originalAttack.get(entity) * (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() - entity.getHealth()) / (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4));
        return true;
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        if (originalSpeed.containsKey(ent)) {
            double speed = originalSpeed.get(ent);
            ent.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).setBaseValue(speed);
            originalSpeed.remove(ent);
        }
        if (originalAttack.containsKey(ent)) {
            double attack = originalAttack.get(ent);
            ent.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue(attack);
            originalAttack.remove(ent);
        }
        super.onRemoved(attributes);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}


public class codeeffects implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/effects");
    public static final RegistryEntry<StatusEffect> UNDYING;
    public static final RegistryEntry<StatusEffect> BLOOD_CLOTH;
    static {
        UNDYING = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "undying"), new Undying());
        BLOOD_CLOTH = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "blood_cloth"), new BloodCloth());
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Effects registering completed.");
    }
}
