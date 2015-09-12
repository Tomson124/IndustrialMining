package tomson124.industrialmining.block;

public class BlockFurnaceBricks extends BlockIndustrialMining {

    public BlockFurnaceBricks() {

        super();
        this.setBlockName("furnaceBricks");
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
