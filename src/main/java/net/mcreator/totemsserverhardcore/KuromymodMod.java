/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.event.TickEvent$ServerTickEvent
 *  net.minecraftforge.eventbus.api.IEventBus
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
 *  net.minecraftforge.network.NetworkEvent$Context
 *  net.minecraftforge.network.NetworkRegistry
 *  net.minecraftforge.network.simple.SimpleChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.mcreator.totemsserverhardcore;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.mcreator.totemsserverhardcore.init.KuromymodModBlocks;
import net.mcreator.totemsserverhardcore.init.KuromymodModEntities;
import net.mcreator.totemsserverhardcore.init.KuromymodModItems;
import net.mcreator.totemsserverhardcore.init.KuromymodModMobEffects;
import net.mcreator.totemsserverhardcore.init.KuromymodModPotions;
import net.mcreator.totemsserverhardcore.init.KuromymodModSounds;
import net.mcreator.totemsserverhardcore.init.KuromymodModTabs;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value="kuromymod")
public class KuromymodMod {
    public static final Logger LOGGER = LogManager.getLogger(KuromymodMod.class);
    public static final String MODID = "kuromymod";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel((ResourceLocation)new ResourceLocation("kuromymod", "kuromymod"), () -> "1", "1"::equals, "1"::equals);
    private static int messageID = 0;
    private static final List<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ArrayList<AbstractMap.SimpleEntry<Runnable, Integer>>();

    public KuromymodMod() {
        // Inicializar tabs primero
        KuromymodModTabs.load();
        
        MinecraftForge.EVENT_BUS.register((Object)this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        KuromymodModSounds.REGISTRY.register(bus);
        KuromymodModBlocks.REGISTRY.register(bus);
        KuromymodModItems.REGISTRY.register(bus);
        KuromymodModEntities.REGISTRY.register(bus);
        KuromymodModMobEffects.REGISTRY.register(bus);
        KuromymodModPotions.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        ++messageID;
    }

    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new AbstractMap.SimpleEntry<Runnable, Integer>(action, tick));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue((Integer)work.getValue() - 1);
                if ((Integer)work.getValue() == 0) {
                    actions.add(work);
                }
            });
            actions.forEach(e -> ((Runnable)e.getKey()).run());
            workQueue.removeAll(actions);
        }
    }
}

