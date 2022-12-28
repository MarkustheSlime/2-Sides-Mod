package net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MoonStoneAngelRenderer extends GeoEntityRenderer<MoonStoneAngelEntity> {
    public MoonStoneAngelRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MoonStoneAngelModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(MoonStoneAngelEntity instance) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/moonshard_angel.png");
    }

    @Override
    public RenderType getRenderType(MoonStoneAngelEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
