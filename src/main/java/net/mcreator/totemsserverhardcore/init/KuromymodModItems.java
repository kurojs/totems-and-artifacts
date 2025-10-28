/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.common.ForgeSpawnEggItem
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.init.KuromymodModBlocks;
import net.mcreator.totemsserverhardcore.init.KuromymodModEntities;
import net.mcreator.totemsserverhardcore.item.CatItem;
import net.mcreator.totemsserverhardcore.item.CoinItem;
import net.mcreator.totemsserverhardcore.item.ELDEGUARDIANNItem;
import net.mcreator.totemsserverhardcore.item.EndermiteTotemItem;
import net.mcreator.totemsserverhardcore.item.EnderswordItem;
import net.mcreator.totemsserverhardcore.item.Evento0Item;
import net.mcreator.totemsserverhardcore.item.FrostswordItem;
import net.mcreator.totemsserverhardcore.item.GolemTotemItem;
import net.mcreator.totemsserverhardcore.item.HorseeItem;
import net.mcreator.totemsserverhardcore.item.JevilItem;
import net.mcreator.totemsserverhardcore.item.MobCoinItem;
import net.mcreator.totemsserverhardcore.item.PhantomItem;
import net.mcreator.totemsserverhardcore.item.PruebaItem;
import net.mcreator.totemsserverhardcore.item.TentacledItem;
import net.mcreator.totemsserverhardcore.item.TotemAMONGUSItem;
import net.mcreator.totemsserverhardcore.item.TotemBlazeItem;
import net.mcreator.totemsserverhardcore.item.TotemGhastItem;
import net.mcreator.totemsserverhardcore.item.TotemRavagerItem;
import net.mcreator.totemsserverhardcore.item.TotemSilverfishItem;
import net.mcreator.totemsserverhardcore.item.TotemSlimeItem;
import net.mcreator.totemsserverhardcore.item.TotemardillaItem;
import net.mcreator.totemsserverhardcore.item.TotemdeadItem;
import net.mcreator.totemsserverhardcore.item.TotemnutriaItem;
import net.mcreator.totemsserverhardcore.item.VillacoinerItem;
import net.mcreator.totemsserverhardcore.item.WhiterItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class KuromymodModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ITEMS, (String)"kuromymod");
    public static final RegistryObject<Item> PHANTOM = REGISTRY.register("phantom", () -> new PhantomItem());
    public static final RegistryObject<Item> TOTEMNUTRIA = REGISTRY.register("totemnutria", () -> new TotemnutriaItem());
    public static final RegistryObject<Item> TOTEMARDILLA = REGISTRY.register("totemardilla", () -> new TotemardillaItem());
    public static final RegistryObject<Item> WHITER = REGISTRY.register("whiter", () -> new WhiterItem());
    public static final RegistryObject<Item> TOTEMDEAD = REGISTRY.register("totemdead", () -> new TotemdeadItem());
    public static final RegistryObject<Item> HORSEE = REGISTRY.register("horsee", () -> new HorseeItem());
    public static final RegistryObject<Item> TOTEM_AMONGUS = REGISTRY.register("totem_amongus", () -> new TotemAMONGUSItem());
    public static final RegistryObject<Item> ELDEGUARDIANN = REGISTRY.register("eldeguardiann", () -> new ELDEGUARDIANNItem());
    public static final RegistryObject<Item> ENDERMITE_TOTEM = REGISTRY.register("endermite_totem", () -> new EndermiteTotemItem());
    public static final RegistryObject<Item> CAT = REGISTRY.register("cat", () -> new CatItem());
    public static final RegistryObject<Item> TENTACLED = REGISTRY.register("tentacled", () -> new TentacledItem());
    public static final RegistryObject<Item> TOTEM_SLIME = REGISTRY.register("totem_slime", () -> new TotemSlimeItem());
    public static final RegistryObject<Item> GOLEM_TOTEM = REGISTRY.register("golem_totem", () -> new GolemTotemItem());
    public static final RegistryObject<Item> TOTEM_SILVERFISH = REGISTRY.register("totem_silverfish", () -> new TotemSilverfishItem());
    public static final RegistryObject<Item> TOTEM_GHAST = REGISTRY.register("totem_ghast", () -> new TotemGhastItem());
    public static final RegistryObject<Item> TOTEM_RAVAGER = REGISTRY.register("totem_ravager", () -> new TotemRavagerItem());
    public static final RegistryObject<Item> TOTEM_BLAZE = REGISTRY.register("totem_blaze", () -> new TotemBlazeItem());
    public static final RegistryObject<Item> FROSTSWORD = REGISTRY.register("frostsword", () -> new FrostswordItem());
    public static final RegistryObject<Item> ENDERSWORD = REGISTRY.register("endersword", () -> new EnderswordItem());
    public static final RegistryObject<Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
    public static final RegistryObject<Item> VILLACOINER = REGISTRY.register("villacoiner", () -> new VillacoinerItem());
    public static final RegistryObject<Item> MOB_COIN = REGISTRY.register("mob_coin", () -> new MobCoinItem());
    public static final RegistryObject<Item> EVENTO_0 = REGISTRY.register("evento_0", () -> new Evento0Item());
    public static final RegistryObject<Item> PRUEBA = REGISTRY.register("prueba", () -> new PruebaItem());
    public static final RegistryObject<Item> JEVIL = REGISTRY.register("jevil", () -> new JevilItem());
    public static final RegistryObject<Item> ALDEANO = REGISTRY.register("aldeano_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANO, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ALDEANOPINA = REGISTRY.register("aldeanopina_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANOPINA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ALDEANOCACTUS = REGISTRY.register("aldeanocactus_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANOCACTUS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ALDEANOCALABAZA = REGISTRY.register("aldeanocalabaza_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANOCALABAZA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    // public static final RegistryObject<Item> ALDEANOZOMBIE = REGISTRY.register("aldeanozombie_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANOZOMBIE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ALDEANOHONGOMALO = REGISTRY.register("aldeanohongomalo_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.ALDEANOHONGOMALO, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEM = REGISTRY.register("golem_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEM, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEMUVA = REGISTRY.register("golemuva_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEMUVA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEMTOMATE = REGISTRY.register("golemtomate_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEMTOMATE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEMCACTUS = REGISTRY.register("golemcactus_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEMCACTUS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEM_CALABAZA = REGISTRY.register("golem_calabaza_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEM_CALABAZA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GOLEM_HONGO = REGISTRY.register("golem_hongo_spawn_egg", () -> new ForgeSpawnEggItem(KuromymodModEntities.GOLEM_HONGO, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> HOJAS = KuromymodModItems.block(KuromymodModBlocks.HOJAS, CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem((Block)block.get(), new Item.Properties().tab(tab)));
    }
}

