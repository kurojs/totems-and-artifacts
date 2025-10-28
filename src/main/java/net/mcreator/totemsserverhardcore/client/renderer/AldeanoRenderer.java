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
import net.mcreator.totemsserverhardcore.entity.AldeanoEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AldeanoRenderer
extends MobRenderer<AldeanoEntity, Modelhongito<AldeanoEntity>> {
    public AldeanoRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelhongito(context.bakeLayer(Modelhongito.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(AldeanoEntity entity) {
        return new ResourceLocation("kuromymod:textures/entities/taiga.png");
    }
}

