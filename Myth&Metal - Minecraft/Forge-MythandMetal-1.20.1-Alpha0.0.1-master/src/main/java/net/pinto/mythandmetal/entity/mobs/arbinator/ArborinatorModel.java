package net.pinto.mythandmetal.entity.mobs.arbinator;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.MagmaraakhEntity;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.ModAnimationDefinitions;

public class ArborinatorModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart Arborinator;
	private final ModelPart Tail;
	private final ModelPart TailBase;
	private final ModelPart TailMiddle;
	private final ModelPart TailEnd;
	private final ModelPart LowerBody;
	private final ModelPart Left_Leg2;
	private final ModelPart Left_Calf2;
	private final ModelPart Left_Thigh2;
	private final ModelPart Ankle2;
	private final ModelPart Left_Back_Toe2;
	private final ModelPart Left_Toes2;
	private final ModelPart RightLeg;
	private final ModelPart RightCalf;
	private final ModelPart RightThigh;
	private final ModelPart Ankle;
	private final ModelPart RightBackToe;
	private final ModelPart RightToes;
	private final ModelPart LowerEnd;
	private final ModelPart LowerUpper;
	private final ModelPart LowerBase;
	private final ModelPart UpperBody;
	private final ModelPart Upper1;
	private final ModelPart Upper2;
	private final ModelPart Upper3;
	private final ModelPart Upper4;
	private final ModelPart Head;
	private final ModelPart Jaw;

	public ArborinatorModel(ModelPart root) {
		this.Arborinator = root.getChild("Arborinator");
		this.Tail = this.Arborinator.getChild("Tail");
		this.TailBase = this.Tail.getChild("TailBase");
		this.TailMiddle = this.Tail.getChild("TailMiddle");
		this.TailEnd = this.Tail.getChild("TailEnd");
		this.LowerBody = this.Arborinator.getChild("LowerBody");
		this.Left_Leg2 = this.LowerBody.getChild("Left_Leg2");
		this.Left_Calf2 = this.Left_Leg2.getChild("Left_Calf2");
		this.Left_Thigh2 = this.Left_Leg2.getChild("Left_Thigh2");
		this.Ankle2 = this.Left_Leg2.getChild("Ankle2");
		this.Left_Back_Toe2 = this.Ankle2.getChild("Left_Back_Toe2");
		this.Left_Toes2 = this.Ankle2.getChild("Left_Toes2");
		this.RightLeg = this.LowerBody.getChild("RightLeg");
		this.RightCalf = this.RightLeg.getChild("RightCalf");
		this.RightThigh = this.RightLeg.getChild("RightThigh");
		this.Ankle = this.RightLeg.getChild("Ankle");
		this.RightBackToe = this.Ankle.getChild("RightBackToe");
		this.RightToes = this.Ankle.getChild("RightToes");
		this.LowerEnd = this.LowerBody.getChild("LowerEnd");
		this.LowerUpper = this.LowerBody.getChild("LowerUpper");
		this.LowerBase = this.LowerBody.getChild("LowerBase");
		this.UpperBody = this.Arborinator.getChild("UpperBody");
		this.Upper1 = this.UpperBody.getChild("Upper1");
		this.Upper2 = this.UpperBody.getChild("Upper2");
		this.Upper3 = this.UpperBody.getChild("Upper3");
		this.Upper4 = this.UpperBody.getChild("Upper4");
		this.Head = this.Arborinator.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Arborinator = partdefinition.addOrReplaceChild("Arborinator", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 4.25F));

		PartDefinition Tail = Arborinator.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 3.25F, 20.0F));

		PartDefinition TailBase = Tail.addOrReplaceChild("TailBase", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = TailBase.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 38).addBox(-3.75F, -12.0F, -5.0F, 7.5F, 15.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.0F));

		PartDefinition TailMiddle = Tail.addOrReplaceChild("TailMiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = TailMiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 37).addBox(-2.75F, -12.0F, -4.5F, 5.5F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 12.0F, 1.5272F, 0.0F, 0.0F));

		PartDefinition TailEnd = Tail.addOrReplaceChild("TailEnd", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = TailEnd.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 43).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 2.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.25F, 20.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r4 = TailEnd.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(41, 42).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.25F, 26.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r5 = TailEnd.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 22.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r6 = TailEnd.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, 27.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r7 = TailEnd.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.25F, 25.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r8 = TailEnd.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(43, 42).addBox(0.0F, -5.75F, -3.75F, 0.0F, 2.5F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.25F, 23.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r9 = TailEnd.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 41).addBox(-2.25F, -12.0F, -3.75F, 4.5F, 15.0F, 4.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, 23.0F, 1.8762F, 0.0F, 0.0F));

		PartDefinition LowerBody = Arborinator.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -1.25F));

		PartDefinition Left_Leg2 = LowerBody.addOrReplaceChild("Left_Leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 3.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Left_Calf2 = Left_Leg2.addOrReplaceChild("Left_Calf2", CubeListBuilder.create(), PartPose.offset(2.9581F, 4.75F, -1.9089F));

		PartDefinition cube_r10 = Left_Calf2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 38).addBox(-2.75F, -6.0F, -2.0F, 4.5F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Left_Thigh2 = Left_Leg2.addOrReplaceChild("Left_Thigh2", CubeListBuilder.create().texOffs(36, 36).addBox(1.0F, -12.0F, 1.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0419F, 7.0F, -5.9089F));

		PartDefinition Ankle2 = Left_Leg2.addOrReplaceChild("Ankle2", CubeListBuilder.create(), PartPose.offset(2.9581F, 12.25F, -1.6589F));

		PartDefinition cube_r11 = Ankle2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 38).addBox(-2.75F, -6.0F, -1.0F, 4.5F, 8.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Left_Back_Toe2 = Ankle2.addOrReplaceChild("Left_Back_Toe2", CubeListBuilder.create(), PartPose.offset(1.5F, -0.75F, 0.75F));

		PartDefinition cube_r12 = Left_Back_Toe2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(209, 238).addBox(-2.75F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0864F, 0.0009F, 0.0075F));

		PartDefinition Left_Toes2 = Ankle2.addOrReplaceChild("Left_Toes2", CubeListBuilder.create(), PartPose.offset(1.5F, -0.25F, -4.25F));

		PartDefinition cube_r13 = Left_Toes2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(209, 238).addBox(-2.75F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.5F, 0.1309F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = Left_Toes2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(209, 238).addBox(-2.5F, 0.0F, -0.5F, 1.25F, 3.0F, 4.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.75F, 0.2182F, -0.0436F, 0.0F));

		PartDefinition cube_r15 = Left_Toes2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(209, 238).addBox(-2.75F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2191F, 0.0009F, 0.0075F));

		PartDefinition RightLeg = LowerBody.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, 7.0F, -3.25F, 0.0F, 0.0873F, 0.0F));

		PartDefinition RightCalf = RightLeg.addOrReplaceChild("RightCalf", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.25F, 4.0F));

		PartDefinition cube_r16 = RightCalf.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(39, 38).mirror().addBox(-1.75F, -6.0F, -2.0F, 4.5F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition RightThigh = RightLeg.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(-6.0F, -12.0F, 1.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Ankle = RightLeg.addOrReplaceChild("Ankle", CubeListBuilder.create(), PartPose.offset(-4.0F, 5.25F, 4.25F));

		PartDefinition cube_r17 = Ankle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(47, 38).mirror().addBox(-1.75F, -6.0F, -1.0F, 4.5F, 8.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition RightBackToe = Ankle.addOrReplaceChild("RightBackToe", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.75F, 0.75F));

		PartDefinition cube_r18 = RightBackToe.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(209, 238).mirror().addBox(1.5F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0864F, -0.0009F, -0.0075F));

		PartDefinition RightToes = Ankle.addOrReplaceChild("RightToes", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.25F, -4.25F));

		PartDefinition cube_r19 = RightToes.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(209, 238).mirror().addBox(1.5F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 0.0F, 0.5F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition cube_r20 = RightToes.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(214, 239).mirror().addBox(1.25F, 0.0F, -0.5F, 1.25F, 3.0F, 4.75F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.75F, 0.2182F, 0.0436F, 0.0F));

		PartDefinition cube_r21 = RightToes.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(209, 238).mirror().addBox(1.5F, 0.0F, -0.5F, 1.25F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2191F, -0.0009F, -0.0075F));

		PartDefinition LowerEnd = LowerBody.addOrReplaceChild("LowerEnd", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 9.25F));

		PartDefinition cube_r22 = LowerEnd.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 34).addBox(-5.25F, -12.0F, -6.0F, 10.5F, 15.0F, 9.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.0F));

		PartDefinition LowerUpper = LowerBody.addOrReplaceChild("LowerUpper", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 9.25F));

		PartDefinition cube_r23 = LowerUpper.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(25, 33).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -5.75F, -14.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LowerBase = LowerBody.addOrReplaceChild("LowerBase", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 9.25F));

		PartDefinition cube_r24 = LowerBase.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(26, 34).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 9.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition UpperBody = Arborinator.addOrReplaceChild("UpperBody", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -10.25F));

		PartDefinition Upper1 = UpperBody.addOrReplaceChild("Upper1", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -0.5F));

		PartDefinition cube_r25 = Upper1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 35).addBox(-5.5F, -12.0F, -5.25F, 11.0F, 12.0F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Upper2 = UpperBody.addOrReplaceChild("Upper2", CubeListBuilder.create(), PartPose.offset(0.0F, 27.0F, 17.0F));

		PartDefinition cube_r26 = Upper2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(29, 35).addBox(-5.25F, -13.25F, -5.25F, 10.5F, 13.25F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -35.5F, -14.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Upper3 = UpperBody.addOrReplaceChild("Upper3", CubeListBuilder.create(), PartPose.offset(0.0F, 27.0F, 17.0F));

		PartDefinition cube_r27 = Upper3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(43, 41).addBox(-5.0F, -13.25F, -5.25F, 10.0F, 13.25F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -46.0F, -13.75F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Upper4 = UpperBody.addOrReplaceChild("Upper4", CubeListBuilder.create(), PartPose.offset(0.0F, 27.0F, 17.0F));

		PartDefinition cube_r28 = Upper4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(30, 35).addBox(-4.5F, -13.25F, -5.25F, 9.0F, 13.25F, 8.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -56.0F, -15.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Head = Arborinator.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9581F, -48.0F, -18.1589F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 38).addBox(-4.5F, -11.25F, -5.25F, 1.0F, 5.25F, 5.5F, new CubeDeformation(0.0F))
				.texOffs(33, 38).addBox(5.5F, -11.25F, -5.25F, 1.0F, 5.25F, 5.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9581F, -1.0F, -0.0912F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 233).addBox(-5.5F, -12.25F, -5.25F, 3.0F, 2.25F, 5.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2919F, 3.0F, 10.1588F, 0.7132F, 0.3751F, 0.3069F));

		PartDefinition cube_r31 = Head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(8, 230).mirror().addBox(1.5F, -12.25F, -5.25F, 4.0F, 4.25F, 5.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9581F, 4.0F, 6.9088F, 0.6931F, -0.3085F, -0.247F));

		PartDefinition cube_r32 = Head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(8, 230).mirror().addBox(2.5F, -12.25F, -5.25F, 3.0F, 2.25F, 5.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.2081F, 3.0F, 10.1588F, 0.7132F, -0.3751F, -0.3069F));

		PartDefinition cube_r33 = Head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(8, 230).addBox(-5.5F, -12.25F, -5.25F, 4.0F, 4.25F, 5.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0419F, 4.0F, 6.9088F, 0.6931F, 0.3085F, 0.247F));

		PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(10, 33).addBox(-4.5F, -11.25F, -7.25F, 9.0F, 11.25F, 6.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9581F, -8.0F, -7.0912F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 54).addBox(-5.0F, -10.75F, -7.25F, 10.0F, 10.75F, 10.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9581F, 1.0F, -0.0912F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9581F, 0.75F, -13.3412F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(66, 54).addBox(-4.5F, -11.25F, -5.25F, 9.0F, 11.25F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.75F, 0.75F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(195, 238).addBox(-1.0F, -2.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -9.5F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r38 = Jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(196, 239).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, -9.5F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r39 = Jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(196, 239).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 0.0F, -9.5F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r40 = Jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(196, 239).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 0.0F, -8.5F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition cube_r41 = Jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(196, 239).mirror().addBox(0.0F, -2.75F, -1.0F, 1.0F, 2.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, 0.0F, -6.5F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition cube_r42 = Jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(195, 239).mirror().addBox(0.0F, -2.25F, -1.0F, 2.0F, 2.25F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, -1.0F, -3.5F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition cube_r43 = Jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(196, 239).mirror().addBox(-0.25F, -2.0F, -1.0F, 1.25F, 1.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.75F, -1.5F, -1.0F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition cube_r44 = Jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(196, 239).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 0.0F, -8.5F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r45 = Jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(196, 239).addBox(3.8815F, -0.9178F, -1.0F, 1.25F, 1.5F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(195, 239).addBox(0.3325F, -1.2207F, -1.0F, 2.0F, 2.25F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(196, 239).addBox(-1.8128F, -1.3938F, -1.0F, 1.0F, 2.75F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(196, 239).addBox(-3.7654F, -1.0767F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(196, 239).addBox(-4.7417F, -1.2931F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(195, 238).addBox(-4.7417F, -1.2931F, 2.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(196, 239).addBox(-4.7417F, -1.2931F, 5.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -4.5F, -4.0F, -1.5708F, -1.3526F, 1.5708F));

		PartDefinition cube_r46 = Jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(196, 239).mirror().addBox(2.7654F, -1.0767F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(196, 239).mirror().addBox(0.8128F, -1.3938F, -8.5F, 1.0F, 2.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(195, 239).mirror().addBox(-2.3325F, -1.2207F, -8.5F, 2.0F, 2.25F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(196, 239).mirror().addBox(-5.1315F, -0.9178F, -8.5F, 1.25F, 1.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.75F, -4.5F, -4.0F, -1.5708F, 1.3526F, -1.5708F));

		PartDefinition cube_r47 = Jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(196, 239).addBox(-1.0F, -2.0F, -1.0F, 1.25F, 1.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -1.5F, -1.0F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r48 = Jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(196, 239).addBox(-1.0F, -2.75F, -1.0F, 1.0F, 2.75F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, 0.0F, -6.5F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition cube_r49 = Jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(195, 239).addBox(-2.0F, -2.25F, -1.0F, 2.0F, 2.25F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.75F, -1.0F, -3.5F, 1.5708F, -1.3526F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 272, 272);
	}




	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ArborinatorDefinitions.arb_walk, limbSwing, limbSwingAmount, 10f, 2.5f);

		this.animate(((ArborinatorEntity) entity).attackAnimationState, ArborinatorDefinitions.attack, ageInTicks, 1f);

	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Arborinator.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Arborinator;
	}
}