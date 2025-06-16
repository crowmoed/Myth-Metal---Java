package net.pinto.mythandmetal.entity.mobs.arbinator;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.entity.client.ModModelLayers;

public class ArborinatorRenderer extends MobRenderer<ArborinatorEntity, ArborinatorModel<ArborinatorEntity>> {

    public ArborinatorRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ArborinatorModel<>(pContext.bakeLayer(ModModelLayers.ARBINATOR_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ArborinatorEntity pEntity) {
        return  new ResourceLocation(MythandMetal.MOD_ID, "textures/entity/arbinator.png");
    }
    @Override
    public void render(ArborinatorEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }



}
