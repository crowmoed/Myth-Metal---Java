package net.pinto.mythandmetal.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.entity.mobs.AshenWolf.AshenWolf;
import net.pinto.mythandmetal.entity.mobs.Magmaraakh.MagmaraakhEntity;
import net.pinto.mythandmetal.entity.mobs.arbinator.ArborinatorEntity;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonSpider;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonWiitherSkeleton;
import net.pinto.mythandmetal.entity.mobs.dungeonmobs.DungeonZombie;

public class ModEntites {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MythandMetal.MOD_ID);

    public static final RegistryObject<EntityType<AshenWolf>> ASHENWOLF =
            ENTITY_TYPES.register("ashenwolf", ()-> EntityType.Builder.of(AshenWolf::new, MobCategory.CREATURE)
                    .sized(1.5f,1.5f).build("ashenwolf"));




    public static final RegistryObject<EntityType<DungeonSkeleton>> DUNGEON_SKELETON =
            ENTITY_TYPES.register("dungeon_skeleton",
                    () -> EntityType.Builder.of(DungeonSkeleton::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.99F)
                            .clientTrackingRange(8)
                            .build("dungeon_skeleton")
            );
    public static final RegistryObject<EntityType<DungeonWiitherSkeleton>> DUNGEON_WITHER_SKELETON =
            ENTITY_TYPES.register("dungeon_wither_skeleton",
                    () -> EntityType.Builder.of(DungeonWiitherSkeleton::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.99F)
                            .clientTrackingRange(8)
                            .build("dungeon_wither_skeleton")
            );
    public static final RegistryObject<EntityType<DungeonZombie>> DUNGEON_ZOMBIE =
            ENTITY_TYPES.register("dungeon_zombie",
                    () -> EntityType.Builder.of(DungeonZombie::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.99F)
                            .clientTrackingRange(8)
                            .build("dungeon_zombie")
            );
    public static final RegistryObject<EntityType<DungeonSpider>> DUNGEON_SPIDER =
            ENTITY_TYPES.register("dungeon_spider",
                    () -> EntityType.Builder.of(DungeonSpider::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.99F)
                            .clientTrackingRange(8)
                            .build("dungeon_spider")
            );


    public static final RegistryObject<EntityType<ArborinatorEntity>> ARBINATOR =
            ENTITY_TYPES.register("arbinator", () -> EntityType.Builder.of(ArborinatorEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("arborinator"));

    public static final RegistryObject<EntityType<MagmaraakhEntity>> MAGMARAAKH =
            ENTITY_TYPES.register("magmaraakh", () -> EntityType.Builder.of(MagmaraakhEntity::new, MobCategory.MONSTER)
                    .sized(2.5f, 2.5f).build("magmaraakh"));


    public static void  register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }



}
