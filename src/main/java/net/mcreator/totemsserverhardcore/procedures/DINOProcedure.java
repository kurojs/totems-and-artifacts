/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.GameType
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.totemsserverhardcore.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class DINOProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(x - 10, y - 10, z - 10, x + 10, y + 10, z + 10).inflate(7.5), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(x, y, z))).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            if (!(entity instanceof Player) || new Object(){

                public boolean checkGamemode(Entity _ent) {
                    if (_ent instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                        return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
                    }
                    if (_ent instanceof LivingEntity && ((LivingEntity)_ent).hasEffect(MobEffects.FIRE_RESISTANCE) && _ent instanceof Player) {
                        Player _player = (Player)_ent;
                        return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
                    }
                    return false;
                }
            }.checkGamemode(entity)) continue;
            if (entityiterator instanceof LivingEntity) {
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2, false, true));
            }
            if (!(entity instanceof Player)) continue;
            Player _player = (Player)entity;
            _player.getCooldowns().addCooldown(itemstack.getItem(), 6000);
        }
    }
}

