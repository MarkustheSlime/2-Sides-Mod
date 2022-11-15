package net.MarkustheSlime.twosidesmod.item.custom.armors.MOON;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MoonStoneArmorRenderer extends GeoArmorRenderer<MoonStoneArmorItem> {
    public MoonStoneArmorRenderer() {
        super(new MoonStoneArmorModel());

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