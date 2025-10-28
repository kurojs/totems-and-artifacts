/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.totemsserverhardcore.client.renderer;

import net.mcreator.totemsserverhardcore.client.model.Modelhongito;
import net.mcreator.totemsserverhardcore.entity.AldeanohongomaloEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AldeanohongomaloRenderer
extends MobRenderer<AldeanohongomaloEntity, Modelhongito<AldeanohongomaloEntity>> {
    public AldeanohongomaloRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhongito(context.bakeLayer(Modelhongito.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(AldeanohongomaloEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/taigamalo.png");
    }
}

