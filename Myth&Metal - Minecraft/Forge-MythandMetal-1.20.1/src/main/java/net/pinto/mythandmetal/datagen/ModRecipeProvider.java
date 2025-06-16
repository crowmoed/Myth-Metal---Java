package net.pinto.mythandmetal.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.pinto.mythandmetal.MythandMetal;
import net.pinto.mythandmetal.block.ModBlocks;
import net.pinto.mythandmetal.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        helmetCrafting(pWriter,ModItems.ARBINITE_HELMET.get(),ModItems.ARBINITE.get());
        chestCrafting(pWriter,ModItems.ARBINITE_CHESTPLATE.get(),ModItems.ARBINITE.get());
        leggingsCrafting(pWriter,ModItems.ARBINITE_LEGGINGS.get(),ModItems.ARBINITE.get());
        bootsCrafting(pWriter,ModItems.ARBINITE_BOOTS.get(),ModItems.ARBINITE.get());

    }
    protected static void leggingsCrafting(Consumer<FinishedRecipe> pWriter, Item craftItem, Item resourceItem){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, craftItem)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S',resourceItem)
                .unlockedBy(getHasName(resourceItem), has(resourceItem))
                .save(pWriter);
    }
    protected static void chestCrafting(Consumer<FinishedRecipe> pWriter, Item craftItem, Item resourceItem){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, craftItem)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',resourceItem)
                .unlockedBy(getHasName(resourceItem), has(resourceItem))
                .save(pWriter);
    }
    protected static void helmetCrafting(Consumer<FinishedRecipe> pWriter, Item craftItem, Item resourceItem){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, craftItem)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S',resourceItem)
                .unlockedBy(getHasName(resourceItem), has(resourceItem))
                .save(pWriter);
    }
    protected static void bootsCrafting(Consumer<FinishedRecipe> pWriter, Item craftItem, Item resourceItem){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, craftItem)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S',resourceItem)
                .unlockedBy(getHasName(resourceItem), has(resourceItem))
                .save(pWriter);
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MythandMetal.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
