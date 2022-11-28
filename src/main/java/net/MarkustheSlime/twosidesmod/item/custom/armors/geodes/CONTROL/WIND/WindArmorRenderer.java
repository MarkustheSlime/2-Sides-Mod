package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WIND;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WindArmorRenderer extends GeoArmorRenderer<WindArmorItem> {
    public WindArmorRenderer() {
        super(new WindArmorModel());

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
