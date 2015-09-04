package de.tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.tomson124.industrialmining.block.BlockFlag;
import de.tomson124.industrialmining.block.BlockIndustrialMining;
import de.tomson124.industrialmining.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    // Create instance of the blocks
    public static final BlockIndustrialMining flag = new BlockFlag();

    // Register the blocks
    public static void init() {

        GameRegistry.registerBlock(flag, "flag");
    }
}
