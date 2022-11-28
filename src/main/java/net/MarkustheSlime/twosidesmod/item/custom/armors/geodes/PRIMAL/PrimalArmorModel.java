package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL.PrimalArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrimalArmorModel extends AnimatedGeoModel<PrimalArmorItem> {

    @Override
    public ResourceLocation getModelResource(PrimalArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/primal_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PrimalArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/primal_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PrimalArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/priarm.animation.json");
    }

}
