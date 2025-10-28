/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.UseAnim
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.totemsserverhardcore.item;

import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;

import java.util.List;
import net.mcreator.totemsserverhardcore.procedures.MASCOTAProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class JevilItem
extends Item {
    public JevilItem() {
        super(new Item.Properties().tab(KuromymodModTabs.SPECIAL_ITEMS).fireResistant().rarity(Rarity.EPIC));
    }

    public UseAnim m_6164_(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public int m_8105_(ItemStack itemstack) {
        return 32;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add((Component)Component.literal((String)"Mascota Jevil debora patatas"));
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder ar = super.use(world, entity, hand);
        ItemStack itemstack = (ItemStack)ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        MASCOTAProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
        return ar;
    }
}

