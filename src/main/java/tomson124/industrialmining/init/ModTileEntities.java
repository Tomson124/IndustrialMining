package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tomson124.industrialmining.reference.Names;
import tomson124.industrialmining.tileentity.TileEntitySmeltingFurnace;
import tomson124.industrialmining.utility.LogHelper;

public class ModTileEntities {

    public static void init() {

        LogHelper.info("Registering TileEntities...");

        GameRegistry.registerTileEntity(TileEntitySmeltingFurnace.class, Names.TileEntities.SMELTING_FURNACE);
    }
}
