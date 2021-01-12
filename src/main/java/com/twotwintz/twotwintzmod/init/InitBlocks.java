package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.TwoTwintzMod;
import com.twotwintz.twotwintzmod.blocks.IronChest;
import com.twotwintz.twotwintzmod.blocks.ModFlowingFluidBlock;
import com.twotwintz.twotwintzmod.blocks.crops.ModCrop;
import com.twotwintz.twotwintzmod.blocks.crops.SeedsAndCrop;
import com.twotwintz.twotwintzmod.blocks.machines.Refinery;
import com.twotwintz.twotwintzmod.blocks.ores.FumoniumOre;
import com.twotwintz.twotwintzmod.itemgroup.ModBlockGroup;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import com.twotwintz.twotwintzmod.items.ModBlockItem;
import com.twotwintz.twotwintzmod.items.specialitems.CarrotTypeItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = TwoTwintzMod.MOD_ID , bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks{
    public static ArrayList<Block> blocks;
    public static ArrayList<BlockItem> blockItems;

    //Crops
    public static SeedsAndCrop rice;

    public static ModCrop rice_crop;
    public static ModCrop black_rice_crop;
    public static ModCrop onion_crop;

    //Seeds
    public static ModBlockItem black_rice_seeds;
    public static ModBlockItem rice_seeds;
    public static CarrotTypeItem onion_seeds;

    public static IronChest iron_chest;
    public static Refinery refinery;
    public static FumoniumOre fumonium_ore;
    public static ModFlowingFluidBlock liquid_plutocethylen_block;
    private static void init(){
        blocks = new ArrayList<>();
        blockItems = new ArrayList<>();



        //Crops
        rice_crop = new ModCrop("rice_crop", Block.Properties.from(Blocks.WHEAT));
        rice_seeds = new ModBlockItem("rice_seeds", InitBlocks.rice_crop, ModItemGroup.group);

        black_rice_crop = new ModCrop("black_rice_crop", Block.Properties.from(rice_crop));
        black_rice_seeds = new ModBlockItem("black_rice_seeds", InitBlocks.black_rice_crop, ModItemGroup.group);

        onion_crop = new ModCrop("onion_crop", Block.Properties.from(Blocks.CARROTS));
        onion_seeds = new CarrotTypeItem("onion_seeds", InitBlocks.onion_crop, ModItemGroup.group, 4);

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
