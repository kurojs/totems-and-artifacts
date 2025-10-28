/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.EntityType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterRenderers
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.totemsserverhardcore.init;

import net.mcreator.totemsserverhardcore.client.renderer.AldeanoRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.AldeanocactusRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.AldeanocalabazaRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.AldeanohongomaloRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.AldeanopinaRenderer;
// import net.mcreator.totemsserverhardcore.client.renderer.AldeanozombieRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemCalabazaRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemHongoRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemcactusRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemtomateRenderer;
import net.mcreator.totemsserverhardcore.client.renderer.GolemuvaRenderer;
import net.mcreator.totemsserverhardcore.init.KuromymodModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class KuromymodModEntityRenderers {
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANO.get(), AldeanoRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANOPINA.get(), AldeanopinaRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANOCACTUS.get(), AldeanocactusRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANOCALABAZA.get(), AldeanocalabazaRenderer::new);
//         event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANOZOMBIE.get(), AldeanozombieRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.ALDEANOHONGOMALO.get(), AldeanohongomaloRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEM.get(), GolemRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEMUVA.get(), GolemuvaRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEMTOMATE.get(), GolemtomateRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEMCACTUS.get(), GolemcactusRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEM_CALABAZA.get(), GolemCalabazaRenderer::new);
        event.registerEntityRenderer((EntityType)KuromymodModEntities.GOLEM_HONGO.get(), GolemHongoRenderer::new);
    }
}

