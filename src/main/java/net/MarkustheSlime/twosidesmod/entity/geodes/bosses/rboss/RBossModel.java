package net.MarkustheSlime.twosidesmod.entity.geodes.bosses.rboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RBossModel extends AnimatedGeoModel<RBossEntity> {
    @Override
    public ResourceLocation getModelResource(RBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/rboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/rboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/rboss.animation.json");
    }
}