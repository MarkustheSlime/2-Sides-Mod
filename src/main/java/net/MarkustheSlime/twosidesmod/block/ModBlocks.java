package net.MarkustheSlime.twosidesmod.block;

import net.MarkustheSlime.twosidesmod.ModCreativeModeTab;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.fluid.ModFluids;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.MarkustheSlime.twosidesmod.block.custom.*;
import net.MarkustheSlime.twosidesmod.world.tree.MoonSyrupFlowerTreeGrower;
import net.MarkustheSlime.twosidesmod.world.tree.SunSapPineTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<Block> DM_BLOCK = registerBlock("dm_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SOUL_BLOCK = registerBlock("soul_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> LIFE_BLOCK = registerBlock("life_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> POWER_BLOCK = registerBlock("power_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> CONTROL_BLOCK = registerBlock("control_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> PRIMALITY_BLOCK = registerBlock("primality_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> INFLUENCE_BLOCK = registerBlock("influence_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> VITALITY_BLOCK = registerBlock("vitality_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> SOUL_MATRIX = registerBlock("soul_matrix",
            () -> new SoulMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> LIFE_MATRIX = registerBlock("life_matrix",
            () -> new LifeMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> POWER_MATRIX = registerBlock("power_matrix",
            () -> new PowerMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> CONTROL_MATRIX = registerBlock("control_matrix",
            () -> new ControlMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> PRIMAL_MATRIX = registerBlock("primal_matrix",
            () -> new PrimalMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> INFLUENCE_MATRIX = registerBlock("influence_matrix",
            () -> new InfluenceMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> VITALITY_MATRIX = registerBlock("vitality_matrix",
            () -> new VitalityMatrixBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);


    public static final RegistryObject<WallBlock> DM_WALL = registerBlock("dm_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DM_TABLE = registerBlock("dm_table",
            () -> new DMTABLEBLOCK(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DM_ORE = registerBlock("dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)),ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> SOUL_ORE = registerBlock("soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> LIFE_ORE = registerBlock("life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> POWER_ORE = registerBlock("power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> CONTROL_ORE = registerBlock("control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> PRIMAL_ORE = registerBlock("primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> INFLUENCE_ORE = registerBlock("influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> VITALITY_ORE = registerBlock("vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> METEORITE = registerBlock("meteorite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_SOUL_ORE = registerBlock("deepslate_soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_LIFE_ORE = registerBlock("deepslate_life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_POWER_ORE = registerBlock("deepslate_power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_CONTROL_ORE = registerBlock("deepslate_control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_PRIMAL_ORE = registerBlock("deepslate_primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_INFLUENCE_ORE = registerBlock("deepslate_influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DEEPSLATE_VITALITY_ORE = registerBlock("deepslate_vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public  static final RegistryObject<Block> DEEPSLATE_DM_ORE = registerBlock("deepslate_dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DarkSeeingBlock = registerBlock("darkseeingblock",
            () -> new DarkSeeingBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> DM_Lamp = registerBlock("dm_lamp",
            () -> new DM_Lamp_Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(DM_Lamp_Block.LIT) ? 0 : 15)),
            ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MoonStoneBud = registerBlock("moon_stone_bud",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel((p_152686_) -> { return 15; })), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> GLOBSQUACH_CROP = BLOCKS.register("globsquach_crop",
            () -> new GlobsquachCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    //Liquid Start
    public static final RegistryObject<LiquidBlock> DME_BLOCK = BLOCKS.register("dme_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DME, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> SSAP_BLOCK = BLOCKS.register("sun_sap_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SSAP, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> MSAP_BLOCK = BLOCKS.register("moon_syrup_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MSAP, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> GS_BLOCK = BLOCKS.register("gorgon_serum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_GS, BlockBehaviour.Properties.copy(Blocks.WATER)));
    //Liquid End

    public static final RegistryObject<Block> SUN_SAP_PINE_LOG = registerBlock("sun_sap_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_SAP_PINE_WOOD = registerBlock("sun_sap_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_SUN_SAP_PINE_LOG =
            registerBlock("stripped_sun_sap_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_SUN_SAP_PINE_WOOD =
            registerBlock("stripped_sun_sap_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MOON_SYRUP_FLOWER_LOG = registerBlock("moon_syrup_flower_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_SYRUP_FLOWER_WOOD = registerBlock("moon_syrup_flower_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MOON_SYRUP_FLOWER_LOG =
            registerBlock("stripped_moon_syrup_flower_log",
                    () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MOON_SYRUP_FLOWER_WOOD =
            registerBlock("stripped_moon_syrup_flower_wood",
                    () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                            .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> SUN_SAP_PINE_PLANKS = registerBlock("sun_sap_pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MOON_SYRUP_FLOWER_PLANKS = registerBlock("moon_syrup_flower_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 0;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 0;
                }
            }, ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_SAP_PINE_LEAVES = registerBlock("sun_sap_pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MOON_SYRUP_FLOWER_PETAL = registerBlock("moon_syrup_flower_petals",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 15;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            }, ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> SUN_SAP_PINE_SAPLING = registerBlock("sun_sap_pine_sapling",
            () -> new SaplingBlock(new SunSapPineTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MOON_SYRUP_FLOWER_SPRIG = registerBlock("moon_syrup_flower_sprig",
            () -> new SaplingBlock(new MoonSyrupFlowerTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> POTTED_SUN_SAP_PINE_SAPLING = BLOCKS.register
            ("potted_sun_sap_pine_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT),
                    ModBlocks.SUN_SAP_PINE_SAPLING, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POTTED_MOON_SYRUP_FLOWER_SPRIG = BLOCKS.register
            ("potted_moon_syrup_flower_sprig", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT),
                    ModBlocks.MOON_SYRUP_FLOWER_SPRIG, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> RainbowFlower = registerBlock("rainbow_flower",
            () -> new FlowerBlock(MobEffects.GLOWING, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> POTTED_RainbowFlower = BLOCKS.register("potted_rainbow_flower",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RainbowFlower,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> CRYSTAL_SPIRE = registerBlock("crystal_spire",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    //add the wooden blocks
    public static final RegistryObject<Block> SUN_WOOD_STAIRS = registerBlock("sun_wood_stairs",
            () -> new StairBlock(SUN_SAP_PINE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).strength(6f)
                            .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_SLAB = registerBlock("sun_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).strength(6f)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_DOOR = registerBlock("sun_wood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).strength(6f)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_TRAPDOOR = registerBlock("sun_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).strength(6f)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_FENCE = registerBlock("sun_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, SUN_SAP_PINE_PLANKS.get()
                    .defaultMaterialColor()).strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_FENCE_GATE = registerBlock("sun_wood_fence_gate", () ->
            new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, SUN_SAP_PINE_PLANKS.get()
                    .defaultMaterialColor()).strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_BUTTON = registerBlock("sun_wood_button", () ->
            new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).strength(6f)
                    .requiresCorrectToolForDrops().requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> SUN_WOOD_PRESSURE_PLATE = registerBlock("sun_wood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of
                    (Material.WOOD,SUN_SAP_PINE_PLANKS.get().defaultMaterialColor()).noCollission()
                    .strength(0.5F).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);

    public static final RegistryObject<Block> MOON_STONE_STAIRS = registerBlock("moon_stone_stairs",
            () -> new StairBlock(MOON_SYRUP_FLOWER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_SLAB = registerBlock("moon_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_DOOR = registerBlock("moon_stone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_TRAPDOOR = registerBlock("moon_stone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),
            ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_FENCE = registerBlock("moon_stone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MOON_SYRUP_FLOWER_PLANKS.get()
                            .defaultMaterialColor()).requiresCorrectToolForDrops()
                    .strength(2.0F, 3.0F)), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_FENCE_GATE = registerBlock("moon_stone_fence_gate", () ->
            new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, SUN_SAP_PINE_PLANKS.get()
                            .defaultMaterialColor()).strength(2.0F, 3.0F)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_BUTTON = registerBlock("moon_stone_button", () ->
            new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).strength(6f)
                    .requiresCorrectToolForDrops().requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);
    public static final RegistryObject<Block> MOON_STONE_PRESSURE_PLATE = registerBlock("moon_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of
                            (Material.WOOD,SUN_SAP_PINE_PLANKS.get().defaultMaterialColor()).noCollission()
                    .strength(0.5F).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_BLOCKS);


    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? 0 : pLightValue;
        };
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
