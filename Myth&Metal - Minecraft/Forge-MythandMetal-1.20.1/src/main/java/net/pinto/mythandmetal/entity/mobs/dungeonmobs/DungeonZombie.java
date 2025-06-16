package net.pinto.mythandmetal.entity.mobs.dungeonmobs;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import net.pinto.mythandmetal.block.customEntity.DungeonRoomEntity;

public class DungeonZombie extends Zombie {

    private DungeonRoomEntity ThisdungeonRoom;

    public void setDungeonRoom(DungeonRoomEntity dungeonRoom) {

        ThisdungeonRoom = dungeonRoom;
    }

    public DungeonZombie(EntityType<? extends Zombie> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 35.0D).add(Attributes.MOVEMENT_SPEED, (double)0.23F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR, 2.0D).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }

    @Override
    public void die(DamageSource pDamageSource) {
        if(ThisdungeonRoom != null) {
            ThisdungeonRoom.mobDied();
        } else {

        }
        super.die(pDamageSource);

    }
}
