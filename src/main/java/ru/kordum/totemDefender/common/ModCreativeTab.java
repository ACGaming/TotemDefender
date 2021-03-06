package ru.kordum.totemDefender.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTab extends CreativeTabs {

    //---------------------------------------------------------------------------
    //
    // CONSTRUCTOR
    //
    //---------------------------------------------------------------------------

    public ModCreativeTab() {
        super(CreativeTabs.getNextID(), "tab_name");
    }

    //---------------------------------------------------------------------------
    //
    // ACCESSORS
    //
    //---------------------------------------------------------------------------

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.woodenTotem);
    }
}
