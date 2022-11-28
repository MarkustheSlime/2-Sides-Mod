package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WIND;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WindArmorModel extends AnimatedGeoModel<WindArmorItem> {

    @Override
    public ResourceLocation getModelResource(WindArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/wind_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WindArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/wind_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WindArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/windarm.animation.json");
    }

}
