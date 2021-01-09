package com.twotwintz.twotwintzmod.entity;

import com.twotwintz.twotwintzmod.init.InitEntities;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class RefineryTileEntity extends TileEntity /*implements ITickableTileEntity*/ {

    public RefineryTileEntity(final TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public RefineryTileEntity() {
        this(InitEntities.REFINERY.get());
    }

}
