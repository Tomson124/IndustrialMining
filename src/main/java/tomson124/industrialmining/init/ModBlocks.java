package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tomson124.industrialmining.block.BlockReinforcedStonebrick;
import tomson124.industrialmining.block.BlockIndustrialMining;
import tomson124.industrialmining.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    // Create instance of the blocks
    public static final BlockIndustrialMining reinforcedStonebrick = new BlockReinforcedStonebrick();

    // Register the blocks
    public static void init() {

        GameRegistry.registerBlock(reinforcedStonebrick, "reinforcedStonebrick");
    }
}
