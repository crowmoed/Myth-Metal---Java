package net.pinto.mythandmetal.worldgen.biome;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.pinto.mythandmetal.MythandMetal;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_METAL_ORE = registerKey("add_metal_ore");


    public static final ResourceKey<BiomeModifier> ADD_TIER_TWO_ORE = registerKey("add_tier_two_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIER_THREE_ORE = registerKey("add_tier_three_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIER_FOUR_ORE = registerKey("add_tier_four_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIER_FIVE_ORE = registerKey("add_tier_five_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIER_SIX_ORE = registerKey("add_tier_six_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIER_SEVEN_ORE = registerKey("add_tier_seven_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);


        context.register(ADD_TIER_TWO_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_TWO_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIER_THREE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_THREE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIER_FOUR_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_FOUR_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIER_FIVE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_FIVE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIER_SIX_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_SIX_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIER_SEVEN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIER_SEVEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_METAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.METAL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MythandMetal.MOD_ID, name));
    }
}
