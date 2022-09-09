package net.MarkustheSlime.tutorialmod.block;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.block.custom.*;
import net.MarkustheSlime.tutorialmod.fluid.ModFluids;
import net.MarkustheSlime.tutorialmod.item.ModCreativeModeTab;
import net.MarkustheSlime.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorialmod.MOD_ID);

    public static final RegistryObject<Block> DM_BLOCK = registerBlock("dm_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<WallBlock> DM_WALL = registerBlock("dm_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DM_TABLE = registerBlock("dm_table",
            () -> new DMTABLEBLOCK(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DM_ORE = registerBlock("dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)),ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> SOUL_ORE = registerBlock("soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> LIFE_ORE = registerBlock("life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> POWER_ORE = registerBlock("power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> CONTROL_ORE = registerBlock("control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> PRIMAL_ORE = registerBlock("primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> INFLUENCE_ORE = registerBlock("influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> VITALITY_ORE = registerBlock("vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> METEORITE = registerBlock("meteorite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SOUL_ORE = registerBlock("deepslate_soul_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_LIFE_ORE = registerBlock("deepslate_life_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_POWER_ORE = registerBlock("deepslate_power_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_CONTROL_ORE = registerBlock("deepslate_control_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PRIMAL_ORE = registerBlock("deepslate_primal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_INFLUENCE_ORE = registerBlock("deepslate_influence_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_VITALITY_ORE = registerBlock("deepslate_vitality_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public  static final RegistryObject<Block> DEEPSLATE_DM_ORE = registerBlock("deepslate_dm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DarkSeeingBlock = registerBlock("darkseeingblock",
            () -> new DarkSeeingBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DM_Lamp = registerBlock("dm_lamp",
            () -> new DM_Lamp_Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(DM_Lamp_Block.LIT) ? 0 : 15)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> GLOBSQUACH_CROP = BLOCKS.register("globsquach_crop",
            () -> new GlobsquachCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<LiquidBlock> DM_ESSENCE_BLOCK = BLOCKS.register("dm_essence_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DM_ESSENCE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
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
