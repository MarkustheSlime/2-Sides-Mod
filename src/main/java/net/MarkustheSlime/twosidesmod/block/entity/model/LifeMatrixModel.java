package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.LifeMatrixBlockEntity;
import net.MarkustheSlime.twosidesmod.block.entity.SoulMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LifeMatrixModel extends AnimatedGeoModel<LifeMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(LifeMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/lmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(LifeMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/life_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LifeMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/life_matrix.png");
    }
}