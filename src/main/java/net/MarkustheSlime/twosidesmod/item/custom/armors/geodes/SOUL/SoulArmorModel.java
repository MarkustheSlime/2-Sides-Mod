package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.SOUL;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SoulArmorModel extends AnimatedGeoModel<SoulArmorItem> {

    @Override
    public ResourceLocation getModelResource(SoulArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/soul_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/soul_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SoulArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/souarm.animation.json");
    }

}
