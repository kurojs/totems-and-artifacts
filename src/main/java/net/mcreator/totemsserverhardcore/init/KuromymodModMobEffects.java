/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.potion.RevivirMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class KuromymodModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.MOB_EFFECTS, (String)"kuromymod");
    public static final RegistryObject<MobEffect> REVIVIR = REGISTRY.register("revivir", () -> new RevivirMobEffect());
}

