package net.MarkustheSlime.tutorialmod.marke_energy;

import net.minecraft.nbt.CompoundTag;

public class PlayerEnergy {
    protected static int energy;
    protected final int MIN_ENERGY = 0;
    protected final int MAX_ENERGY = 100;

    public int getEnergy() {
        return energy;
    }

    public void addEnergy(int add) {
        this.energy = Math.min(energy + add, MAX_ENERGY);
    }

    public void subEnergy(int sub) {
        this.energy = Math.max(energy - sub, MIN_ENERGY);
    }

    public void copyFrom(PlayerEnergy source) {
        this.energy = source.energy;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("energy", energy);
    }

    public void loadNBTData(CompoundTag nbt) {
        energy = nbt.getInt("energy");
    }
}
