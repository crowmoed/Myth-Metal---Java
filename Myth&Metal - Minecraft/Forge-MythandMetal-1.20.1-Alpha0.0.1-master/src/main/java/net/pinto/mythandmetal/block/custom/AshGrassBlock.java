package net.pinto.mythandmetal.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.pinto.mythandmetal.block.ModBlocks;

public class AshGrassBlock extends GrassBlock {
    public AshGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isClientSide) {
            // Check if the grass block is covered
            if (!level.getBlockState(pos.above()).isAir()) {
                level.setBlock(pos, ModBlocks.ASH_DIRT.get().defaultBlockState(), 3);
            } else {
                // Try to spread to nearby dirt blocks
                if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
                    for (int i = 0; i < 4; ++i) {
                        BlockPos targetPos = pos.offset(
                            random.nextInt(3) - 1,
                            random.nextInt(5) - 3,
                            random.nextInt(3) - 1
                        );
                        BlockState targetState = level.getBlockState(targetPos);
                        
                        // Check if the target block is dirt and can be converted to grass
                        if (targetState.is(ModBlocks.ASH_DIRT.get())) {
                            level.setBlock(targetPos, this.defaultBlockState(), 3);
                        }
                    }
                }
            }
        }
    }
}
