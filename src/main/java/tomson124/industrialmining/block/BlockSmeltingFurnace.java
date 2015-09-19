package tomson124.industrialmining.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tomson124.industrialmining.reference.Names;
import tomson124.industrialmining.tileentity.TileEntitySmeltingFurnace;

public class BlockSmeltingFurnace extends BlockIndustrialMiningTileEntity {

    public BlockSmeltingFurnace() {

        super();
        this.setBlockName(Names.Blocks.SMELTING_FURNACE);
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntitySmeltingFurnace();
    }

}
