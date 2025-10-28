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

public class ModelGolem<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("kuromymod", "model_golem"), "main");
    public final ModelPart body;
    public final ModelPart head;
    public final ModelPart right_arm;
    public final ModelPart left_arm;
    public final ModelPart right_leg;
    public final ModelPart left_leg;

    public ModelGolem(ModelPart root) {
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.right_arm = root.getChild("right_arm");
        this.left_arm = root.getChild("left_arm");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 28).addBox(-5.0f, 12.0f, -5.0f, 10.0f, 8.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)-7.0f, (float)0.0f));
        PartDefinition salad = body.addOrReplaceChild("salad", CubeListBuilder.create().texOffs(13, 106).addBox(-7.0f, -19.0f, -7.0f, 14.0f, 8.0f, 14.0f, new CubeDeformation(0.5f)).texOffs(69, 100).addBox(-6.0f, -19.0f, -6.0f, 12.0f, 8.0f, 12.0f, new CubeDeformation(0.5f)).texOffs(111, 123).addBox(6.0f, -14.0f, -7.0f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(85, 123).addBox(5.0f, -13.8f, -8.0f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(85, 123).addBox(-3.0f, -14.8f, 5.0f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(85, 123).addBox(-9.0f, -13.8f, 0.0f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(120, 123).addBox(-8.0f, -14.0f, 1.0f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(102, 122).addBox(-2.0f, -15.0f, 6.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)31.0f, (float)0.0f));
        PartDefinition bone3 = salad.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(105, 96).addBox(0.0f, -8.0f, -3.0f, 0.0f, 8.0f, 8.0f, new CubeDeformation(0.5f)), PartPose.offsetAndRotation((float)7.0f, (float)-11.0f, (float)4.0f, (float)0.0f, (float)-0.4363f, (float)0.5236f));
        PartDefinition bowl = body.addOrReplaceChild("bowl", CubeListBuilder.create().texOffs(44, 50).addBox(-6.0f, -7.0f, -6.0f, 12.0f, 1.0f, 12.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)31.0f, (float)0.0f));
        PartDefinition bowl_s = bowl.addOrReplaceChild("bowl_s", CubeListBuilder.create().texOffs(55, 81).addBox(-7.0f, -12.0f, 8.0f, 14.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 55).addBox(-9.0f, -13.0f, 9.0f, 18.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(-10.0f, -13.0f, 7.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(55, 71).addBox(-10.0f, -12.0f, 6.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(10, 49).addBox(-12.0f, -13.0f, 8.0f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(25, 65).addBox(-7.0f, -8.0f, 5.0f, 14.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-5.0f, -7.0f, 5.0f, 10.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)0.0f, (float)1.0f));
        PartDefinition bowl_e = bowl.addOrReplaceChild("bowl_e", CubeListBuilder.create().texOffs(55, 81).addBox(-7.0f, -12.0f, 8.5f, 14.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 55).addBox(-9.0f, -13.0f, 9.5f, 18.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(-10.0f, -13.0f, 7.5f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(55, 71).addBox(-10.0f, -12.0f, 6.5f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(10, 49).addBox(-12.0f, -13.0f, 8.5f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(25, 65).addBox(-7.0f, -8.0f, 5.5f, 14.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-5.0f, -7.0f, 5.5f, 10.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.5f, (float)0.0f, (float)0.0f, (float)0.0f, (float)1.5708f, (float)0.0f));
        PartDefinition bowl_n = bowl.addOrReplaceChild("bowl_n", CubeListBuilder.create().texOffs(55, 81).addBox(-7.0f, -12.0f, 9.0f, 14.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 55).addBox(-9.0f, -13.0f, 10.0f, 18.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(-10.0f, -13.0f, 8.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(55, 71).addBox(-10.0f, -12.0f, 7.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(10, 49).addBox(-12.0f, -13.0f, 9.0f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(25, 65).addBox(-7.0f, -8.0f, 6.0f, 14.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-5.0f, -7.0f, 6.0f, 10.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)0.0f, (float)0.0f, (float)0.0f, (float)-3.1416f, (float)0.0f, (float)3.1416f));
        PartDefinition bowl_w = bowl.addOrReplaceChild("bowl_w", CubeListBuilder.create().texOffs(55, 81).addBox(-7.0f, -12.0f, 8.5f, 14.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 55).addBox(-9.0f, -13.0f, 9.5f, 18.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(-10.0f, -13.0f, 7.5f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(55, 71).addBox(-10.0f, -12.0f, 6.5f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(10, 49).addBox(-12.0f, -13.0f, 8.5f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(25, 65).addBox(-7.0f, -8.0f, 5.5f, 14.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-5.0f, -7.0f, 5.5f, 10.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-0.5f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-1.5708f, (float)0.0f));
        PartDefinition bowl3 = bowl.addOrReplaceChild("bowl3", CubeListBuilder.create().texOffs(0, 69).addBox(-9.0f, -11.8f, -9.0f, 18.0f, 4.0f, 18.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition veggie_armL = body.addOrReplaceChild("veggie_armL", CubeListBuilder.create(), PartPose.offset((float)5.0f, (float)12.5f, (float)0.0f));
        PartDefinition body_sub_9 = veggie_armL.addOrReplaceChild("body_sub_9", CubeListBuilder.create().texOffs(32, 7).mirror().addBox(1.0f, 0.0f, 0.05f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(32, 15).mirror().addBox(0.7f, 4.0f, -0.95f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(32, 2).mirror().addBox(0.0f, -1.0f, -0.95f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition veggie_armR = body.addOrReplaceChild("veggie_armR", CubeListBuilder.create().texOffs(32, 2).addBox(-2.0f, -1.0f, -0.95f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(32, 15).addBox(-2.7f, 4.0f, -0.95f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(32, 7).addBox(-3.0f, 0.0f, 0.05f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-5.0f, (float)12.5f, (float)0.0f, (float)-0.5942f, (float)0.474f, (float)0.5942f));
        PartDefinition veggie = body.addOrReplaceChild("veggie", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition body_head = veggie.addOrReplaceChild("body_head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -11.0f, -4.0f, 8.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 9).addBox(-5.0f, -10.0f, -5.0f, 10.0f, 9.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)1.0f, (float)0.0f));
        PartDefinition bone = body_head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation((float)0.0f, (float)-9.0f, (float)0.5f, (float)-1.5708f, (float)0.0f, (float)0.0f));
        PartDefinition head_leave = body_head.addOrReplaceChild("head_leave", CubeListBuilder.create().texOffs(108, 9).addBox(-2.5f, -35.0f, -2.5f, 5.0f, 12.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(42, 9).addBox(-2.0f, -38.0f, -2.0f, 4.0f, 15.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(42, 0).addBox(-5.0f, -32.0f, 0.0f, 10.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 32).addBox(-7.5f, -25.0f, -7.5f, 15.0f, 2.0f, 15.0f, new CubeDeformation(0.0f)).texOffs(73, 33).addBox(-6.5f, -26.0f, -6.5f, 13.0f, 1.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(44, 9).addBox(-10.5f, -23.0f, -10.5f, 21.0f, 2.0f, 21.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition body_sub_4 = head_leave.addOrReplaceChild("body_sub_4", CubeListBuilder.create().texOffs(62, -10).mirror().addBox(0.0f, -32.0f, -5.0f, 0.0f, 9.0f, 10.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition head_eyebrow = body_head.addOrReplaceChild("head_eyebrow", CubeListBuilder.create().texOffs(0, 1).addBox(-5.5f, -19.0f, -6.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)12.0f, (float)0.0f));
        PartDefinition body_sub_6 = head_eyebrow.addOrReplaceChild("body_sub_6", CubeListBuilder.create().texOffs(0, 1).mirror().addBox(2.5f, -19.0f, -6.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition eye = body_head.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(0, 4).addBox(-5.5f, -1.5f, -5.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset((float)0.0f, (float)-3.0f, (float)0.0f));
        PartDefinition body_sub_8 = eye.addOrReplaceChild("body_sub_8", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(3.5f, -1.5f, -5.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset((float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)-7.0f, (float)-2.0f));
        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)-7.0f, (float)0.0f));
        PartDefinition bone2 = right_arm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 117).addBox(-1.3502f, -8.3259f, -1.5606f, 3.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 92).addBox(-0.8502f, 8.6741f, -0.5606f, 2.0f, 9.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 103).addBox(-0.8502f, 0.6741f, -1.0606f, 2.0f, 10.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 107).addBox(-1.8502f, 15.6741f, -1.0606f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 110).addBox(-2.8502f, 16.6741f, -1.0606f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 100).addBox(-2.8502f, 19.6741f, -1.0606f, 6.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 100).addBox(-2.8502f, 19.6741f, -1.0606f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 96).addBox(-2.8502f, 23.6741f, -1.5606f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 100).addBox(2.1498f, 19.6741f, -1.0606f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 96).addBox(2.1498f, 23.6741f, -1.5606f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 96).addBox(0.4498f, 23.6741f, -1.5606f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 100).addBox(0.4498f, 19.6741f, -1.0606f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 96).addBox(-1.1502f, 23.6741f, -1.5606f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 100).addBox(-1.1502f, 19.6741f, -1.0606f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation((float)-10.0f, (float)16.0f, (float)-2.0f, (float)-1.0908f, (float)0.0f, (float)0.8727f));
        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset((float)0.0f, (float)-7.0f, (float)0.0f));
        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(1, 72).addBox(-2.0f, 7.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset((float)-4.0f, (float)11.0f, (float)0.0f));
        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(1, 72).addBox(-3.0f, 7.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset((float)5.0f, (float)11.0f, (float)0.0f));
        return LayerDefinition.create((MeshDefinition)meshdefinition, (int)128, (int)128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.right_arm.xRot = Mth.cos((float)(limbSwing * 0.6662f + (float)Math.PI)) * limbSwingAmount;
        this.left_leg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * -1.0f * limbSwingAmount;
        this.left_arm.xRot = Mth.cos((float)(limbSwing * 0.6662f)) * limbSwingAmount;
        this.right_leg.xRot = Mth.cos((float)(limbSwing * 1.0f)) * 1.0f * limbSwingAmount;
    }
}

