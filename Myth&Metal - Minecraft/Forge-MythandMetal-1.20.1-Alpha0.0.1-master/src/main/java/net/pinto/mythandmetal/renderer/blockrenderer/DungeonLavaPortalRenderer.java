package net.pinto.mythandmetal.renderer.blockrenderer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.pinto.mythandmetal.renderer.GlintRenderers;

public class DungeonLavaPortalRenderer extends DungeonPortalRenderer {


    public DungeonLavaPortalRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }
    protected RenderType renderType() {
        return GlintRenderers.getDungeonLavaLightPortal();
    }
}
