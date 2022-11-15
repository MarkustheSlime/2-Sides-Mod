package net.MarkustheSlime.twosidesmod.item.custom.armors.SUN;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

 public class SunWoodArmorModel extends AnimatedGeoModel<SunWoodArmorItem> {

     @Override
     public ResourceLocation getModelResource(SunWoodArmorItem object) {
         return new ResourceLocation(TwoSidesMod.MOD_ID, "geo/swag_two.geo.json");
     }

     @Override
     public ResourceLocation getTextureResource(SunWoodArmorItem object) {
         return new ResourceLocation(TwoSidesMod.MOD_ID, "textures/models/armor/swat_two.png");
     }

     @Override
     public ResourceLocation getAnimationResource(SunWoodArmorItem animatable) {
         return new ResourceLocation(TwoSidesMod.MOD_ID, "animations/swaa_two.animation.json");
     }

 }

