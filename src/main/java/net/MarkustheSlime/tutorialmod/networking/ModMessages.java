package net.MarkustheSlime.tutorialmod.networking;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.networking.packet.EXAMPLEC2SPACKET;
import net.MarkustheSlime.tutorialmod.networking.packet.MARKERCC2SPACKET;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModMessages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Tutorialmod.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(EXAMPLEC2SPACKET.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(EXAMPLEC2SPACKET::new)
                .encoder(EXAMPLEC2SPACKET::toBytes)
                .consumerMainThread(EXAMPLEC2SPACKET::handle)
                .add();
        net.messageBuilder(MARKERCC2SPACKET.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(MARKERCC2SPACKET::new)
                .encoder(MARKERCC2SPACKET::toBytes)
                .consumerMainThread(MARKERCC2SPACKET::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }

}
