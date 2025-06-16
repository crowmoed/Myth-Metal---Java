package net.pinto.mythandmetal.block.custom.dungeon.forest;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.pinto.mythandmetal.block.custom.dungeon.DungeonAirBlock;
import net.pinto.mythandmetal.block.customEntity.dungeon.DungeonAirEntity_Forest_Boss;
import net.pinto.mythandmetal.block.customEntity.dungeon.DungeonAirEntity_Lava_Boss;

public class Dungeon_Forest_AirBlock_Boss extends DungeonAirBlock {
    public static int roomCount=0;


    public Dungeon_Forest_AirBlock_Boss(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canEntityDestroy(BlockState state, BlockGetter world, BlockPos pos, Entity entity) {
        return false;
    } 

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {

        return Shapes.empty();
    }
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.INVISIBLE;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DungeonAirEntity_Forest_Boss(pPos, pState);
    }


    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pLevel instanceof ServerLevel && pEntity instanceof Player && pLevel.getBlockEntity(pPos) instanceof  DungeonAirEntity_Forest_Boss dungeonAir) {
            if(!dungeonAir.started&&!dungeonAir.defated){
            dungeonAir.Startroom(pPos,roomCount);
            dungeonAir.roomEntityCount=roomCount;
            roomCount++;
            }
        }
    }



}
