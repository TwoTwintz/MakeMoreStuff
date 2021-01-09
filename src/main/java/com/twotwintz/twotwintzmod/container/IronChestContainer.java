package com.twotwintz.twotwintzmod.container;

import com.twotwintz.twotwintzmod.entity.IronChestTileEntity;
;
import com.twotwintz.twotwintzmod.init.InitContainerTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import java.util.Objects;

public class IronChestContainer {

    //X = 12 Y = 18

    /*
    public final IronChestTileEntity tileEntity;
    private final IWorldPosCallable canInteractWith;

    public IronChestContainer(final int windowId, final PlayerInventory playerInventory, final IronChestTileEntity tileEntity) {
        super(InitContainerTypes.IRON_CHEST.get(), windowId);

        this.tileEntity = tileEntity;
        this.canInteractWith = IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos());

        //Chest Inventory

        int startX = 12;
        int startY = 18;
        int slotSizePlus2 = 18;

        for (int row = 0; row < 6; ++row){
            for(int column = 0; column < 9; ++column){
                this.addSlot(new Slot(tileEntity, (row * 9) + column, startX + (column * slotSizePlus2), startY + (row + slotSizePlus2)));
            }
        }
        //Player Inventory
        int playerInventoryStartY = 140;
        for (int row = 0; row < 3; ++row){
            for(int column = 0; column < 9; ++column){
                this.addSlot(new Slot(playerInventory, 9 + (row * 9) + column, startX + (column * slotSizePlus2), playerInventoryStartY + (row + slotSizePlus2)));
            }
        }
        //Player hotbar
        int hotbarY = 198;
        for (int row = 0; row < 3; ++row){
            for(int column = 0; column < 9; ++column){
                this.addSlot(new Slot(playerInventory, column, startX + (column * slotSizePlus2), hotbarY));
            }
        }
    }
    private static IronChestTileEntity getTileEntity(final PlayerInventory playerInventory, final PacketBuffer data){
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final TileEntity tileAtPosition = playerInventory.player.world.getTileEntity(data.readBlockPos());

        if(tileAtPosition instanceof IronChestTileEntity){
            return (IronChestTileEntity)tileAtPosition;
        }

        throw new IllegalStateException("Tile Entity is not correct : " + tileAtPosition);
    }


    public IronChestContainer(final int windowId, final PlayerInventory playerInventory, final PacketBuffer data){
        this(windowId, playerInventory, getTileEntity(playerInventory, data));
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWith, playerIn, );
    }

     */
}

