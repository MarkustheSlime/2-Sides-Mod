package net.MarkustheSlime.twosidesmod.entity.dwarven_mines.dm_golem;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DmGolemModel extends AnimatedGeoModel<DmGolemEntity> {
    @Override
    public ResourceLocation getModelResource(DmGolemEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/dm_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DmGolemEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/dm_golem.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DmGolemEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/dm_golem.animation.json");
    }
}
