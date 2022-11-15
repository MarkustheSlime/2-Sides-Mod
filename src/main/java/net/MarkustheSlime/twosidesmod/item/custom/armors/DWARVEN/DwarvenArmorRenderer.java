package net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN;

import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DwarvenArmorRenderer extends GeoArmorRenderer<DwarvenArmorItem> {
    public DwarvenArmorRenderer() {
        super(new DwarvenArmorModel());

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
