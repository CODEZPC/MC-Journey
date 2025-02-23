package com.code.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.code.Codeattributes.codeattributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import net.minecraft.entity.attribute.DefaultAttributeContainer;

@Mixin(DefaultAttributeRegistry.class)
public abstract class codeattributemixin {
    @Inject(method = "register", at = @At("TAIL"))
    private static void addCustomAttributeToPlayers(EntityType<? extends LivingEntity> type, DefaultAttributeContainer.Builder builder, CallbackInfo ci) {
        if (type == EntityType.PLAYER) {
            builder.add(codeattributes.RUST);
        }
    }
}
