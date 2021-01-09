package com.twotwintz.twotwintzmod.items.armor;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;

public class ModArmor extends ArmorItem
{
    public ModArmor(String name, ModArmorMaterial materialIn, EquipmentSlotType slot, ItemGroup group)
    {
        super(materialIn, slot, new Properties().group(group));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
