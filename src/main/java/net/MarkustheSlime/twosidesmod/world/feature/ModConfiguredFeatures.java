package net.MarkustheSlime.twosidesmod.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TwoSidesMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_DM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DM_ORE = CONFIGURED_FEATURES.register("dm_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_DM_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SOUL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SOUL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SOUL_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SOUL_ORE = CONFIGURED_FEATURES.register("soul_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SOUL_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LIFE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIFE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LIFE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIFE_ORE = CONFIGURED_FEATURES.register("life_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LIFE_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_POWER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.POWER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_POWER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> POWER_ORE = CONFIGURED_FEATURES.register("power_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_POWER_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CONTROL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CONTROL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CONTROL_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CONTROL_ORE = CONFIGURED_FEATURES.register("control_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CONTROL_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PRIMAL_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PRIMAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PRIMAL_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PRIMAL_ORE = CONFIGURED_FEATURES.register("primal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PRIMAL_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_INFLUENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.INFLUENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_INFLUENCE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> INFLUENCE_ORE = CONFIGURED_FEATURES.register("influence_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_INFLUENCE_ORES.get(),7)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_VITALITY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.VITALITY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_VITALITY_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> VITALITY_ORE = CONFIGURED_FEATURES.register("vitality_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_VITALITY_ORES.get(),7)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SUN_SAP_PINE =
            CONFIGURED_FEATURES.register("sun_sap_pine", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.SUN_SAP_PINE_LOG.get()),
                            new StraightTrunkPlacer(2, 3, 1),
                            BlockStateProvider.simple(ModBlocks.SUN_SAP_PINE_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                            new TwoLayersFeatureSize(2, 0, 3)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SUN_SAP_PINE_SPAWN =
            CONFIGURED_FEATURES.register("sun_sap_pine_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ModPlacedFeatures.SUN_SAP_PINE_CHECKED.getHolder().get(),
                            0.5F)), ModPlacedFeatures.SUN_SAP_PINE_CHECKED.getHolder().get())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MOON_SYRUP_FLOWER =
            CONFIGURED_FEATURES.register("moon_syrup_flower", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.MOON_SYRUP_FLOWER_LOG.get()),
                            new StraightTrunkPlacer(2, 3, 1),
                            BlockStateProvider.simple(ModBlocks.MOON_SYRUP_FLOWER_PETAL.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                            new TwoLayersFeatureSize(2, 0, 3)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MOON_SYRUP_FLOWER_SPAWN =
            CONFIGURED_FEATURES.register("moon_syrup_flower_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ModPlacedFeatures.MOON_SYRUP_FLOWER_CHECKED.getHolder().get(),
                            0.5F)), ModPlacedFeatures.MOON_SYRUP_FLOWER_CHECKED.getHolder().get())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RainbowFlower = CONFIGURED_FEATURES.register("rainbow_flower",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RainbowFlower.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DM_GEODE = CONFIGURED_FEATURES.register("dm_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(Blocks.COBBLED_DEEPSLATE),
                            BlockStateProvider.simple(ModBlocks.DM_ORE.get()),
                            BlockStateProvider.simple(ModBlocks.DEEPSLATE_DM_ORE.get()),
                            BlockStateProvider.simple(Blocks.DEEPSLATE),
                            List.of(ModBlocks.DM_BLOCK.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                            true, UniformInt.of(3, 8),
                            UniformInt.of(2, 6), UniformInt.of(1, 2),
                            -18, 18, 0.075D, 1)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
