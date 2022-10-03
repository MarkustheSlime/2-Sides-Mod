package net.MarkustheSlime.twosidesmod.entity.deep_gorgon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DeepGorgonRenderer extends GeoEntityRenderer<DeepGorgonEntity> {
    public DeepGorgonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DeepGorgonModel());
        this.shadowRadius = 2.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(DeepGorgonEntity instance) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/deep_gorgon.png");
    }

    @Override
    public RenderType getRenderType(DeepGorgonEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}