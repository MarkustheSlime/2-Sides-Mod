package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.InfluenceMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class InfluenceMatrixModel extends AnimatedGeoModel<InfluenceMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(InfluenceMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/imb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(InfluenceMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/influence_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(InfluenceMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/influence_matrix.png");
    }
}