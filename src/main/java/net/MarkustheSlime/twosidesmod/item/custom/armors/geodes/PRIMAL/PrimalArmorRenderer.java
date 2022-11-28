package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PrimalArmorRenderer extends GeoArmorRenderer<PrimalArmorItem> {
    public PrimalArmorRenderer() {
        super(new PrimalArmorModel());

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
