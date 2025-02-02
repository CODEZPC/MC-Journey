package com.code.Codeeffects;

//TODO 避免多实体共用变量（所有）
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
    //private LivingEntity ent;

    public Undying() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF00);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        //ent = entity;
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).hasModifier(Identifier.of("code", "undying_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).updateModifier(new EntityAttributeModifier(Identifier.of("code", "undying_modifier"), 500.0F - entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue(), EntityAttributeModifier.Operation.ADD_VALUE));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).addTemporaryModifier(new EntityAttributeModifier(Identifier.of("code", "undying_modifier"), 500.0F - entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue(), EntityAttributeModifier.Operation.ADD_VALUE));
        entity.setHealth(500.0F);
        return true;
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        EntityAttributeInstance entityAttributeInstance = attributes.getCustomInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (entityAttributeInstance != null) {
            entityAttributeInstance.removeModifier(Identifier.of("code", "undying_modifier"));
        }
        //ent.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).removeModifier(Identifier.of("code", "undying_modifier"));
        super.onRemoved(attributes);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}


// 血衣
class BloodCloth extends StatusEffect {
    public static final Logger LOGGER = LoggerFactory.getLogger("code/effects/blood_cloth");
    private LivingEntity ent;

    public BloodCloth() {
        super(StatusEffectCategory.BENEFICIAL, 0x3B0402);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        int ticks = 0;
        boolean pl = false;
        ent = entity;
        ticks++;
        if (ticks >= 120 / (amplifier + 1) && entity.getHealth() > entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 4) {
            entity.setHealth(entity.getHealth() - (float) entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 20 * (amplifier + 1));
            ticks = 0;
        }
        float hp = entity.getHealth();
        double unit = entity.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).getBaseValue() / 20;
        int fx = (int) Math.ceil(hp / unit);
        if (entity instanceof PlayerEntity) pl = true;
        else pl = false;
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).hasModifier(Identifier.of("code", "blood_cloth_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).addPersistentModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        if (entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).hasModifier(Identifier.of("code", "blood_cloth_modifier")))
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        else
            entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).addPersistentModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        switch (pl?(int)hp:fx) {
            case 20:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.00F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
            case 19:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.05F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.05F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 18:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.10F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.10F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 17:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.15F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.15F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 16:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.20F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.20F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 15:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.25F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.25F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 14:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.30F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.30F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 13:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.35F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.35F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 12:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.40F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.40F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 11:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.45F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.45F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 10:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.50F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.50F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 9:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.60F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.60F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 8:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.70F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.70F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 7:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.80F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.80F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 6:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.90F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 0.90F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 5:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.00F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.00F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 4:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.15F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.25F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 3:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.30F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.50F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 2:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.45F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.75F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            case 1:
                entity.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 1.60F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).updateModifier(new EntityAttributeModifier(Identifier.of("code", "blood_cloth_modifier"), 2.00F * (amplifier + 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onRemoved(AttributeContainer attributes) {
        ent.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).removeModifier(Identifier.of("code", "blood_cloth_modifier"));
        ent.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).removeModifier(Identifier.of("code", "blood_cloth_modifier"));
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
