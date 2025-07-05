package com.materialsoftherift.motr.init.recipe;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MotrRecipeDisplayTypes {
    public static final DeferredRegister<RecipeDisplay.Type<?>> RECIPE_DISPLAY_TYPES = DeferredRegister
            .create(Registries.RECIPE_DISPLAY, MaterialsOfTheRift.MODID);

}
