package net.MarkustheSlime.tutorialmod.fluid;

import com.mojang.math.Vector3f;
import net.MarkustheSlime.tutorialmod.Tutorialmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidType {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation DM_ESSENCE_OVERLAY_RL = new ResourceLocation(Tutorialmod.MOD_ID, "misc/in_dm_essence");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Tutorialmod.MOD_ID);
    public static final RegistryObject<FluidType> DM_ESSENCE_TYPE = register("dm_essence",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.EXPERIENCE_ORB_PICKUP));
    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, DM_ESSENCE_OVERLAY_RL,
                0x55FFFF, new Vector3f(85f / 255f, 255f / 255f, 255f / 255f), properties));
    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
