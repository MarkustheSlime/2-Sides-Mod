package net.MarkustheSlime.twosidesmod.block.entity.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.SoulMatrixBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SoulMatrixModel extends AnimatedGeoModel<SoulMatrixBlockEntity> {
    @Override
    public ResourceLocation getAnimationResource(SoulMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/smb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SoulMatrixBlockEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/soul_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulMatrixBlockEntity entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/soul_matrix.png");
    }
}