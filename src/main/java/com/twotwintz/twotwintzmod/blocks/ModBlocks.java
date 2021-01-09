package com.twotwintz.twotwintzmod.blocks;

import com.twotwintz.twotwintzmod.init.InitBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModBlocks extends Block {

    public ModBlocks(String name , Material materialIn, float hardness, float ressistance, int harvestLevel, ItemGroup tab) {
        super(Properties.create(materialIn).hardnessAndResistance(hardness, ressistance).harvestLevel(harvestLevel));

        setRegistryName(name);

        InitBlocks.blocks.add(this);
        InitBlocks.blockItems.add((BlockItem)new BlockItem(this, new Item.Properties().group(tab)).setRegistryName(name));
    }
}
