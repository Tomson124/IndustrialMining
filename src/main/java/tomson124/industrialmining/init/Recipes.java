package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init() {

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.reinforcedStonebrick, 2), "sis", "isi", "sis", 's',new ItemStack(Blocks.stonebrick), 'i', "ingotIron"));
    }
}