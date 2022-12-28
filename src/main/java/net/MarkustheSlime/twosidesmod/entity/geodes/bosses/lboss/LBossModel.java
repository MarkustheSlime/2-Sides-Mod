package net.MarkustheSlime.twosidesmod.entity.geodes.bosses.lboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LBossModel extends AnimatedGeoModel<LBossEntity> {
    @Override
    public ResourceLocation getModelResource(LBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/lboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/lboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/lboss.animation.json");
    }
}