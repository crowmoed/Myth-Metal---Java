package net.pinto.mythandmetal.block.custom.dungeon;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.DebugPackets;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.pinto.mythandmetal.block.customEntity.DungeonChestEntity;

import java.util.function.Supplier;

public class DungeonChest extends ChestBlock {

    public DungeonChest(Properties pProperties, Supplier<BlockEntityType<? extends ChestBlockEntity>> pBlockEntityType) {
        super(pProperties, pBlockEntityType);
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DungeonChestEntity(pPos, pState);
    }
    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pNeighborBlock, BlockPos pNeighborPos, boolean pMovedByPiston) {
        if(pLevel.getBlockEntity(pPos.below()) instanceof HopperBlockEntity hello)
        {
            pLevel.destroyBlock(pPos.below(),false);
        }
        DebugPackets.sendNeighborsUpdatePacket(pLevel, pPos);
    }



    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(pLevel.getBlockEntity(pPos) instanceof DungeonChestEntity blockEntity) {
            blockEntity.findCount(pPos, pLevel);

            if(blockEntity.unlocked) {
                if (!blockEntity.hasLootGenerated()) {
                    blockEntity.generateLoot(pPlayer);
                    blockEntity.setLootGenerated(true);
                }

                if (pLevel.isClientSide) {
                    return InteractionResult.SUCCESS;
                } else {
                    MenuProvider menuprovider = this.getMenuProvider(pState, pLevel, pPos);
                    if (menuprovider != null) {
                        pPlayer.openMenu(menuprovider);
                        pPlayer.awardStat(this.getOpenChestStat());
                        PiglinAi.angerNearbyPiglins(pPlayer, true);
                    }
                    return InteractionResult.CONSUME;
                }
            }
        }
        return InteractionResult.FAIL;
    }



}
