package net.mcreator.totemsserverhardcore.procedures;

import javax.annotation.Nullable;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class UNIVERSOProcedure {
    
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute((Event)event, (Entity)event.player);
        }
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null) return;
        
        ItemStack offhandItem;
        ItemStack mainhandItem;
        
        // TOTEM_AMONGUS - Speed IX
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_AMONGUS.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_AMONGUS.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 999, 9, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_AMONGUS.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.MOVEMENT_SPEED);
            }
        }
        
        // CAT - Night Vision II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.CAT.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.CAT.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.CAT.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.NIGHT_VISION);
            }
        }
        
        // TOTEM_GHAST - Regeneration IV + Fire Resistance IV
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_GHAST.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_GHAST.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999, 3, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_GHAST.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.REGENERATION);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.FIRE_RESISTANCE);
                }
            }
        }
        
        // GOLEM_TOTEM - Resistance IV + Absorption IV
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.GOLEM_TOTEM.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.GOLEM_TOTEM.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999, 3, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.GOLEM_TOTEM.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.ABSORPTION);
                }
            }
        }
        
        // ELDEGUARDIANN - Night Vision II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.ELDEGUARDIANN.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.ELDEGUARDIANN.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.ELDEGUARDIANN.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.NIGHT_VISION);
            }
        }
        
        // HORSEE - Jump Boost VI + Haste II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.HORSEE.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.HORSEE.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.JUMP, 999, 5, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.HORSEE.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.JUMP);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DIG_SPEED);
                }
            }
        }
        
        // PHANTOM - Slow Falling II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.PHANTOM.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.PHANTOM.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.PHANTOM.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.SLOW_FALLING);
            }
        }
        
        // TOTEM_RAVAGER - Resistance IX + Strength III
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_RAVAGER.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_RAVAGER.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999, 8, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999, 2, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_RAVAGER.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_BOOST);
                }
            }
        }
        
        // TOTEM_SILVERFISH - Haste IV + Luck II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_SILVERFISH.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_SILVERFISH.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.LUCK, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_SILVERFISH.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DIG_SPEED);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.LUCK);
                }
            }
        }
        
        // TOTEM_SLIME - Jump Boost V
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_SLIME.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_SLIME.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.JUMP, 999, 4, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_SLIME.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.JUMP);
            }
        }
        
        // TENTACLED - Strength II + Water Breathing II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TENTACLED.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TENTACLED.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TENTACLED.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_BOOST);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.WATER_BREATHING);
                }
            }
        }
        
        // TOTEM_BLAZE - Fire Resistance II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEM_BLAZE.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEM_BLAZE.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEM_BLAZE.get() && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(MobEffects.FIRE_RESISTANCE);
            }
        }
        
        // TOTEMDEAD - Fire Resistance II + Resistance II + Jump Boost VIII + Water Breathing II + Absorption IV + Health Boost IV + Heal
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.TOTEMDEAD.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.TOTEMDEAD.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.JUMP, 999, 7, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.JUMP, 999, 7, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 999, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).setHealth(6.0f);
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.TOTEMDEAD.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.FIRE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.JUMP);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.JUMP);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.WATER_BREATHING);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.ABSORPTION);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.HEALTH_BOOST);
                }
            }
        }
        
        // WHITER - Resistance II + Absorption II
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.WHITER.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.WHITER.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 999, 1, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.WHITER.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.ABSORPTION);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.GLOWING);
                }
            }
        }
        
        // ENDERMITE_TOTEM - Resistance IV + Strength IV
        if (entity instanceof LivingEntity) {
            offhandItem = ((LivingEntity) entity).getOffhandItem();
        } else {
            offhandItem = ItemStack.EMPTY;
        }
        if (offhandItem.getItem() == KuromymodModItems.ENDERMITE_TOTEM.get()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                ItemStack stack = new ItemStack(KuromymodModItems.ENDERMITE_TOTEM.get());
                stack.setCount(1);
                livingEntity.setItemInHand(InteractionHand.OFF_HAND, stack);
                if (livingEntity instanceof Player) {
                    ((Player) livingEntity).getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999, 3, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999, 3, false, false));
            }
        } else {
            if (entity instanceof LivingEntity) {
                mainhandItem = ((LivingEntity) entity).getMainHandItem();
            } else {
                mainhandItem = ItemStack.EMPTY;
            }
            if (mainhandItem.getItem() == KuromymodModItems.ENDERMITE_TOTEM.get()) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.DAMAGE_BOOST);
                }
            }
        }
    }
}
