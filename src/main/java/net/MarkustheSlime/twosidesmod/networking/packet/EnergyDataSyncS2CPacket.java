package net.MarkustheSlime.twosidesmod.networking.packet;

import net.MarkustheSlime.twosidesmod.client.ClientEnergyData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class EnergyDataSyncS2CPacket {
    private final int energy;

    public EnergyDataSyncS2CPacket(int energy) {
        this.energy = energy;
    }

    public EnergyDataSyncS2CPacket(FriendlyByteBuf buf) {
        this.energy = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeInt(energy);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            // HERE WE ARE ON THE CLIENT!
            ClientEnergyData.set(energy);
        });
        return true;
    }
}
