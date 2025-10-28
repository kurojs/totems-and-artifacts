package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.KuromymodMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class KuromymodModTabs {
    
    // Tab de Totems
    public static final CreativeModeTab TOTEMS = new CreativeModeTab("kuromymod_totems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(KuromymodModItems.TOTEM_AMONGUS.get());
        }
    };
    
    // Tab de Armas
    public static final CreativeModeTab WEAPONS = new CreativeModeTab("kuromymod_weapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(KuromymodModItems.FROSTSWORD.get());
        }
    };
    
    // Tab de Items Especiales
    public static final CreativeModeTab SPECIAL_ITEMS = new CreativeModeTab("kuromymod_special_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(KuromymodModItems.COIN.get());
        }
    };
    
    // Tab de Bloques
    public static final CreativeModeTab BLOCKS = new CreativeModeTab("kuromymod_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(KuromymodModItems.HOJAS.get());
        }
    };
    
    public static void load() {
        // Las tabs se inicializan estáticamente, este método solo asegura la carga
    }
}
