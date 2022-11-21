package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.ControlMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ControlMatrixBlockItemModel extends AnimatedGeoModel<ControlMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(ControlMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/cmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(ControlMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/control_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ControlMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/control_matrix.png");
    }
}