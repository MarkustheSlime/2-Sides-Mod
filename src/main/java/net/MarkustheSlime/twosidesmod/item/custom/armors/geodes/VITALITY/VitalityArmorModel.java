package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.VITALITY;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VitalityArmorModel extends AnimatedGeoModel<VitalityArmorItem> {

    @Override
    public ResourceLocation getModelResource(VitalityArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/vitality_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VitalityArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/vitality_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VitalityArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/vitarm.animation.json");
    }

}
