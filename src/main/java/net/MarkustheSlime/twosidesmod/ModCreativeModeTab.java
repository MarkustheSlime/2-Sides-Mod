package net.MarkustheSlime.twosidesmod;

import net.MarkustheSlime.twosidesmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TWO_SIDES_TAB  = new CreativeModeTab("twosidestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DM_PICKAXE.get());
        }
    };
}
