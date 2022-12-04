package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.SOUL;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SoulArmorRenderer extends GeoArmorRenderer<SoulArmorItem> {
    public SoulArmorRenderer() {
        super(new SoulArmorModel());

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
