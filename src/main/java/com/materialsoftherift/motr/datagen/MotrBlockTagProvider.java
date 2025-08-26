package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class MotrBlockTagProvider extends BlockTagsProvider {
    public MotrBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, MaterialsOfTheRift.MODID);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // spotless:off
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MotrBlocks.WHITE_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_GRAY_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.GRAY_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.BLACK_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.BROWN_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.RED_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.ORANGE_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.YELLOW_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.LIME_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.GREEN_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.CYAN_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_BLUE_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.BLUE_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.PURPLE_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.MAGENTA_CONCRETE_SLAB.slab().get())
                .add(MotrBlocks.PINK_CONCRETE_SLAB.slab().get())

                .add(MotrBlocks.GLASS_SLAB.slab().get())
                .add(MotrBlocks.TINTED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.WHITE_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.GRAY_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.BLACK_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.BROWN_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.RED_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.ORANGE_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.YELLOW_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.LIME_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.GREEN_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.CYAN_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.BLUE_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.PURPLE_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.MAGENTA_STAINED_GLASS_SLAB.slab().get())
                .add(MotrBlocks.PINK_STAINED_GLASS_SLAB.slab().get())

                .add(MotrBlocks.TUBE_CORAL_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.BRAIN_CORAL_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.BUBBLE_CORAL_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.FIRE_CORAL_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.HORN_CORAL_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.GOLD_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.IRON_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.RAW_IRON_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.RAW_GOLD_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.PACKED_ICE_SLAB.slab().get())
                .add(MotrBlocks.ICE_SLAB.slab().get())
                .add(MotrBlocks.BLUE_ICE_SLAB.slab().get())
                .add(MotrBlocks.GILDED_BLACKSTONE_SLAB.slab().get())
                .add(MotrBlocks.BONE_BLOCK_SLAB.slab().get())
                .add(MotrBlocks.CLAY_SLAB.slab().get())
                .add(MotrBlocks.RESIN_BLOCK_SLAB.slab().get())
                .add(getAllButtonBlocks())
                .add(getAllFallingBlocks())
                .add(getAllBrushableBlocks())
                .add(getAllFenceBlocks())
                .add(getAllWallBlocks())
                .add(getAllStairBlocks());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(MotrBlocks.DIRT_SLAB.slab().get())
                .add(MotrBlocks.COARSE_DIRT_SLAB.slab().get())
                .add(MotrBlocks.ROOTED_DIRT_SLAB.slab().get())
                .add(MotrBlocks.PODZOL_SLAB.slab().get())
                .add(MotrBlocks.MYCELIUM_SLAB.slab().get())
                .add(MotrBlocks.DIRT_PATH_SLAB.slab().get())
                .add(MotrBlocks.SOUL_SAND_SLAB.slab().get())
                .add(MotrBlocks.SOUL_SOIL_SLAB.slab().get())
                .add(MotrBlocks.MUD_SLAB.slab().get())
                .add(MotrBlocks.MUDDY_MANGROVE_ROOTS_SLAB.slab().get())

                .add(MotrBlocks.WHITE_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.GRAY_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.BLACK_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.BROWN_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.RED_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.ORANGE_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.YELLOW_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.LIME_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.GREEN_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.CYAN_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.BLUE_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.PURPLE_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.MAGENTA_CONCRETE_POWDER_SLAB.slab().get())
                .add(MotrBlocks.PINK_CONCRETE_POWDER_SLAB.slab().get())

                .add(getAllFallingBlocks())
                .add(getAllBrushableBlocks())
        ;

        tag(BlockTags.DIRT)
                .add(MotrBlocks.DIRT_SLAB.slab().get())
                .add(MotrBlocks.DIRT_PATH_SLAB.slab().get())
                .add(MotrBlocks.COARSE_DIRT_SLAB.slab().get())
                .add(MotrBlocks.ROOTED_DIRT_SLAB.slab().get())
                .add(MotrBlocks.PODZOL_SLAB.slab().get())
                .add(MotrBlocks.MYCELIUM_SLAB.slab().get());

        tag(BlockTags.SOUL_SPEED_BLOCKS)
                .add(MotrBlocks.SOUL_SAND_SLAB.slab().get())
                .add(MotrBlocks.SOUL_SOIL_SLAB.slab().get());

        tag(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(MotrBlocks.SOUL_SAND_SLAB.slab().get())
                .add(MotrBlocks.SOUL_SOIL_SLAB.slab().get());

        tag(BlockTags.ICE)
                .add(MotrBlocks.ICE_SLAB.slab().get())
                .add(MotrBlocks.PACKED_ICE_SLAB.slab().get())
                .add(MotrBlocks.BLUE_ICE_SLAB.slab().get());

        tag(BlockTags.SLABS)
                .add(getAllSlabBlocks());

        tag(BlockTags.WALLS)
                .add(getAllWallBlocks());

        tag(BlockTags.FENCES)
                .add(getAllFenceBlocks());

        tag(BlockTags.BUTTONS)
                .add(getAllButtonBlocks());

        tag(BlockTags.SAND)
                .add(getAllSandBlocks());

        tag(BlockTags.ENDERMAN_HOLDABLE)
                .add(MotrBlocks.SAND.block().get())
                .add(MotrBlocks.RED_SAND.block().get())
                .add(MotrBlocks.GRAVEL.block().get())
                .add(MotrBlocks.SUSPICIOUS_GRAVEL.block().get());

        tag(BlockTags.RABBITS_SPAWNABLE_ON)
                .add(MotrBlocks.SAND.block().get());

        tag(BlockTags.SMELTS_TO_GLASS)
                .add(MotrBlocks.SAND.block().get())
                .add(MotrBlocks.RED_SAND.block().get());

        tag(BlockTags.BAMBOO_PLANTABLE_ON)
                .add(MotrBlocks.SUSPICIOUS_GRAVEL.block().get())
                .add(MotrBlocks.GRAVEL.block().get());

        tag(BlockTags.GOATS_SPAWNABLE_ON)
                .add(MotrBlocks.GRAVEL.block().get());

        tag(BlockTags.CONCRETE_POWDER)
                .add(MotrBlocks.WHITE_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.ORANGE_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.MAGENTA_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.LIGHT_BLUE_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.YELLOW_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.LIME_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.PINK_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.GRAY_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.LIGHT_GRAY_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.CYAN_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.PURPLE_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.BLUE_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.BROWN_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.GREEN_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.RED_CONCRETE_POWDER.block().get())
                .add(MotrBlocks.BLACK_CONCRETE_POWDER.block().get());

        tag(BlockTags.FENCE_GATES)
                .add(getAllFenceGateBlocks());

        tag(BlockTags.STAIRS)
                .add(getAllStairBlocks());

        tag(BlockTags.WOOL_CARPETS)
                .add(MotrBlocks.HAY_CARPET.get());
        // spotless:on

    }

    private Block[] getAllSlabBlocks() {
        return Stream.of(
                MotrBlocks.REGISTERED_STANDARD_SLABS.values().stream(),
                MotrBlocks.REGISTERED_GLASS_SLABS.values().stream(),
                MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.values().stream(),
                MotrBlocks.REGISTERED_TRIMM_SLABS.values().stream()
        ).flatMap(stream -> stream).map(slabInfo -> slabInfo.slab().get()).toArray(Block[]::new);
    }

    private Block[] getAllWallBlocks() {
        return Stream.concat(
                MotrBlocks.REGISTERED_STANDARD_WALLS.values().stream(),
                MotrBlocks.REGISTERED_GLASS_WALLS.values().stream()
        ).map(wallInfo -> wallInfo.wall().get()).toArray(Block[]::new);
    }

    private Block[] getAllButtonBlocks() {
        return MotrBlocks.REGISTERED_BUTTONS.values()
                .stream()
                .map(buttonInfo -> buttonInfo.button().get())
                .toArray(Block[]::new);
    }

    private Block[] getAllFallingBlocks() {
        return MotrBlocks.REGISTERED_FALLING_BLOCKS.values()
                .stream()
                .map(buttonInfo -> buttonInfo.block().get())
                .toArray(Block[]::new);
    }

    private Block[] getAllBrushableBlocks() {
        return MotrBlocks.REGISTERED_BRUSHABLE_BLOCKS.values()
                .stream()
                .map(buttonInfo -> buttonInfo.block().get())
                .toArray(Block[]::new);
    }

    public static Block[] getAllSandBlocks() {
        return new Block[] { MotrBlocks.SAND.block().get(), MotrBlocks.RED_SAND.block().get(),
                MotrBlocks.SUSPICIOUS_SAND.block().get() };
    }

    private Block[] getAllFenceBlocks() {
        return MotrBlocks.REGISTERED_FENCES.values()
                .stream()
                .map(fenceInfo -> fenceInfo.fence().get())
                .toArray(Block[]::new);
    }

    private Block[] getAllFenceGateBlocks() {
        return MotrBlocks.REGISTERED_FENCE_GATES.values()
                .stream()
                .map(fenceGateInfo -> fenceGateInfo.fenceGate().get())
                .toArray(Block[]::new);
    }

    private Block[] getAllStairBlocks() {
        return MotrBlocks.REGISTERED_STANDARD_STAIRS.values()
                .stream()
                .map(stairInfo -> stairInfo.stair().get())
                .toArray(Block[]::new);
    }

}
