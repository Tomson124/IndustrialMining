package tomson124.industrialmining.creativetab;

import tomson124.industrialmining.init.ModBlocks;
import tomson124.industrialmining.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabIM {

    public static final CreativeTabs IM_TAB = new CreativeTabs(Reference.MOD_ID_LOWER) {

        @Override
        public Item getTabIconItem() {

            return Item.getItemFromBlock(ModBlocks.smeltingFurnace);
        }
    };
}
