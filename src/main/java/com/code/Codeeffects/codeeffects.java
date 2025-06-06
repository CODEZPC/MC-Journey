package com.code.Codeeffects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

// 不朽
class Undying extends StatusEffect {

    public Undying() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.setHealth(500.0F);
        return true;
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).hasModifier(Identifier.of("code", "undying_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).updateModifier(new EntityAttributeModifier(Identifier.of("code", "undying_modifier"), 500.0F - entity.getMaxHealth(), EntityAttributeModifier.Operation.ADD_VALUE));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).addTemporaryModifier(new EntityAttributeModifier(Identifier.of("code", "undying_modifier"), 500.0F - entity.getMaxHealth(), EntityAttributeModifier.Operation.ADD_VALUE));
        super.onApplied(entity, amplifier);
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        EntityAttributeInstance entityAttributeInstance = attributes.getCustomInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (entityAttributeInstance != null) {
            entityAttributeInstance.removeModifier(Identifier.of("code", "undying_modifier"));
        }
        super.onRemoved(attributes);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}


// 血衣
class BloodCloth extends StatusEffect {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/effects/blc-log");

    public BloodCloth() {
        super(StatusEffectCategory.BENEFICIAL, 0x3B0402);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        boolean pl = false;
        if (entity.getHealth() > entity.getMaxHealth() / 4) {
            entity.damage(entity.getDamageSources().magic(), (float) entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 20);
        }
        float hp = entity.getHealth();
        double unit = entity.getMaxHealth() / 20;
        int fx = (int) Math.ceil(hp / unit);
        if (entity instanceof PlayerEntity)
            pl = true;
        else
            pl = false;
        float[] atk = {0.00F, 2.00F, 1.75F, 1.50F, 1.25F, 1.00F, 0.90F, 0.80F, 0.70F, 0.60F, 0.50F, 0.45F, 0.40F, 0.35F, 0.30F, 0.25F, 0.20F, 0.15F, 0.10F, 0.05F, 0.00F};
        float[] spd = {0.00F, 1.60F, 1.45F, 1.30F, 1.15F, 1.00F, 0.90F, 0.80F, 0.70F, 0.60F, 0.50F, 0.45F, 0.40F, 0.35F, 0.30F, 0.25F, 0.20F, 0.15F, 0.10F, 0.05F, 0.00F};
        entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), spd[pl ? (int) hp : fx], EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), atk[pl ? (int) hp : fx], EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        return true;
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).hasModifier(Identifier.of("code", "blood_cloth_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).addPersistentModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).hasModifier(Identifier.of("code", "blood_cloth_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).addPersistentModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        EntityAttributeInstance entityAttributeInstance = attributes.getCustomInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (entityAttributeInstance != null) {
            entityAttributeInstance.removeModifier(Identifier.of("code", "blood_cloth_modifier"));
        }
        entityAttributeInstance = attributes.getCustomInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (entityAttributeInstance != null) {
            entityAttributeInstance.removeModifier(Identifier.of("code", "blood_cloth_modifier"));
        }
        super.onRemoved(attributes);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 100 << amplifier;
        return i > 0 ? duration % 100 == 0 : true;
    }
}


//缓慢再生
class Slow_Regeneration extends StatusEffect {
    public Slow_Regeneration() {
        super(StatusEffectCategory.BENEFICIAL, 0xCD5CAB);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getHealth() < entity.getMaxHealth())
            entity.heal(1.0F);
        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 120 == 0;
    }
}


/*
 * 破伤风之刃（设想）
 * 效果
 *   获得此效果后，立刻获得一层[锈蚀]，后每(5/amp)s叠加一层，当攻击敌人时，给对方增加与[锈蚀]层数相同的[破伤风]层数并减少一层[锈蚀]，持续时间45s
 *   [锈蚀]
 *     每层[锈蚀]使攻击力降低1点，最大叠层4层
 *   [破伤风]
 *     每层[破伤风]使生命值上限减少10%，使血量颜色变为#CC753F，每次受到攻击都会有(2.5*层数)%的概率直接死亡，每层单独计时
 */


public class codeeffects implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/effects");
    public static final RegistryEntry<StatusEffect> UNDYING;
    public static final RegistryEntry<StatusEffect> BLOOD_CLOTH;
    public static final RegistryEntry<StatusEffect> SLOW_REGENERATION;
    static {
        UNDYING = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "undying"), new Undying());
        BLOOD_CLOTH = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "blood_cloth"), new BloodCloth());
        SLOW_REGENERATION = Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of("code", "slow_regeneration"), new Slow_Regeneration());
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Effects registering completed.");
    }
}
