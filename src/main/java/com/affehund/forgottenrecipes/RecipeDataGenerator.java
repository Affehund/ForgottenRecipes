package com.affehund.forgottenrecipes;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class RecipeDataGenerator extends RecipeProvider {
    public RecipeDataGenerator(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Items.ROTTEN_FLESH), Items.LEATHER, 0.1f, 600).unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH)).save(consumer);
        // ShapedRecipeBuilder.shaped(Items.BUNDLE).pattern("shs").pattern("h h").pattern("hhh").define('s', Items.STRING).unlockedBy("has_string", has(Items.STRING)).define('h', Items.RABBIT_HIDE).unlockedBy("has_rabbit_hide", has(Items.RABBIT_HIDE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.POWDER_SNOW_BUCKET).requires(Items.SNOW_BLOCK).unlockedBy("has_snow_block", has(Items.SNOW_BLOCK)).requires(Items.BUCKET).unlockedBy("has_bucket", has(Items.BUCKET)).save(consumer);
        // ShapedRecipeBuilder.shaped(Items.SCULK_SENSOR, 2).pattern("twt").pattern("cwc").define('t', Items.TWISTING_VINES).unlockedBy("has_twisting_vines", has(Items.TWISTING_VINES)).define('w', Items.WARPED_WART_BLOCK).unlockedBy("has_warped_wart_block", has(Items.WARPED_WART_BLOCK)).define('c', Items.CRYING_OBSIDIAN).unlockedBy("has_crying_obsidian", has(Items.CRYING_OBSIDIAN)).save(consumer);
    }
}
