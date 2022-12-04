package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.LIFE;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LifeArmorRenderer extends GeoArmorRenderer<LifeArmorItem> {
    public LifeArmorRenderer() {
        super(new LifeArmorModel());

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
