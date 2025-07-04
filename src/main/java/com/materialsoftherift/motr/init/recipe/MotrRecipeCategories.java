package com.materialsoftherift.motr.init.recipe;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeBookCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MotrRecipeCategories {
    public static final DeferredRegister<RecipeBookCategory> RECIPE_BOOK_CATEGORIES = DeferredRegister
            .create(Registries.RECIPE_BOOK_CATEGORY, MaterialsOfTheRift.MODID);

}
