package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.FIRE;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireArmorModel extends AnimatedGeoModel<FireArmorItem> {

    @Override
    public ResourceLocation getModelResource(FireArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/fire_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/fire_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/firearm.animation.json");
    }

}
