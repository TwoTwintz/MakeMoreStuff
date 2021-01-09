package com.twotwintz.twotwintzmod.items.tools;

import com.twotwintz.twotwintzmod.init.InitItems;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;

public class ModAxe extends AxeItem
{
    public ModAxe(String name, ModItemTier tier, ItemGroup itemGroup)
    {
        super(tier, (tier.getAttackDamageInt() * 70 / 100), 2.1F, new Properties().group(itemGroup));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
