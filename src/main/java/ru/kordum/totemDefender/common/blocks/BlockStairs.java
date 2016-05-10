package ru.kordum.totemDefender.common.blocks;

import ru.kordum.totemDefender.TotemDefender;
import ru.kordum.totemDefender.common.BlockManager;

public class BlockStairs extends net.minecraft.block.BlockStairs {
    private String name;

    //---------------------------------------------------------------------------
    //
    // CONSTRUCTOR
    //
    //---------------------------------------------------------------------------

    public BlockStairs() {
        super(BlockManager.planks, 0);
        name = "totemTreeStairs";
        setBlockName(name);
        useNeighborBrightness = true;
        setHardness(4);
        setCreativeTab(TotemDefender.tab);
    }

    //---------------------------------------------------------------------------
    //
    // ACCESSORS
    //
    //---------------------------------------------------------------------------

    public String getName() {
        return name;
    }
}