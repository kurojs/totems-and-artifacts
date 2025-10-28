/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.block.HojasBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class KuromymodModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.BLOCKS, (String)"kuromymod");
    public static final RegistryObject<Block> HOJAS = REGISTRY.register("hojas", () -> new HojasBlock());
}

