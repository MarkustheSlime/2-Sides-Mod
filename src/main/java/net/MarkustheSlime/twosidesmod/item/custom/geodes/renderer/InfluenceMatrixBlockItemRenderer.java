package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.InfluenceMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.InfluenceMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class InfluenceMatrixBlockItemRenderer extends GeoItemRenderer<InfluenceMatrixBlockItem> {

    public InfluenceMatrixBlockItemRenderer() {
        super(new InfluenceMatrixBlockItemModel());
    }

}