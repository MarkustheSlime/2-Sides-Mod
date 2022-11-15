package net.MarkustheSlime.twosidesmod.item.custom.armors.SUN;

import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SunWoodArmorRenderer extends GeoArmorRenderer<SunWoodArmorItem> {
    public SunWoodArmorRenderer() {
        super(new SunWoodArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}