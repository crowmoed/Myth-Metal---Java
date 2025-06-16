package net.pinto.mythandmetal.block.customEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinto.mythandmetal.block.ModBlocks;
import net.pinto.mythandmetal.block.customEntity.dungeon.DungeonAirEntity_Forest;
import net.pinto.mythandmetal.block.customEntity.dungeon.DungeonAirEntity_Lava;
import net.pinto.mythandmetal.block.customEntity.dungeon.DungeonAirEntity_Lava_Boss;

public class MyBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "mythandmetal");

    public static final RegistryObject<BlockEntityType<ModDungeonPortalDoorBlockEntity>> LAVA_MOD_PORTAL =
            BLOCK_ENTITY_TYPES.register("lava_mod_portal",
                    () -> BlockEntityType.Builder.of(ModDungeonPortalDoorBlockEntity::new,
                            ModBlocks.LAVA_MOD_PORTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModDungeonPortalDoorBlockEntity>> FOREST_MOD_PORTAL =
            BLOCK_ENTITY_TYPES.register("forest_mod_portal",
                    () -> BlockEntityType.Builder.of(ModDungeonPortalDoorBlockEntity::new,
                            ModBlocks.FOREST_MOD_PORTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<DungeonChestEntity>> DUNGEON_CHEST =
            BLOCK_ENTITY_TYPES.register("dungeon_chest",
                    () -> BlockEntityType.Builder.of(DungeonChestEntity::new,
                            ModBlocks.DUNGEONCHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<DungeonAirEntity>> DUNGEON_AIR =
            BLOCK_ENTITY_TYPES.register("dungeon_air",
                    () -> BlockEntityType.Builder.of(DungeonAirEntity::new,
                            ModBlocks.DUNGEONAIR.get()).build(null));

    public static final RegistryObject<BlockEntityType<DungeonAirEntity_Lava>> DUNGEON_AIR_LAVA =
            BLOCK_ENTITY_TYPES.register("dungeon_air_lava",
                    () -> BlockEntityType.Builder.of(DungeonAirEntity_Lava::new,
                            ModBlocks.DUNGEONAIR_LAVA.get()).build(null));
    public static final RegistryObject<BlockEntityType<DungeonAirEntity_Forest>> DUNGEON_AIR_FOREST =
            BLOCK_ENTITY_TYPES.register("dungeon_air_forest",
                    () -> BlockEntityType.Builder.of(DungeonAirEntity_Forest::new,
                            ModBlocks.DUNGEONAIR_FOREST.get()).build(null));
    public static final RegistryObject<BlockEntityType<DungeonAirEntity_Lava_Boss>> DUNGEON_AIR_LAVA_BOSS =
            BLOCK_ENTITY_TYPES.register("dungeon_air_lava_boss",
                    () -> BlockEntityType.Builder.of(DungeonAirEntity_Lava_Boss::new,
                            ModBlocks.DUNGEONAIR_LAVA_BOSS.get()).build(null));

    public static final RegistryObject<BlockEntityType<DungeonAirEntity_Forest>> DUNGEON_AIR_FOREST_BOSS =
            BLOCK_ENTITY_TYPES.register("dungeon_air_forest_boss",
                    () -> BlockEntityType.Builder.of(DungeonAirEntity_Forest::new,
                            ModBlocks.DUNGEONAIR_FOREST_BOSS.get()).build(null));


    public static final RegistryObject<BlockEntityType<DungeonRoomEntity>> DUNGEON_ROOM =
            BLOCK_ENTITY_TYPES.register("dungeon_room", () ->
                    BlockEntityType.Builder.of(DungeonRoomEntity::new, ModBlocks.DUNGEONAIR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }




}
