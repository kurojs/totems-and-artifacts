/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.Container
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.ExperienceOrb
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.item.enchantment.EnchantmentHelper
 *  net.minecraft.world.item.enchantment.Enchantments
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.totemsserverhardcore.procedures;

import java.util.Map;
import net.mcreator.totemsserverhardcore.KuromymodMod;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Container;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class MASCOTAProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        // Level world; // Removed - duplicate
        Player _player;
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack3 = _livEnt.getOffhandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (itemStack3.getItem() == Items.TOTEM_OF_UNDYING) {
            ItemStack itemStack4;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                itemStack4 = _livEnt.getMainHandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            if (itemStack4.getItem() == KuromymodModItems.JEVIL.get()) {
                Level _level2;
                Player _player2;
                if (entity instanceof Player) {
                    _player2 = (Player)entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike)Items.TOTEM_OF_UNDYING);
// TODO: Fix clearOrCountMatchingItems signature
        //                     _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1);
                }
                if (world instanceof Level) {
                    _level2 = (Level)world;
                    if (!_level2.isClientSide) {
// TODO: Fix playLocalSound parameters
        //                         _level2.playLocalSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.eat")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
_level2.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.eat")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    _level2 = (ServerLevel)world;
                    ((ServerLevel)_level2).sendParticles((ParticleOptions)ParticleTypes.ENCHANT, x, y, z, 1200, 3.0, 3.0, 3.0, 1.0);
                }
                KuromymodMod.queueServerWork(60, () -> {
                    ItemStack _ist;
                    // ServerLevel _level2; // Duplicate removed
                    if (world instanceof ServerLevel) {
                        // world = (ServerLevel)world; // Commented - lambda issue
//                         _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, world, 4, "", (Component)Component.literal((String)""), _level2.getServer(), null).withSuppressedOutput(), "give @p baked_potato 1");
                    }
                    if (world instanceof ServerLevel) {
                        // world = (ServerLevel)world; // Commented - lambda issue
//                         _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, world, 4, "", (Component)Component.literal((String)""), _level2.getServer(), null).withSuppressedOutput(), "tellraw @p [\"\",{\"text\":\"Delicioso\",\"color\":\"gold\"},{\"text\":\" :D!\",\"underlined\":true,\"color\":\"gold\"}]");
                    }
                    if ((_ist = itemstack).hurt(5, RandomSource.create(), null)) {
                        _ist.setCount(1);
                        _ist.setDamageValue(0);
                    }
                });
                if (!(entity instanceof Player)) return;
                _player2 = (Player)entity;
                _player2.getCooldowns().addCooldown(itemstack.getItem(), 100);
                return;
            }
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack2 = _livEnt.getOffhandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() != Items.APPLE) return;
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() != KuromymodModItems.JEVIL.get()) return;
        if (entity instanceof Player) {
            _player = (Player)entity;
            ItemStack _stktoremove = new ItemStack((ItemLike)Items.APPLE);
// TODO: Fix clearOrCountMatchingItems signature
        //             _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1);
        }
        itemstack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
        if (world instanceof Level && !((Level)world).isClientSide) {
            world.addFreshEntity((Entity)new ExperienceOrb((Level)world, x, y, z, 10));
        }
        KuromymodMod.queueServerWork(40, () -> {
            Map _enchantments = EnchantmentHelper.getEnchantments((ItemStack)itemstack);
            if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
                _enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
                EnchantmentHelper.setEnchantments((Map)_enchantments, (ItemStack)itemstack);
            }
            if (world instanceof ServerLevel) {
                ServerLevel _levelTemp = (ServerLevel)world;
//                 _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, world, 4, "", (Component)Component.literal((String)""), _level2.getServer(), null).withSuppressedOutput(), "/tellraw @p {\"text\":\"Reparado ;D!\",\"color\":\"green\"}");
            }
        });
        if (!(entity instanceof Player)) return;
        _player = (Player)entity;
        _player.getCooldowns().addCooldown(itemstack.getItem(), 100);
    }
}

