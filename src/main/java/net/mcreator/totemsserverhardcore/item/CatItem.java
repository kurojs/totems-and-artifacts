package net.mcreator.totemsserverhardcore.item;

import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;
import net.mcreator.totemsserverhardcore.procedures.UNIVERSOProcedure;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CatItem extends Item {
    public CatItem() {
        super(new Item.Properties().tab(KuromymodModTabs.TOTEMS).stacksTo(64).rarity(Rarity.EPIC));
    }

    @OnlyIn(value=Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("nya"));
    }

    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        UNIVERSOProcedure.execute(entity);
    }
}
