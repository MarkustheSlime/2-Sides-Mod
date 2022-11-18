package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.LifeMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.LifeMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LifeMatrixBlockItemRenderer extends GeoItemRenderer<LifeMatrixBlockItem> {

    public LifeMatrixBlockItemRenderer() {
        super(new LifeMatrixBlockItemModel());
    }

}