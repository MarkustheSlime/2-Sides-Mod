package net.MarkustheSlime.twosidesmod.recipe;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DmTableRecipe>> GEM_INFUSING_SERIALIZER =
            SERIALIZERS.register("magic_infusing", () -> DmTableRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}