package net.MarkustheSlime.twosidesmod.entity.bosses.geodes.vboss;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VBossModel extends AnimatedGeoModel<VBossEntity> {
    @Override
    public ResourceLocation getModelResource(VBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/vboss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VBossEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/vboss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VBossEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/vboss.animation.json");
    }
}