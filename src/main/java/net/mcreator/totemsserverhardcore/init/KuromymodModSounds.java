/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.totemsserverhardcore.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class KuromymodModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.SOUND_EVENTS, (String)"kuromymod");
    public static final RegistryObject<SoundEvent> MEMORY = REGISTRY.register("memory", () -> new SoundEvent(new ResourceLocation("kuromymod", "memory")));
    public static final RegistryObject<SoundEvent> MAGIA = REGISTRY.register("magia", () -> new SoundEvent(new ResourceLocation("kuromymod", "magia")));
    public static final RegistryObject<SoundEvent> INTRO = REGISTRY.register("intro", () -> new SoundEvent(new ResourceLocation("kuromymod", "intro")));
    public static final RegistryObject<SoundEvent> INICIO = REGISTRY.register("inicio", () -> new SoundEvent(new ResourceLocation("kuromymod", "inicio")));
    public static final RegistryObject<SoundEvent> DESPERTAR = REGISTRY.register("despertar", () -> new SoundEvent(new ResourceLocation("kuromymod", "despertar")));
    public static final RegistryObject<SoundEvent> POP = REGISTRY.register("pop", () -> new SoundEvent(new ResourceLocation("kuromymod", "pop")));
}

