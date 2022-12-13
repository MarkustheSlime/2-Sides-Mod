package net.MarkustheSlime.twosidesmod.item;

import net.MarkustheSlime.twosidesmod.*;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.entity.ModEntityTypes;
import net.MarkustheSlime.twosidesmod.fluid.ModFluids;
import net.MarkustheSlime.twosidesmod.item.custom.armors.DWARVEN.DwarvenArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.MOON.MoonStoneArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.SUN.SunWoodArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.EARTH.EarthArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.FIRE.FireArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WATER.WaterArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.CONTROL.WIND.WindArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.INFLUENCE.InfluenceArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.LIFE.LifeArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.POWER.PowerArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.PRIMAL.PrimalArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.SOUL.SoulArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.armors.geodes.VITALITY.VitalityArmorItem;
import net.MarkustheSlime.twosidesmod.item.custom.geodes.*;
import net.MarkustheSlime.twosidesmod.item.custom.tutorial.TESTADVANCEDITEM;
import net.minecraft.world.entity.EquipmentSlot;
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

    public static final RegistryObject<Item> SOUL_MATRIX_ITEM = ITEMS.register("soul_matrix_item",
            () -> new SoulMatrixBlockItem(ModBlocks.SOUL_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> LIFE_MATRIX_ITEM = ITEMS.register("life_matrix_item",
            () -> new LifeMatrixBlockItem(ModBlocks.LIFE_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> POWER_MATRIX_ITEM = ITEMS.register("power_matrix_item",
            () -> new PowerMatrixBlockItem(ModBlocks.POWER_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> CONTROL_MATRIX_ITEM = ITEMS.register("control_matrix_item",
            () -> new ControlMatrixBlockItem(ModBlocks.CONTROL_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> PRIMAL_MATRIX_ITEM = ITEMS.register("primal_matrix_item",
            () -> new PrimalMatrixBlockItem(ModBlocks.PRIMAL_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> INFLUENCE_MATRIX_ITEM = ITEMS.register("influence_matrix_item",
            () -> new InfluenceMatrixBlockItem(ModBlocks.INFLUENCE_MATRIX.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> VITALITY_MATRIX_ITEM = ITEMS.register("vitality_matrix_item",
            () -> new VitalityMatrixBlockItem(ModBlocks.VITALITY_MATRIX.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> DM_Shard = ITEMS.register("dm_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> SOUL_Shard = ITEMS.register("soul_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> LIFE_Shard = ITEMS.register("life_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> POWER_Shard = ITEMS.register("power_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> CONTROL_Shard = ITEMS.register("control_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> PRIMAL_Shard = ITEMS.register("primal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> INFLUENCE_Shard = ITEMS.register("influence_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> VITALITY_Shard = ITEMS.register("vitality_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> METEORITE_DEBRIS = ITEMS.register("meteorite_debris",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));

    public static final RegistryObject<Item> GLOBSQUACH = ITEMS.register("globsquach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_FOODS)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> GLOBSQUACH_SEEDS = ITEMS.register("globsquach_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GLOBSQUACH_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_CROPS)));

    public static final RegistryObject<Item> TESTADVANCEDITEM = ITEMS.register("testadvanceditem",
            () -> new TESTADVANCEDITEM(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TOOLS).stacksTo(1)));

    public static final RegistryObject<Item> DM_PICKAXE = ITEMS.register("dwarven_pick",
            () -> new PickaxeItem(ModToolTiers.DwarvenMagic, 8, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> SUN_WOOD_PICKAXE = ITEMS.register("sun_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SunWood, 9, 1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_TOOLS).stacksTo(1)));

    public static final RegistryObject<Item> SUN_WOOD_SWORD = ITEMS.register("sun_wood_blade",
            () -> new SwordItem(ModToolTiers.SunWood, 10, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_WEAPONS).stacksTo(1)));
    public static final RegistryObject<Item> MOON_STONE_AXE = ITEMS.register("moon_stone_battle_axe",
            () -> new SwordItem(ModToolTiers.MoonStone, 11, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_WEAPONS).stacksTo(1)));
    public static final RegistryObject<Item> MOON_STONE_SCYTHE = ITEMS.register("moon_stone_scythe",
            () -> new SwordItem(ModToolTiers.MoonStone, 15, 0.5f,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_WEAPONS).stacksTo(1)));


    public static final RegistryObject<Item> DM_GOLEM_SPAWNER = ITEMS.register("dm_golem_constructor",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DM_GOLEM, 0x55FFFF, 0x2DD7D7,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> DEEP_GORGON_SPAWNER = ITEMS.register("deep_gorgon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DEEP_GORGON, 0x004f97, 0x00FF1F,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> SUN_FAIRY_SPAWNER = ITEMS.register("sun_fairy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SUN_FAIRY, 0x4c6603, 0xBAAA00  ,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> SUN_TROLL_SPAWNER = ITEMS.register("sun_troll_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SUN_TROLL, 0x4c6603 , 0xeedb19   ,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> MOON_FAIRY_SPAWNER = ITEMS.register("moon_fairy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MOON_FAIRY, 0x004f97, 0x00F6FF  ,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> MOON_STONE_ANGEL_SPAWNER = ITEMS.register("moon_stone_angel_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MOON_STONE_ANGEL, 0x35249f , 0x41f6ff   ,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));
    public static final RegistryObject<Item> SBOSS_SPAWNER = ITEMS.register("sboss_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SBOSS, 0xfafbe3  , 0x900C3F    ,
                    new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ENTITIES)));

    public static final RegistryObject<Item> D_Casing = ITEMS.register("d_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> SUN_FAIRY_WING = ITEMS.register("sun_fairy_wing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> MOON_FAIRY_WING = ITEMS.register("moon_fairy_wing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> TROLL_FAT = ITEMS.register("troll_fat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> MOON_SHARD = ITEMS.register("moon_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> SUN_WOOD_STICK = ITEMS.register("sun_wood_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> MOON_STONE_STICK = ITEMS.register("moon_stone_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> DWARVEN_BULB = ITEMS.register("dwarven_bulb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> SBOSS_SHARD = ITEMS.register("knightly_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> LBOSS_SHARD = ITEMS.register("mage_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> POBOSS_SHARD = ITEMS.register("toughness_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> CBOSS_SHARD = ITEMS.register("elementalist_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> PRBOSS_SHARD = ITEMS.register("druid_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> IBOSS_SHARD = ITEMS.register("mob_king_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));
    public static final RegistryObject<Item> VBOSS_SHARD = ITEMS.register("immortalist_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_ITEMS)));

    public static final RegistryObject<Item> TRANSMUTATION_SERUM = ITEMS.register("gorgon_serum",
            () -> new BucketItem(ModFluids.SOURCE_GS, new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_FLUIDS)
                    .craftRemainder(Items.BUCKET).stacksTo(16)));
    public static final RegistryObject<Item> DME_BUCKET = ITEMS.register("dm_essence_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DME, new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_FLUIDS)
                    .craftRemainder(Items.BUCKET).stacksTo(16)));
    public static final RegistryObject<Item> SUN_SAP = ITEMS.register("sun_sap",
            () -> new BucketItem(ModFluids.SOURCE_SSAP, new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_FLUIDS)
                    .craftRemainder(Items.BUCKET).stacksTo(16)));
    public static final RegistryObject<Item> MOON_SYRUP = ITEMS.register("moon_syrup",
            () -> new BucketItem(ModFluids.SOURCE_MSAP, new Item.Properties().tab(ModCreativeModeTab.TWO_SIDES_FLUIDS)
                    .craftRemainder(Items.BUCKET).stacksTo(16)));

    public static final RegistryObject<MoonStoneArmorItem> MOON_STONE_HELMET = ITEMS.register("moon_stone_helm",
            () -> new MoonStoneArmorItem(ModArmorTiers.MOON_STONE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< MoonStoneArmorItem> MOON_STONE_CHESTPLATE = ITEMS.register("moon_stone_chest",
            () -> new MoonStoneArmorItem(ModArmorTiers.MOON_STONE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< MoonStoneArmorItem> MOON_STONE_LEGGINGS = ITEMS.register("moon_stone_leggings",
            () -> new MoonStoneArmorItem(ModArmorTiers.MOON_STONE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< MoonStoneArmorItem> MOON_STONE_BOOTS = ITEMS.register("moon_stone_boots",
            () -> new MoonStoneArmorItem(ModArmorTiers.MOON_STONE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< SunWoodArmorItem> SUN_WOOD_HELMET = ITEMS.register("sun_wood_helm",
            () -> new SunWoodArmorItem(ModArmorTiers.SUN_WOOD, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< SunWoodArmorItem> SUN_WOOD_CHESTPLATE = ITEMS.register("sun_wood_chest",
            () -> new SunWoodArmorItem(ModArmorTiers.SUN_WOOD, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< SunWoodArmorItem> SUN_WOOD_LEGGINGS = ITEMS.register("sun_wood_leggings",
            () -> new SunWoodArmorItem(ModArmorTiers.SUN_WOOD, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< SunWoodArmorItem> SUN_WOOD_BOOTS = ITEMS.register("sun_wood_boots",
            () -> new SunWoodArmorItem(ModArmorTiers.SUN_WOOD, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<DwarvenArmorItem> DWARVEN_HELMET = ITEMS.register("dwarven_helm",
            () -> new DwarvenArmorItem(ModArmorTiers.DWARVEN, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< DwarvenArmorItem> DWARVEN_CHESTPLATE = ITEMS.register("dwarven_chest",
            () -> new DwarvenArmorItem(ModArmorTiers.DWARVEN, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< DwarvenArmorItem> DWARVEN_LEGGINGS = ITEMS.register("dwarven_leggings",
            () -> new DwarvenArmorItem(ModArmorTiers.DWARVEN, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< DwarvenArmorItem> DWARVEN_BOOTS = ITEMS.register("dwarven_boots",
            () -> new DwarvenArmorItem(ModArmorTiers.DWARVEN, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<VitalityArmorItem> VITALITY_HELMET = ITEMS.register("vitality_helm",
            () -> new VitalityArmorItem(ModArmorTiers.VITALITY, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< VitalityArmorItem> VITALITY_CHESTPLATE = ITEMS.register("vitality_chest",
            () -> new VitalityArmorItem(ModArmorTiers.VITALITY, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< VitalityArmorItem> VITALITY_LEGGINGS = ITEMS.register("vitality_leggings",
            () -> new VitalityArmorItem(ModArmorTiers.VITALITY, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject< VitalityArmorItem> VITALITY_BOOTS = ITEMS.register("vitality_boots",
            () -> new VitalityArmorItem(ModArmorTiers.VITALITY, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<InfluenceArmorItem> INFLUENCE_HELMET = ITEMS.register("influence_helm",
            () -> new InfluenceArmorItem(ModArmorTiers.INFLUENCE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<InfluenceArmorItem> INFLUENCE_CHESTPLATE = ITEMS.register("influence_chest",
            () -> new InfluenceArmorItem(ModArmorTiers.INFLUENCE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<InfluenceArmorItem> INFLUENCE_LEGGINGS = ITEMS.register("influence_leggings",
            () -> new InfluenceArmorItem(ModArmorTiers.INFLUENCE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<InfluenceArmorItem> INFLUENCE_BOOTS = ITEMS.register("influence_boots",
            () -> new InfluenceArmorItem(ModArmorTiers.INFLUENCE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PrimalArmorItem> PRIMAL_HELMET = ITEMS.register("primal_helm",
            () -> new PrimalArmorItem(ModArmorTiers.PRIMALITY, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PrimalArmorItem> PRIMAL_CHESTPLATE = ITEMS.register("primal_chest",
            () -> new PrimalArmorItem(ModArmorTiers.PRIMALITY, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PrimalArmorItem> PRIMAL_LEGGINGS = ITEMS.register("primal_leggings",
            () -> new PrimalArmorItem(ModArmorTiers.PRIMALITY, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PrimalArmorItem> PRIMAL_BOOTS = ITEMS.register("primal_boots",
            () -> new PrimalArmorItem(ModArmorTiers.PRIMALITY, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WindArmorItem> WINDCONTROL_HELMET = ITEMS.register("wind_helm",
            () -> new WindArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WindArmorItem> WINDCONTROL_CHESTPLATE = ITEMS.register("wind_chest",
            () -> new WindArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WindArmorItem> WINDCONTROL_LEGGINGS = ITEMS.register("wind_leggings",
            () -> new WindArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WindArmorItem> WINDCONTROL_BOOTS = ITEMS.register("wind_boots",
            () -> new WindArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<EarthArmorItem> EARTHCONTROL_HELMET = ITEMS.register("earth_helm",
            () -> new EarthArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<EarthArmorItem> EARTHCONTROL_CHESTPLATE = ITEMS.register("earth_chest",
            () -> new EarthArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<EarthArmorItem> EARTHCONTROL_LEGGINGS = ITEMS.register("earth_leggings",
            () -> new EarthArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<EarthArmorItem> EARTHCONTROL_BOOTS = ITEMS.register("earth_boots",
            () -> new EarthArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WaterArmorItem> WATERCONTROL_HELMET = ITEMS.register("water_helm",
            () -> new WaterArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WaterArmorItem> WATERCONTROL_CHESTPLATE = ITEMS.register("water_chest",
            () -> new WaterArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WaterArmorItem> WATERCONTROL_LEGGINGS = ITEMS.register("water_leggings",
            () -> new WaterArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<WaterArmorItem> WATERCONTROL_BOOTS = ITEMS.register("water_boots",
            () -> new WaterArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<FireArmorItem> FIRECONTROL_HELMET = ITEMS.register("fire_helm",
            () -> new FireArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<FireArmorItem> FIRECONTROL_CHESTPLATE = ITEMS.register("fire_chest",
            () -> new FireArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<FireArmorItem> FIRECONTROL_LEGGINGS = ITEMS.register("fire_leggings",
            () -> new FireArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<FireArmorItem> FIRECONTROL_BOOTS = ITEMS.register("fire_boots",
            () -> new FireArmorItem(ModArmorTiers.CONTROL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PowerArmorItem> POWER_HELMET = ITEMS.register("power_helm",
            () -> new PowerArmorItem(ModArmorTiers.POWER, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PowerArmorItem> POWER_CHESTPLATE = ITEMS.register("power_chest",
            () -> new PowerArmorItem(ModArmorTiers.POWER, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PowerArmorItem> POWER_LEGGINGS = ITEMS.register("power_leggings",
            () -> new PowerArmorItem(ModArmorTiers.POWER, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<PowerArmorItem> POWER_BOOTS = ITEMS.register("power_boots",
            () -> new PowerArmorItem(ModArmorTiers.POWER, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<LifeArmorItem> LIFE_HELMET = ITEMS.register("life_helm",
            () -> new LifeArmorItem(ModArmorTiers.LIFE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<LifeArmorItem> LIFE_CHESTPLATE = ITEMS.register("life_chest",
            () -> new LifeArmorItem(ModArmorTiers.LIFE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<LifeArmorItem> LIFE_LEGGINGS = ITEMS.register("life_leggings",
            () -> new LifeArmorItem(ModArmorTiers.LIFE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<LifeArmorItem> LIFE_BOOTS = ITEMS.register("life_boots",
            () -> new LifeArmorItem(ModArmorTiers.LIFE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<SoulArmorItem> SOUL_HELMET = ITEMS.register("soul_helm",
            () -> new SoulArmorItem(ModArmorTiers.SOUL, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<SoulArmorItem> SOUL_CHESTPLATE = ITEMS.register("soul_chest",
            () -> new SoulArmorItem(ModArmorTiers.SOUL, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<SoulArmorItem> SOUL_LEGGINGS = ITEMS.register("soul_leggings",
            () -> new SoulArmorItem(ModArmorTiers.SOUL, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));
    public static final RegistryObject<SoulArmorItem> SOUL_BOOTS = ITEMS.register("soul_boots",
            () -> new SoulArmorItem(ModArmorTiers.SOUL, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.TWO_SIDES_ARMORS)));



    //tip: don't use gecko lib for items/blocks unless they have to be animated
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
