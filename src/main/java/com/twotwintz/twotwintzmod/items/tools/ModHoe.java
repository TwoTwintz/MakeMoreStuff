package com.twotwintz.twotwintzmod.items.tools;

import com.twotwintz.twotwintzmod.init.InitItems;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;

public class ModHoe extends HoeItem
{
    public ModHoe(String name, ModItemTier itemTier, ItemGroup itemGroup)
    {
        super(itemTier, 2.1f, new Properties().group(itemGroup));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
