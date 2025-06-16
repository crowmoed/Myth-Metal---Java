package net.pinto.mythandmetal.block.customEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.pinto.mythandmetal.block.ModBlocks;

public class DungeonAirEntity extends BlockEntity {
    public boolean started = false;
    public int roomEntityCount = 0;
    public boolean defated = false;

    private boolean checked = false;
    private DungeonRoomEntity thisdungeonRoom;

    public DungeonRoomEntity getDungeonRoom() {
        return thisdungeonRoom;
    }

    public int[] findRoomCord(BlockPos blockPos, int[] returnThis) {
        if (!checked) {
            checked = true;
            if (blockPos.getX() > returnThis[0]) {
                returnThis[0] = blockPos.getX();
            }
            if (blockPos.getZ() < returnThis[1]) {
                returnThis[1] = blockPos.getZ();
            }
            if (blockPos.getX() < returnThis[2]) {
                returnThis[2] = blockPos.getX();
            }
            if (blockPos.getZ() > returnThis[3]) {
                returnThis[3] = blockPos.getZ();
            }

            if (level.getBlockEntity(blockPos.above()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
            if (level.getBlockEntity(blockPos.below()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
            if (level.getBlockEntity(blockPos.west()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
            if (level.getBlockEntity(blockPos.east()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
            if (level.getBlockEntity(blockPos.north()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
            if (level.getBlockEntity(blockPos.south()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.findRoomCord(aboveblock.getBlockPos(), returnThis);
            }
        }
        return returnThis;
    }

    public void Startroom(BlockPos blockPos, int currentchescount) {
        Level level = this.getLevel();
        if (!started) {
            int[] roomCords = {blockPos.getX(), blockPos.getZ(), blockPos.getX(), blockPos.getZ()};
            findRoomCord(blockPos, roomCords);
            
            thisdungeonRoom = new DungeonRoomEntity(blockPos, getBlockState());
            thisdungeonRoom.initializeRoom(roomCords[0], roomCords[1], roomCords[2], roomCords[3],level);
            started = true;

            if (level.getBlockEntity(blockPos.above()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }
            if (level.getBlockEntity(blockPos.below()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }
            if (level.getBlockEntity(blockPos.west()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }
            if (level.getBlockEntity(blockPos.east()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }
            if (level.getBlockEntity(blockPos.north()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }
            if (level.getBlockEntity(blockPos.south()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,thisdungeonRoom);
            }

            BlockState ironBarsState = Blocks.IRON_BARS.defaultBlockState();

            if (level.getBlockState(blockPos.west()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.west(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.east()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.east(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.north()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.north(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.south()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.south(), ironBarsState, Block.UPDATE_ALL);
            }
        }
    }
    public void Startroom(BlockPos blockPos, int currentchescount,DungeonRoomEntity dungeonRoom) {
        Level level = this.getLevel();
        if (!started) {


            thisdungeonRoom = dungeonRoom;
            started = true;

            if (level.getBlockEntity(blockPos.above()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }
            if (level.getBlockEntity(blockPos.below()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }
            if (level.getBlockEntity(blockPos.west()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }
            if (level.getBlockEntity(blockPos.east()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }
            if (level.getBlockEntity(blockPos.north()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }
            if (level.getBlockEntity(blockPos.south()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.roomEntityCount = currentchescount;
                aboveblock.Startroom(aboveblock.getBlockPos(), currentchescount,dungeonRoom);
            }

            BlockState ironBarsState = Blocks.IRON_BARS.defaultBlockState();

            if (level.getBlockState(blockPos.west()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.west(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.east()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.east(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.north()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.north(), ironBarsState, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.south()).getBlock() instanceof AirBlock) {
                level.setBlock(blockPos.south(), ironBarsState, Block.UPDATE_ALL);
            }
        }
    }
    public void setDefated(BlockPos blockPos) {
        Level level = this.getLevel();
        if (!defated) {
            defated = true;
            if (level.getBlockEntity(blockPos.above()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos());
            }
            if (level.getBlockEntity(blockPos.below()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos() );
            }
            if (level.getBlockEntity(blockPos.west()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos());
            }
            if (level.getBlockEntity(blockPos.east()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos());
            }
            if (level.getBlockEntity(blockPos.north()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos());
            }
            if (level.getBlockEntity(blockPos.south()) instanceof DungeonAirEntity aboveblock) {
                aboveblock.setDefated(aboveblock.getBlockPos());
            }

            BlockState Air = Blocks.AIR.defaultBlockState();
            level.setBlock(blockPos,Air,Block.UPDATE_ALL);
            Block Bars = ModBlocks.DUNGEON_BARS.get();

            if (level.getBlockState(blockPos.west()).getBlock() instanceof AirBlock || level.getBlockState(blockPos.west()).getBlock() == Bars) {
                level.setBlock(blockPos.west(), Air, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.east()).getBlock() instanceof AirBlock || level.getBlockState(blockPos.east()).getBlock() == Bars) {
                level.setBlock(blockPos.east(), Air, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.north()).getBlock() instanceof AirBlock || level.getBlockState(blockPos.north()).getBlock() == Bars) {
                level.setBlock(blockPos.north(), Air, Block.UPDATE_ALL);
            }
            if (level.getBlockState(blockPos.south()).getBlock() instanceof AirBlock || level.getBlockState(blockPos.south()).getBlock() == Bars) {
                level.setBlock(blockPos.south(), Air, Block.UPDATE_ALL);
            }
        }
    }

    public DungeonAirEntity(BlockPos pPos, BlockState pBlockState) {
        super(MyBlockEntityTypes.DUNGEON_AIR.get(), pPos, pBlockState);
    }
}
