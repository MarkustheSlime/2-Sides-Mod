package net.MarkustheSlime.twosidesmod.world.feature;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TwoSidesMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> DM_ORE_PLACED = PLACED_FEATURES.register("dm_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DM_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> SOUL_ORE_PLACED = PLACED_FEATURES.register("soul_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SOUL_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> LIFE_ORE_PLACED = PLACED_FEATURES.register("life_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LIFE_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> POWER_ORE_PLACED = PLACED_FEATURES.register("power_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.POWER_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> CONTROL_ORE_PLACED = PLACED_FEATURES.register("control_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CONTROL_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> VITALITY_ORE_PLACED = PLACED_FEATURES.register("vitality_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.VITALITY_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> PRIMAL_ORE_PLACED = PLACED_FEATURES.register("primal_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PRIMAL_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> INFLUENCE_ORE_PLACED = PLACED_FEATURES.register("influence_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.INFLUENCE_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> SUN_SAP_PINE_CHECKED = PLACED_FEATURES.register("sun_sap_pine_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.SUN_SAP_PINE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.SUN_SAP_PINE_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> SUN_SAP_PINE_PLACED = PLACED_FEATURES.register("sun_sap_pine_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SUN_SAP_PINE_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static final RegistryObject<PlacedFeature> DM_GEODE_PLACED = PLACED_FEATURES.register("dm_geode_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DM_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
