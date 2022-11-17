package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.LifeMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.SoulMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LifeMatrixBlockItemModel extends AnimatedGeoModel<LifeMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(LifeMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/lmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(LifeMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/life_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LifeMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/life_matrix.png");
    }
}