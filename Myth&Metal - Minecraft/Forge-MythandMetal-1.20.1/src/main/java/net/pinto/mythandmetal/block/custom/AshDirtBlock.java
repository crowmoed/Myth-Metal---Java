package net.pinto.mythandmetal.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.pinto.mythandmetal.block.ModBlocks;

public class AshDirtBlock extends Block {
    public AshDirtBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isClientSide) {
            BlockState aboveState = level.getBlockState(pos.above());
            
            // Check if the block above is transparent and has enough light
            if (aboveState.propagatesSkylightDown(level, pos.above()) && level.getMaxLocalRawBrightness(pos.above()) >= 9) {
                // Try to convert to grass if adjacent to grass
                if (isAdjacentToGrass(level, pos)) {
                    level.setBlock(pos, ModBlocks.ASH_GRASS.get().defaultBlockState(), 3);
                }
            }
        }
    }

    private boolean isAdjacentToGrass(ServerLevel level, BlockPos pos) {
        for (net.minecraft.core.Direction direction : net.minecraft.core.Direction.values()) {
            BlockState neighborState = level.getBlockState(pos.relative(direction));
            if (neighborState.is(ModBlocks.ASH_GRASS.get())) {
                return true;
            }
        }
        return false;
    }
}
