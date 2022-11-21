package net.MarkustheSlime.twosidesmod.item.custom.geodes.renderer;

import net.MarkustheSlime.twosidesmod.item.custom.geodes.PowerMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.SoulMatrixBlockItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.PowerMatrixBlockItemModel;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.model.SoulMatrixBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PowerMatrixBlockItemRenderer extends GeoItemRenderer<PowerMatrixBlockItem> {

    public PowerMatrixBlockItemRenderer() {
        super(new PowerMatrixBlockItemModel());
    }

}