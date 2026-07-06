package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.block.ModBlocks;
import com.opaqueyardinfinity.thelostfrontiers.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }
        @Override
        protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
            // FIX: use the parameters passed into this method
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public @NonNull String getName() {
            return "TheLostFrontiers Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .group("silver")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK)
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK))
                .group("silver")
                .save(output);

        List<ItemLike> SILVER_SMELTING = List.of(ModItems.RAW_SILVER.get(),
                ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get()
        );

        oreSmelting(SILVER_SMELTING, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(SILVER_SMELTING, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver");

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER))
                .group("raw_silver")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9)
                .requires(ModBlocks.RAW_SILVER_BLOCK)
                .unlockedBy(getHasName(ModBlocks.RAW_SILVER_BLOCK.get()), has(ModBlocks.RAW_SILVER_BLOCK))
                .group("raw_silver")
                .save(output);

        /* WEAPONS AND TOOLS */
        shaped(RecipeCategory.COMBAT, ModItems.SILVER_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.SILVER_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.SILVER_SHOVEL.get())
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.SILVER_AXE.get())
                .pattern("AA")
                .pattern("SA")
                .pattern("S ")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.TOOLS, ModItems.SILVER_HOE.get())
                .pattern("AA")
                .pattern("S ")
                .pattern("S ")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_SPEAR.get())
                .pattern("  A")
                .pattern(" S ")
                .pattern("S  ")
                .define('A', ModItems.SILVER_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("silver")
                .save(output);

        /* ARMOR */

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .group("silver")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SILVER_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT))
                .group("silver")
                .save(output);

    }


    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.@NonNull Factory<T> factory, List<ItemLike> smeltables,
                                                                @NonNull RecipeCategory craftingCategory, @NonNull CookingBookCategory cookingCategory, @NonNull ItemLike result,
                                                                float experience, int cookingTime, @NonNull String group, @NonNull String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, TheLostFrontiers.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
