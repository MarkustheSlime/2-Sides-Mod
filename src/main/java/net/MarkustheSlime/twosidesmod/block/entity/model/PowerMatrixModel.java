package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.LifeMatrixBlockEntity;
import net.MarkustheSlime.twosidesmod.block.entity.PowerMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PowerMatrixModel extends AnimatedGeoModel<PowerMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(PowerMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/pmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PowerMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/power_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PowerMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/power_matrix.png");
    }
}