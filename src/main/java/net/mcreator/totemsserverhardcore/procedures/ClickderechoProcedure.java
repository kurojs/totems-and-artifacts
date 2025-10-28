/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.GameType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.totemsserverhardcore.procedures;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class ClickderechoProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        // Level world; // Removed - duplicate
        if (entity == null) {
            return;
        }
        double raytrace_distance = 0.0;
        String found_entity_name = "";
        boolean entity_found = false;
        if (world instanceof Level) {
            // world = (Level)world; // Commented - lambda issue
            if (!((Level)world).isClientSide) {
// TODO: Fix playLocalSound parameters
        //                 ((Level)world).playLocalSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
((Level)world).playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof ServerLevel) {
            // world = (ServerLevel)world; // Commented - lambda issue
            ((ServerLevel)world).sendParticles((ParticleOptions)ParticleTypes.SOUL, x, y, z, 1200, 3.0, 3.0, 3.0, 1.0);
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity)entity;
// TODO: Fix remaining obfuscated MobEffect
        //             _entity.addEffect(new MobEffectInstance(MobEffects.f_19596_, 60, 9, false, false));
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(x - 10, y - 10, z - 10, x + 10, y + 10, z + 10).inflate(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(x, y, z))).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            ItemStack itemStack;
            ItemStack itemStack2;
            ItemStack _ist;
            LivingEntity _livEnt;
            ItemStack itemStack3;
            if (entityiterator == entity) continue;
            if (world instanceof ServerLevel) {
                ServerLevel _level2 = (ServerLevel)world;
                LightningBolt entityToSpawn = (LightningBolt)EntityType.LIGHTNING_BOLT.create((Level)_level2);
                entityToSpawn.moveTo(Vec3.atCenterOf(new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));
                entityToSpawn.setVisualOnly(false);
                _level2.addFreshEntity((Entity)entityToSpawn);
            }
            if (!new Object(){

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
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt2 = (LivingEntity)entity;
                itemStack3 = _livEnt2.getMainHandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            if (itemStack3.getItem() == KuromymodModItems.ENDERSWORD.get()) {
                ItemStack itemStack4;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    itemStack4 = _livEnt.getMainHandItem();
                } else {
                    itemStack4 = ItemStack.EMPTY;
                }
                if (!(_ist = itemStack4).hurt(1, RandomSource.create(), null)) continue;
                _ist.setCount(1);
                _ist.setDamageValue(0);
                continue;
            }
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt3 = (LivingEntity)entity;
                itemStack2 = _livEnt3.getOffhandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() != KuromymodModItems.ENDERSWORD.get()) continue;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                itemStack = _livEnt.getOffhandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (!(_ist = itemStack).hurt(1, RandomSource.create(), null)) continue;
            _ist.setCount(1);
            _ist.setDamageValue(0);
        }
        if (entity instanceof Player) {
            Player _player = (Player)entity;
            _player.getCooldowns().addCooldown(itemstack.getItem(), 100);
        }
    }
}

