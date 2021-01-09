package com.twotwintz.twotwintzmod.items.tools;

import com.twotwintz.twotwintzmod.init.InitItems;
import com.twotwintz.twotwintzmod.itemgroup.ModItemGroup;
import com.twotwintz.twotwintzmod.items.tools.ModItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ModSword extends SwordItem
{
    public ModSword(String name, ModItemTier itemTier, ItemGroup group)
    {
        super(itemTier, itemTier.getAttackDamageInt(), 2.1F, new Properties().group(group));

        setRegistryName(name);

        InitItems.INSTANCE.items.add(this);
    }
}
