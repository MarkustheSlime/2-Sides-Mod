package net.MarkustheSlime.twosidesmod.item.custom.armors.MOON;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonStoneArmorModel extends AnimatedGeoModel<MoonStoneArmorItem> {

    @Override
    public ResourceLocation getModelResource(MoonStoneArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/msag_two.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonStoneArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/msat_two.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonStoneArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/msaa_two.animation.json");
    }

}
