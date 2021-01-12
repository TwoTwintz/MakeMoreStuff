package com.twotwintz.twotwintzmod.items;

import com.twotwintz.twotwintzmod.blocks.crops.ModCrop;
import com.twotwintz.twotwintzmod.init.InitBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModBlockItem extends BlockItem
{
    public ModBlockItem(String name, ModCrop parentBlock, ItemGroup group)
    {
        super(parentBlock, new Item.Properties().group(group));

        setRegistryName(name);

        InitBlocks.blockItems.add(this);
    }
}
