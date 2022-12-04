package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.LIFE;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LifeArmorModel extends AnimatedGeoModel<LifeArmorItem> {

    @Override
    public ResourceLocation getModelResource(LifeArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/life_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LifeArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/life_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LifeArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/lifarm.animation.json");
    }

}
