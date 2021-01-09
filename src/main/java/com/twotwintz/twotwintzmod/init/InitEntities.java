package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.entity.IronChestTileEntity;
import com.twotwintz.twotwintzmod.entity.RefineryTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "twotwintzmod");

    //On initialize la tile entity entre les chevron de "TileEntityType"

    public static final RegistryObject<TileEntityType<RefineryTileEntity>> REFINERY = TILE_ENTITY_TYPE.register("refinery", () -> TileEntityType.Builder.create(RefineryTileEntity::new, InitBlocks.refinery).build(null));

    //public static final RegistryObject<TileEntityType<IronChestTileEntity>> IRON_CHEST = TILE_ENTITY_TYPE.register("iron_chest", () -> TileEntityType.Builder.create(IronChestTileEntity::new, InitBlocks.iron_chest).build(null));
}
