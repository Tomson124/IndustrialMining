package de.tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.tomson124.industrialmining.item.ItemIndustrialMining;
import de.tomson124.industrialmining.item.ItemMapleLeave;
import de.tomson124.industrialmining.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemIndustrialMining mapleLeaf = new ItemMapleLeave();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
