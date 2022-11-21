package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.PrimalMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.PrimalMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PrimalMatrixBlockItemRenderer extends GeoItemRenderer<PrimalMatrixBlockItem> {

    public PrimalMatrixBlockItemRenderer() {
        super(new PrimalMatrixBlockItemModel());
    }

}