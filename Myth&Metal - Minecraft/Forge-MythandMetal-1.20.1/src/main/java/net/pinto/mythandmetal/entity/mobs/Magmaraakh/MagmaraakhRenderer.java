package net.pinto.mythandmetal.entity.mobs.Magmaraakh;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.entity.client.ModModelLayers;

public class MagmaraakhRenderer extends MobRenderer<MagmaraakhEntity, MagmaraakhModel<MagmaraakhEntity>> {

    public MagmaraakhRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MagmaraakhModel<>(pContext.bakeLayer(ModModelLayers.MAGMARAAKH_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MagmaraakhEntity pEntity) {
        return  new ResourceLocation(MythandMetal.MOD_ID, "textures/entity/maghmaraakh.png");
    }
    @Override
    public void render(MagmaraakhEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}
