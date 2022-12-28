package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.cboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CBossModel extends AnimatedGeoModel<CBossEntity> {
    @Override
    public ResourceLocation getModelResource(CBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/cboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/cboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/cboss.animation.json");
    }
}