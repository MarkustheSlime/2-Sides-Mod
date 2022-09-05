package net.MarkustheSlime.tutorialmod.event;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.client.MarkeHudOverlay;
import net.MarkustheSlime.tutorialmod.networking.ModMessages;
import net.MarkustheSlime.tutorialmod.networking.packet.MARKERCC2SPACKET;
import net.MarkustheSlime.tutorialmod.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.MarkustheSlime.tutorialmod.marke_energy.PlayerEnergy;

public class ClientEvents extends PlayerEnergy{
    @Mod.EventBusSubscriber (modid = Tutorialmod.MOD_ID, value = Dist.CLIENT)
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

    @Mod.EventBusSubscriber(modid = Tutorialmod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
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
    }
}
