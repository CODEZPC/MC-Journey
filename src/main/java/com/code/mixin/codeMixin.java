package com.code.mixin;

import net.minecraft.component.type.PotionContentsComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PotionContentsComponent.class)
public class codeMixin {
	@Inject(at = @At("HEAD"), method = "buildTooltip")
	private void ampdbg(CallbackInfo info) {
	}
}