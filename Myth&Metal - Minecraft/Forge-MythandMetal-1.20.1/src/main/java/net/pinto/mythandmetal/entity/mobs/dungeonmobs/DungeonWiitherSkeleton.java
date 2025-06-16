package net.pinto.mythandmetal.entity.mobs.dungeonmobs;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.level.Level;
import net.pinto.mythandmetal.block.customEntity.DungeonRoomEntity;

public class DungeonWiitherSkeleton extends WitherSkeleton {
    private DungeonRoomEntity ThisdungeonRoom;

    public void setDungeonRoom(DungeonRoomEntity dungeonRoom) {
        ThisdungeonRoom = dungeonRoom;
    }

    public DungeonWiitherSkeleton(EntityType<? extends WitherSkeleton> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public void die(DamageSource pDamageSource) {
        if(ThisdungeonRoom != null) {
            ThisdungeonRoom.mobDied();
        } else {
        }
        super.die(pDamageSource);

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, 0.25D);
    }
}
