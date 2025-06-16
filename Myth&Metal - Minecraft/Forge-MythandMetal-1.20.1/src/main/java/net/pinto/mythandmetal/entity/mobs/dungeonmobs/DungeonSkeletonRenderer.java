package net.pinto.mythandmetal.entity.mobs.dungeonmobs;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import org.joml.Vector3f;

public class DungeonSkeletonRenderer extends SkeletonRenderer {
    public DungeonSkeletonRenderer(EntityRendererProvider.Context p_174380_) {
        super(p_174380_);
    }

    private static final ResourceLocation SKELETON_LOCATION = new ResourceLocation("mythandmetal:textures/entity/lava_skeleton.png");


    public ResourceLocation getTextureLocation(AbstractSkeleton pEntity) {
        return SKELETON_LOCATION;
    }

    @Override
    protected void scale(AbstractSkeleton skeleton, PoseStack poseStack, float partialTicks) {
        // Force full brightness (no shadows)
        RenderSystem.setShaderLights(
                new Vector3f(1.0F, 1.0F, 1.0F),  // Light direction (doesn't matter)
                new Vector3f(1.0F, 1.0F, 1.0F)   // Ambient light (full brightness)
        );
    }

    @Override
    public void render(AbstractSkeleton entity, float yaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        // Override packedLight to MAX (15728640 = full brightness)
        super.render(entity, yaw, partialTicks, poseStack, buffer, 15728640);
    }
}
