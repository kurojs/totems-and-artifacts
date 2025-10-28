/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.totemsserverhardcore.client.renderer;

import net.mcreator.totemsserverhardcore.client.model.Modelcalabaza;
import net.mcreator.totemsserverhardcore.entity.AldeanocalabazaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AldeanocalabazaRenderer
extends MobRenderer<AldeanocalabazaEntity, Modelcalabaza<AldeanocalabazaEntity>> {
    public AldeanocalabazaRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelcalabaza(context.bakeLayer(Modelcalabaza.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(AldeanocalabazaEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/snow.png");
    }
}

