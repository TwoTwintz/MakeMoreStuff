package com.twotwintz.twotwintzmod.blocks.crops;

import com.twotwintz.twotwintzmod.init.InitBlocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SeedsAndCrop extends CropsBlock
{
    public SeedsAndCrop(String name, Properties builder, ItemGroup group)
    {
        super(builder);

        setRegistryName(name + "_crop");

        InitBlocks.blocks.add(this);
        InitBlocks.blockItems.add((BlockItem) new BlockItem(this, new Item.Properties().group(group)).setRegistryName(name + "_seeds"));
    }
}
