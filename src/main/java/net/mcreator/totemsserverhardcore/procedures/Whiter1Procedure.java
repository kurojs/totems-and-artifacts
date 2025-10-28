package net.mcreator.totemsserverhardcore.procedures;

import javax.annotation.Nullable;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class Whiter1Procedure {
    
    private static net.minecraft.world.item.Item[] totems = null;
    
    private static net.minecraft.world.item.Item[] getTotems() {
        if (totems == null) {
            totems = new net.minecraft.world.item.Item[] {
                KuromymodModItems.WHITER.get(),
                KuromymodModItems.GOLEM_TOTEM.get(),
                KuromymodModItems.TOTEM_BLAZE.get(),
                KuromymodModItems.ENDERMITE_TOTEM.get(),
                KuromymodModItems.TOTEM_AMONGUS.get(),
                KuromymodModItems.CAT.get(),
                KuromymodModItems.TOTEM_SLIME.get(),
                KuromymodModItems.TOTEMNUTRIA.get(),
                KuromymodModItems.TOTEMARDILLA.get(),
                KuromymodModItems.HORSEE.get(),
                KuromymodModItems.TOTEM_SILVERFISH.get(),
                KuromymodModItems.TOTEM_GHAST.get(),
                KuromymodModItems.TOTEM_RAVAGER.get()
            };
        }
        return totems;
    }
    
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), 
                    event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) return;
        if (!(entity instanceof LivingEntity)) return;
        
        LivingEntity livingEntity = (LivingEntity) entity;
        
        // Solo procesar si la salud es menor a 1 (está muriendo)
        if (livingEntity.getHealth() >= 1.0f) return;
        
        ItemStack mainHandItem = livingEntity.getMainHandItem();
        ItemStack offHandItem = livingEntity.getOffhandItem();
        
        // Verificar si tiene algún totem
        boolean hasTotem = false;
        net.minecraft.world.item.Item usedTotem = null;
        InteractionHand totemHand = null;
        
        for (net.minecraft.world.item.Item totem : getTotems()) {
            if (mainHandItem.getItem() == totem) {
                hasTotem = true;
                usedTotem = totem;
                totemHand = InteractionHand.MAIN_HAND;
                break;
            } else if (offHandItem.getItem() == totem) {
                hasTotem = true;
                usedTotem = totem;
                totemHand = InteractionHand.OFF_HAND;
                break;
            }
        }
        
        if (!hasTotem) return;
        
        // CANCELAR MUERTE
        if (event != null && event.isCancelable()) {
            event.setCanceled(true);
        } else if (event instanceof LivingDeathEvent) {
            ((LivingDeathEvent)event).setCanceled(true);
        }
        
        // Mostrar animación del totem en cliente
        if (world.isClientSide()) {
            Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(usedTotem));
        }
        
        // Restaurar vida
        livingEntity.setHealth(4.0f);
        
        // Limpiar fuego
        livingEntity.clearFire();
        
        // Aplicar efectos según el totem
        applyTotemEffects(livingEntity, usedTotem);
        
        // Reemplazar totem con aire (consumirlo)
        livingEntity.setItemInHand(totemHand, new ItemStack(Blocks.AIR));
        if (livingEntity instanceof Player) {
            ((Player) livingEntity).getInventory().setChanged();
        }
        
        // Partículas
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles((ParticleOptions) ParticleTypes.TOTEM_OF_UNDYING, 
                x + 1.0, y + 1.0, z + 1.0, 32, 1.0, 1.0, 1.0, 1.0);
        }
        
        // Sonido del totem
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), 
                    (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), 
                    SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, 
                    (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.totem.use")), 
                    SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
    }
    
    private static void applyTotemEffects(LivingEntity entity, net.minecraft.world.item.Item totem) {
        // Efectos base para todos los totems
        entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1, false, false));
        entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0, false, false));
        entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1, false, false));
        
        // Efectos específicos por totem
        if (totem == KuromymodModItems.WHITER.get()) {
            entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 3600, 3, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 1, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 3600, 1, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 2, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 1, false, false));
        } else if (totem == KuromymodModItems.GOLEM_TOTEM.get()) {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 3, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 2, false, false));
        } else if (totem == KuromymodModItems.TOTEM_BLAZE.get()) {
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 4, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 4, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 2, false, false));
        } else if (totem == KuromymodModItems.ENDERMITE_TOTEM.get()) {
            entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 3, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1, false, false));
        }
    }
}
