package net.MarkustheSlime.twosidesmod;

import com.mojang.logging.LogUtils;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.block.entity.ModBlockEntities;
import net.MarkustheSlime.twosidesmod.fluid.ModFluidTypes;
import net.MarkustheSlime.twosidesmod.fluid.ModFluids;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.MarkustheSlime.twosidesmod.networking.ModMessages;
import net.MarkustheSlime.twosidesmod.screen.DmTableScreen;
import net.MarkustheSlime.twosidesmod.screen.ModMenuTypes;
import net.MarkustheSlime.twosidesmod.villager.ModVillagers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.MarkustheSlime.twosidesmod.painting.ModPaintings;
import net.MarkustheSlime.twosidesmod.world.feature.ModConfiguredFeatures;
import net.MarkustheSlime.twosidesmod.world.feature.ModPlacedFeatures;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(TwoSidesMod.MOD_ID)
public class TwoSidesMod
{
    //comment
    public static final String MOD_ID = "twosidesmod";
    private static final Logger LOGGER = LogUtils.getLogger();


    public TwoSidesMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register((modEventBus));
        ModItems.register(modEventBus);

        ModVillagers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ModMessages.register();
            ModVillagers.registerPOIs();
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DM_ESSENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DM_ESSENCE.get(), RenderType.translucent());

            MenuScreens.register(ModMenuTypes.DM_TABLE_MENU.get(), DmTableScreen::new);
        }
    }
}
