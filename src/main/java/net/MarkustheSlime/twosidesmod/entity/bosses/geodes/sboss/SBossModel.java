package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.sboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SBossModel extends AnimatedGeoModel<SBossEntity> {
    @Override
    public ResourceLocation getModelResource(SBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/sboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/sboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/sboss.animation.json");
    }
}