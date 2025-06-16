package net.pinto.mythandmetal.entity.mobs.Magmaraakh;// Made with Blockbench 4.12.4
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

public class MagmaraakhModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart LavaGolem;
	private final ModelPart UpperBody;
	private final ModelPart Head;
	private final ModelPart Crown2;
	private final ModelPart Horns;
	private final ModelPart Horns2;
	private final ModelPart Skull;
	private final ModelPart Eyelids;
	private final ModelPart Jaw;
	private final ModelPart Chest;
	private final ModelPart LowerBack;
	private final ModelPart Waist;
	private final ModelPart Tail;
	private final ModelPart UpperTail;
	private final ModelPart LowerTail;
	private final ModelPart LeftArmbase;
	private final ModelPart UpperBack;
	private final ModelPart RightArmBase;
	private final ModelPart LeftArm;
	private final ModelPart LeftShoulder;
	private final ModelPart LeftForearm;
	private final ModelPart LeftHand;
	private final ModelPart Fingers;
	private final ModelPart LeftThumb;
	private final ModelPart LeftThumb2;
	private final ModelPart LeftPointer;
	private final ModelPart LeftPointer2;
	private final ModelPart LeftPinkie;
	private final ModelPart bone;
	private final ModelPart RightArm;
	private final ModelPart RightShoulder;
	private final ModelPart RightForearm;
	private final ModelPart RightHand;
	private final ModelPart Fingers2;
	private final ModelPart RightThumb;
	private final ModelPart RightThumb2;
	private final ModelPart RightPointer;
	private final ModelPart RightPointer2;
	private final ModelPart RightPinkie;
	private final ModelPart bone2;
	private final ModelPart LeftLeg;
	private final ModelPart LeftThigh;
	private final ModelPart LeftAnkle;
	private final ModelPart LeftFoot;
	private final ModelPart LeftPointToe;
	private final ModelPart LeftPinkieToe;
	private final ModelPart LeftBackToe;
	private final ModelPart Right_Leg;
	private final ModelPart Right_Thigh;
	private final ModelPart Right_Ankle;
	private final ModelPart Right_Foot;
	private final ModelPart Right_Point_Toe;
	private final ModelPart Right_Pinkie_Toe;
	private final ModelPart Right_Back_Toe;

	public MagmaraakhModel(ModelPart root) {
		this.LavaGolem = root.getChild("lavaGolem");
		this.UpperBody = this.LavaGolem.getChild("UpperBody");
		this.Head = this.UpperBody.getChild("Head");
		this.Crown2 = this.Head.getChild("Crown2");
		this.Horns = this.Head.getChild("Horns");
		this.Horns2 = this.Head.getChild("Horns2");
		this.Skull = this.Head.getChild("Skull");
		this.Eyelids = this.Skull.getChild("Eyelids");
		this.Jaw = this.Head.getChild("Jaw");
		this.Chest = this.UpperBody.getChild("Chest");
		this.LowerBack = this.Chest.getChild("LowerBack");
		this.Waist = this.Chest.getChild("Waist");
		this.Tail = this.Chest.getChild("Tail");
		this.UpperTail = this.Tail.getChild("UpperTail");
		this.LowerTail = this.Tail.getChild("LowerTail");
		this.LeftArmbase = this.Chest.getChild("LeftArmbase");
		this.UpperBack = this.Chest.getChild("UpperBack");
		this.RightArmBase = this.Chest.getChild("RightArmBase");
		this.LeftArm = this.UpperBody.getChild("LeftArm");
		this.LeftShoulder = this.LeftArm.getChild("LeftShoulder");
		this.LeftForearm = this.LeftArm.getChild("LeftForearm");
		this.LeftHand = this.LeftForearm.getChild("LeftHand");
		this.Fingers = this.LeftHand.getChild("Fingers");
		this.LeftThumb = this.Fingers.getChild("LeftThumb");
		this.LeftThumb2 = this.LeftThumb.getChild("LeftThumb2");
		this.LeftPointer = this.Fingers.getChild("LeftPointer");
		this.LeftPointer2 = this.LeftPointer.getChild("LeftPointer2");
		this.LeftPinkie = this.Fingers.getChild("LeftPinkie");
		this.bone = this.LeftPinkie.getChild("bone");
		this.RightArm = this.UpperBody.getChild("RightArm");
		this.RightShoulder = this.RightArm.getChild("RightShoulder");
		this.RightForearm = this.RightArm.getChild("RightForearm");
		this.RightHand = this.RightForearm.getChild("RightHand");
		this.Fingers2 = this.RightHand.getChild("Fingers2");
		this.RightThumb = this.Fingers2.getChild("RightThumb");
		this.RightThumb2 = this.RightThumb.getChild("RightThumb2");
		this.RightPointer = this.Fingers2.getChild("RightPointer");
		this.RightPointer2 = this.RightPointer.getChild("RightPointer2");
		this.RightPinkie = this.Fingers2.getChild("RightPinkie");
		this.bone2 = this.RightPinkie.getChild("bone2");
		this.LeftLeg = this.LavaGolem.getChild("LeftLeg");
		this.LeftThigh = this.LeftLeg.getChild("LeftThigh");
		this.LeftAnkle = this.LeftLeg.getChild("LeftAnkle");
		this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
		this.LeftPointToe = this.LeftFoot.getChild("LeftPointToe");
		this.LeftPinkieToe = this.LeftFoot.getChild("LeftPinkieToe");
		this.LeftBackToe = this.LeftFoot.getChild("LeftBackToe");
		this.Right_Leg = this.LavaGolem.getChild("Right_Leg");
		this.Right_Thigh = this.Right_Leg.getChild("Right_Thigh");
		this.Right_Ankle = this.Right_Leg.getChild("Right_Ankle");
		this.Right_Foot = this.Right_Leg.getChild("Right_Foot");
		this.Right_Point_Toe = this.Right_Foot.getChild("Right_Point_Toe");
		this.Right_Pinkie_Toe = this.Right_Foot.getChild("Right_Pinkie_Toe");
		this.Right_Back_Toe = this.Right_Foot.getChild("Right_Back_Toe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LavaGolem = partdefinition.addOrReplaceChild("lavaGolem", CubeListBuilder.create(), PartPose.offset(-10.0F, 24.0F, 9.0F));

		PartDefinition UpperBody = LavaGolem.addOrReplaceChild("UpperBody", CubeListBuilder.create(), PartPose.offset(10.0F, 0.0F, -9.0F));

		PartDefinition Head = UpperBody.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(-2.0F, -55.0F, -13.0F));

		PartDefinition Crown2 = Head.addOrReplaceChild("Crown2", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, -23.0F, -6.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r1 = Crown2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -11.0F, -9.0F, 15.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0265F, 8.4107F, 6.5F, 1.2509F, -1.4329F, -1.248F));

		PartDefinition cube_r2 = Crown2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -11.0F, -9.0F, 15.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0265F, 7.4107F, 15.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Crown2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -11.0F, -9.0F, 15.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.9735F, 8.4107F, 7.0F, 1.2509F, -1.4329F, -1.248F));

		PartDefinition cube_r4 = Crown2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0265F, 5.9107F, 14.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Crown2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0265F, 5.9107F, 11.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Crown2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0265F, 6.4107F, 6.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Crown2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 102).addBox(-17.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 102).addBox(-22.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 102).addBox(-26.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0265F, 6.9107F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Crown2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0265F, 5.6607F, 14.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Crown2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0265F, 6.9107F, 14.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Crown2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5265F, 6.4107F, 5.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Crown2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0265F, 5.9107F, 11.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Crown2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -12.0F, -9.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0265F, 5.4107F, 14.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Crown2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 102).addBox(-13.0F, -11.0F, -9.0F, 15.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0265F, 8.9107F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(-7.0F, 53.0F, 20.0F));

		PartDefinition cube_r14 = Horns.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 126).addBox(-8.1185F, 0.0822F, 7.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -82.75F, -34.0F, 0.1278F, 0.0283F, -0.2164F));

		PartDefinition cube_r15 = Horns.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 227).addBox(7.2887F, -2.1023F, 7.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5F, -88.5F, -34.75F, 0.1188F, -0.0552F, 0.4331F));

		PartDefinition Horns2 = Head.addOrReplaceChild("Horns2", CubeListBuilder.create(), PartPose.offsetAndRotation(17.5F, -24.0F, -4.0F, 2.9671F, 0.0436F, 3.1416F));

		PartDefinition cube_r16 = Horns2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(148, 224).addBox(-8.1185F, 0.0822F, 7.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.25F, -6.75F, -10.0F, 0.1278F, 0.0283F, -0.2164F));

		PartDefinition cube_r17 = Horns2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 227).addBox(7.2887F, -2.1023F, 7.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -12.5F, -10.75F, 0.1188F, -0.0552F, 0.4331F));

		PartDefinition Skull = Head.addOrReplaceChild("Skull", CubeListBuilder.create(), PartPose.offset(-7.0F, -3.0F, 5.0F));

		PartDefinition cube_r18 = Skull.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 24).addBox(-2.5F, -1.0F, 10.0F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.25F, -30.75F, -7.0F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Skull.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 158).addBox(-3.0F, -10.0F, 11.0F, 4.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.25F, -30.75F, -17.0F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Skull.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(164, 224).addBox(-3.0F, -10.0F, 11.0F, 4.0F, 18.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.25F, -5.75F, -37.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Skull.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(212, 138).addBox(-5.0F, -3.0513F, 11.2168F, 6.0F, 3.5F, 0.0F, new CubeDeformation(0.01F))
				.texOffs(212, 138).addBox(8.0F, -3.0513F, 11.2168F, 6.0F, 3.5F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.75F, -2.25F, -36.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Skull.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 84).addBox(-13.0F, -10.0F, -9.0F, 24.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.25F, -8.75F, -16.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Eyelids = Skull.addOrReplaceChild("Eyelids", CubeListBuilder.create(), PartPose.offset(4.25F, -5.75F, -36.0F));

		PartDefinition cube_r23 = Eyelids.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(198, 174).addBox(-6.0F, -4.0513F, 10.2168F, 8.0F, 5.5F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(198, 174).addBox(-20.0F, -4.0513F, 10.2168F, 8.0F, 5.5F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offset(4.25F, 2.25F, 0.0F));

		PartDefinition cube_r24 = Jaw.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(90, 65).addBox(-12.0F, -10.0F, -9.0F, 22.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -7.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Jaw.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 224).addBox(-13.0F, -13.0F, -9.0F, 1.0F, 5.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(218, 0).addBox(-38.0F, -13.0F, -9.0F, 1.0F, 5.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(90, 42).addBox(-37.0F, -10.0F, -9.0F, 24.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, 7.0F, -8.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Jaw.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(160, 88).addBox(-13.0F, -13.25F, -13.0F, 1.0F, 5.25F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.25F, -4.0F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition Chest = UpperBody.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offset(2.0F, -42.0F, 2.0F));

		PartDefinition LowerBack = Chest.addOrReplaceChild("LowerBack", CubeListBuilder.create(), PartPose.offset(-0.75F, 11.25F, 0.0F));

		PartDefinition cube_r27 = LowerBack.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(198, 158).addBox(-11.5F, -5.0F, -9.0F, 21.5F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -12.0F, -4.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r28 = LowerBack.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(124, 224).addBox(-2.0F, -1.0F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -25.0F, 14.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r29 = LowerBack.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(100, 224).addBox(-2.0F, -1.0F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -19.0F, 14.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r30 = LowerBack.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(76, 215).addBox(-2.0F, -1.0F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -13.0F, 14.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r31 = LowerBack.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 203).addBox(-2.0F, -1.0F, -9.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.0F, 14.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r32 = LowerBack.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 42).addBox(-13.0F, -10.0F, -9.0F, 24.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -12.0F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Waist = Chest.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(70, 152).addBox(-8.0F, -3.0F, -10.0F, 16.0F, 12.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.75F, 11.25F, 1.0F));

		PartDefinition Tail = Chest.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-0.75F, 22.25F, 13.0F));

		PartDefinition UpperTail = Tail.addOrReplaceChild("UpperTail", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, -4.0F));

		PartDefinition cube_r33 = UpperTail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(140, 152).addBox(-5.0F, -9.0F, -8.0F, 10.0F, 9.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LowerTail = Tail.addOrReplaceChild("LowerTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 12.0F));

		PartDefinition cube_r34 = LowerTail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(160, 118).addBox(-3.0F, -7.0F, -8.0F, 6.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftArmbase = Chest.addOrReplaceChild("LeftArmbase", CubeListBuilder.create(), PartPose.offset(13.25F, -6.75F, -4.0F));

		PartDefinition cube_r35 = LeftArmbase.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(104, 200).addBox(-8.0F, -10.0F, -1.0F, 9.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -3.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition UpperBack = Chest.addOrReplaceChild("UpperBack", CubeListBuilder.create(), PartPose.offset(-12.0F, 42.0F, 7.0F));

		PartDefinition cube_r36 = UpperBack.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 158).addBox(-2.5F, -1.75F, -17.0F, 3.0F, 2.75F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, -69.0F, -13.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r37 = UpperBack.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(104, 183).addBox(-2.5F, -1.75F, -5.0F, 3.0F, 2.75F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, -69.0F, -4.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r38 = UpperBack.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(224, 60).addBox(-2.5F, -1.75F, -5.0F, 3.0F, 2.75F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, -63.0F, -4.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r39 = UpperBack.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(218, 22).addBox(-2.5F, -1.75F, -5.0F, 3.0F, 2.75F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, -57.0F, -4.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r40 = UpperBack.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -10.0F, -9.0F, 28.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, -58.75F, -14.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition RightArmBase = Chest.addOrReplaceChild("RightArmBase", CubeListBuilder.create(), PartPose.offset(-9.5F, -6.75F, -4.0F));

		PartDefinition cube_r41 = RightArmBase.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(144, 200).addBox(-6.0F, -10.0F, -1.0F, 7.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArm = UpperBody.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(16.0F, -60.0F, -5.0F));

		PartDefinition LeftShoulder = LeftArm.addOrReplaceChild("LeftShoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, -4.0F, 0.8286F, 0.0322F, -0.5531F));

		PartDefinition cube_r42 = LeftShoulder.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(188, 180).addBox(-12.0F, 2.0F, -5.0F, 13.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.25F, 4.75F, 11.25F, 0.5672F, -0.829F, 1.5708F));

		PartDefinition cube_r43 = LeftShoulder.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 88).addBox(-12.0F, -10.0F, -5.0F, 17.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.25F, 9.25F, 3.75F, 0.9128F, 0.3715F, 0.4391F));

		PartDefinition cube_r44 = LeftShoulder.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 185).addBox(-12.0F, 2.0F, -5.0F, 12.25F, 2.0F, 13.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, 15.25F, 2.25F, 2.0944F, -0.829F, 1.5708F));

		PartDefinition LeftForearm = LeftArm.addOrReplaceChild("LeftForearm", CubeListBuilder.create(), PartPose.offsetAndRotation(9.5F, 13.0F, 0.0F, 0.8185F, -0.0084F, 0.1571F));

		PartDefinition cube_r45 = LeftForearm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(180, 210).addBox(4.0F, -10.0F, -3.0F, 2.0F, 12.75F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 15.75F, -5.75F, 1.413F, 0.7279F, 1.336F));

		PartDefinition cube_r46 = LeftForearm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(98, 0).addBox(-1.8349F, -0.5417F, -6.7924F, 17.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.25F, -5.25F, 1.413F, 0.7279F, 1.336F));

		PartDefinition cube_r47 = LeftForearm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(212, 85).addBox(4.0F, -10.0F, -3.0F, 2.0F, 12.75F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, 1.5F, 6.75F, 1.413F, 0.7279F, 1.336F));

		PartDefinition LeftHand = LeftForearm.addOrReplaceChild("LeftHand", CubeListBuilder.create(), PartPose.offset(7.75F, 16.0F, -13.0F));

		PartDefinition cube_r48 = LeftHand.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(168, 0).addBox(-1.2871F, 1.1071F, -3.5363F, 13.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.75F, -1.75F, -3.25F, 1.413F, 0.7279F, 1.336F));

		PartDefinition Fingers = LeftHand.addOrReplaceChild("Fingers", CubeListBuilder.create(), PartPose.offset(-35.0F, 36.0F, 23.0F));

		PartDefinition LeftThumb = Fingers.addOrReplaceChild("LeftThumb", CubeListBuilder.create(), PartPose.offset(27.25F, -30.75F, -30.25F));

		PartDefinition cube_r49 = LeftThumb.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(144, 32).addBox(-10.0F, -1.0F, -2.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.0F, -6.0F, 1.413F, 0.7279F, 1.336F));

		PartDefinition LeftThumb2 = LeftThumb.addOrReplaceChild("LeftThumb2", CubeListBuilder.create(), PartPose.offset(2.0F, 7.0F, -4.0F));

		PartDefinition cube_r50 = LeftThumb2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(182, 143).addBox(-2.6957F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, 1.2335F, 0.6741F, 1.0589F));

		PartDefinition LeftPointer = Fingers.addOrReplaceChild("LeftPointer", CubeListBuilder.create(), PartPose.offset(37.25F, -31.75F, -32.25F));

		PartDefinition cube_r51 = LeftPointer.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(122, 32).addBox(-1.5301F, 1.4556F, -3.4935F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.413F, 0.7279F, 1.336F));

		PartDefinition LeftPointer2 = LeftPointer.addOrReplaceChild("LeftPointer2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, -3.0F));

		PartDefinition cube_r52 = LeftPointer2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(202, 60).addBox(-2.6957F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5F, -1.0F, 1.6898F, 0.734F, 1.7475F));

		PartDefinition LeftPinkie = Fingers.addOrReplaceChild("LeftPinkie", CubeListBuilder.create(), PartPose.offset(39.25F, -27.75F, -28.25F));

		PartDefinition cube_r53 = LeftPinkie.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(122, 37).addBox(-0.8648F, 0.7183F, -3.6108F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.413F, 0.7279F, 1.336F));

		PartDefinition bone = LeftPinkie.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -5.0F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(216, 174).addBox(-2.6957F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.5F, 0.0F, 1.6898F, 0.734F, 1.7475F));

		PartDefinition RightArm = UpperBody.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-14.0F, -60.0F, -5.0F));

		PartDefinition RightShoulder = RightArm.addOrReplaceChild("RightShoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, -4.0F, 0.8286F, -0.0322F, 0.5531F));

		PartDefinition cube_r55 = RightShoulder.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(188, 180).mirror().addBox(-1.0F, 2.0F, -5.0F, 13.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.25F, 4.75F, 11.25F, 0.5672F, 0.829F, -1.5708F));

		PartDefinition cube_r56 = RightShoulder.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 88).mirror().addBox(-5.0F, -10.0F, -5.0F, 17.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.25F, 9.25F, 3.75F, 0.9128F, -0.3715F, -0.4391F));

		PartDefinition cube_r57 = RightShoulder.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 185).mirror().addBox(-0.25F, 2.0F, -5.0F, 12.25F, 2.0F, 13.25F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.25F, 15.25F, 2.25F, 2.0944F, 0.829F, -1.5708F));

		PartDefinition RightForearm = RightArm.addOrReplaceChild("RightForearm", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.5F, 13.0F, 0.0F, 0.8185F, 0.0084F, -0.1571F));

		PartDefinition cube_r58 = RightForearm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(180, 210).mirror().addBox(-6.0F, -10.0F, -3.0F, 2.0F, 12.75F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.75F, 15.75F, -5.75F, 1.413F, -0.7279F, -1.336F));

		PartDefinition cube_r59 = RightForearm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-15.1651F, -0.5417F, -6.7924F, 17.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.75F, 0.25F, -5.25F, 1.413F, -0.7279F, -1.336F));

		PartDefinition cube_r60 = RightForearm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(212, 85).mirror().addBox(-6.0F, -10.0F, -3.0F, 2.0F, 12.75F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.25F, 1.5F, 6.75F, 1.413F, -0.7279F, -1.336F));

		PartDefinition RightHand = RightForearm.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-7.75F, 16.0F, -13.0F));

		PartDefinition cube_r61 = RightHand.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(168, 0).mirror().addBox(-11.7129F, 1.1071F, -3.5363F, 13.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.75F, -1.75F, -3.25F, 1.413F, -0.7279F, -1.336F));

		PartDefinition Fingers2 = RightHand.addOrReplaceChild("Fingers2", CubeListBuilder.create(), PartPose.offset(35.0F, 36.0F, 23.0F));

		PartDefinition RightThumb = Fingers2.addOrReplaceChild("RightThumb", CubeListBuilder.create(), PartPose.offset(-27.25F, -30.75F, -30.25F));

		PartDefinition cube_r62 = RightThumb.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(144, 32).mirror().addBox(2.0F, -1.0F, -2.0F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.0F, -6.0F, 1.413F, -0.7279F, -1.336F));

		PartDefinition RightThumb2 = RightThumb.addOrReplaceChild("RightThumb2", CubeListBuilder.create(), PartPose.offset(-2.0F, 7.0F, -4.0F));

		PartDefinition cube_r63 = RightThumb2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(182, 143).mirror().addBox(-2.3043F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, 1.2335F, -0.6741F, -1.0589F));

		PartDefinition RightPointer = Fingers2.addOrReplaceChild("RightPointer", CubeListBuilder.create(), PartPose.offset(-37.25F, -31.75F, -32.25F));

		PartDefinition cube_r64 = RightPointer.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(122, 32).mirror().addBox(-6.4699F, 1.4556F, -3.4935F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 1.413F, -0.7279F, -1.336F));

		PartDefinition RightPointer2 = RightPointer.addOrReplaceChild("RightPointer2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, -3.0F));

		PartDefinition cube_r65 = RightPointer2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(202, 60).mirror().addBox(-2.3043F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.5F, -1.0F, 1.6898F, -0.734F, -1.7475F));

		PartDefinition RightPinkie = Fingers2.addOrReplaceChild("RightPinkie", CubeListBuilder.create(), PartPose.offset(-39.25F, -27.75F, -28.25F));

		PartDefinition cube_r66 = RightPinkie.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(122, 37).mirror().addBox(-7.1352F, 0.7183F, -3.6108F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.413F, -0.7279F, -1.336F));

		PartDefinition bone2 = RightPinkie.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -5.0F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(216, 174).mirror().addBox(-2.3043F, -1.3084F, -1.2571F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 3.5F, 0.0F, 1.6898F, -0.734F, -1.7475F));

		PartDefinition LeftLeg = LavaGolem.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(19.0F, -27.0F, -10.0F));

		PartDefinition LeftThigh = LeftLeg.addOrReplaceChild("LeftThigh", CubeListBuilder.create(), PartPose.offset(6.25F, 13.25F, 2.0F));

		PartDefinition cube_r68 = LeftThigh.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 200).addBox(-8.0F, -10.0F, -1.0F, 9.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition LeftAnkle = LeftLeg.addOrReplaceChild("LeftAnkle", CubeListBuilder.create(), PartPose.offset(6.25F, 13.25F, 2.0F));

		PartDefinition cube_r69 = LeftAnkle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(176, 65).addBox(-8.0F, -10.0F, -6.0F, 9.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create(), PartPose.offset(4.25F, 21.25F, -5.0F));

		PartDefinition cube_r70 = LeftFoot.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(180, 40).addBox(-8.0F, -10.0F, -6.0F, 9.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 10.0F, -2.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition LeftPointToe = LeftFoot.addOrReplaceChild("LeftPointToe", CubeListBuilder.create().texOffs(68, 227).addBox(-0.25F, -3.0F, -6.75F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 6.0F, -7.0F));

		PartDefinition LeftPinkieToe = LeftFoot.addOrReplaceChild("LeftPinkieToe", CubeListBuilder.create(), PartPose.offset(4.0F, 3.0F, -8.0F));

		PartDefinition cube_r71 = LeftPinkieToe.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(228, 40).addBox(-2.0946F, 1.0F, -3.865F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -1.0F, -1.25F, 0.0F, -0.3491F, 0.0F));

		PartDefinition LeftBackToe = LeftFoot.addOrReplaceChild("LeftBackToe", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.0F, 6.0F));

		PartDefinition cube_r72 = LeftBackToe.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(70, 143).addBox(-5.0F, -7.0F, -6.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 7.0F, 6.25F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Right_Leg = LavaGolem.addOrReplaceChild("Right_Leg", CubeListBuilder.create(), PartPose.offset(4.0F, -27.0F, -10.0F));

		PartDefinition Right_Thigh = Right_Leg.addOrReplaceChild("Right_Thigh", CubeListBuilder.create(), PartPose.offset(-6.25F, 13.25F, 2.0F));

		PartDefinition cube_r73 = Right_Thigh.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(38, 203).addBox(-1.0F, -10.0F, -1.0F, 9.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition Right_Ankle = Right_Leg.addOrReplaceChild("Right_Ankle", CubeListBuilder.create(), PartPose.offset(-6.25F, 13.25F, 2.0F));

		PartDefinition cube_r74 = Right_Ankle.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(140, 180).addBox(-1.0F, -10.0F, -6.0F, 9.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Right_Foot = Right_Leg.addOrReplaceChild("Right_Foot", CubeListBuilder.create(), PartPose.offset(-6.25F, 21.25F, -2.0F));

		PartDefinition cube_r75 = Right_Foot.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 183).addBox(-4.7085F, -1.0F, -13.7619F, 9.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Right_Point_Toe = Right_Foot.addOrReplaceChild("Right_Point_Toe", CubeListBuilder.create().texOffs(228, 48).addBox(-2.75F, -1.0F, -5.75F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 4.0F, -11.0F));

		PartDefinition Right_Pinkie_Toe = Right_Foot.addOrReplaceChild("Right_Pinkie_Toe", CubeListBuilder.create(), PartPose.offset(-2.0F, 3.0F, -11.0F));

		PartDefinition cube_r76 = Right_Pinkie_Toe.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(68, 235).addBox(-0.5634F, 0.0F, -4.8047F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.0F, -0.25F, 0.0F, 0.3491F, 0.0F));

		PartDefinition Right_Back_Toe = Right_Foot.addOrReplaceChild("Right_Back_Toe", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 4.0F));

		PartDefinition cube_r77 = Right_Back_Toe.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(86, 236).addBox(-2.9811F, -1.0F, -0.7857F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 12.0F, -0.75F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}




	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDefinitions.Walk, limbSwing, limbSwingAmount, 5f, 2.5f);


		this.animate(((MagmaraakhEntity) entity).attackAnimationState, ModAnimationDefinitions.Groundslam, ageInTicks, 1f);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LavaGolem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return LavaGolem;
	}
}