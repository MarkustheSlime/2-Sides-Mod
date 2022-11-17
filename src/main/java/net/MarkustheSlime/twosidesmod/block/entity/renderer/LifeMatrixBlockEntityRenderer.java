package net.MarkustheSlime.twosidesmod.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.block.entity.LifeMatrixBlockEntity;
import net.MarkustheSlime.twosidesmod.block.entity.SoulMatrixBlockEntity;
import net.MarkustheSlime.twosidesmod.block.entity.model.LifeMatrixModel;
import net.MarkustheSlime.twosidesmod.block.entity.model.SoulMatrixModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class LifeMatrixBlockEntityRenderer extends GeoBlockRenderer<LifeMatrixBlockEntity> {

    public LifeMatrixBlockEntityRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
        super(rendererDispatcherIn, new LifeMatrixModel());
    }

    @Override
    public RenderType getRenderType(LifeMatrixBlockEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }

    @Override
    public void renderEarly(LifeMatrixBlockEntity animatable, PoseStack stackIn, float ticks,
                            MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn,
                            float red, float green, float blue, float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
    }
}
