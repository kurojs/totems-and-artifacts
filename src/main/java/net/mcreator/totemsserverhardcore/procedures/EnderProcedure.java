/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.totemsserverhardcore.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class EnderProcedure {
    public static void execute(Entity entity) {
        if (entity == null || !(entity instanceof Player)) {
            return;
        }
        
        Player player = (Player) entity;
        
        // Teletransporte tipo Enderman - hacia donde mira el jugador
        Vec3 lookVec = player.getLookAngle();
        Vec3 startPos = player.getEyePosition(1.0f);
        Vec3 endPos = startPos.add(lookVec.scale(16.0)); // Distancia de 16 bloques
        
        // Raycast para encontrar bloque
        HitResult hitResult = player.level.clip(new ClipContext(startPos, endPos, 
            ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, player));
        
        Vec3 teleportPos;
        if (hitResult.getType() != HitResult.Type.MISS) {
            teleportPos = hitResult.getLocation();
        } else {
            teleportPos = endPos;
        }
        
        // Partículas en posición original
        if (player.level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel) player.level;
            serverLevel.sendParticles(ParticleTypes.PORTAL, 
                player.getX(), player.getY() + 1, player.getZ(), 
                30, 0.5, 0.5, 0.5, 0.1);
        }
        
        // Sonido de teletransporte
        player.level.playSound(null, player.blockPosition(), 
            SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0f, 1.0f);
        
        // Teletransportar
        player.teleportTo(teleportPos.x, teleportPos.y, teleportPos.z);
        player.fallDistance = 0.0f; // Evitar daño de caída
        
        // Partículas en nueva posición
        if (player.level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel) player.level;
            serverLevel.sendParticles(ParticleTypes.PORTAL, 
                teleportPos.x, teleportPos.y + 1, teleportPos.z, 
                30, 0.5, 0.5, 0.5, 0.1);
        }
        
        // Sonido de llegada
        player.level.playSound(null, new BlockPos(teleportPos), 
            SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0f, 1.0f);
    }
}

