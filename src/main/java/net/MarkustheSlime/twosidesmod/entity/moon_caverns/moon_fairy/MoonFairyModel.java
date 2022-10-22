package net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_fairy;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonFairyModel extends AnimatedGeoModel<MoonFairyEntity> {
    @Override
    public ResourceLocation getModelResource(MoonFairyEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/moon_fairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonFairyEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/moon_fairy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonFairyEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/moon_fairy.animation.json");
    }
}