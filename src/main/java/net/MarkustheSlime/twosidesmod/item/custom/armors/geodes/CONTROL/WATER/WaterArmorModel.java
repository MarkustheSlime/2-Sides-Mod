package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WATER;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WaterArmorModel extends AnimatedGeoModel<WaterArmorItem> {

    @Override
    public ResourceLocation getModelResource(WaterArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/water_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaterArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/water_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaterArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/waterarm.animation.json");
    }

}
