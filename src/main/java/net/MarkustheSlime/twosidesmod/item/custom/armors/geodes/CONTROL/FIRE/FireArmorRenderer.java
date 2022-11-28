package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.FIRE;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireArmorRenderer extends GeoArmorRenderer<FireArmorItem> {
    public FireArmorRenderer() {
        super(new FireArmorModel());

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
