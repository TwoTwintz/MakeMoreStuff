package com.twotwintz.twotwintzmod.blocks;

import com.twotwintz.twotwintzmod.init.InitBlocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class ModFlowingFluidBlock extends FlowingFluidBlock {
    public ModFlowingFluidBlock(String name, Supplier<? extends FlowingFluid> supplier, Properties p_i48368_1_) {
        super(supplier, p_i48368_1_);

        setRegistryName(name);

        InitBlocks.blocks.add(this);
        InitBlocks.blockItems.add((BlockItem)new BlockItem(this, new Item.Properties()).setRegistryName(name));
    }
}
