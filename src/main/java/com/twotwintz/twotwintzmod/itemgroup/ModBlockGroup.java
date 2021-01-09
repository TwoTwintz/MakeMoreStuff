package com.twotwintz.twotwintzmod.itemgroup;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModBlockGroup extends ItemGroup {
    public static final ModBlockGroup group = new ModBlockGroup(ItemGroup.GROUPS.length, "twotwintzmod");

    private ModBlockGroup(int index , String label){
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(InitItems.refined_fumonium);
    }
}
