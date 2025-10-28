package net.mcreator.totemsserverhardcore.item;

import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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

public class FrostswordItem extends SwordItem {
    public FrostswordItem() {
        super(new Tier(){

            public int getUses() {
                return 1500;
            }

            public float getSpeed() {
                return 4.0f;
            }

            public float getAttackDamageBonus() {
                return 7.0f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 3, -2.4f, new Item.Properties().tab(KuromymodModTabs.WEAPONS).fireResistant());
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("Espada de hielo que congela enemigos"));
    }
    
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);
        
        // Apply freezing effect (Slowness IV for 5 seconds)
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 3));
        target.setTicksFrozen(200);  // Freeze for 10 seconds
        
        return result;
    }
}
