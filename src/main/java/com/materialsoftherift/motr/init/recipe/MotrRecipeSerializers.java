package com.materialsoftherift.motr.init.recipe;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MotrRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister
            .create(Registries.RECIPE_SERIALIZER, MaterialsOfTheRift.MODID);

}
