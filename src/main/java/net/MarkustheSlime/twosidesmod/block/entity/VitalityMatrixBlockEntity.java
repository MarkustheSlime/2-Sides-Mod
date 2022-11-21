package net.MarkustheSlime.twosidesmod.block.entity;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class VitalityMatrixBlockEntity extends BlockEntity implements IAnimatable{
        private final AnimationFactory manager = GeckoLibUtil.createFactory(this);

        private <E extends BlockEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
            AnimationController controller = event.getController();
            controller.setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
            return PlayState.CONTINUE;
        }

        public VitalityMatrixBlockEntity(BlockPos pos, BlockState state) {
            super(ModBlockEntities.VITALITY_MATRIX_TILE.get(), pos, state);
        }

        @Override
        public void registerControllers(AnimationData data) {
            data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
        }

        @Override
        public AnimationFactory getFactory() {
            return this.manager;
        }
}