package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.VitalityMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.VitalityMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class VitalityMatrixBlockItemRenderer extends GeoItemRenderer<VitalityMatrixBlockItem> {

    public VitalityMatrixBlockItemRenderer() {
        super(new VitalityMatrixBlockItemModel());
    }

}