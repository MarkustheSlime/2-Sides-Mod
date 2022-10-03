package net.MarkustheSlime.twosidesmod.fluid;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_SSAP = FLUIDS.register("sun_sap_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SSAP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SSAP = FLUIDS.register("flowing_sun_sap",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SSAP_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SSAP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SunSap.SSAP_FLUID_TYPE, SOURCE_SSAP, FLOWING_SSAP)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.SSAP_BLOCK)
            .bucket(ModItems.SUN_SAP);

    public static final RegistryObject<FlowingFluid> SOURCE_DME = FLUIDS.register("dme_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DME = FLUIDS.register("flowing_dme",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DME_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties DME_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DME.DME_FLUID_TYPE, SOURCE_DME, FLOWING_DME)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.DME_BLOCK)
            .bucket(ModItems.DME_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_MSAP = FLUIDS.register("moon_syrup_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MSAP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MSAP = FLUIDS.register("flowing_moon_syrup",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MSAP_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MSAP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MoonSyrup.MSAP_FLUID_TYPE, SOURCE_MSAP, FLOWING_MSAP)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MSAP_BLOCK)
            .bucket(ModItems.MOON_SYRUP);

    public static final RegistryObject<FlowingFluid> SOURCE_GS = FLUIDS.register("gorgon_serum_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.GS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GS = FLUIDS.register("flowing_gorgon_serum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GS_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties GS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            MoonSyrup.MSAP_FLUID_TYPE, SOURCE_MSAP, FLOWING_GS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.GS_BLOCK)
            .bucket(ModItems.TRANSMUTATION_SERUM);




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
