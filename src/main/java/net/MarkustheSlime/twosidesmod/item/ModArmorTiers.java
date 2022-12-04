package net.MarkustheSlime.twosidesmod.item;

import net.MarkustheSlime.twosidesmod.TwoSidesMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {
    SUN_WOOD("sun_wood", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_GENERIC, 4.0F, 0.5F, () -> {
            return Ingredient.of(ModItems.SUN_FAIRY_WING.get());
    }),
    MOON_STONE("moon_stone", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_GENERIC, 4.0F, 0.5F, () -> {
            return Ingredient.of(ModItems.MOON_FAIRY_WING.get());
    }),
    DWARVEN("dwarven", 35, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.25F, () -> {
        return Ingredient.of(ModItems.DM_Shard.get());
    }),

    VITALITY("vitality", 50, new int[]{8, 11, 13, 8}, 30,
    SoundEvents.AMETHYST_CLUSTER_PLACE, 8.0F, 0.6F, () -> {
        return Ingredient.of(ModItems.VITALITY_Shard.get());
    }),

    INFLUENCE("influence", 50, new int[]{8, 11, 13, 8}, 30,
    SoundEvents.AMETHYST_CLUSTER_PLACE, 6.0F, 0.4F, () -> {
        return Ingredient.of(ModItems.INFLUENCE_Shard.get());
    }),

    PRIMALITY("primality", 50, new int[]{8, 11, 13, 8}, 30,
            SoundEvents.ENDERMAN_AMBIENT, 5.0F, 0.3F, () -> {
        return Ingredient.of(ModItems.PRIMAL_Shard.get());
    }),

    CONTROL("control", 50, new int[]{8, 11, 13, 8}, 30,
            SoundEvents.WOOL_PLACE, 4.5F, 0.3F, () -> {
        return Ingredient.of(ModItems.CONTROL_Shard.get());
    }),

    POWER("power", 50, new int[]{9, 12, 14, 9}, 30,
            SoundEvents.ARMOR_EQUIP_LEATHER, 7.0F, 0.8F, () -> {
        return Ingredient.of(ModItems.POWER_Shard.get());
    }),

    LIFE("life", 50, new int[]{8, 11, 13, 8}, 30,
            SoundEvents.BIG_DRIPLEAF_PLACE, 4.0F, 0.4F, () -> {
        return Ingredient.of(ModItems.LIFE_Shard.get());
    }),

    SOUL("soul", 50, new int[]{8, 11, 13, 8}, 30,
            SoundEvents.ANVIL_PLACE, 6.0F, 0.5F, () -> {
        return Ingredient.of(ModItems.SOUL_Shard.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

     ModArmorTiers(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return TwoSidesMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
