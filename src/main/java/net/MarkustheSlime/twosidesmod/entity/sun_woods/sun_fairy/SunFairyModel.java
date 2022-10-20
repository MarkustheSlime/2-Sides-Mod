package net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_fairy;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SunFairyModel extends AnimatedGeoModel<SunFairyEntity> {
    @Override
    public ResourceLocation getModelResource(SunFairyEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/sun_fairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SunFairyEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/sun_fairy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SunFairyEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/sun_fairy.animation.json");
    }
}