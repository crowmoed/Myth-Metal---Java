package net.pinto.mythandmetal.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CUSTOM_ORE_REPLACEABLES =
                TagKey.create(Registries.BLOCK, new ResourceLocation("mythandmetal", "custom_ore_replaceables"));
    }
}
