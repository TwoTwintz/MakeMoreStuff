package com.twotwintz.twotwintzmod;

import com.twotwintz.twotwintzmod.init.InitBlocks;
import com.twotwintz.twotwintzmod.init.InitContainerTypes;
import com.twotwintz.twotwintzmod.init.InitEntities;
import com.twotwintz.twotwintzmod.init.InitFluids;
import com.twotwintz.twotwintzmod.ores.OreGeneration;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod("twotwintzmod")
public class TwoTwintzMod
{
    public static final String MOD_ID = "twotwintzmod";
    private static final Logger LOGGER = Logger.getLogger(MOD_ID);

    public TwoTwintzMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        InitFluids.FLUIDS.register(eventBus);


        MinecraftForge.EVENT_BUS.register(this);
    }


    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Hello from common setup event");
        OreGeneration.initGeneration();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("Hello from client setup event");
        RenderTypeLookup.setRenderLayer(InitBlocks.rice_crop, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(InitBlocks.black_rice_crop, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(InitBlocks.onion_crop, RenderType.getCutout());
    }


}