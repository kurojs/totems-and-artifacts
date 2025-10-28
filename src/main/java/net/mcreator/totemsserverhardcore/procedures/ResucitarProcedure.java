/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.network.chat.Component
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.totemsserverhardcore.procedures;

import net.mcreator.totemsserverhardcore.KuromymodMod;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class ResucitarProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        Entity _ent = entity;
        if (!(_ent instanceof LivingEntity && ((LivingEntity)_ent).hasEffect(MobEffects.FIRE_RESISTANCE)) && (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null) != null) {
//             (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null).getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, _ent.getAttribute(), _ent.getAttributeBaseValue(), _ent.level instanceof ServerLevel ? (ServerLevel)_ent.level : null, 4, _ent.getArmorValue().getString(), _ent.getCustomName(), _ent.level.getServer(), _ent), "function soulrush:nautilus_class/revered_grounds/revered_grounds_fire");
        }
        KuromymodMod.queueServerWork(20, () -> {
            // Entity _ent = entity; // Duplicate removed
            if (!(_ent instanceof LivingEntity && ((LivingEntity)_ent).hasEffect(MobEffects.FIRE_RESISTANCE)) && (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null) != null) {
//                 (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null).getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, _ent.getAttribute(), _ent.getAttributeBaseValue(), _ent.level instanceof ServerLevel ? (ServerLevel)_ent.level : null, 4, _ent.getArmorValue().getString(), _ent.getCustomName(), _ent.level.getServer(), _ent), "function soulrush:nautilus_class/golden_barrier/barrier_activate");
            }
        });
        KuromymodMod.queueServerWork(10, () -> {
            // Entity _ent = entity; // Duplicate removed
            if (!(_ent instanceof LivingEntity && ((LivingEntity)_ent).hasEffect(MobEffects.FIRE_RESISTANCE)) && (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null) != null) {
//                 (_ent instanceof LivingEntity ? ((LivingEntity)_ent).getAttributes() : null).getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, _ent.getAttribute(), _ent.getAttributeBaseValue(), _ent.level instanceof ServerLevel ? (ServerLevel)_ent.level : null, 4, _ent.getArmorValue().getString(), _ent.getCustomName(), _ent.level.getServer(), _ent), "function soulrush:amethyst_class/starlight_flurry/starlight_cast");
            }
        });
        if (world instanceof ServerLevel) {
            ServerLevel _levelTemp = (ServerLevel)world;
//             _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, world, 4, "", (Component)Component.literal((String)""), _level2.getServer(), null).withSuppressedOutput(), "function lostworld:alchemy/ritual/boss_phantom/1_start");
        }
    }
}

