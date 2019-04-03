package tk.diamondbuildz.mod.character.blocks.blockbases.a;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import tk.diamondbuildz.mod.character.util.ModUtil;

import javax.annotation.Nonnull;

public class BlockBaseConcreteA extends Block {

    private static final AxisAlignedBB BOUNDING_BOX_1 = new AxisAlignedBB(0.0625 * 3, 0 , 0.0625 * 7, 0.0625 * 13, 0.0625 * 13, 0.0625 * 9);
    private static final AxisAlignedBB BOUNDING_BOX_2 = new AxisAlignedBB(0.0625 * 7, 0 , 0.0625 * 3, 0.0625 * 9, 0.0625 * 13, 0.0625 * 13);
    private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public EntityPlayer entityPlayer;

    public BlockBaseConcreteA(@Nonnull String name) {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        this.setHardness(0.3F);
        this.setSoundType(SoundType.GLASS);
        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));
        ModUtil.setRegistryNames(this, name);
        ModUtil.setCreativeTab(this);
    }
    @Override
    public boolean isFullCube(IBlockState state) { return false; }
    @Override
    public boolean isOpaqueCube(IBlockState state) { return false; }
    @Override
    public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) { return false; }
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) { return state; }
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getHorizontal(meta);
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumFacing facing = (EnumFacing)state.getValue(FACING);

        int facingbits = facing.getHorizontalIndex();
        return facingbits;
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        // find the quadrant the player is facing
        EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        state = state.getActualState(source, pos);
        EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

        switch (enumfacing)
        {
            case SOUTH:
            default:
                return BOUNDING_BOX_1;
            case WEST:
                return BOUNDING_BOX_2;
            case NORTH:
                return BOUNDING_BOX_1;
            case EAST:
                return BOUNDING_BOX_2;
        }
    }
}