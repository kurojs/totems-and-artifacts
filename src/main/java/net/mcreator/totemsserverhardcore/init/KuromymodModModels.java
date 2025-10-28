/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterLayerDefinitions
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.client.model.ModelGolem;
import net.mcreator.totemsserverhardcore.client.model.Modelcactus;
import net.mcreator.totemsserverhardcore.client.model.Modelcalabaza;
import net.mcreator.totemsserverhardcore.client.model.Modelhongito;
import net.mcreator.totemsserverhardcore.client.model.Modelpi\u00f1a;
// import net.mcreator.totemsserverhardcore.client.model.Modelzombie;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class KuromymodModModels {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modelcalabaza.LAYER_LOCATION, Modelcalabaza::createBodyLayer);
        event.registerLayerDefinition(Modelhongito.LAYER_LOCATION, Modelhongito::createBodyLayer);
        // event.registerLayerDefinition(Modelzombie.LAYER_LOCATION, Modelzombie::createBodyLayer);
        event.registerLayerDefinition(Modelcactus.LAYER_LOCATION, Modelcactus::createBodyLayer);
        event.registerLayerDefinition(Modelpi\u00f1a.LAYER_LOCATION, Modelpi\u00f1a::createBodyLayer);
        event.registerLayerDefinition(ModelGolem.LAYER_LOCATION, ModelGolem::createBodyLayer);
    }
}

