package net.MarkustheSlime.twosidesmod.fluid;

import com.mojang.math.Vector3f;
import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("textures/block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("textures/block/water_flow");
    public static final ResourceLocation DM_OVERLAY_RL = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/misc/in_dm_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TwoSidesMod.MOD_ID);

    public static final RegistryObject<FluidType> DM_ESSENCE_FLUID_TYPE = register("dm_essence_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, DM_OVERLAY_RL,
                0x33FEFF, new Vector3f(51f / 255f, 254f / 255f, 254f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
