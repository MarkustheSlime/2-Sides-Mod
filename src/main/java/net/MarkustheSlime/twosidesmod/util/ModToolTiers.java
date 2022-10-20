package net.MarkustheSlime.twosidesmod.util;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.MarkustheSlime.twosidesmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier DwarvenMagic;
    public static Tier SunWood;
    public static Tier MoonStone;

    static {
        DwarvenMagic = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24,
                        ModTags.Blocks.NEEDS_DM_TOOL, () -> Ingredient.of(ModItems.DM_Shard.get())),
                new ResourceLocation(TwoSidesMod.MOD_ID, "dm_shard"), List.of(Tiers.NETHERITE), List.of());
        SunWood = TierSortingRegistry.registerTier(
                new ForgeTier(6, 1500, 10f, 2f, 20,
                        ModTags.Blocks.NEEDS_SUN_TOOL, () -> Ingredient.of(ModItems.SUN_SAP.get())),
                new ResourceLocation(TwoSidesMod.MOD_ID, "sun_sap"), List.of(Tiers.NETHERITE), List.of());
        MoonStone = TierSortingRegistry.registerTier(
                new ForgeTier(6, 1500, 10f, 2f, 20,
                        ModTags.Blocks.NEEDS_MOON_TOOL, () -> Ingredient.of(ModItems.MOON_SYRUP.get())),
                new ResourceLocation(TwoSidesMod.MOD_ID, "moon_syrup"), List.of(Tiers.NETHERITE), List.of());
    }
}
