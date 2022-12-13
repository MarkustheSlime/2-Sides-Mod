package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.sboss;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SBossRenderer extends GeoEntityRenderer<SBossEntity> {
    public SBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SBossModel());
        this.shadowRadius = 2.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(SBossEntity instance) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/sboss.png");
    }

    @Override
    public RenderType getRenderType(SBossEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}