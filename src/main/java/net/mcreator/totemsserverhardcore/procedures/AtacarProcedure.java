/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.totemsserverhardcore.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class AtacarProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        LivingEntity _livEnt;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity && (_livEnt = (LivingEntity)entity).getMobType() == MobType.UNDEFINED) {
            ServerLevel _level2;
            world.setBlock(new BlockPos(x, y, z), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 2.0, z), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0, y, z), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 2.0, y, z), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z + 1.0), Blocks.TORCH.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z + 2.0), Blocks.TORCH.defaultBlockState(), 3);
            if (world instanceof ServerLevel) {
                // world = (ServerLevel)world; // Commented - lambda issue
                ((ServerLevel)world).sendParticles((ParticleOptions)ParticleTypes.ENCHANT, x, y, z, 1200, 4.0, 3.0, 3.0, 1.0);
            }
            if (world instanceof Level) {
                // world = (Level)world; // Commented - lambda issue
                if (!((Level)world).isClientSide) {
// TODO: Fix playLocalSound parameters
        //                     ((Level)world).playLocalSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
((Level)world).playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
    }
}

