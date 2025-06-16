package net.pinto.mythandmetal.worldgen.biome;


import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {


    public static final ResourceKey<PlacedFeature> ASH_PLACED_KEY = registerKey("ash_placed");
    public static final ResourceKey<PlacedFeature> ENCHANTED_PLACED_KEY = registerKey("enchanted_placed");
    public static final ResourceKey<PlacedFeature> ENCHANTED_LARGE_PLACED_KEY = registerKey("enchanted_large_placed");
    public static final ResourceKey<PlacedFeature> MAGMA_ROCK = registerKey("magma_rock");
    public static final ResourceKey<PlacedFeature> LAVA_ASH = registerKey("lava_ash");
    public static final ResourceKey<PlacedFeature> METAL_ORE_PLACED_KEY = registerKey("metal_ore_placed");

    public static final ResourceKey<PlacedFeature> TIER_TWO_ORE_PLACED_KEY = registerKey("mythril_ore_t2_placed");
    public static final ResourceKey<PlacedFeature> TIER_THREE_ORE_PLACED_KEY = registerKey("mythril_ore_t3_placed");
    public static final ResourceKey<PlacedFeature> TIER_FOUR_ORE_PLACED_KEY = registerKey("mythril_ore_t4_placed");
    public static final ResourceKey<PlacedFeature> TIER_FIVE_ORE_PLACED_KEY = registerKey("mythril_ore_t5_placed");
    public static final ResourceKey<PlacedFeature> TIER_SIX_ORE_PLACED_KEY = registerKey("mythril_ore_t6_placed");
    public static final ResourceKey<PlacedFeature> TIER_SEVEN_ORE_PLACED_KEY = registerKey("mythril_ore_t7_placed");



    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> holder2 = holdergetter.getOrThrow(ModConfiguredFeatures.MAGMA_ROCK);
        Holder<ConfiguredFeature<?, ?>> holder6 = holdergetter.getOrThrow(ModConfiguredFeatures.LAVA_ASH_KEY);


        register(context, TIER_TWO_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_TWO_ORE_KEY),
                ModOrePlacement.rareOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, TIER_THREE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_THREE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(48))));
        register(context, TIER_FOUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_FOUR_ORE_KEY),
                ModOrePlacement.rareOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, TIER_FIVE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_FIVE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, TIER_SIX_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_SIX_ORE_KEY),
                ModOrePlacement.rareOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, TIER_SEVEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIER_SEVEN_ORE_KEY),
                ModOrePlacement.rareOrePlacement(1,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-16))));




        register(context, METAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.METALPLAINS_METAL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(48,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(180))));

        PlacementUtils.register(context, LAVA_ASH, holder6, RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

        register(context, ASH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ASH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        ModBlocks.ASH_SAPLING.get()));

        register(context, ENCHANTED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENCHANTED_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(9, 0.5f, 7),
                        ModBlocks.ENCHANTED_SAPLING.get()));

        register(context, ENCHANTED_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENCHANTED_LARGE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(5, 0.5f, 2),
                        ModBlocks.ENCHANTED_LARGE_SAPLING.get()));



        PlacementUtils.register(context, MAGMA_ROCK, holder2, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());




    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MythandMetal.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}