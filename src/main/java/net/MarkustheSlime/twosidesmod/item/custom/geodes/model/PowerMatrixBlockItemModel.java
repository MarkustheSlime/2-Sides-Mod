package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.PowerMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.SoulMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PowerMatrixBlockItemModel extends AnimatedGeoModel<PowerMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(PowerMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/pmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PowerMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/power_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PowerMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/power_matrix.png");
    }
}