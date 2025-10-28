/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.item.alchemy.Potion
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.init.KuromymodModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class KuromymodModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.POTIONS, (String)"kuromymod");
    public static final RegistryObject<Potion> LAMENTO_RESUCITADOR = REGISTRY.register("lamento_resucitador", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance((MobEffect)KuromymodModMobEffects.REVIVIR.get(), 10, 0, false, false)}));
}

