package tomson124.industrialmining.block;

import tomson124.industrialmining.reference.Names;

public class BlockFurnaceBricks extends BlockIndustrialMining {

    public BlockFurnaceBricks() {

        super();
        this.setBlockName(Names.Blocks.FURNACE_BRICKS);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
