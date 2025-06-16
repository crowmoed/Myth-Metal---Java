package net.pinto.mythandmetal.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.pinto.mythandmetal.block.customEntity.DungeonRoomEntity;
import net.pinto.mythandmetal.entity.ModEntites;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSpider;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonWiitherSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonZombie;

import java.util.Random;

public class MobSpawnUtils {
    private static final Random random = new Random();

    public static void spawnRandomSkeleton(Level level, double x1, double z1, double x2, double z2, double y, DungeonRoomEntity dungeonRoom) {
        if (level == null) return;

        double spawnY = 1.0;
        int maxAttempts = 5;

        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            double randomX = x1 + (x2 - x1) * random.nextDouble();
            double randomZ = z1 + (z2 - z1) * random.nextDouble();

            BlockPos feetPos = new BlockPos((int) Math.floor(randomX), (int) spawnY, (int) Math.floor(randomZ));
            BlockPos headPos = feetPos.above();

            if (!level.getBlockState(feetPos).isAir() || !level.getBlockState(headPos).isAir()) {
                continue;
            }

            AABB mobBoundingBox = new AABB(randomX - 0.3, spawnY, randomZ - 0.3,
                    randomX + 0.3, spawnY + 2.0, randomZ + 0.3);

            if (!level.noCollision(mobBoundingBox)) {
                continue;
            }

            DungeonWiitherSkeleton dungeonWiitherSkeleton = null;
            DungeonSkeleton dungeonSkeleton = null;

            if (random.nextBoolean()) {
                dungeonSkeleton = ModEntites.DUNGEON_SKELETON.get().create(level);
            } else {
                dungeonWiitherSkeleton = ModEntites.DUNGEON_WITHER_SKELETON.get().create(level);
            }

            if (dungeonSkeleton != null) {
                dungeonSkeleton.setPos(randomX, spawnY, randomZ);
                dungeonSkeleton.setDungeonRoom(dungeonRoom);
                level.addFreshEntity(dungeonSkeleton);
                return;
            }
            else if (dungeonWiitherSkeleton != null) {
                dungeonWiitherSkeleton.setPos(randomX, spawnY, randomZ);
                dungeonWiitherSkeleton.setDungeonRoom(dungeonRoom);
                level.addFreshEntity(dungeonWiitherSkeleton);
                return;
            }
        }
    }

    public static void spawnRandomJungleMobs(Level level, double x1, double z1, double x2, double z2, double y, DungeonRoomEntity dungeonRoom) {
        if (level == null) return;

        double spawnY = 1.0;
        int maxAttempts = 5;

        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            double randomX = x1 + (x2 - x1) * random.nextDouble();
            double randomZ = z1 + (z2 - z1) * random.nextDouble();

            BlockPos feetPos = new BlockPos((int) Math.floor(randomX), (int) spawnY, (int) Math.floor(randomZ));
            BlockPos headPos = feetPos.above();

            if (!level.getBlockState(feetPos).isAir() || !level.getBlockState(headPos).isAir()) {
                continue;
            }

            AABB mobBoundingBox = new AABB(randomX - 0.3, spawnY, randomZ - 0.3,
                    randomX + 0.3, spawnY + 2.0, randomZ + 0.3);

            if (!level.noCollision(mobBoundingBox)) {
                continue;
            }

            DungeonZombie dungeonZombie = null;
            DungeonSpider dungeonSpider = null;

            if (random.nextBoolean()) {
                dungeonSpider = ModEntites.DUNGEON_SPIDER.get().create(level);
            } else {
                dungeonZombie = ModEntites.DUNGEON_ZOMBIE.get().create(level);
            }

            if (dungeonSpider != null) {
                dungeonSpider.setPos(randomX, spawnY, randomZ);
                dungeonSpider.setDungeonRoom(dungeonRoom);
                level.addFreshEntity(dungeonSpider);
                return;
            }
            else if (dungeonZombie != null) {
                dungeonZombie.setPos(randomX, spawnY, randomZ);
                dungeonZombie.setDungeonRoom(dungeonRoom);
                level.addFreshEntity(dungeonZombie);
                return;
            }
        }
    }
}