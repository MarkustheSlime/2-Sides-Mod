package net.MarkustheSlime.twosidesmod.entity.geodes.bosses.poboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class QBossModel extends AnimatedGeoModel<QBossEntity> {
    @Override
    public ResourceLocation getModelResource(QBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/qboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(QBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/qboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(QBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/qboss.animation.json");
    }
}