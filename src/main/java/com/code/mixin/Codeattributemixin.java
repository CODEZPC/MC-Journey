package com.code.mixin;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import com.code.Codeattributes.*;

@Mixin(DefaultAttributeRegistry.class)
public abstract class Codeattributemixin {
    @Inject(method = "register", at = @At("TAIL"))
    private static void addCustomAttributeToPlayer(EntityType<? extends LivingEntity> entityType, DefaultAttributeContainer.Builder builder, CallbackInfo ci) {
        builder.add(codeattributes.ENTITY_EFFECT_RUST);
    }
}
