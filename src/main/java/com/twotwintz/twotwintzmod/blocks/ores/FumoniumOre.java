package com.twotwintz.twotwintzmod.blocks.ores;

import com.twotwintz.twotwintzmod.init.InitBlocks;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class FumoniumOre extends OreBlock {
    public FumoniumOre(String name, Material materialIn, float hardness, float resistance, int harvestLevel, ItemGroup tab) {
        super(Properties.create(materialIn).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel).harvestTool(ToolType.PICKAXE));

        setRegistryName(name);

        InitBlocks.blocks.add(this);
        InitBlocks.blockItems.add((BlockItem)new BlockItem(this, new Item.Properties().group(tab)).setRegistryName(name));
    }
}
