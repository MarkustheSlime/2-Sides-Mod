package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.PrimalMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrimalMatrixModel extends AnimatedGeoModel<PrimalMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(PrimalMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/prmb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PrimalMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/primal_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PrimalMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/primal_matrix.png");
    }
}