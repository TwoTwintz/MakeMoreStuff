package com.twotwintz.twotwintzmod.blocks.machines;

import com.twotwintz.twotwintzmod.blocks.ModBlocks;
import com.twotwintz.twotwintzmod.init.InitEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Refinery extends ModBlocks {

    public Refinery(String name, Material materialIn, float hardness, float ressistance, int harvestLevel, ItemGroup tab) {
        super(name, materialIn, hardness, ressistance, harvestLevel, tab);
    }

    //On explique dans cette fonction que le blocks ca une tile entity

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return InitEntities.REFINERY.get().create();
    }
}
