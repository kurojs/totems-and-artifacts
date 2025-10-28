package net.mcreator.totemsserverhardcore.procedures;

import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class TotemDeathProcedure {

    private static Map<Item, TotemEffect> TOTEM_EFFECTS = null;

    private static Map<Item, TotemEffect> getTotemEffects() {
        if (TOTEM_EFFECTS == null) {
            TOTEM_EFFECTS = new HashMap<>();
            
            // Register totem effects
            TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_AMONGUS.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.CAT.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_BLAZE.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_GHAST.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 3));
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 3));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.GOLEM_TOTEM.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 3));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.ELDEGUARDIANN.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.HORSEE.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 3));
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.PHANTOM.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_RAVAGER.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 4));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 3));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_SILVERFISH.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 900, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEM_SLIME.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 4));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TENTACLED.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEMDEAD.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 4));
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 4));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.WHITER.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.ENDERMITE_TOTEM.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 900, 2));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        });

        TOTEM_EFFECTS.put(KuromymodModItems.TOTEMNUTRIA.get(), entity -> {
            entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 900, 0));
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        });

            TOTEM_EFFECTS.put(KuromymodModItems.TOTEMARDILLA.get(), entity -> {
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 900, 1));
                entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 900, 2));
                entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
            });
        }
        return TOTEM_EFFECTS;
    }

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (event.getEntity() == null) {
            return;
        }

        LivingEntity entity = event.getEntity();
        Level world = entity.level;

        if (world.isClientSide) {
            return;
        }

        // Check mainhand and offhand for totem
        ItemStack mainHandItem = entity.getMainHandItem();
        ItemStack offHandItem = entity.getOffhandItem();

        ItemStack totemStack = null;
        InteractionHand hand = null;

        if (getTotemEffects().containsKey(offHandItem.getItem())) {
            totemStack = offHandItem;
            hand = InteractionHand.OFF_HAND;
        } else if (getTotemEffects().containsKey(mainHandItem.getItem())) {
            totemStack = mainHandItem;
            hand = InteractionHand.MAIN_HAND;
        }

        if (totemStack != null && !totemStack.isEmpty()) {
            // Cancel death
            event.setCanceled(true);

            // Set health
            entity.setHealth(1.0F);

            // Remove totem
            totemStack.shrink(1);

            // Play totem sound and animation
            world.playSound(null, entity.blockPosition(), SoundEvents.TOTEM_USE, SoundSource.PLAYERS, 1.0F, 1.0F);

            // Apply totem effects
            TotemEffect effect = getTotemEffects().get(totemStack.getItem());
            if (effect != null) {
                effect.apply(entity);
            }

            // Trigger totem animation for player
            if (entity instanceof ServerPlayer) {
                ServerPlayer player = (ServerPlayer) entity;
                player.awardStat(Stats.ITEM_USED.get(totemStack.getItem()), 1);
                
                // This triggers the totem animation on client
                ItemStack totemForAnimation = new ItemStack(totemStack.getItem());
                player.setItemInHand(hand, totemForAnimation);
            }

            // Clear fire
            entity.clearFire();
        }
    }

    @FunctionalInterface
    private interface TotemEffect {
        void apply(LivingEntity entity);
    }
}
