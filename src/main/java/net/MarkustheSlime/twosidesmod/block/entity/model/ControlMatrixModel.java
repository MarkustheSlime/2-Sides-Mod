package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.ControlMatrixBlockEntity;
import net.MarkustheSlime.twosidesmod.block.entity.PowerMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ControlMatrixModel extends AnimatedGeoModel<ControlMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(ControlMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/cmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ControlMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/control_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ControlMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/control_matrix.png");
    }
}