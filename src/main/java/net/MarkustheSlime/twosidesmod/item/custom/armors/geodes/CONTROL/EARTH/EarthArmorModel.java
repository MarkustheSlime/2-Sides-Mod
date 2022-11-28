package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.EARTH;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EarthArmorModel extends AnimatedGeoModel<EarthArmorItem> {

    @Override
    public ResourceLocation getModelResource(EarthArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/earth_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EarthArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/earth_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EarthArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/eartharm.animation.json");
    }

}
