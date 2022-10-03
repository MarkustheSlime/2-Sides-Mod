package net.MarkustheSlime.twosidesmod.block;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.custom.*;
import net.MarkustheSlime.twosidesmod.ModCreativeModeTab;
import net.MarkustheSlime.twosidesmod.fluid.ModFluids;
import net.MarkustheSlime.twosidesmod.fluid.SunSap;
import net.MarkustheSlime.twosidesmod.item.ModItems;
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
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<Block> DM_BLOCK = registerBlock("dm_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<WallBlock> DM_WALL = registerBlock("dm_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DM_TABLE = registerBlock("dm_table",
            () -> new DMTABLEBLOCK(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DM_ORE = registerBlock("dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)),ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> SOUL_ORE = registerBlock("soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> LIFE_ORE = registerBlock("life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> POWER_ORE = registerBlock("power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> CONTROL_ORE = registerBlock("control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> PRIMAL_ORE = registerBlock("primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> INFLUENCE_ORE = registerBlock("influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> VITALITY_ORE = registerBlock("vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> METEORITE = registerBlock("meteorite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SOUL_ORE = registerBlock("deepslate_soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_LIFE_ORE = registerBlock("deepslate_life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_POWER_ORE = registerBlock("deepslate_power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_CONTROL_ORE = registerBlock("deepslate_control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PRIMAL_ORE = registerBlock("deepslate_primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_INFLUENCE_ORE = registerBlock("deepslate_influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DEEPSLATE_VITALITY_ORE = registerBlock("deepslate_vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public  static final RegistryObject<Block> DEEPSLATE_DM_ORE = registerBlock("deepslate_dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DarkSeeingBlock = registerBlock("darkseeingblock",
            () -> new DarkSeeingBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> DM_Lamp = registerBlock("dm_lamp",
            () -> new DM_Lamp_Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(DM_Lamp_Block.LIT) ? 0 : 15)),
            ModCreativeModeTab.TWO_SIDES_TAB);
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
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);
    public static final RegistryObject<Block> SUN_SAP_PINE_WOOD = registerBlock("sun_sap_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);
    public static final RegistryObject<Block> STRIPPED_SUN_SAP_PINE_LOG =
            registerBlock("stripped_sun_sap_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);
    public static final RegistryObject<Block> STRIPPED_SUN_SAP_PINE_WOOD =
            registerBlock("stripped_sun_sap_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.TWO_SIDES_TAB);

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
            }, ModCreativeModeTab.TWO_SIDES_TAB);
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
            }, ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> SUN_SAP_PINE_SAPLING = registerBlock("sun_sap_pine_sapling",
            () -> new SaplingBlock(new SunSapPineTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> POTTED_SUN_SAP_PINE_SAPLING = BLOCKS.register
            ("potted_sun_sap_pine_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT),
                    ModBlocks.SUN_SAP_PINE_SAPLING, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> RainbowFlower = registerBlock("rainbow_flower",
            () -> new FlowerBlock(MobEffects.GLOWING, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.TWO_SIDES_TAB);

    public static final RegistryObject<Block> POTTED_RainbowFlower = BLOCKS.register("potted_rainbow_flower",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.RainbowFlower,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> EXTRACTOR = registerBlock("sap_extractor",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0f)),
            ModCreativeModeTab.TWO_SIDES_TAB);


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
