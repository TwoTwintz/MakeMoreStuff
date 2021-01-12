package com.twotwintz.twotwintzmod.items.specialitems;

import com.twotwintz.twotwintzmod.blocks.crops.ModCrop;
import com.twotwintz.twotwintzmod.init.InitBlocks;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import com.twotwintz.twotwintzmod.items.ModBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CarrotTypeItem extends BlockItem
{
    public CarrotTypeItem(String name, ModCrop parentBlock, ItemGroup group, int hunger)
    {
        super(parentBlock, new Item.Properties().group(group).food(new Food.Builder().hunger(hunger).saturation(hunger).build()));

        setRegistryName(name);

        InitBlocks.blockItems.add(this);
    }
}
