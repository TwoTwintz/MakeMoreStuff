package com.twotwintz.twotwintzmod.items.specialitems;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BurnItem extends Item
{
    private final int burnTime;

    public BurnItem(String name, ItemGroup group, int stack, int burnTime)
    {
        super(new Properties().group(group).maxStackSize(stack));
        this.burnTime = burnTime;

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return burnTime;
    }
}
