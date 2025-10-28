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
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.totemsserverhardcore.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class SoloamobsProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        Player _player;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(x - 10, y - 10, z - 10, x + 10, y + 10, z + 10).inflate(10.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(x, y, z))).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            LivingEntity _entity;
            if (entityiterator instanceof Mob || !(entityiterator instanceof ServerPlayer) || entityiterator instanceof Monster) {
                if (entityiterator instanceof LivingEntity) {
                    _entity = (LivingEntity)entityiterator;
                    _entity.addEffect(new MobEffectInstance(MobEffects.HARM, 600, 1, false, true));
                }
                if (!(entity instanceof LivingEntity)) continue;
                _entity = (LivingEntity)entity;
                _entity.removeEffect(MobEffects.HARM);
                continue;
            }
            if (entityiterator instanceof Mob && !(entity instanceof Player) && !(entityiterator instanceof ServerPlayer)) continue;
            if (entityiterator instanceof LivingEntity) {
                _entity = (LivingEntity)entityiterator;
                _entity.removeEffect(MobEffects.HARM);
            }
            if (!(entity instanceof LivingEntity)) continue;
            _entity = (LivingEntity)entity;
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

