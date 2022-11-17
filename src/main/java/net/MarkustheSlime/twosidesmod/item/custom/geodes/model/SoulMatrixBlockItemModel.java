package net.MarkustheSlime.twosidesmod.item.custom.geodes.model;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.SoulMatrixBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SoulMatrixBlockItemModel extends AnimatedGeoModel<SoulMatrixBlockItem> {
    @Override
    public ResourceLocation getAnimationResource(SoulMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/smb.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(SoulMatrixBlockItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/soul_matrix.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulMatrixBlockItem entity) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/soul_matrix.png");
    }
}