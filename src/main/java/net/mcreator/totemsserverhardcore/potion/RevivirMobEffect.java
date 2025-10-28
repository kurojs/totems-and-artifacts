/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectCategory
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.client.extensions.common.IClientMobEffectExtensions
 */
package net.mcreator.totemsserverhardcore.potion;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.function.Consumer;
import net.mcreator.totemsserverhardcore.procedures.ResucitarProcedure;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

public class RevivirMobEffect
extends MobEffect {
    public RevivirMobEffect() {
        super(MobEffectCategory.NEUTRAL, -16777216);
    }

    public String m_19481_() {
        return "effect.kuromymod.revivir";
    }

    public boolean m_8093_() {
        return true;
    }

    public void m_19461_(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        ResucitarProcedure.execute((LevelAccessor)entity.level, entity.getX(), entity.getY(), entity.getZ(), (Entity)entity);
    }

    public boolean m_6584_(int duration, int amplifier) {
        return true;
    }

    public void initializeClient(Consumer<IClientMobEffectExtensions> consumer) {
        consumer.accept(new IClientMobEffectExtensions(){

            public boolean isVisibleInInventory(MobEffectInstance effect) {
                return false;
            }

            public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
                return false;
            }
        });
    }
}

