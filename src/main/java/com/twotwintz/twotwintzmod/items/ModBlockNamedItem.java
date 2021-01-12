package com.twotwintz.twotwintzmod.items;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;

public class ModBlockNamedItem extends BlockNamedItem
{
    public ModBlockNamedItem(String name, Block blockIn, ItemGroup itemGroup)
    {
        super(blockIn, new Properties().group(itemGroup));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
