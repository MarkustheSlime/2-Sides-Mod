package net.MarkustheSlime.twosidesmod.block.entity;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TwoSidesMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<DmTableBlockEntity>> DM_TABLE =
            BLOCK_ENTITIES.register("dm_table", () ->
                    BlockEntityType.Builder.of(DmTableBlockEntity::new,
                            ModBlocks.DM_TABLE.get()).build(null));
    public static final RegistryObject<BlockEntityType<SoulMatrixBlockEntity>> SOUL_MATRIX_TILE =
            BLOCK_ENTITIES.register("soulmatrixblocktile", () ->
                    BlockEntityType.Builder.of(SoulMatrixBlockEntity::new,
                            ModBlocks.SOUL_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<LifeMatrixBlockEntity>> LIFE_MATRIX_TILE =
            BLOCK_ENTITIES.register("lifematrixblocktile", () ->
                    BlockEntityType.Builder.of(LifeMatrixBlockEntity::new,
                            ModBlocks.LIFE_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<PowerMatrixBlockEntity>> POWER_MATRIX_TILE =
            BLOCK_ENTITIES.register("powermatrixblocktile", () ->
                    BlockEntityType.Builder.of(PowerMatrixBlockEntity::new,
                            ModBlocks.POWER_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<ControlMatrixBlockEntity>> CONTROL_MATRIX_TILE =
            BLOCK_ENTITIES.register("controlmatrixblocktile", () ->
                    BlockEntityType.Builder.of(ControlMatrixBlockEntity::new,
                            ModBlocks.CONTROL_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<PrimalMatrixBlockEntity>> PRIMAL_MATRIX_TILE =
            BLOCK_ENTITIES.register("primalmatrixblocktile", () ->
                    BlockEntityType.Builder.of(PrimalMatrixBlockEntity::new,
                            ModBlocks.PRIMAL_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<InfluenceMatrixBlockEntity>> INFLUENCE_MATRIX_TILE =
            BLOCK_ENTITIES.register("influencematrixblocktile", () ->
                    BlockEntityType.Builder.of(InfluenceMatrixBlockEntity::new,
                            ModBlocks.INFLUENCE_MATRIX.get()).build(null));
    public static final RegistryObject<BlockEntityType<VitalityMatrixBlockEntity>> VITALITY_MATRIX_TILE =
            BLOCK_ENTITIES.register("vitalitymatrixblocktile", () ->
                    BlockEntityType.Builder.of(VitalityMatrixBlockEntity::new,
                            ModBlocks.VITALITY_MATRIX.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
