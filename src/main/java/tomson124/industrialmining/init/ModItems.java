package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tomson124.industrialmining.item.ItemHardenedBrick;
import tomson124.industrialmining.item.ItemIndustrialMining;
import tomson124.industrialmining.item.ItemRefinedClay;
import tomson124.industrialmining.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemIndustrialMining refinedClay = new ItemRefinedClay();
    public static final ItemIndustrialMining hardenedBrick = new ItemHardenedBrick();

    public static void init() {

        GameRegistry.registerItem(refinedClay, "refinedClay");
        GameRegistry.registerItem(hardenedBrick, "hardenedBrick");
    }
}
