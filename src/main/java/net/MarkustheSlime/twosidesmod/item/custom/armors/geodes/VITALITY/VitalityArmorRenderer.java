package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.VITALITY;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VitalityArmorRenderer extends GeoArmorRenderer<VitalityArmorItem> {
    public VitalityArmorRenderer() {
        super(new VitalityArmorModel());

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
