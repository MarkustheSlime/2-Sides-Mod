package net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DwarvenArmorModel extends AnimatedGeoModel<DwarvenArmorItem> {

    @Override
    public ResourceLocation getModelResource(DwarvenArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/dag.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DwarvenArmorItem object) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/dwarven_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DwarvenArmorItem animatable) {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/daa.animation.json");
    }

}
