package tomson124.industrialmining.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init() {

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.refinedClay, 2), "sand", "sand", new ItemStack(Items.clay_ball)));
        GameRegistry.addSmelting(new ItemStack(ModItems.refinedClay), new ItemStack(ModItems.hardenedBrick), 0.6F);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.furnaceBricks), "bb", "bb", 'b', new ItemStack(ModItems.hardenedBrick));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smeltingFurnace), "bbb", "bfb", "bbb", 'b', new ItemStack(ModItems.hardenedBrick), 'f', new ItemStack(Blocks.furnace));
    }
}