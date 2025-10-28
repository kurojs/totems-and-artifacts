package net.mcreator.totemsserverhardcore.procedures;

import net.mcreator.totemsserverhardcore.KuromymodMod;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class EVENT0Procedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        
        // Título 1: "II YOKAI HARDCORE II"
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel) world;
            try {
                _level.getServer().getCommands().performPrefixedCommand(
                    new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, 
                        _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), 
                    "title @a title [\"\",{\"text\":\"II\",\"bold\":true,\"obfuscated\":true,\"color\":\"dark_gray\"},{\"text\":\"YOKAI HARDCORE\",\"color\":\"light_purple\"},{\"text\":\"II \",\"bold\":true,\"obfuscated\":true,\"color\":\"dark_gray\"}]"
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        // Sonido intro
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), 
                    (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:intro")), 
                    SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, 
                    (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:intro")), 
                    SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        
        // Después de 40 ticks (2 segundos)
        KuromymodMod.queueServerWork(40, () -> {
            // Título 2: "II BY: SHINIGAMISTUDIOS II"
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                try {
                    _level.getServer().getCommands().performPrefixedCommand(
                        new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, 
                            _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), 
                        "title @a title [\"\",{\"text\":\"II\",\"bold\":true,\"obfuscated\":true,\"color\":\"dark_gray\"},{\"text\":\"BY:\",\"color\":\"black\"},{\"text\":\" SHINIGAMISTUDIOS\",\"color\":\"white\"},{\"text\":\"II \",\"bold\":true,\"obfuscated\":true,\"color\":\"dark_gray\"}]"
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            // Sonido intro (repetido)
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), 
                        (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:intro")), 
                        SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, 
                        (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:intro")), 
                        SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            
            // Después de otros 80 ticks (4 segundos total)
            KuromymodMod.queueServerWork(80, () -> {
                // Sonido de inicio
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), 
                            (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:inicio")), 
                            SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, 
                            (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("kuromymod:inicio")), 
                            SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
            });
        });
    }
}
