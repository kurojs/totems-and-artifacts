/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.totemsserverhardcore.client.renderer;

import net.mcreator.totemsserverhardcore.client.model.Modelcactus;
import net.mcreator.totemsserverhardcore.entity.AldeanocactusEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AldeanocactusRenderer
extends MobRenderer<AldeanocactusEntity, Modelcactus<AldeanocactusEntity>> {
    public AldeanocactusRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelcactus(context.bakeLayer(Modelcactus.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(AldeanocactusEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/desert.png");
    }
}

