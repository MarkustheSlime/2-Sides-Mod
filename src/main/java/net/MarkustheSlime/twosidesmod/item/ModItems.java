package net.MarkustheSlime.twosidesmod.item;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.entity.ModEntityTypes;
import net.MarkustheSlime.twosidesmod.fluid.ModFluids;
import net.MarkustheSlime.twosidesmod.item.custom.TESTADVANCEDITEM;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TwoSidesMod.MOD_ID);


    public static final RegistryObject<Item> D_Casing = ITEMS.register("d_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> DM_Shard = ITEMS.register("dm_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));

    public static final RegistryObject<Item> SOUL_Shard = ITEMS.register("soul_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> LIFE_Shard = ITEMS.register("life_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> POWER_Shard = ITEMS.register("power_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> CONTROL_Shard = ITEMS.register("control_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> PRIMAL_Shard = ITEMS.register("primal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> INFLUENCE_Shard = ITEMS.register("influence_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> VITALITY_Shard = ITEMS.register("vitality_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> METEORITE_DEBRIS = ITEMS.register("meteorite_debris",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));
    public static final RegistryObject<Item> GLOBSQUACH = ITEMS.register("globsquach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> GLOBSQUACH_SEEDS = ITEMS.register("globsquach_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GLOBSQUACH_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));

    public static final RegistryObject<Item> TESTADVANCEDITEM = ITEMS.register("testadvanceditem",
            () -> new TESTADVANCEDITEM(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DM_ESSENCE_BUCKET = ITEMS.register("dm_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DM_ESSENCE,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> DM_PICKAXE = ITEMS.register("dwarven_pick",
            () -> new PickaxeItem(ModToolTiers.DwarvenMagic, 8, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DM_GOLEM_SPAWNER = ITEMS.register("dm_golem_constructor",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DM_GOLEM, 0x55FFFF, 0x2DD7D7,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));

    public static final RegistryObject<Item> DEEP_GORGON_SPAWNER = ITEMS.register("deep_gorgon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DEEP_GORGON, 0x004f97, 0x00FF1F,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
