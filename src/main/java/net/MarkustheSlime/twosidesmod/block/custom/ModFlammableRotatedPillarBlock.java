package net.MarkustheSlime.twosidesmod.block.custom;

import net.MarkustheSlime.twosidesmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

    public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
        public ModFlammableRotatedPillarBlock(Properties pProperties) {
            super(pProperties);
        }

        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return true;
        }

        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }

        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return 5;
        }

        @Override
        public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
            if(context.getItemInHand().getItem() instanceof AxeItem) {
                if(state.is(ModBlocks.SUN_SAP_PINE_LOG.get())) {
                    return ModBlocks.STRIPPED_SUN_SAP_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }

                if(state.is(ModBlocks.SUN_SAP_PINE_WOOD.get())) {
                    return ModBlocks.STRIPPED_SUN_SAP_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
            }

            /*if(context.getItemInHand().getItem() instanceof PickaxeItem) {
                if(state.is(ModBlocks.MOON_SYRUP_FLOWER_LOG.get())) {
                    return ModBlocks.STRIPPED_MOON_SYRUP_FLOWER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }

                if(state.is(ModBlocks.MOON_SYRUP_FLOWER_WOOD.get())) {
                    return ModBlocks.STRIPPED_MOON_SYRUP_FLOWER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
            }*/

            return super.getToolModifiedState(state, context, toolAction, simulate);
        }
    }
