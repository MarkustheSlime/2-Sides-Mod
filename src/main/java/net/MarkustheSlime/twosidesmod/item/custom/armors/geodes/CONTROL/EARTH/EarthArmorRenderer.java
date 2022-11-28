package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.EARTH;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EarthArmorRenderer extends GeoArmorRenderer<EarthArmorItem> {
    public EarthArmorRenderer() {
        super(new EarthArmorModel());

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
