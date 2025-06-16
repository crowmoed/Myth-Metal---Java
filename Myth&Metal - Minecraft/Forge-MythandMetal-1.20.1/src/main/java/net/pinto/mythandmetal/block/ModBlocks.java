package net.pinto.mythandmetal.block;

import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.block.custom.AshDirtBlock;
import net.pinto.mythandmetal.block.custom.AshGrassBlock;
import net.pinto.mythandmetal.block.custom.CustomAnvilTierBlock;
import net.pinto.mythandmetal.block.custom.CustomRotatingBlock;
import net.pinto.mythandmetal.block.custom.dungeon.DungeonAirBlock;
import net.pinto.mythandmetal.block.custom.dungeon.DungeonBar;
import net.pinto.mythandmetal.block.custom.dungeon.DungeonChest;
import net.pinto.mythandmetal.block.custom.dungeon.ModPortalBlock;
import net.pinto.mythandmetal.block.custom.dungeon.forest.Dungeon_Forest_AirBlock;
import net.pinto.mythandmetal.block.custom.dungeon.forest.Dungeon_Forest_AirBlock_Boss;
import net.pinto.mythandmetal.block.custom.dungeon.forest.ModForestDungeonPortalDoor;
import net.pinto.mythandmetal.block.custom.dungeon.lava.Dungeon_Lava_AirBlock;
import net.pinto.mythandmetal.block.custom.dungeon.lava.Dungeon_Lava_AirBlock_Boss;
import net.pinto.mythandmetal.block.custom.dungeon.lava.ModLavaDungeonPortalDoor;
import net.pinto.mythandmetal.block.customEntity.MyBlockEntityTypes;
import net.pinto.mythandmetal.item.ModItems;
import net.pinto.mythandmetal.worldgen.tree.AshTreeGrower;
import net.pinto.mythandmetal.worldgen.tree.EnchantedLargeTreeGrower;
import net.pinto.mythandmetal.worldgen.tree.EnchantedTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MythandMetal.MOD_ID);





    public static final RegistryObject<Block> TIER_ANVIL = registerBlock("tier_anvil",
            ()-> new CustomAnvilTierBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 1200.0F).sound(SoundType.ANVIL).pushReaction(PushReaction.BLOCK)));




    public static final RegistryObject<Block> ENCHANTED_SAPLING = registerBlock("enchanted_sapling",
            () -> new SaplingBlock(new EnchantedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ENCHANTED_LARGE_SAPLING = registerBlock("enchanted_large_sapling",
            () -> new SaplingBlock(new EnchantedLargeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noLootTable()));

    public static final RegistryObject<Block> ASH_SAPLING = registerBlock("ash_sapling",
            () -> new SaplingBlock(new AshTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> DUNGEON_BARS = registerBlock("dungeon_bars",
            () -> new DungeonBar(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> DUNGEON_BARS_FOREST = registerBlock("dungeon_bars_forest",
            () -> new DungeonBar(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> DUNGEON_BARS_LAVA = registerBlock("dungeon_bars_lava",
            () -> new DungeonBar(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(-1.0F, 3600000.0F).noLootTable()));


    public static final RegistryObject<Block> MYTHRIL_ORE_T2 = registerBlock("mythril_ore_t2",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> MYTHRIL_ORE_T3 = registerBlock("mythril_ore_t3",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> MYTHRIL_ORE_T4 = registerBlock("mythril_ore_t4",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> MYTHRIL_ORE_T5 = registerBlock("mythril_ore_t5",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> MYTHRIL_ORE_T6 = registerBlock("mythril_ore_t6",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> MYTHRIL_ORE_T7 = registerBlock("mythril_ore_t7",
            () -> new DropExperienceBlock( BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));















    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    public static final RegistryObject<Block> DUNGEONAIR = registerBlock("dungeon_air",
            () -> new DungeonAirBlock(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()));

    public static final RegistryObject<Block> DUNGEONAIR_FOREST = registerBlock("dungeon_air_forest",
            () -> new Dungeon_Forest_AirBlock(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()));
    public static final RegistryObject<Block> DUNGEONAIR_LAVA = registerBlock("dungeon_air_lava",
            () -> new Dungeon_Lava_AirBlock(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()));
    public static final RegistryObject<Block> DUNGEONAIR_LAVA_BOSS = registerBlock("dungeon_air_lava_boss",
            () -> new Dungeon_Lava_AirBlock_Boss(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()));
    public static final RegistryObject<Block> DUNGEONAIR_FOREST_BOSS = registerBlock("dungeon_air_forest_boss",
            () -> new Dungeon_Forest_AirBlock_Boss(BlockBehaviour.Properties.of().replaceable().noCollission().noLootTable().air()));



    public static final RegistryObject<Block> DUNGEONCHEST = registerBlock("dungeon_chest",
            () -> new DungeonChest(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD).ignitedByLava(), () -> {return MyBlockEntityTypes.DUNGEON_CHEST.get();}));


    public static final RegistryObject<Block> MOD_PORTAL = registerBlock("mod_portal",
            () -> new ModPortalBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noLootTable().noOcclusion().noCollission()));



    public static final RegistryObject<Block> LAVA_MOD_PORTAL = registerBlock("lava_mod_portal",
                () -> new ModLavaDungeonPortalDoor(BlockBehaviour.Properties.copy(Blocks.STONE).noLootTable().noOcclusion().noCollission().destroyTime(300.0F)));

    public static final RegistryObject<Block> FOREST_MOD_PORTAL = registerBlock("forest_mod_portal",
            () -> new ModForestDungeonPortalDoor(BlockBehaviour.Properties.copy(Blocks.STONE).noLootTable().noOcclusion().noCollission().destroyTime(300.0F)));







    public static final RegistryObject<Block> ASH_LOG = registerBlock("ash_log",
            () -> new CustomRotatingBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0F).lightLevel((state) -> 12).randomTicks()));

    public static final RegistryObject<Block> ASHBURNT_LOG = registerBlock("ashburnt_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0F).lightLevel((state) -> 12)));


    public static final RegistryObject<Block> ENCHANTED_LOG = registerBlock("enchanted_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.0F)));

    public static final RegistryObject<Block> ASH_LEAVES = registerBlock("ash_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PLANT).strength(0.2F).randomTicks().noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ENCHANTED_LEAVES = registerBlock("enchanted_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PLANT).strength(0.2F).randomTicks().noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY)));





    public static final RegistryObject<Block> METAL_STONE = registerBlock("metal_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> ASH_DIRT = registerBlock("ash_dirt",
            () -> new AshDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).randomTicks()));

    public static final RegistryObject<Block> ASH_GRASS = registerBlock("ash_grass",
            () -> new AshGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));




    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }




    private static RotatedPillarBlock log(MapColor pTopMapColor, MapColor pSideMapColor) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? pTopMapColor : pSideMapColor;
        }).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }










}
