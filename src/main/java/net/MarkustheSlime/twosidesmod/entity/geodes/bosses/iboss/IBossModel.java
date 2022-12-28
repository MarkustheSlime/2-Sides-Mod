package net.MarkustheSlime.twosidesmod.entity.geodes.bosses.iboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IBossModel extends AnimatedGeoModel<IBossEntity> {
    @Override
    public ResourceLocation getModelResource(IBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/iboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/iboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/iboss.animation.json");
    }
}