package com.twotwintz.twotwintzmod.items;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems extends Item {
    public ModItems(int stackSize, ItemGroup groupItem, String name) {
        super(new Properties().group(groupItem).maxStackSize(stackSize));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
