package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.VitalityMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VitalityMatrixModel extends AnimatedGeoModel<VitalityMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(VitalityMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/vmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VitalityMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/vitality_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VitalityMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/vitality_matrix.png");
    }
}