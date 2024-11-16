package lee.orebamboo.orebamboomod.orebambooBlock;

import com.mojang.serialization.MapCodec;
import lee.orebamboo.orebamboomod.util.OreBambooTag;
import net.minecraft.block.*;
import net.minecraft.block.enums.BambooLeaves;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class ModOreBambooShootBlock extends BambooShootBlock {

    public Enum<GetBamooType.bambooType> bambooOreType;

    public Block getOrebambooblock(){
        return GetBamooType.getBambooType(bambooOreType);
    }
    public Item getorebambooshootitem() {
        return GetBamooType.getBambooItem(bambooOreType);
    }

    @Override
    public MapCodec<BambooShootBlock> getCodec() {
        return CODEC;
    }

    public ModOreBambooShootBlock(Settings settings,Enum<GetBamooType.bambooType> OreType) {
        super(settings);
        bambooOreType = OreType;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isIn(OreBambooTag.ORE_BAMBOO_PLANTABLE_ON);
    }


    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if (direction == Direction.UP && neighborState.isOf(getOrebambooblock())) {
                world.setBlockState(pos, getOrebambooblock().getDefaultState(), 2);
            }

            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(getorebambooshootitem());
    }

    @Override
    protected void grow(World world, BlockPos pos) {
        world.setBlockState(pos.up(), (BlockState)getOrebambooblock().getDefaultState().with(ModOreBamboo.LEAVES, BambooLeaves.SMALL), 3);
    }
}
