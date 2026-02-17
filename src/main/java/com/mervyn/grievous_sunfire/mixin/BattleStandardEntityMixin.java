package com.mervyn.grievous_sunfire.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.sweenus.simplyswords.entity.BattleStandardEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BattleStandardEntity.class)
public abstract class BattleStandardEntityMixin extends LivingEntity {

    @Shadow public String standardType;

    protected BattleStandardEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "baseTick", at = @At("HEAD"))
    private void grievous_sunfire$applyGrievousWounds(CallbackInfo ci) {
        if (!this.getWorld().isClient && "sunfire".equals(this.standardType)) {
             StatusEffect grievous = Registries.STATUS_EFFECT.get(new Identifier("zenith_attributes", "grievous"));
             if (grievous != null && !this.hasStatusEffect(grievous)) {
                 // Amplifier 2 (Level 3), Duration -1 (Infinite)
                 this.addStatusEffect(new StatusEffectInstance(grievous, -1, 2));
             }
        }
    }
}
