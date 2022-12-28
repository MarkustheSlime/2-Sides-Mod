package net.MarkustheSlime.twosidesmod.entity.geodes.bosses.mboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MBossModel extends AnimatedGeoModel<MBossEntity> {
    @Override
    public ResourceLocation getModelResource(MBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/mboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/mboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/mboss.animation.json");
    }
}