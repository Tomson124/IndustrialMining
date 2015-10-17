package tomson124.industrialmining.tileentity;

import net.minecraft.item.ItemStack;
import tomson124.industrialmining.reference.Names;

public class TileEntitySmeltingFurnace extends TileEntityInventoryBase {

    public TileEntitySmeltingFurnace(){
        super(3, Names.Blocks.SMELTING_FURNACE);
    }


    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return false;
    }
}
