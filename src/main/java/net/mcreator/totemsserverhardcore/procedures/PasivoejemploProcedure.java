/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package net.mcreator.totemsserverhardcore.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class PasivoejemploProcedure {
    public static void execute(Entity entity) {
        LivingEntity _entity;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1));
        }
        if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
// TODO: Fix remaining obfuscated MobEffect
        //             _entity.addEffect(new MobEffectInstance(MobEffects.f_19596_, 60, 5));
        }
    }
}

