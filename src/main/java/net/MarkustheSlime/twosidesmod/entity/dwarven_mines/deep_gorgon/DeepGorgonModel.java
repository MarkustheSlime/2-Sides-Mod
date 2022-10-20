package net.MarkustheSlime.twosidesmod.entity.dwarven_mines.deep_gorgon;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeepGorgonModel extends AnimatedGeoModel<DeepGorgonEntity> {
    @Override
    public ResourceLocation getModelResource(DeepGorgonEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/deep_gorgon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DeepGorgonEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/deep_gorgon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DeepGorgonEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/deep_gorgon.animation.json");
    }
}
