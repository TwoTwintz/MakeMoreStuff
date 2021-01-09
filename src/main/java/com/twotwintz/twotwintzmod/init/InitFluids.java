package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.TwoTwintzMod;
import com.twotwintz.twotwintzmod.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitFluids {

    //Resources Location (textures)
    public static final ResourceLocation LIQUID_PLUTOCETHYLEN_STILL_RL = new ResourceLocation(TwoTwintzMod.MOD_ID, "block/liquid_plutocethylen_still");
    public static final ResourceLocation LIQUID_PLUTOCETHYLEN_FLOWING_RL = new ResourceLocation(TwoTwintzMod.MOD_ID, "block/liquid_plutocethylen_flowing");
    public static final ResourceLocation LIQUID_PLUTOCETHYLEN_TEXTURE_RL = new ResourceLocation(TwoTwintzMod.MOD_ID, "block/liquid_plutocethylen");

    //DeferredRegisters
    public static final DeferredRegister<Fluid> FLUIDS= new DeferredRegister<>(ForgeRegistries.FLUIDS, "twotwintzmod");

    //Fluids
    public static final RegistryObject<FlowingFluid> LIQUID_PLUTOCETHYLEN_FLUID = FLUIDS.register("liquid_plutocethylen_fluid", () -> new ForgeFlowingFluid.Source(InitFluids.LIQUID_PLUTOCETHYLEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> LIQUID_PLUTOCETHYLEN_FLOWING = FLUIDS.register("liquid_plutocethylen_flowing", () -> new ForgeFlowingFluid.Flowing(InitFluids.LIQUID_PLUTOCETHYLEN_PROPERTIES));

    //Fluids Properties
    public static final ForgeFlowingFluid.Properties LIQUID_PLUTOCETHYLEN_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LIQUID_PLUTOCETHYLEN_FLUID.get(),
            () -> LIQUID_PLUTOCETHYLEN_FLOWING.get(),
            FluidAttributes.builder(LIQUID_PLUTOCETHYLEN_STILL_RL, LIQUID_PLUTOCETHYLEN_FLOWING_RL).density(15).luminosity(14).sound(SoundEvents.ITEM_BUCKET_FILL).rarity(Rarity.COMMON).overlay(LIQUID_PLUTOCETHYLEN_TEXTURE_RL)).block(() -> InitBlocks.liquid_plutocethylen_block).bucket(() -> InitItems.plutocethylen_bucket);
}

