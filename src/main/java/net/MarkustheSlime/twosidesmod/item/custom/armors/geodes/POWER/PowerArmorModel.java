package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.POWER;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PowerArmorModel extends AnimatedGeoModel<PowerArmorItem> {

    @Override
    public ResourceLocation getModelResource(PowerArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/power_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PowerArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/power_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PowerArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/powarm.animation.json");
    }

}
