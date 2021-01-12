package com.twotwintz.twotwintzmod.items.food;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModFood extends Item
{
    public ModFood(String name, int stackSize, ItemGroup group, int foodToGive, int staturationToGive)
    {
        super(new Properties().maxStackSize(stackSize).group(group).food(new Food.Builder().fastToEat().hunger(foodToGive).saturation(staturationToGive).build()));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
