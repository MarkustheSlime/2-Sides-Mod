package net.MarkustheSlime.twosidesmod.client;

public class ClientEnergyData {
        private static int playerEnergy;

        public static void set(int energy) {
            ClientEnergyData.playerEnergy = energy;
        }

        public static int getPlayerEnergy() {
            return playerEnergy;
        }
    }
