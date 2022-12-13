package net.MarkustheSlime.twosidesmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.entity.ModEntityTypes;
import net.MarkustheSlime.twosidesmod.entity.bosses.geodes.sboss.SBossEntity;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.deep_gorgon.DeepGorgonEntity;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.dm_golem.DmGolemEntity;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel.MoonStoneAngelEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_fairy.SunFairyEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_troll.SunTrollEntity;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.MarkustheSlime.twosidesmod.marke_energy.PlayerEnergy;
import net.MarkustheSlime.twosidesmod.marke_energy.PlayerEnergyProvider;
import net.MarkustheSlime.twosidesmod.networking.ModMessages;
import net.MarkustheSlime.twosidesmod.networking.packet.EnergyDataSyncS2CPacket;
import net.MarkustheSlime.twosidesmod.villager.ModVillagers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

import java.util.List;


public class ModEvents {
    @Mod.EventBusSubscriber(modid = TwoSidesMod.MOD_ID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void addCustomTrades(VillagerTradesEvent event) {
            if(event.getType() == VillagerProfession.TOOLSMITH) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.TESTADVANCEDITEM.get(), 1);
                int villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 2),
                        stack,10,8,0.02F));
            }

            if(event.getType() == ModVillagers.NIGHTTIME_GURU.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.GLOBSQUACH.get(), 15);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.EMERALD, 5),
                        stack,10,8,0.02F));
            }
        }

        @SubscribeEvent
        public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
            if(event.getObject() instanceof Player) {
                if(!event.getObject().getCapability(PlayerEnergyProvider.PLAYER_ENERGY).isPresent()) {
                    event.addCapability(new ResourceLocation(TwoSidesMod.MOD_ID, "properties"), new PlayerEnergyProvider());
                }
            }
        }

        @SubscribeEvent
        public static void onPlayerCloned(PlayerEvent.Clone event) {
            if(event.isWasDeath()) {
                event.getOriginal().getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(oldStore -> {
                    event.getOriginal().getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(newStore -> {
                        newStore.copyFrom(oldStore);
                    });
                });
            }
        }

        @SubscribeEvent
        public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
            event.register(PlayerEnergy.class);
        }

        @SubscribeEvent
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if(event.side == LogicalSide.SERVER) {
                event.player.getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(energy -> {
                    if(energy.getEnergy() > 0 && event.player.getRandom().nextFloat() < 0.0003f) { // Once Every 60 Seconds on Avg
                        energy.subEnergy(1);
                        ModMessages.sendToPlayer(new EnergyDataSyncS2CPacket(energy.getEnergy()), ((ServerPlayer)event.player));
                    }
                });
            }
        }

        @SubscribeEvent
        public static void onPlayerJoinWorld(EntityJoinLevelEvent event) {
            if(!event.getLevel().isClientSide()) {
                if(event.getEntity() instanceof ServerPlayer player) {
                    player.getCapability(PlayerEnergyProvider.PLAYER_ENERGY).ifPresent(energy -> {
                        ModMessages.sendToPlayer(new EnergyDataSyncS2CPacket(energy.getEnergy()), player);
                    });
                }
            }
        }
    }
    @Mod.EventBusSubscriber(modid = TwoSidesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.DM_GOLEM.get(), DmGolemEntity.setAttributes());
            event.put(ModEntityTypes.DEEP_GORGON.get(), DeepGorgonEntity.setAttributes());
            event.put(ModEntityTypes.SUN_FAIRY.get(), SunFairyEntity.setAttributes());
            event.put(ModEntityTypes.SUN_TROLL.get(), SunTrollEntity.setAttributes());
            event.put(ModEntityTypes.MOON_FAIRY.get(), SunFairyEntity.setAttributes());
            event.put(ModEntityTypes.MOON_STONE_ANGEL.get(), MoonStoneAngelEntity.setAttributes());
            event.put(ModEntityTypes.SBOSS.get(), SBossEntity.setAttributes());
        }
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if(event.getEntity() instanceof Sheep) {
            if(event.getSource().getEntity() instanceof Player player) {
                if(player.getMainHandItem().getItem() == Items.BEEF) {
                    player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep with BEEF! But why?"));
                } else {
                    //player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep!"));
                }
            }
        }
    }
}
