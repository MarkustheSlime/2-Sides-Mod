package net.MarkustheSlime.twosidesmod.entity;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.deep_gorgon.DeepGorgonEntity;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.dm_golem.DmGolemEntity;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_fairy.MoonFairyEntity;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel.MoonStoneAngelEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_fairy.SunFairyEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_troll.SunTrollEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.enchantment.FireAspectEnchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TntBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TwoSidesMod.MOD_ID);

    public static final RegistryObject<EntityType<DmGolemEntity>> DM_GOLEM =
            ENTITY_TYPES.register("dm_golem",
                    () -> EntityType.Builder.of(DmGolemEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 1.5f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "dm_golem").toString()));

    public static final RegistryObject<EntityType<DeepGorgonEntity>> DEEP_GORGON =
            ENTITY_TYPES.register("deep_gorgon",
                    () -> EntityType.Builder.of(DeepGorgonEntity::new, MobCategory.MONSTER)
                            .sized(3f, 2.0f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "deep_gorgon").toString()));

    public static final RegistryObject<EntityType<SunFairyEntity>> SUN_FAIRY =
            ENTITY_TYPES.register("sun_fairy",
                    () -> EntityType.Builder.of(SunFairyEntity::new, MobCategory.CREATURE)
                            .sized(0.4f, 0.8f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "sun_fairy").toString()));

    public static final RegistryObject<EntityType<SunTrollEntity>> SUN_TROLL =
            ENTITY_TYPES.register("sun_troll",
                    () -> EntityType.Builder.of(SunTrollEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 3.0f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "sun_troll").toString()));

    public static final RegistryObject<EntityType<MoonFairyEntity>> MOON_FAIRY =
            ENTITY_TYPES.register("moon_fairy",
                    () -> EntityType.Builder.of(MoonFairyEntity::new, MobCategory.CREATURE)
                            .sized(0.4f, 0.8f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "moon_fairy").toString()));

    public static final RegistryObject<EntityType<MoonStoneAngelEntity>> MOON_STONE_ANGEL =
            ENTITY_TYPES.register("moonshard_angel",
                    () -> EntityType.Builder.of(MoonStoneAngelEntity::new, MobCategory.MONSTER)
                            .sized(5f, 10f).fireImmune()
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "moonshard_angel").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
