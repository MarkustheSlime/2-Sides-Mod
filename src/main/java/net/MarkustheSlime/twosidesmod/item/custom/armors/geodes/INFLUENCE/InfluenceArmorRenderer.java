package net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.INFLUENCE;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class InfluenceArmorRenderer extends GeoArmorRenderer<InfluenceArmorItem> {
    public InfluenceArmorRenderer() {
        super(new InfluenceArmorModel());

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
