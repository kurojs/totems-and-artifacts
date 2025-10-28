package net.mcreator.totemsserverhardcore.item;

import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class HorseeItem extends Item {
    public HorseeItem() {
        super(new Item.Properties().tab(KuromymodModTabs.TOTEMS).stacksTo(64).rarity(Rarity.COMMON));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(Component.literal("Caballo especial"));
    }
}
