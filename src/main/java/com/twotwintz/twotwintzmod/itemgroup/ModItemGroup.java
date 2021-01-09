package com.twotwintz.twotwintzmod.itemgroup;

import com.twotwintz.twotwintzmod.init.InitItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {

    public static final ModItemGroup group = new ModItemGroup(ItemGroup.GROUPS.length, "twotwintzmod");

    private ModItemGroup(int index , String label){
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(InitItems.refined_fumonium);
    }
}
