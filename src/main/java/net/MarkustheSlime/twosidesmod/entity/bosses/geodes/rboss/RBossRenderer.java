package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.rboss;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.PrimalMatrixBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RBossRenderer extends GeoEntityRenderer<RBossEntity> {
    public RBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RBossModel());
        this.shadowRadius = 0.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(RBossEntity instance) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/rboss.png");
    }

    @Override
    public RenderType getRenderType(RBossEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}