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

    public static final RegistryObject<Item> TESTADVANCEDITEM = ITEMS.register("testadvanceditem",
            () -> new TESTADVANCEDITEM(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
