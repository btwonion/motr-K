package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class MotrBlockLootTableProvider extends BlockLootSubProvider {
    public MotrBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        MotrBlocks.REGISTERED_STANDARD_SLABS.values().forEach(slabInfo -> dropSelf(slabInfo.slab().get()));
        MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.values().forEach(slabInfo -> dropSelf(slabInfo.slab().get()));
        MotrBlocks.REGISTERED_GLASS_SLABS.values().forEach(slabInfo -> dropSelf(slabInfo.slab().get()));
        MotrBlocks.REGISTERED_TRIMM_SLABS.values().forEach(slabInfo -> dropSelf(slabInfo.slab().get()));

    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return MotrBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}