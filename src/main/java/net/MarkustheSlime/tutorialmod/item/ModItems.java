package net.MarkustheSlime.tutorialmod.item;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.item.custom.TESTADVANCEDITEM;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);


    public static final RegistryObject<Item> D_Casing = ITEMS.register("d_casing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> DM_Shard = ITEMS.register("dm_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SOUL_Shard = ITEMS.register("soul_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> LIFE_Shard = ITEMS.register("life_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> POWER_Shard = ITEMS.register("power_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> CONTROL_Shard = ITEMS.register("control_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> PRIMAL_Shard = ITEMS.register("primal_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> INFLUENCE_Shard = ITEMS.register("influence_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> VITALITY_Shard = ITEMS.register("vitality_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> METEORITE_DEBRIS = ITEMS.register("meteorite_debris",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TESTADVANCEDITEM = ITEMS.register("testadvanceditem",
            () -> new TESTADVANCEDITEM(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
