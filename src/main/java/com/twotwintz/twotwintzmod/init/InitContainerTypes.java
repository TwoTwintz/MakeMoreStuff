package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.TwoTwintzMod;
import com.twotwintz.twotwintzmod.container.IronChestContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = new DeferredRegister<>(ForgeRegistries.CONTAINERS, TwoTwintzMod.MOD_ID);

    //public static final RegistryObject<ContainerType<IronChestContainer>> IRON_CHEST = CONTAINER_TYPE.register("iron_chest", () -> IForgeContainerType.create(IronChestContainer::new));
}
