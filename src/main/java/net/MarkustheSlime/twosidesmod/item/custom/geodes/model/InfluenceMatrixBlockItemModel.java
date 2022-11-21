package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.InfluenceMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class InfluenceMatrixBlockItemModel extends AnimatedGeoModel<InfluenceMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(InfluenceMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/imb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(InfluenceMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/influence_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(InfluenceMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/influence_matrix.png");
    }
}