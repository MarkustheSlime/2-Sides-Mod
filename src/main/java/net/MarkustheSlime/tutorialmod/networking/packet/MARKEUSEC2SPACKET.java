package net.MarkustheSlime.tutorialmod.networking.packet;

import net.MarkustheSlime.tutorialmod.marke_energy.PlayerEnergyProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class MARKEUSEC2SPACKET {
    private static final String MESSAGE_USE_MARKE = "message.tutorialmod.markeuse";

    public MARKEUSEC2SPACKET() {

    }

    public MARKEUSEC2SPACKET(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //EVERYTHING HERE HAPPENS ON SERVER
            ServerPlayer player = context.getSender();
            ServerLevel level = player.getLevel();

            if(true) { //need to make when key pressed
                //Notify Player Water has been Drunk
                player.sendSystemMessage(Component.translatable(MESSAGE_USE_MARKE).withStyle(ChatFormatting.LIGHT_PURPLE));
                //play drinking sound
                level.playSound(null, player.getOnPos(), SoundEvents.PLAYER_ATTACK_SWEEP, SoundSource.PLAYERS,
                        0.5F, level.random.nextFloat() * 0.1F + 0.9F);
                //increase thirst bar
                player.getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(energy -> {
                    energy.subEnergy(1);
                    player.sendSystemMessage(Component.literal("Current Energy " + energy.getEnergy())
                            .withStyle(ChatFormatting.LIGHT_PURPLE));
                });
                //OUTPUT thirst level
            }
        });
        return true;
    }
}
