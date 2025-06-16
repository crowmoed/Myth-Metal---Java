package net.pinto.mythandmetal.block.customEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.pinto.mythandmetal.block.ModBlocks;
import net.pinto.mythandmetal.entity.ModEntites;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.MagmaraakhEntity;
import net.pinto.mythandmetal.entity.mobs.arbinator.ArborinatorEntity;
import net.pinto.mythandmetal.util.MobSpawnUtils;

public class DungeonRoomEntity extends BlockEntity {
    private int roomstartx;
    private int roomstartz;
    private int roomendx;
    private int roomendz;
    public int mobCount = 16;
    public int alive = 0;
    private boolean started = false;
    public Level level;
    public BlockPos spawnBossPos;
    public DungeonRoomEntity(BlockPos pPos, BlockState pBlockState) {
        super(MyBlockEntityTypes.DUNGEON_ROOM.get(), pPos, pBlockState);
    }
    public void initializeBossFight_LAVA(Level plevel){
        if (!plevel.isClientSide()) {
            level = plevel;




            MagmaraakhEntity boss = new MagmaraakhEntity(ModEntites.MAGMARAAKH.get(),plevel);

            boss.setDungeonRoomEntity(this);


            boss.setPos(
                    spawnBossPos.getX() - 0.5,
                    spawnBossPos.getY() + 1,
                    spawnBossPos.getZ() - 0.5
            );

            boss.setPersistenceRequired();


            plevel.addFreshEntity(boss);


            /*
            System.out.println(spawnBossPos);
            Zombie boss = new Zombie(plevel);

            boss.setPos(
                    spawnBossPos.getX() + 1,
                    spawnBossPos.getY() + 1,
                    spawnBossPos.getZ() - 4.5
            );

            boss.setPersistenceRequired();


            plevel.addFreshEntity(boss);*/

            Block Bars = ModBlocks.DUNGEON_BARS_LAVA.get();
            System.out.println(new BlockPos(spawnBossPos.getX()+2,1,spawnBossPos.getZ()-22)+ "bruh");
            level.setBlock(new BlockPos(spawnBossPos.getX()+2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);


        }
    }
    public void initializeBossFight_FOREST(Level plevel){
        if (!plevel.isClientSide()) {
            level = plevel;




            ArborinatorEntity boss = new ArborinatorEntity(ModEntites.ARBINATOR.get(),plevel);

            boss.setDungeonRoomEntity(this);


            boss.setPos(
                    spawnBossPos.getX() - 0.5,
                    spawnBossPos.getY() + 1,
                    spawnBossPos.getZ() - 0.5
            );

            boss.setPersistenceRequired();


            plevel.addFreshEntity(boss);


            /*
            System.out.println(spawnBossPos);
            Zombie boss = new Zombie(plevel);

            boss.setPos(
                    spawnBossPos.getX() + 1,
                    spawnBossPos.getY() + 1,
                    spawnBossPos.getZ() - 4.5
            );

            boss.setPersistenceRequired();


            plevel.addFreshEntity(boss);*/

            Block Bars = ModBlocks.DUNGEON_BARS_FOREST.get();
            System.out.println(new BlockPos(spawnBossPos.getX()+2,1,spawnBossPos.getZ()-22)+ "bruh");
            level.setBlock(new BlockPos(spawnBossPos.getX()+2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()+1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-3,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

            level.setBlock(new BlockPos(spawnBossPos.getX()+1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX(),4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(new BlockPos(spawnBossPos.getX()-2,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);


        }
    }
    public void  bossDied(){
        setDefeatedBoss();



    }
    private void setDefeatedBoss (){
        BlockPos dungeonAir = new BlockPos(roomstartx,1,roomstartz);

        if(level.getBlockEntity(dungeonAir) instanceof DungeonAirEntity dungeonAirEntity){
            dungeonAirEntity.setDefated(dungeonAir);
        }
        Block Bars = Blocks.AIR;

        level.setBlock(new BlockPos(spawnBossPos.getX()+2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()+1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX(),1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-1,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-2,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-3,1,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

        level.setBlock(new BlockPos(spawnBossPos.getX()+2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()+1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX(),2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-1,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-2,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-3,2,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

        level.setBlock(new BlockPos(spawnBossPos.getX()+2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()+1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX(),3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-1,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-2,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-3,3,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);

        level.setBlock(new BlockPos(spawnBossPos.getX()+1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX(),4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-1,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
        level.setBlock(new BlockPos(spawnBossPos.getX()-2,4,spawnBossPos.getZ()-22), Bars.defaultBlockState(), Block.UPDATE_ALL);
    }


    public void initializeRoom(int startX, int startZ, int endX, int endZ,Level plevel) {
        this.roomstartx = startX;
        this.roomstartz = startZ;
        this.roomendx = endX;
        this.roomendz = endZ;
        this.started = true;
        level = plevel;
        this.setChanged();
    }

    private void setDefeatedRoom (){
        BlockPos dungeonAir = new BlockPos(roomstartx,1,roomstartz);

        if(level.getBlockEntity(dungeonAir) instanceof DungeonAirEntity dungeonAirEntity){
            dungeonAirEntity.setDefated(dungeonAir);
        }
        }
    public void mobDied() {
        System.out.println(mobCount);
        alive--;
        this.setChanged();
    }
    public void spawnForestWaves() {
        if(mobCount<=0&&alive<=0){
            setDefeatedRoom();
        }
        if (mobCount > 0 && alive < 6) {
            alive++;
            mobCount--;
            MobSpawnUtils.spawnRandomJungleMobs(level, roomstartx, roomstartz, roomendx, roomendz, 1, this);
            this.setChanged();
        }
    }
    public void spawnLavaWaves() {
        if(mobCount<=0&&alive<=0){
            setDefeatedRoom();
        }
        if (mobCount > 0 && alive < 6) {
            alive++;
            mobCount--;
            MobSpawnUtils.spawnRandomSkeleton(level, roomstartx, roomstartz, roomendx, roomendz, 1, this);
            this.setChanged();
        }
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        pTag.putInt("roomstartx", roomstartx);
        pTag.putInt("roomstartz", roomstartz);
        pTag.putInt("roomendx", roomendx);
        pTag.putInt("roomendz", roomendz);
        pTag.putInt("mobCount", mobCount);
        pTag.putInt("alive", alive);
        pTag.putBoolean("started", started);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        roomstartx = pTag.getInt("roomstartx");
        roomstartz = pTag.getInt("roomstartz");
        roomendx = pTag.getInt("roomendx");
        roomendz = pTag.getInt("roomendz");
        mobCount = pTag.getInt("mobCount");
        alive = pTag.getInt("alive");
        started = pTag.getBoolean("started");
    }
} 