package lee.orebamboo.orebamboomod.orebambooBlock;

import com.mojang.serialization.MapCodec;
import lee.orebamboo.orebamboomod.util.OreBambooTag;
import net.minecraft.block.*;
import net.minecraft.block.enums.BambooLeaves;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class ModOreBamboo extends BambooBlock {
    public Block orebambooblock = ModBlockRegister.COAL_BAMBOO;
    public Block orebambooshootblock = ModBlockRegister.COAL_BAMBOO_SAPLING;


    public static final MapCodec<BambooBlock> CODEC = createCodec(ModOreBamboo::new);

    @Override
    public MapCodec<BambooBlock> getCodec() {
        return CODEC;
    }


    public ModOreBamboo(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0)).with(LEAVES, BambooLeaves.NONE)).with(STAGE, 0));
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        if (!fluidState.isEmpty()) {
            return null;
        } else {
            BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().down());
            if (blockState.isIn(OreBambooTag.ORE_BAMBOO_PLANTABLE_ON)) {
                if (blockState.isOf(orebambooshootblock)) {
                    return (BlockState)this.getDefaultState().with(AGE, 0);
                } else if (blockState.isOf(orebambooblock)) {
                    int i = (Integer)blockState.get(AGE) > 0 ? 1 : 0;
                    return (BlockState)this.getDefaultState().with(AGE, i);
                } else {
                    BlockState blockState2 = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
                    return blockState2.isOf(orebambooblock) ? (BlockState)this.getDefaultState().with(AGE, (Integer)blockState2.get(AGE)) : orebambooshootblock.getDefaultState();
                }
            } else {
                return null;
            }
        }
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape voxelShape = state.get(LEAVES) == BambooLeaves.LARGE ? LARGE_LEAVES_SHAPE : SMALL_LEAVES_SHAPE;
        Vec3d vec3d = state.getModelOffset(world, pos);
        return voxelShape.offset(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return NO_LEAVES_SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isIn(OreBambooTag.ORE_BAMBOO_PLANTABLE_ON);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.scheduleBlockTick(pos, this, 1);
        }

        if (direction == Direction.UP && neighborState.isOf(orebambooblock) && (Integer)neighborState.get(AGE) > (Integer)state.get(AGE)) {
            world.setBlockState(pos, (BlockState)state.cycle(AGE), 2);
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }


    @Override
    protected void updateLeaves(BlockState state, World world, BlockPos pos, Random random, int height) {
        BlockState blockState = world.getBlockState(pos.down());
        BlockPos blockPos = pos.down(2);
        BlockState blockState2 = world.getBlockState(blockPos);
        BambooLeaves bambooLeaves = BambooLeaves.NONE;
        if (height >= 1) {
            if (blockState.isOf(orebambooblock) && blockState.get(LEAVES) != BambooLeaves.NONE) {
                if (blockState.isOf(orebambooblock) && blockState.get(LEAVES) != BambooLeaves.NONE) {
                    bambooLeaves = BambooLeaves.LARGE;
                    if (blockState2.isOf(orebambooblock)) {
                        world.setBlockState(pos.down(), (BlockState)blockState.with(LEAVES, BambooLeaves.SMALL), 3);
                        world.setBlockState(blockPos, (BlockState)blockState2.with(LEAVES, BambooLeaves.NONE), 3);
                    }
                }
            } else {
                bambooLeaves = BambooLeaves.SMALL;
            }
        }

        int i = (Integer)state.get(AGE) != 1 && !blockState2.isOf(orebambooblock) ? 0 : 1;
        int j = (height < 11 || !(random.nextFloat() < 0.25F)) && height != 15 ? 0 : 1;
        world.setBlockState(pos.up(), (BlockState)((BlockState)((BlockState)this.getDefaultState().with(AGE, i)).with(LEAVES, bambooLeaves)).with(STAGE, j), 3);
    }

    @Override
    protected int countBambooAbove(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.up(i + 1)).isOf(orebambooblock); ++i) {
        }

        return i;
    }


    @Override
    protected int countBambooBelow(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.down(i + 1)).isOf(orebambooblock); ++i) {
        }

        return i;
    }

}
