package net.MarkustheSlime.twosidesmod.entity;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.cboss.CBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.iboss.IBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.lboss.LBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.mboss.MBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.poboss.QBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.rboss.RBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.sboss.SBossEntity;
import net.MarkustheSlime.twosidesmod.entity.geodes.bosses.vboss.VBossEntity;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.deep_gorgon.DeepGorgonEntity;
import net.MarkustheSlime.twosidesmod.entity.dwarven_mines.dm_golem.DmGolemEntity;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_fairy.MoonFairyEntity;
import net.MarkustheSlime.twosidesmod.entity.moon_caverns.moon_stone_angel.MoonStoneAngelEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_fairy.SunFairyEntity;
import net.MarkustheSlime.twosidesmod.entity.sun_woods.sun_troll.SunTrollEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
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

    public static final RegistryObject<EntityType<SBossEntity>> SBOSS =
            ENTITY_TYPES.register("sboss",
                    () -> EntityType.Builder.of(SBossEntity::new, MobCategory.MONSTER)
                            .sized(3f, 6f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "sboss").toString()));
    public static final RegistryObject<EntityType<LBossEntity>> LBOSS =
            ENTITY_TYPES.register("lboss",
                    () -> EntityType.Builder.of(LBossEntity::new, MobCategory.MONSTER)
                            .sized(1f, 6f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "lboss").toString()));
    public static final RegistryObject<EntityType<QBossEntity>> QBOSS =
            ENTITY_TYPES.register("qboss",
                    () -> EntityType.Builder.of(QBossEntity::new, MobCategory.MONSTER)
                            .sized(7.5f, 8f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "qboss").toString()));
    public static final RegistryObject<EntityType<CBossEntity>> CBOSS =
            ENTITY_TYPES.register("cboss",
                    () -> EntityType.Builder.of(CBossEntity::new, MobCategory.MONSTER)
                            .sized(8f, 11.8f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "cboss").toString()));
    public static final RegistryObject<EntityType<RBossEntity>> RBOSS =
            ENTITY_TYPES.register("rboss",
                    () -> EntityType.Builder.of(RBossEntity::new, MobCategory.MONSTER)
                            .sized(5f, 12.5f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "rboss").toString()));
    public static final RegistryObject<EntityType<IBossEntity>> IBOSS =
            ENTITY_TYPES.register("iboss",
                    () -> EntityType.Builder.of(IBossEntity::new, MobCategory.MONSTER)
                            .sized(2.5f, 6.0f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "iboss").toString()));
    public static final RegistryObject<EntityType<VBossEntity>> VBOSS =
            ENTITY_TYPES.register("vboss",
                    () -> EntityType.Builder.of(VBossEntity::new, MobCategory.MONSTER)
                            .sized(3.5f, 5f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "vboss").toString()));
    public static final RegistryObject<EntityType<MBossEntity>> MBOSS =
            ENTITY_TYPES.register("mboss",
                    () -> EntityType.Builder.of(MBossEntity::new, MobCategory.MONSTER)
                            .sized(3.5f, 5f)
                            .build(new ResourceLocation(TwoSidesMod.MOD_ID, "mboss").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
