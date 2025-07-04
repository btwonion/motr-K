package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/* Handles Data Generation for Recipes of the Wotr mod */
public class MotrRecipeProvider extends RecipeProvider {

    // Construct the provider to run
    protected MotrRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
        HolderGetter<Item> getter = this.registries.lookupOrThrow(Registries.ITEM);

        MotrBlocks.REGISTERED_STANDARD_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_GLASS_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_TRIMM_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });
    }

    // The runner to add to the data generator
    public static class Runner extends RecipeProvider.Runner {
        // Get the parameters from the `GatherDataEvent`s.
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(
                HolderLookup.@NotNull Provider provider,
                @NotNull RecipeOutput output) {
            return new MotrRecipeProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Wanderers of the Rift's Recipes";
        }
    }
}
