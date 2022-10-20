package net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_troll;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SunTrollModel extends AnimatedGeoModel<SunTrollEntity> {
    @Override
    public ResourceLocation getModelResource(SunTrollEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/sun_troll.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SunTrollEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/sun_troll.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SunTrollEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/sun_troll.animation.json");
    }
}