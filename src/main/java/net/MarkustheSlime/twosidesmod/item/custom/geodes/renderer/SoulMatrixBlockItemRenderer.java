package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.SoulMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.SoulMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SoulMatrixBlockItemRenderer extends GeoItemRenderer<SoulMatrixBlockItem> {

    public SoulMatrixBlockItemRenderer() {
        super(new SoulMatrixBlockItemModel());
    }

}