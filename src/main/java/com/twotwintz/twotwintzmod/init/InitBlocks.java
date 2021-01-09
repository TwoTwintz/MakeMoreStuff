package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.TwoTwintzMod;
import com.twotwintz.twotwintzmod.blocks.IronChest;
import com.twotwintz.twotwintzmod.blocks.ModFlowingFluidBlock;
import com.twotwintz.twotwintzmod.blocks.machines.Refinery;
import com.twotwintz.twotwintzmod.blocks.ores.FumoniumOre;
import com.twotwintz.twotwintzmod.itemgroup.ModBlockGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = TwoTwintzMod.MOD_ID , bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks{
    public static ArrayList<Block> blocks;
    public static ArrayList<BlockItem> blockItems;

    public static IronChest iron_chest;
    public static Refinery refinery;
    public static FumoniumOre fumonium_ore;
    public static ModFlowingFluidBlock liquid_plutocethylen_block;

    private static void init(){
        blocks = new ArrayList<>();
        blockItems = new ArrayList<>();

        liquid_plutocethylen_block = new ModFlowingFluidBlock("liquid_plutocethylen", () -> InitFluids.LIQUID_PLUTOCETHYLEN_FLUID.get(), Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops());

        iron_chest = new IronChest("iron_chest", 1.5f, 16f, 3);

        fumonium_ore = new FumoniumOre("fumonium_ore", Material.ROCK, 3.0f, 3.0f, 2, ModBlockGroup.group);
        //refinery = new Refinery("refinery", Material.IRON, 2.2f, 284.0f , 4, ModBlockGroup.group);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        init();

        for(Block b : blocks){
            event.getRegistry().register(b);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event){
        for (BlockItem bi : blockItems){
            event.getRegistry().register(bi);
        }
    }
}
