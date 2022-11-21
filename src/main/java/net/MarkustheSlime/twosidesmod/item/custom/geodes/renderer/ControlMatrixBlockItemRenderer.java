package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.ControlMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.PowerMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.ControlMatrixBlockItemModel;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.PowerMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ControlMatrixBlockItemRenderer extends GeoItemRenderer<ControlMatrixBlockItem> {

    public ControlMatrixBlockItemRenderer() {
        super(new ControlMatrixBlockItemModel());
    }

}