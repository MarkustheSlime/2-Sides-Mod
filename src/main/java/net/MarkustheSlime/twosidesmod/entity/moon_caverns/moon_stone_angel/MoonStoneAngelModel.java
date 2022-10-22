package net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonStoneAngelModel extends AnimatedGeoModel<MoonStoneAngelEntity> {
    @Override
    public ResourceLocation getModelResource(MoonStoneAngelEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/moonshard_angel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonStoneAngelEntity object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/moonshard_angel.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonStoneAngelEntity animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/moonshard_angel.animation.json");
    }
}
