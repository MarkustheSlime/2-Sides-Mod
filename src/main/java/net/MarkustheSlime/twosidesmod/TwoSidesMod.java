package net.MarkustheSlime.twosidesmod;

import com.mojang.logging.LogUtils;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.block.entity.ModBlockEntities;
import net.MarkustheSlime.twosidesmod.entity.ModEntityTypes;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.deep_gorgon.DeepGorgonRenderer;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.dm_golem.DmGolemRenderer;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_fairy.MoonFairyRenderer;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel.MoonStoneAngelRenderer;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_fairy.SunFairyRenderer;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_troll.SunTrollRenderer;
import net.MarkustheSlime.twosidesmod.fluid.*;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.MarkustheSlime.twosidesmod.networking.ModMessages;
import net.MarkustheSlime.twosidesmod.recipe.ModRecipes;
import net.MarkustheSlime.twosidesmod.screen.DmTableScreen;
import net.MarkustheSlime.twosidesmod.screen.ModMenuTypes;
import net.MarkustheSlime.twosidesmod.villager.ModVillagers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
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
import software.bernie.geckolib3.GeckoLib;


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

        //Liquid Start
        SunSap.register(modEventBus);
        DME.register(modEventBus);
        MoonSyrup.register(modEventBus);
        GorgonSerumFluid.register(modEventBus);
        ModFluids.register(modEventBus);
        //Liquid End

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);
        ModEntityTypes.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntityTypes.DEEP_GORGON.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
            SpawnPlacements.register(ModEntityTypes.DM_GOLEM.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
            SpawnPlacements.register(ModEntityTypes.SUN_TROLL.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
            SpawnPlacements.register(ModEntityTypes.SUN_FAIRY.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    AmbientCreature::checkMobSpawnRules);
            SpawnPlacements.register(ModEntityTypes.MOON_FAIRY.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    AmbientCreature::checkMobSpawnRules);
            SpawnPlacements.register(ModEntityTypes.MOON_STONE_ANGEL.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SUN_SAP_PINE_SAPLING.getId(), ModBlocks.POTTED_SUN_SAP_PINE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MOON_SYRUP_FLOWER_SPRIG.getId(), ModBlocks.POTTED_MOON_SYRUP_FLOWER_SPRIG);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RainbowFlower.getId(), ModBlocks.POTTED_RainbowFlower);

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
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_DME.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_DME.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_GS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_GS.get(), RenderType.translucent());

            MenuScreens.register(ModMenuTypes.DM_TABLE_MENU.get(), DmTableScreen::new);

            EntityRenderers.register(ModEntityTypes.DM_GOLEM.get(), DmGolemRenderer::new);
            EntityRenderers.register(ModEntityTypes.DEEP_GORGON.get(), DeepGorgonRenderer::new);
            EntityRenderers.register(ModEntityTypes.SUN_FAIRY.get(), SunFairyRenderer::new);
            EntityRenderers.register(ModEntityTypes.SUN_TROLL.get(), SunTrollRenderer::new);
            EntityRenderers.register(ModEntityTypes.MOON_FAIRY.get(), MoonFairyRenderer::new);
            EntityRenderers.register(ModEntityTypes.MOON_STONE_ANGEL.get(), MoonStoneAngelRenderer::new);
        }
    }
}
