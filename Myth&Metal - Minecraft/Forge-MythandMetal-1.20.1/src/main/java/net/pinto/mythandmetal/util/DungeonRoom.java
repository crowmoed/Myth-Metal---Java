/*
package net.pinto.mythandmetal.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.pinto.mythandmetal.block.customEntity.DungeonAirEntity;

public class DungeonRoom {
    private int roomstartx;
    private int roomstartz;

    private int roomendx;
    private int roomendz;

    private Level level;

    public int mobCount = 16;
    public int alive =0;
    private BlockPos thisBlockPos;

    public DungeonRoom(BlockState blockState, Level plevel, BlockPos blockPos){
        level = plevel;
        int[] roomCords = {blockPos.getX(),blockPos.getZ(),blockPos.getX(),blockPos.getZ()};
        if(plevel.getBlockEntity(blockPos) instanceof  DungeonAirEntity airEntity)
            airEntity.findRoomCord(blockPos,roomCords);
        roomstartx = roomCords[0];
        roomstartz = roomCords[1];
        roomendx = roomCords[2];
        roomendz = roomCords[3];
        thisBlockPos = blockPos;

    }

    public void mobDied(){
        alive--;
    }
    public void spawnWaves (){
        if(mobCount>0){
        if(alive<6){
            alive++;
            mobCount--;
        MobSpawnUtils.spawnRandomSkeleton(level,roomstartx,roomstartz,roomendx,roomendz,1,this);}
    }

    }




}
*/
