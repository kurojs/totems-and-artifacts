/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.totemsserverhardcore.client.renderer;

import net.mcreator.totemsserverhardcore.client.model.ModelGolem;
import net.mcreator.totemsserverhardcore.entity.GolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GolemRenderer
extends MobRenderer<GolemEntity, ModelGolem<GolemEntity>> {
    public GolemRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelGolem(context.bakeLayer(ModelGolem.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(GolemEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/iron_golem.png");
    }
}

