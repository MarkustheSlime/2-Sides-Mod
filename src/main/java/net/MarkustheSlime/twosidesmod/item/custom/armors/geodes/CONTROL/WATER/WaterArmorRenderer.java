package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WATER;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WaterArmorRenderer extends GeoArmorRenderer<WaterArmorItem> {
    public WaterArmorRenderer() {
        super(new WaterArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
