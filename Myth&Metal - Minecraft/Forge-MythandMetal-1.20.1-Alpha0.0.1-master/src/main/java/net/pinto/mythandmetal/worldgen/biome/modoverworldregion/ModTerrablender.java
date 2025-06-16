package net.pinto.mythandmetal.worldgen.biome.modoverworldregion;

import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

import static net.pinto.mythandmetal.MythandMetal.MOD_ID;

public class ModTerrablender {
    public static void registerBiomes() {

        Regions.register(new EnchantedRegion(new ResourceLocation(MOD_ID, "overworld_1"), 4));
        Regions.register(new AshenRegion(new ResourceLocation(MOD_ID, "overworld_2"), 4));
        Regions.register(new MetalRegion(new ResourceLocation(MOD_ID, "overworld_3"), 4));

    }
}