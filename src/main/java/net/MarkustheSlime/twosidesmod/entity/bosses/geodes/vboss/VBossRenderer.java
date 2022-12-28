package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.vboss;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VBossRenderer extends GeoEntityRenderer<VBossEntity> {
    public VBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VBossModel());
        this.shadowRadius = 3.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(VBossEntity instance) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/vboss.png");
    }

    @Override
    public RenderType getRenderType(VBossEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}