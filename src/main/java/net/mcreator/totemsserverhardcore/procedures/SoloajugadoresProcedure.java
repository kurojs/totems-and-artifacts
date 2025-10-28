/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.Container
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.monster.Monster
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.totemsserverhardcore.procedures;

import java.util.List;
import java.util.ArrayList;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;

public class SoloajugadoresProcedure {
    public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
        Player _player;
        if (entity == null) {
            return;
        }
        ArrayList _players = new ArrayList(world.players());
        for (Entity entityiterator : (List<Entity>)(Object)_players) {
            LivingEntity _entity;
            if (!(entityiterator instanceof Mob) || entity instanceof Player || entityiterator instanceof ServerPlayer) {
                if (!(entityiterator instanceof LivingEntity)) continue;
                _entity = (LivingEntity)entityiterator;
                _entity.addEffect(new MobEffectInstance(MobEffects.HARM, 600, 1, false, true));
                continue;
            }
            if (!(entityiterator instanceof Mob) && entityiterator instanceof ServerPlayer && !(entityiterator instanceof Monster) || !(entityiterator instanceof LivingEntity)) continue;
            _entity = (LivingEntity)entityiterator;
            _entity.removeEffect(MobEffects.HARM);
        }
        if (entity instanceof Player) {
            _player = (Player)entity;
            ItemStack _stktoremove = new ItemStack((ItemLike)KuromymodModItems.PRUEBA.get());
// TODO: Fix clearOrCountMatchingItems signature
        //             _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1);
        }
        if (entity instanceof Player) {
            _player = (Player)entity;
            _player.getCooldowns().addCooldown(itemstack.getItem(), 100);
        }
    }
}

