package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

/* Handles Data Generation for Block Tags of the Wotr mod */
public class MotrItemTagProvider extends ItemTagsProvider {
    public MotrItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, MaterialsOfTheRift.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // spotless:off

        tag(Tags.Items.HIDDEN_FROM_RECIPE_VIEWERS)
               ;



        // spotless:on
    }
}