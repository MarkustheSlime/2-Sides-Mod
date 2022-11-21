package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.PrimalMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrimalMatrixBlockItemModel extends AnimatedGeoModel<PrimalMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(PrimalMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/prmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PrimalMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/primal_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PrimalMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/primal_matrix.png");
    }
}