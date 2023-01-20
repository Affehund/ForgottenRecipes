package com.affehund.forgottenrecipes;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeDataGenerator extends RecipeProvider {
    public RecipeDataGenerator(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER, 0.1f, 600).unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.BELL).pattern("sts").pattern("sbs").pattern("sns").define('s', Items.STONE).define('t', Items.STICK).define('b', Items.GOLD_BLOCK).define('n', Items.GOLD_NUGGET).unlockedBy(getHasName(Items.GOLD_BLOCK), has(Items.GOLD_BLOCK)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.CRYING_OBSIDIAN, 8).pattern("ooo").pattern("ogo").pattern("ooo").define('o', Items.OBSIDIAN).define('g', Items.GHAST_TEAR).unlockedBy(getHasName(Items.GHAST_TEAR), has(Items.GHAST_TEAR)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GLOW_LICHEN, 3).pattern("gv").pattern("vv").define('g', Items.GLOWSTONE_DUST).define('v', Items.VINE).unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.SCULK_SENSOR, 2).pattern("twt").pattern("cwc").define('t', Items.TWISTING_VINES).define('w', Items.WARPED_WART_BLOCK).define('c', Items.CRYING_OBSIDIAN).unlockedBy(getHasName(Items.CRYING_OBSIDIAN), has(Items.CRYING_OBSIDIAN)).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SCULK_VEIN, 3).pattern("ev").pattern("vv").define('e', Items.ECHO_SHARD).define('v', Items.VINE).unlockedBy(getHasName(Items.ECHO_SHARD), has(Items.ECHO_SHARD)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GLOWSTONE_DUST).requires(Items.GLOW_BERRIES).unlockedBy(getHasName(Items.GLOW_BERRIES), has(Items.GLOW_BERRIES)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.POWDER_SNOW_BUCKET).requires(Items.BUCKET).requires(Items.SNOW_BLOCK).unlockedBy(getHasName(Items.SNOW_BLOCK), has(Items.SNOW_BLOCK)).save(consumer);
    }
}