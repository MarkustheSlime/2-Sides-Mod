package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.POWER;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PowerArmorRenderer extends GeoArmorRenderer<PowerArmorItem> {
    public PowerArmorRenderer() {
        super(new PowerArmorModel());

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
