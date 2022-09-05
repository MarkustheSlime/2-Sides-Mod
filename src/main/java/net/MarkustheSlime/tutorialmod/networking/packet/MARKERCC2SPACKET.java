package net.MarkustheSlime.tutorialmod.networking.packet;

import net.MarkustheSlime.tutorialmod.marke_energy.PlayerEnergyProvider;
import net.MarkustheSlime.tutorialmod.networking.ModMessages;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class MARKERCC2SPACKET {
    private static final String MESSAGE_RC_MARKE = "message.tutorialmod.markerc";
    private static final String MESSAGE_NO_RC = "message.tutorialmod.no_markerc";

    public MARKERCC2SPACKET() {

    }

    public MARKERCC2SPACKET(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //EVERYTHING HERE HAPPENS ON SERVER
            ServerPlayer player = context.getSender();
            ServerLevel level = player.getLevel();

            if(hasWaterAroundThem(player, level, 2)) {
                //Notify Player Water has been Drunk
                player.sendSystemMessage(Component.translatable(MESSAGE_RC_MARKE).withStyle(ChatFormatting.LIGHT_PURPLE));
                //play drinking sound
                level.playSound(null, player.getOnPos(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS,
                        0.5F, level.random.nextFloat() * 0.1F + 0.9F);
                //increase thirst bar
                player.getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(energy -> {
                    energy.addEnergy(1);
                    player.sendSystemMessage(Component.literal("Current Energy " + energy.getEnergy())
                            .withStyle(ChatFormatting.LIGHT_PURPLE));
                    ModMessages.sendToPlayer(new EnergyDataSyncS2CPacket(energy.getEnergy()), player);
                });
                //OUTPUT thirst level
            } else {
                //Notify Player there is no Water Around
                player.sendSystemMessage(Component.translatable(MESSAGE_NO_RC).withStyle(ChatFormatting.DARK_PURPLE));
                //OUTPUT thirst level
                player.getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(energy -> {
                    player.sendSystemMessage(Component.literal("Current Energy " + energy.getEnergy())
                            .withStyle(ChatFormatting.DARK_PURPLE));
                    ModMessages.sendToPlayer(new EnergyDataSyncS2CPacket(energy.getEnergy()), player);
                });
                //Check if player is near water
            }
        });
        return true;
    }

    private boolean hasWaterAroundThem(ServerPlayer player, ServerLevel level, int size) {
        return level.getBlockStates(player.getBoundingBox().inflate(size))
                .filter(state -> state.is(Blocks.WATER)).toArray().length > 0;
    }
}
