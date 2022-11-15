package net.MarkustheSlime.twosidesmod.event;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.entity.ModBlockEntities;
import net.MarkustheSlime.twosidesmod.block.entity.renderer.DmTableBlockEntityRenderer;
import net.MarkustheSlime.twosidesmod.client.MarkeHudOverlay;
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
        }
    }
}
