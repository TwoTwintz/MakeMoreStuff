package com.twotwintz.twotwintzmod.items.tools;

import com.twotwintz.twotwintzmod.init.InitItems;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class ModPickaxe extends PickaxeItem
{
    public ModPickaxe(String name, ModItemTier tier, ItemGroup group)
    {
        super(tier, (tier.getAttackDamageInt() * 40 / 100), 2.1F, new Properties().group(group));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
