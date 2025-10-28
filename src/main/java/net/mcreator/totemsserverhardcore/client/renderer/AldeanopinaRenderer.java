/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.totemsserverhardcore.client.renderer;

import net.mcreator.totemsserverhardcore.client.model.Modelpi\u00f1a;
import net.mcreator.totemsserverhardcore.entity.AldeanopinaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AldeanopinaRenderer
extends MobRenderer<AldeanopinaEntity, Modelpi\u00f1a<AldeanopinaEntity>> {
    public AldeanopinaRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelpi\u00f1a(context.bakeLayer(Modelpi\u00f1a.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(AldeanopinaEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/.png");
    }
}

