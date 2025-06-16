package net.pinto.mythandmetal.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

public static final ResourceKey<ConfiguredFeature<?, ?>> MAGMA_ROCK = registerKey("magma_rock");
public static final ResourceKey<ConfiguredFeature<?, ?>> ASH_KEY = registerKey("ash_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_LARGE_KEY = registerKey("enchanted_large_tree");

public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_KEY = registerKey("enchanted_tree");
public static final ResourceKey<ConfiguredFeature<?, ?>> LAVA_ASH_KEY = registerKey("lake_ash");

public static final ResourceKey<ConfiguredFeature<?, ?>> METALPLAINS_METAL_ORE_KEY = registerKey("metal_ore");


    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_TWO_ORE_KEY = registerKey("mythril_ore_t2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_THREE_ORE_KEY = registerKey("mythril_ore_t3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_FOUR_ORE_KEY = registerKey("mythril_ore_t4");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_FIVE_ORE_KEY = registerKey("mythril_ore_t5");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_SIX_ORE_KEY = registerKey("mythril_ore_t6");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIER_SEVEN_ORE_KEY = registerKey("mythril_ore_t7");








public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    RuleTest metalstoneReplaceable = new BlockMatchTest(ModBlocks.METAL_STONE.get());




    register(context, TIER_TWO_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T2.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T2.get().defaultBlockState())
            ), 9));
    register(context, TIER_THREE_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T3.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T3.get().defaultBlockState())
            ), 9));
    register(context, TIER_FOUR_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T4.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T4.get().defaultBlockState())
            ), 9));
    register(context, TIER_FIVE_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T5.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T5.get().defaultBlockState())
            ), 9));
    register(context, TIER_SIX_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T6.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T6.get().defaultBlockState())
            ), 9));
    register(context, TIER_SEVEN_ORE_KEY, Feature.ORE,
            new OreConfiguration(List.of(
                    OreConfiguration.target(stoneReplaceable, ModBlocks.MYTHRIL_ORE_T7.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_ORE_T7.get().defaultBlockState())
            ), 9));



    register(context, METALPLAINS_METAL_ORE_KEY, Feature.ORE, new OreConfiguration(metalstoneReplaceable,ModBlocks.ENCHANTED_LOG.get().defaultBlockState(), 9));


    register(context, MAGMA_ROCK, Feature.FOREST_ROCK, new BlockStateConfiguration(Blocks.MAGMA_BLOCK.defaultBlockState()));


    register(context, LAVA_ASH_KEY, Feature.LAKE, new LakeFeature.Configuration(BlockStateProvider.simple(Blocks.LAVA.defaultBlockState()), BlockStateProvider.simple(Blocks.NETHERRACK.defaultBlockState())));

    register(context, ASH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.ASH_LOG.get()),
            new StraightTrunkPlacer(5, 4, 3)
            ,

            BlockStateProvider.simple(ModBlocks.ASH_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(2), 2),

            new TwoLayersFeatureSize(1, 0, 2)).build());
    register(context, ENCHANTED_LARGE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.ENCHANTED_LOG.get()),
                    new MegaJungleTrunkPlacer(
                            10,  // Base height (bigger than oak/mangrove)
                            2,   // Height randomness
                            1    // Extra height variation
                    ),
                    BlockStateProvider.simple(ModBlocks.ENCHANTED_LEAVES.get()),
                    new MegaJungleFoliagePlacer(
                            ConstantInt.of(2),  // Foliage radius at bottom
                            ConstantInt.of(1),  // Foliage radius at top
                            3                 // Foliage height
                    ),
                    new TwoLayersFeatureSize(1, 1, 2)
            )
                    .ignoreVines()
                    .build()
    );


    register(context, ENCHANTED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(ModBlocks.ENCHANTED_LOG.get()),
            new StraightTrunkPlacer(9, 6, 4),

            BlockStateProvider.simple(ModBlocks.ENCHANTED_LEAVES.get()),
            new SpruceFoliagePlacer(
                    UniformInt.of(3, 5),
                    UniformInt.of(2, 3),
                    UniformInt.of(5, 7)
            ),

            new TwoLayersFeatureSize(2, 1, 5)
    ).ignoreVines().build());
}

public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
    return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MythandMetal.MOD_ID, name));
}

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));}

}
