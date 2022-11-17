package net.MarkustheSlime.twosidesmod.util;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_DM_TOOL
                = tag("needs_dm_tool");
        public static final TagKey<Block> NEEDS_SUN_TOOL
                = tag("needs_sun_tool");

        public static final TagKey<Block> NEEDS_MOON_TOOL
                = tag("needs_moon_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TwoSidesMod.MOD_ID, name));
        }
    }
}