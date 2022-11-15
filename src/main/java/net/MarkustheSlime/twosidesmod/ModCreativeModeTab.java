package net.MarkustheSlime.twosidesmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TWO_SIDES_ITEMS = new CreativeModeTab("twosidesitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DM_PICKAXE.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_BLOCKS = new CreativeModeTab("twosidesblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DM_TABLE.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_ENTITIES = new CreativeModeTab("twosidesentities") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEEP_GORGON_SPAWNER.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_ARMORS = new CreativeModeTab("twosidesarmors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOON_STONE_CHESTPLATE.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_FLUIDS = new CreativeModeTab("twosidesfluids") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DME_BUCKET.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_WEAPONS = new CreativeModeTab("twosidesweapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOON_STONE_SCYTHE.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_TOOLS = new CreativeModeTab("twosidestools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SUN_WOOD_PICKAXE.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_CROPS = new CreativeModeTab("twosidescrops") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GLOBSQUACH_SEEDS.get());
        }
    };
    public static final CreativeModeTab TWO_SIDES_FOODS = new CreativeModeTab("twosidesfoods") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GLOBSQUACH.get());
        }
    };
}
