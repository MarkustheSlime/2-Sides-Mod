package net.MarkustheSlime.twosidesmod.item;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
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

    static {
        DwarvenMagic = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24,
                        ModTags.Blocks.NEEDS_DM_TOOL, () -> Ingredient.of(ModItems.DM_Shard.get())),
                new ResourceLocation(TwoSidesMod.MOD_ID, "dm_shard"), List.of(Tiers.NETHERITE), List.of());
    }
}
