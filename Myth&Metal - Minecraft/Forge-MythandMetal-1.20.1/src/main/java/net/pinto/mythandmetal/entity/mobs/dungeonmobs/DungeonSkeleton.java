package net.pinto.mythandmetal.entity.mobs.dungeonmobs;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.level.Level;
import net.pinto.mythandmetal.block.customEntity.DungeonRoomEntity;

public class DungeonSkeleton extends Skeleton {

    private DungeonRoomEntity ThisdungeonRoom;

    public void setDungeonRoom(DungeonRoomEntity dungeonRoom) {

        ThisdungeonRoom = dungeonRoom;
    }

    public DungeonSkeleton(EntityType<? extends Skeleton> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public void die(DamageSource pDamageSource) {
        if(ThisdungeonRoom != null) {
            ThisdungeonRoom.mobDied();
        } else {

        }
        super.die(pDamageSource);

    }
    @Override
    public boolean doHurtTarget(Entity pEntity) {

        boolean flag = super.doHurtTarget(pEntity);
        if (flag) {
            pEntity.setSecondsOnFire(3);
        }
        return flag;
    }
    @Override
    public boolean isInvulnerableTo(DamageSource pSource) {
        if (pSource.is(DamageTypes.IN_FIRE) ||
                pSource.is(DamageTypes.ON_FIRE) ||
                pSource.is(DamageTypes.LAVA) ||
                pSource.is(DamageTypes.HOT_FLOOR)) {
            return true;
        }
        return super.isInvulnerableTo(pSource);
    }
}
