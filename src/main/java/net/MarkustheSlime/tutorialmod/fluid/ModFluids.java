package net.MarkustheSlime.tutorialmod.fluid;

import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.MarkustheSlime.tutorialmod.block.ModBlocks;
import net.MarkustheSlime.tutorialmod.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Tutorialmod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_DM_ESSENCE = FLUIDS.register("dm_essence_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DM_ESSENCE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DM_ESSENCE = FLUIDS.register("flowing_dm_essence",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DM_ESSENCE_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties DM_ESSENCE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.DM_ESSENCE_FLUID_TYPE, SOURCE_DM_ESSENCE, FLOWING_DM_ESSENCE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.DM_ESSENCE_BLOCK)
            .bucket(ModItems.DM_ESSENCE_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
