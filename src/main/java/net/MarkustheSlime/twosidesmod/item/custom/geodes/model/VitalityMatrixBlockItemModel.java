package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.VitalityMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VitalityMatrixBlockItemModel extends AnimatedGeoModel<VitalityMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(VitalityMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/vmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VitalityMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/vitality_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VitalityMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/vitality_matrix.png");
    }
}