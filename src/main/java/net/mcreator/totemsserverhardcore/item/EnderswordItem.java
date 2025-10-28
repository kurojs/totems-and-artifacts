package net.mcreator.totemsserverhardcore.item;

import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import net.mcreator.totemsserverhardcore.procedures.EnderProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class EnderswordItem extends SwordItem {
    
    private static final HashMap<UUID, Long> COOLDOWNS = new HashMap<>();
    private static final int COOLDOWN_TICKS = 100; // 5 segundos
    private static final double ATTACK_RADIUS = 5.0;

    public EnderswordItem() {
        super(new Tier(){

            public int getUses() {
                return 1500;
            }

            public float getSpeed() {
                return 4.0f;
            }

            public float getAttackDamageBonus() {
                return 12.0f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 2;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 3, -3.0f, new Item.Properties().tab(KuromymodModTabs.WEAPONS).fireResistant());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        
        if (world.isClientSide) {
            return InteractionResultHolder.success(itemStack);
        }
        
        // Check cooldown
        UUID playerId = player.getUUID();
        long currentTime = world.getGameTime();
        
        if (COOLDOWNS.containsKey(playerId)) {
            long lastUse = COOLDOWNS.get(playerId);
            if (currentTime - lastUse < COOLDOWN_TICKS) {
                int remainingSeconds = (int) ((COOLDOWN_TICKS - (currentTime - lastUse)) / 20);
                player.displayClientMessage(Component.literal("Cooldown: " + remainingSeconds + "s"), true);
                return InteractionResultHolder.fail(itemStack);
            }
        }
        
        // Attack nearby entities
        AABB searchBox = new AABB(
            player.getX() - ATTACK_RADIUS, player.getY() - ATTACK_RADIUS, player.getZ() - ATTACK_RADIUS,
            player.getX() + ATTACK_RADIUS, player.getY() + ATTACK_RADIUS, player.getZ() + ATTACK_RADIUS
        );
        
        List<LivingEntity> nearbyEntities = world.getEntitiesOfClass(LivingEntity.class, searchBox,
            entity -> entity != player && entity.isAlive());
        
        for (LivingEntity target : nearbyEntities) {
            target.hurt(DamageSource.playerAttack(player), 8.0f);
        }
        
        // Teleport player
        EnderProcedure.execute(player);
        
        // Set cooldown
        COOLDOWNS.put(playerId, currentTime);
        
        // Damage item
        itemStack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
        
        return InteractionResultHolder.success(itemStack);
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("Forjada mediante un poder que reside en la vida endermaniana"));
        list.add(Component.literal("Click derecho: Ataca enemigos cercanos y teletransporta"));
    }
}