package tomson124.industrialmining.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tomson124.industrialmining.reference.Names;
import tomson124.industrialmining.reference.Reference;
import tomson124.industrialmining.tileentity.TileEntitySmeltingFurnace;

public class BlockSmeltingFurnace extends BlockIndustrialMiningTileEntity {

    private IIcon topIcon;
    private IIcon onIcon;
    private IIcon frontIcon;

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

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack){
        int rotation = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (rotation == 0) world.setBlockMetadataWithNotify(x, y, z, 0, 2);
        if (rotation == 1) world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        if (rotation == 2) world.setBlockMetadataWithNotify(x, y, z, 1, 2);
        if (rotation == 3) world.setBlockMetadataWithNotify(x, y, z, 2, 2);
    }

    @Override
    public IIcon getIcon(int side, int meta){
        if(side == 1) return this.topIcon;
        if(side == 3) return this.frontIcon;
        return this.blockIcon;
    }

    @Override
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side){
        int meta = world.getBlockMetadata(x, y, z);
        if(side == 1) return this.topIcon;
        if(side == meta+2 && meta <= 3) return this.frontIcon;
        else if(side == meta-2 && meta > 3) return this.onIcon;
        return this.blockIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconReg){
        this.blockIcon = iconReg.registerIcon(Reference.MOD_ID_LOWER + ":" + Names.Blocks.SMELTING_FURNACE);
        this.topIcon = iconReg.registerIcon(Reference.MOD_ID_LOWER + ":" + Names.Blocks.SMELTING_FURNACE + "Top");
        this.onIcon = iconReg.registerIcon(Reference.MOD_ID_LOWER + ":" + Names.Blocks.SMELTING_FURNACE + "On");
        this.frontIcon = iconReg.registerIcon(Reference.MOD_ID_LOWER + ":" + Names.Blocks.SMELTING_FURNACE + "Front");
    }

}
