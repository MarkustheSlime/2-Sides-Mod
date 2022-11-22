package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.INFLUENCE;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class InfluenceArmorModel extends AnimatedGeoModel<InfluenceArmorItem> {

    @Override
    public ResourceLocation getModelResource(InfluenceArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/influence_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(InfluenceArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/influence_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(InfluenceArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/infarm.animation.json");
    }

}
