package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tomson124.industrialmining.block.BlockFurnaceBricks;
import tomson124.industrialmining.block.BlockIndustrialMining;
import tomson124.industrialmining.block.BlockIndustrialMiningTileEntity;
import tomson124.industrialmining.block.BlockSmeltingFurnace;
import tomson124.industrialmining.reference.Names;
import tomson124.industrialmining.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    // Create instance of the blocks
    public static final BlockIndustrialMining furnaceBricks = new BlockFurnaceBricks();
    public static final BlockIndustrialMiningTileEntity smeltingFurnace = new BlockSmeltingFurnace();

    // Register the blocks
    public static void init() {

        GameRegistry.registerBlock(furnaceBricks, Names.Blocks.FURNACE_BRICKS);
        GameRegistry.registerBlock(smeltingFurnace, Names.Blocks.SMELTING_FURNACE);
    }
}
