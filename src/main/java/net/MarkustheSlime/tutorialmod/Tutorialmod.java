package net.MarkustheSlime.tutorialmod;

import com.mojang.logging.LogUtils;
import net.MarkustheSlime.tutorialmod.block.ModBlocks;
import net.MarkustheSlime.tutorialmod.block.entity.ModBlockEntities;
import net.MarkustheSlime.tutorialmod.fluid.ModFluidTypes;
import net.MarkustheSlime.tutorialmod.fluid.ModFluids;
import net.MarkustheSlime.tutorialmod.item.ModItems;
import net.MarkustheSlime.tutorialmod.networking.ModMessages;
import net.MarkustheSlime.tutorialmod.screen.DmTableScreen;
import net.MarkustheSlime.tutorialmod.screen.ModMenuTypes;
import net.MarkustheSlime.tutorialmod.villager.ModVillagers;
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
import net.MarkustheSlime.tutorialmod.painting.ModPaintings;
import net.MarkustheSlime.tutorialmod.world.feature.ModConfiguredFeatures;
import net.MarkustheSlime.tutorialmod.world.feature.ModPlacedFeatures;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(Tutorialmod.MOD_ID)
public class Tutorialmod
{
    //comment
    public static final String MOD_ID = "tutorialmod";
    private static final Logger LOGGER = LogUtils.getLogger();


    public Tutorialmod()
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
