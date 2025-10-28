/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.geom.ModelLayerLocation
 *  net.minecraft.client.model.geom.ModelPart
 *  net.minecraft.client.model.geom.PartPose
 *  net.minecraft.client.model.geom.builders.CubeDeformation
 *  net.minecraft.client.model.geom.builders.CubeListBuilder
 *  net.minecraft.client.model.geom.builders.LayerDefinition
 *  net.minecraft.client.model.geom.builders.MeshDefinition
 *  net.minecraft.client.model.geom.builders.PartDefinition
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.totemsserverhardcore.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Modelhongito<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("kuromymod", "modelhongito"), "main");
    public final ModelPart head;
    public final ModelPart headwear;
    public final ModelPart headwear2;
    public final ModelPart nose;
    public final ModelPart body;
    public final ModelPart bodywear;
    public final ModelPart arms;
    public final ModelPart right_leg;
    public final ModelPart left_leg;

    public Modelhongito(ModelPart root) {
        this.head = root.getChild("head");
        this.headwear = root.getChild("headwear");
        this.headwear2 = root.getChild("headwear2");
        this.nose = root.getChild("nose");
        this.body = root.getChild("body");
        this.bodywear = root.getChild("bodywear");
        this.arms = root.getChild("arms");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition headwear2 = partdefinition.addOrReplaceChild("headwear2", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition rotation = headwear2.addOrReplaceChild("rotation", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-1.5708f, (float)0.0f, (float)0.0f));
        PartDefinition nose = partdefinition.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)-2.0f, (float)0.0f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20).addBox(-5.0f, 11.0f, -5.0f, 10.0f, 8.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition pant = body.addOrReplaceChild("pant", CubeListBuilder.create().texOffs(44, 9).addBox(-4.5f, 0.0f, -4.5f, 9.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(60, 1).addBox(3.0f, -3.0f, -6.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(68, 0).addBox(2.5f, -3.5f, -6.0f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(41, 20).addBox(-5.0f, -9.0f, -5.0f, 10.0f, 13.0f, 10.0f, new CubeDeformation(0.25f)), PartPose.offset((float)0.0f, (float)19.0f, (float)0.0f));
        PartDefinition body_head = body.addOrReplaceChild("body_head", CubeListBuilder.create().texOffs(31, 0).addBox(-4.0f, -11.0f, -4.0f, 8.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.0f, -10.0f, -5.0f, 10.0f, 9.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(88, 0).addBox(-5.0f, -12.0f, -5.0f, 10.0f, 10.0f, 10.0f, new CubeDeformation(0.5f)).texOffs(92, 40).addBox(-4.5f, -13.0f, -4.5f, 9.0f, 3.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition bone = body_head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(94, 22).addBox(-8.0f, -8.0f, -0.5f, 16.0f, 16.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)-9.0f, (float)0.5f, (float)-1.5708f, (float)0.0f, (float)0.0f));
        PartDefinition head_leave = body_head.addOrReplaceChild("head_leave", CubeListBuilder.create().texOffs(17, 39).addBox(-2.5f, -35.0f, -2.5f, 5.0f, 12.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 39).addBox(-2.0f, -38.0f, -2.0f, 4.0f, 15.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-5.0f, -32.0f, 0.0f, 10.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 107).addBox(-7.5f, -25.0f, -7.5f, 15.0f, 2.0f, 15.0f, new CubeDeformation(0.0f)).texOffs(0, 91).addBox(-6.5f, -26.0f, -6.5f, 13.0f, 1.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(44, 105).addBox(-10.5f, -23.0f, -10.5f, 21.0f, 2.0f, 21.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition body_sub_4 = head_leave.addOrReplaceChild("body_sub_4", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(0.0f, -32.0f, -5.0f, 0.0f, 9.0f, 10.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition head_eyebrow = body_head.addOrReplaceChild("head_eyebrow", CubeListBuilder.create().texOffs(42, 10).addBox(-5.5f, -19.0f, -6.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition body_sub_6 = head_eyebrow.addOrReplaceChild("body_sub_6", CubeListBuilder.create().texOffs(42, 10).mirror().addBox(2.5f, -19.0f, -6.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition eye = body_head.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(42, 13).addBox(-5.5f, -1.5f, -5.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)-3.0f, (float)0.0f));
        PartDefinition body_sub_8 = eye.addOrReplaceChild("body_sub_8", CubeListBuilder.create().texOffs(42, 13).mirror().addBox(3.5f, -1.5f, -5.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition fisher = body.addOrReplaceChild("fisher", CubeListBuilder.create().texOffs(0, 69).addBox(2.0f, -14.0f, 0.0f, 5.0f, 0.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 76).addBox(2.0f, -14.0f, 6.0f, 6.0f, 13.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)24.0f, (float)0.0f));
        PartDefinition right = body.addOrReplaceChild("right", CubeListBuilder.create().texOffs(31, 22).addBox(-6.5f, 0.0f, -2.0f, 3.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset((float)2.0f, (float)20.0f, (float)0.0f));
        PartDefinition left = body.addOrReplaceChild("left", CubeListBuilder.create().texOffs(31, 22).addBox(3.5f, 0.0f, -2.0f, 3.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-2.0f, (float)20.0f, (float)0.0f));
        PartDefinition armR = body.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(82, 27).addBox(-8.0f, 0.0f, -0.1f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(82, 35).addBox(-7.7f, 4.0f, -1.1f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(82, 22).addBox(-7.0f, -1.0f, -1.1f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)11.5f, (float)0.15f));
        PartDefinition hammer2 = armR.addOrReplaceChild("hammer2", CubeListBuilder.create().texOffs(24, 80).addBox(-1.0f, -2.5f, -2.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-6.5f, (float)5.0f, (float)-3.0f));
        PartDefinition body_sub_14 = hammer2.addOrReplaceChild("body_sub_14", CubeListBuilder.create().texOffs(13, 80).mirror().addBox(-0.5f, -0.5f, -3.0f, 1.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition knife2 = armR.addOrReplaceChild("knife2", CubeListBuilder.create().texOffs(38, 74).addBox(-7.0f, 4.5f, -2.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition body_sub_16 = knife2.addOrReplaceChild("body_sub_16", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-6.5f, 4.5f, -8.0f, 0.0f, 4.0f, 7.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition farmer2 = armR.addOrReplaceChild("farmer2", CubeListBuilder.create().texOffs(36, 65).addBox(-7.0f, 5.5f, -13.0f, 1.0f, 1.0f, 23.0f, new CubeDeformation(0.0f)).texOffs(62, 81).addBox(-9.0f, 5.5f, -12.5f, 5.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)-1.0f, (float)0.2f));
        PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)11.5f, (float)0.15f));
        PartDefinition arms_sub_2 = armL.addOrReplaceChild("arms_sub_2", CubeListBuilder.create().texOffs(82, 27).mirror().addBox(6.0f, 0.0f, -0.1f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(82, 35).mirror().addBox(5.7f, 4.0f, -1.1f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(82, 22).mirror().addBox(5.0f, -1.0f, -1.1f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition book2 = armL.addOrReplaceChild("book2", CubeListBuilder.create().texOffs(42, 56).addBox(5.3f, 2.0f, -4.0f, 1.0f, 5.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition bodywear = partdefinition.addOrReplaceChild("bodywear", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)11.0f, (float)0.0f));
        PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)6.0f, (float)0.3f));
        PartDefinition arms_rotation = arms.addOrReplaceChild("arms_rotation", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)4.0f, (float)0.0f));
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset((float)-2.0f, (float)12.0f, (float)0.0f));
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset((float)2.0f, (float)12.0f, (float)0.0f));
        return LayerDefinition.create((MeshDefinition)meshdefinition, (int)128, (int)128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.headwear2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.bodywear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.left_leg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.right_leg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
        this.arms.xRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
    }
}

