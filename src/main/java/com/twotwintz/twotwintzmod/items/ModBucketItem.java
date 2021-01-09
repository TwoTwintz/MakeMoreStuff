package com.twotwintz.twotwintzmod.items;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBucketItem extends BucketItem {
    public ModBucketItem(String name, Supplier<? extends Fluid> fluid, Item containerItem, ItemGroup group) {
        super(fluid, new Properties().containerItem(containerItem).maxStackSize(1).group(group));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
