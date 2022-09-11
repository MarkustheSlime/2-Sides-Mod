package net.MarkustheSlime.tutorialmod.block.entity;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Tutorialmod.MOD_ID);

    public static final RegistryObject<BlockEntityType<DmTableBlockEntity>> DM_TABLE =
            BLOCK_ENTITIES.register("dm_table", () ->
                    BlockEntityType.Builder.of(DmTableBlockEntity::new,
                            ModBlocks.DM_TABLE.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
