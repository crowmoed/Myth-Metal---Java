package net.pinto.mythandmetal.worldgen.biome;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.pinto.mythandmetal.MythandMetal;

public class ModBiomes {
    public  static final ResourceKey<Biome> ASH_FOREST = register("ash_forest");
    public  static final ResourceKey<Biome> ENCHANTED_FOREST = register("enchanted_forest");
    public  static final ResourceKey<Biome> METALPLAINS = register("metalplains");
    public  static final ResourceKey<Biome> DUNGEON = register("dungeon");


    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(MythandMetal.MOD_ID,name));
    }

    public static void bootstrap(BootstapContext<Biome> context) {
        context.register(ASH_FOREST, ash_forest(context));
        context.register(ENCHANTED_FOREST, enchanted_forest(context));
        context.register(METALPLAINS, metalplains(context));
        context.register(DUNGEON, dungeon(context));

    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
    }

    public static Biome dungeon(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0.0f)
                .temperature(0.0f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x050533)
                        .skyColor(0x78A7FF)
                        .grassColorOverride(0x91BD59)
                        .foliageColorOverride(0x77AB2F)
                        .fogColor(0xC0D8FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }


    public static Biome enchanted_forest(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        globalOverworldGeneration(biomeBuilder);

        /*
        globalOverworldGeneration(biomeBuilder);

        BiomeDefaultFeatures.addForestFlowers(biomeBuilder); // Forest-specific flowers
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder); // Additional flower variety
        BiomeDefaultFeatures.addForestGrass(biomeBuilder); // Forest grass patches
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder); // More grass variety

        BiomeDefaultFeatures.addMushroomFieldVegetation(biomeBuilder); // Includes both mushroom types
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder); // Small mushrooms on the ground

        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);

        BiomeDefaultFeatures.addSavannaExtraGrass(biomeBuilder);
        */
        BiomeDefaultFeatures.addPlainGrass(biomeBuilder);
        BiomeDefaultFeatures.addPlainVegetation(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ENCHANTED_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ENCHANTED_LARGE_PLACED_KEY);


        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);


        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f) // High downfall helps mushroom growth
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x050533)
                        .skyColor(0x78A7FF)
                        .grassColorOverride(0x91BD59) // Bright magical green
                        .foliageColorOverride(0x77AB2F) // Enchanted foliage color
                        .fogColor(0xC0D8FF) // Soft blue fog
                        .ambientParticle(new AmbientParticleSettings(ParticleTypes.ENCHANTED_HIT, 0.01f)) // Magical particles
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .ambientLoopSound(SoundEvents.AMBIENT_CRIMSON_FOREST_LOOP) // Mysterious ambient sound
                        .build())
                .build();
    }

    public static Biome metalplains(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        globalOverworldGeneration(biomeBuilder);

        BiomeDefaultFeatures.addPlainGrass(biomeBuilder);
        BiomeDefaultFeatures.addPlainVegetation(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder);


        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x050533)
                        .skyColor(0x78A7FF)
                        .grassColorOverride(0x91BD59)
                        .foliageColorOverride(0x77AB2F)
                        .fogColor(0xC0D8FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }


    public static Biome ash_forest(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        biomeBuilder.addFeature(GenerationStep.Decoration.LAKES, MiscOverworldPlacements.LAKE_LAVA_SURFACE);
        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        biomeBuilder.addFeature(GenerationStep.Decoration.LAKES, ModPlacedFeatures.LAVA_ASH);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.ASH_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, ModPlacedFeatures.MAGMA_ROCK);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3F76E4)
                        .waterFogColor(0x050533)
                        .skyColor(0x78A7FF)
                        .grassColorOverride(0x91BD59)
                        .foliageColorOverride(0x77AB2F)
                        .fogColor(0xC0D8FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }
}
