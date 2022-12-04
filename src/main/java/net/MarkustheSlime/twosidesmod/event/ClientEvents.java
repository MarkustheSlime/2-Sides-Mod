package net.MarkustheSlime.twosidesmod.event;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.ModBlockEntities;
import net.MarkustheSlime.twosidesmod.block.entity.renderer.*;
import net.MarkustheSlime.twosidesmod.client.MarkeHudOverlay;
import net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN.DwarvenArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN.DwarvenArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.EARTH.EarthArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.EARTH.EarthArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.FIRE.FireArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.FIRE.FireArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WATER.WaterArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WATER.WaterArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WIND.WindArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WIND.WindArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.LIFE.LifeArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.LIFE.LifeArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.POWER.PowerArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.POWER.PowerArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL.PrimalArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.INFLUENCE.InfluenceArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.INFLUENCE.InfluenceArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL.PrimalArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.SOUL.SoulArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.SOUL.SoulArmorRenderer;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.VITALITY.VitalityArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.VITALITY.VitalityArmorRenderer;
import net.MarkustheSlime.twosidesmod.networking.ModMessages;
import net.MarkustheSlime.twosidesmod.networking.packet.MARKERCC2SPACKET;
import net.MarkustheSlime.twosidesmod.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.MarkustheSlime.twosidesmod.marke_energy.PlayerEnergy;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import static software.bernie.geckolib3.renderers.geo.GeoArmorRenderer.registerArmorRenderer;

public class ClientEvents extends PlayerEnergy {
    @Mod.EventBusSubscriber (modid = TwoSidesMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents{

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event){
            if(KeyBinding.TK1_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
                }
            if(KeyBinding.TK2_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
            }
            if(KeyBinding.TK3_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
            }
            if(KeyBinding.TK4_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
            }
            if(KeyBinding.TK5_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
            }
            if(KeyBinding.MARKERC_KEY.consumeClick()) {
                ModMessages.sendToServer(new MARKERCC2SPACKET());
            }
        }

    }

    @Mod.EventBusSubscriber(modid = TwoSidesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModBusEvents{


        @SubscribeEvent
        public static void  onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.TK1_KEY);
            event.register(KeyBinding.TK2_KEY);
            event.register(KeyBinding.TK3_KEY);
            event.register(KeyBinding.TK4_KEY);
            event.register(KeyBinding.TK5_KEY);
            event.register(KeyBinding.MARKERC_KEY);
        }

        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerAboveAll("energy", MarkeHudOverlay.HUD_ENERGY);
        }

        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.DM_TABLE.get(),
                    DmTableBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SOUL_MATRIX_TILE.get(),
                    SoulMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIFE_MATRIX_TILE.get(),
                    LifeMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POWER_MATRIX_TILE.get(),
                    PowerMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CONTROL_MATRIX_TILE.get(),
                    ControlMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PRIMAL_MATRIX_TILE.get(),
                    PrimalMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.INFLUENCE_MATRIX_TILE.get(),
                    InfluenceMatrixBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.VITALITY_MATRIX_TILE.get(),
                    VitalityMatrixBlockEntityRenderer::new);
        }

        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
            GeoArmorRenderer.registerArmorRenderer(MoonStoneArmorItem.class, () -> new MoonStoneArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(SunWoodArmorItem.class, () -> new SunWoodArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(DwarvenArmorItem.class, () -> new DwarvenArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(VitalityArmorItem.class, () -> new VitalityArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(InfluenceArmorItem.class, () -> new InfluenceArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(PrimalArmorItem.class, () -> new PrimalArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(WindArmorItem.class, () -> new WindArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(EarthArmorItem.class, () -> new EarthArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(WaterArmorItem.class, () -> new WaterArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(FireArmorItem.class, () -> new FireArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(PowerArmorItem.class, () -> new PowerArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(LifeArmorItem.class, () -> new LifeArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(SoulArmorItem.class, () -> new SoulArmorRenderer());
        }
    }
}
