package com.twotwintz.twotwintzmod.init;

import com.twotwintz.twotwintzmod.TwoTwintzMod;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import com.twotwintz.twotwintzmod.items.ModBucketItem;
import com.twotwintz.twotwintzmod.items.ModItems;
import com.twotwintz.twotwintzmod.items.armor.ModArmor;
import com.twotwintz.twotwintzmod.items.armor.ModArmorMaterial;
import com.twotwintz.twotwintzmod.items.food.ModFood;
import com.twotwintz.twotwintzmod.items.specialitems.BurnItem;
import com.twotwintz.twotwintzmod.items.tools.*;
import com.twotwintz.twotwintzmod.items.tools.ModSword;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = TwoTwintzMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitItems
{
    public static final InitItems INSTANCE = new InitItems();
    public ArrayList<Item> items;

    //Basic items
    public static ModItems fumonium_piece;
    public static ModItems refined_fumonium;
    public static ModItems machete;

    //Plant
    public static ModFood rice;
    public static ModFood black_rice;
    public static ModFood onion;

    //Food
    public static ModFood mixed_rice_and_onion;

    //Bucket
    public static BucketItem plutocethylen_bucket;

    //Fuel
    public static BurnItem fumonium_fuel;

    //Tools
    public static ModSword fumonium_sword;
    public static ModPickaxe fumonium_pickaxe;
    public static ModAxe fumonium_axe;
    public static ModHoe fumonium_hoe;
    public static ModShovel fumonium_shovel;

    //Armors
    public static ModArmor fumonium_helmet;
    public static ModArmor fumonium_chestplate;
    public static ModArmor fumonium_legging;
    public static ModArmor fumonium_boots;

    public void init()
    {
        ItemGroup group = ModItemGroup.group;
        items = new ArrayList<>();

        //Basics items
        fumonium_piece = new ModItems(64, group, "fumonium_piece");
        refined_fumonium = new ModItems(1, group, "refined_fumonium");
        machete = new ModItems(1, group, "machete");

        //Fuels
        fumonium_fuel = new BurnItem("fumonium_fuel", group, 16, 3200);

        //Plants
        rice = new ModFood("rice",64,group, 1, 0);
        black_rice = new ModFood("black_rice",64,group, 1, 0);

        //Food
        mixed_rice_and_onion = new ModFood("mixed_rice_and_onion", 64, group, 8, 4);


        //Tools
        fumonium_sword = new ModSword("fumonium_sword", ModItemTier.FUMONIUM, group);
        fumonium_pickaxe = new ModPickaxe("fumonium_pickaxe", ModItemTier.FUMONIUM, group);
        fumonium_axe = new ModAxe("fumonium_axe", ModItemTier.FUMONIUM, group);
        fumonium_hoe = new ModHoe("fumonium_hoe", ModItemTier.FUMONIUM, group);
        fumonium_shovel = new ModShovel("fumonium_shovel", ModItemTier.FUMONIUM, group);

        //Armors
        fumonium_helmet = new ModArmor("fumonium_helmet", ModArmorMaterial.FUMONIUM, EquipmentSlotType.HEAD, group);
        fumonium_chestplate = new ModArmor("fumonium_chestplate", ModArmorMaterial.FUMONIUM, EquipmentSlotType.CHEST, group);
        fumonium_legging = new ModArmor("fumonium_legging", ModArmorMaterial.FUMONIUM, EquipmentSlotType.LEGS, group);
        fumonium_boots = new ModArmor("fumonium_boots", ModArmorMaterial.FUMONIUM, EquipmentSlotType.FEET, group);

        //Bucket
        plutocethylen_bucket = new ModBucketItem("plutocethylen_bucket", InitFluids.LIQUID_PLUTOCETHYLEN_FLUID, Items.BUCKET, group);

    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event)
    {
        INSTANCE.init();

        for (Item item : INSTANCE.items)
        {
            event.getRegistry().register(item);
        }
    }

}
