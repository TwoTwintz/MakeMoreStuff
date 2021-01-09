package com.twotwintz.twotwintzmod.items.tools;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{
    FUMONIUM(3, 890, 8.9F, 5.0F, 3, 10, () ->
    {
        return Ingredient.fromItems(InitItems.fumonium_piece);
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float effiecency;
    private final float attackDamage;
    private final int attackDamageInt;
    private final int enchantablity;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float effiecency, float attackDamage, int attackDamageInt, int enchantablity, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.effiecency = effiecency;
        this.attackDamage = attackDamage;
        this.attackDamageInt = attackDamageInt;
        this.enchantablity = enchantablity;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantablity;
    }

    @Override
    public int getMaxUses()
    {
        return maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return effiecency;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return repairMaterial.getValue();
    }

    public int getAttackDamageInt()
    {
        return attackDamageInt;
    }
}
