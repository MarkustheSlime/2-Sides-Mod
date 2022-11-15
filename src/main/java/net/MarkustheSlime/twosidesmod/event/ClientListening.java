package net.MarkustheSlime.twosidesmod.event;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN.DwarvenArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN.DwarvenArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = TwoSidesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListening {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(MoonStoneArmorItem.class, () -> new MoonStoneArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(SunWoodArmorItem.class, () -> new SunWoodArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(DwarvenArmorItem.class, () -> new DwarvenArmorRenderer());
    }
}
