package net.pinto.mythandmetal.block.customEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DungeonChestEntity extends ChestBlockEntity {
    public boolean unlocked = false;

    public void findCount(BlockPos blockPos ,Level level){
        if(level.getBlockState(blockPos.above()).getBlock() instanceof AirBlock ){
            unlocked = true;
        }
//        else if(level.getBlockState(blockPos.north()).getBlock() instanceof AirBlock ){
//            unlocked = true;
//        }


    }
    public DungeonChestEntity( BlockPos pPos, BlockState pBlockState) {
        super(MyBlockEntityTypes.DUNGEON_CHEST.get(), pPos, pBlockState);
    }

    private boolean lootGenerated = false;

    public boolean hasLootGenerated() {
        return this.lootGenerated;
    }

    public void setLootGenerated(boolean generated) {
        this.lootGenerated = generated;
        this.setChanged();
    }

    public void generateLoot(Player player) {
        this.setLootTable( new ResourceLocation("minecraft", "chests/woodland_mansion"), player.getRandom().nextLong());
        this.clearContent();
        this.unpackLootTable(player);
    }


}
