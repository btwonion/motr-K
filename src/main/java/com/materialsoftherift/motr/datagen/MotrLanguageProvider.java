package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class MotrLanguageProvider extends LanguageProvider {

    public MotrLanguageProvider(PackOutput output) {
        super(output, MaterialsOfTheRift.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Helpers are available for various common object types. Every helper has two variants: an add() variant
        // for the object itself, and an addTypeHere() variant that accepts a supplier for the object.
        // The different names for the supplier variants are required due to generic type erasure.
        // All following examples assume the existence of the values as suppliers of the needed type.
        // See https://docs.neoforged.net/docs/1.21.1/resources/client/i18n/ for translation of other types.

        // Adds a block translation.

        addBlock(MotrBlocks.GLASS_WALL.wall(), "Glass Wall");
        addBlock(MotrBlocks.TINTED_GLASS_WALL.wall(), "Tinted Glass Wall");
        addBlock(MotrBlocks.WHITE_STAINED_GLASS_WALL.wall(), "White Stained Glass Wall");
        addBlock(MotrBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.wall(), "Light Gray Stained Glass Wall");
        addBlock(MotrBlocks.GRAY_STAINED_GLASS_WALL.wall(), "Gray Stained Glass Wall");
        addBlock(MotrBlocks.BLACK_STAINED_GLASS_WALL.wall(), "Black Stained Glass Wall");
        addBlock(MotrBlocks.BROWN_STAINED_GLASS_WALL.wall(), "Brown Stained Glass Wall");
        addBlock(MotrBlocks.RED_STAINED_GLASS_WALL.wall(), "Red Stained Glass Wall");
        addBlock(MotrBlocks.ORANGE_STAINED_GLASS_WALL.wall(), "Orange Stained Glass Wall");
        addBlock(MotrBlocks.YELLOW_STAINED_GLASS_WALL.wall(), "Yellow Stained Glass Wall");
        addBlock(MotrBlocks.LIME_STAINED_GLASS_WALL.wall(), "Lime Stained Glass Wall");
        addBlock(MotrBlocks.GREEN_STAINED_GLASS_WALL.wall(), "Green Stained Glass Wall");
        addBlock(MotrBlocks.CYAN_STAINED_GLASS_WALL.wall(), "Cyan Stained Glass Wall");
        addBlock(MotrBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.wall(), "Light Blue Stained Glass Wall");
        addBlock(MotrBlocks.BLUE_STAINED_GLASS_WALL.wall(), "Blue Stained Glass Wall");
        addBlock(MotrBlocks.PURPLE_STAINED_GLASS_WALL.wall(), "Purple Stained Glass Wall");
        addBlock(MotrBlocks.MAGENTA_STAINED_GLASS_WALL.wall(), "Magenta Stained Glass Wall");
        addBlock(MotrBlocks.PINK_STAINED_GLASS_WALL.wall(), "Pink Stained Glass Wall");

        addBlock(MotrBlocks.WHITE_CONCRETE_WALL.wall(), "White Concrete Wall");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_WALL.wall(), "Light Gray Concrete Wall");
        addBlock(MotrBlocks.GRAY_CONCRETE_WALL.wall(), "Gray Concrete Wall");
        addBlock(MotrBlocks.BLACK_CONCRETE_WALL.wall(), "Black Concrete Wall");
        addBlock(MotrBlocks.BROWN_CONCRETE_WALL.wall(), "Brown Concrete Wall");
        addBlock(MotrBlocks.RED_CONCRETE_WALL.wall(), "Red Concrete Wall");
        addBlock(MotrBlocks.ORANGE_CONCRETE_WALL.wall(), "Orange Concrete Wall");
        addBlock(MotrBlocks.YELLOW_CONCRETE_WALL.wall(), "Yellow Concrete Wall");
        addBlock(MotrBlocks.LIME_CONCRETE_WALL.wall(), "Lime Concrete Wall");
        addBlock(MotrBlocks.GREEN_CONCRETE_WALL.wall(), "Green Concrete Wall");
        addBlock(MotrBlocks.CYAN_CONCRETE_WALL.wall(), "Cyan Concrete Wall");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_WALL.wall(), "Light Blue Concrete Wall");
        addBlock(MotrBlocks.BLUE_CONCRETE_WALL.wall(), "Blue Concrete Wall");
        addBlock(MotrBlocks.PURPLE_CONCRETE_WALL.wall(), "Purple Concrete Wall");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_WALL.wall(), "Magenta Concrete Wall");
        addBlock(MotrBlocks.PINK_CONCRETE_WALL.wall(), "Pink Concrete Wall");

        addBlock(MotrBlocks.GOLD_BLOCK_WALL.wall(), "Gold Block Wall");
        addBlock(MotrBlocks.RAW_GOLD_BLOCK_WALL.wall(), "Raw Gold Block Wall");
        addBlock(MotrBlocks.IRON_BLOCK_WALL.wall(), "Iron Block Wall");
        addBlock(MotrBlocks.RAW_IRON_BLOCK_WALL.wall(), "Raw Iron Block Wall");
        addBlock(MotrBlocks.BRAIN_CORAL_BLOCK_WALL.wall(), "Brain Coral Block Wall");
        addBlock(MotrBlocks.BUBBLE_CORAL_BLOCK_WALL.wall(), "Bubble Coral Block Wall");
        addBlock(MotrBlocks.DEAD_FIRE_CORAL_BLOCK_WALL.wall(), "Dead Fire Coral Block Wall");
        addBlock(MotrBlocks.DEAD_TUBE_CORAL_BLOCK_WALL.wall(), "Dead Tube Coral Block Wall");
        addBlock(MotrBlocks.FIRE_CORAL_BLOCK_WALL.wall(), "Fire Coral Block Wall");
        addBlock(MotrBlocks.HORN_CORAL_BLOCK_WALL.wall(), "Horn Coral Block Wall");
        addBlock(MotrBlocks.TUBE_CORAL_BLOCK_WALL.wall(), "Tube Coral Block Wall");

        addBlock(MotrBlocks.WHITE_CONCRETE_SLAB.slab(), "White Concrete Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_SLAB.slab(), "Light Gray Concrete Slab");
        addBlock(MotrBlocks.GRAY_CONCRETE_SLAB.slab(), "Gray Concrete Slab");
        addBlock(MotrBlocks.BLACK_CONCRETE_SLAB.slab(), "Black Concrete Slab");
        addBlock(MotrBlocks.BROWN_CONCRETE_SLAB.slab(), "Brown Concrete Slab");
        addBlock(MotrBlocks.RED_CONCRETE_SLAB.slab(), "Red Concrete Slab");
        addBlock(MotrBlocks.ORANGE_CONCRETE_SLAB.slab(), "Orange Concrete Slab");
        addBlock(MotrBlocks.YELLOW_CONCRETE_SLAB.slab(), "Yellow Concrete Slab");
        addBlock(MotrBlocks.LIME_CONCRETE_SLAB.slab(), "Lime Concrete Slab");
        addBlock(MotrBlocks.GREEN_CONCRETE_SLAB.slab(), "Green Concrete Slab");
        addBlock(MotrBlocks.CYAN_CONCRETE_SLAB.slab(), "Cyan Concrete Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_SLAB.slab(), "Light Blue Concrete Slab");
        addBlock(MotrBlocks.BLUE_CONCRETE_SLAB.slab(), "Blue Concrete Slab");
        addBlock(MotrBlocks.PURPLE_CONCRETE_SLAB.slab(), "Purple Concrete Slab");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_SLAB.slab(), "Magenta Concrete Slab");
        addBlock(MotrBlocks.PINK_CONCRETE_SLAB.slab(), "Pink Concrete Slab");

        addBlock(MotrBlocks.WHITE_CONCRETE_POWDER_SLAB.slab(), "White Concrete Powder Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB.slab(), "Light Gray Concrete Powder Slab");
        addBlock(MotrBlocks.GRAY_CONCRETE_POWDER_SLAB.slab(), "Gray Concrete Powder Slab");
        addBlock(MotrBlocks.BLACK_CONCRETE_POWDER_SLAB.slab(), "Black Concrete Powder Slab");
        addBlock(MotrBlocks.BROWN_CONCRETE_POWDER_SLAB.slab(), "Brown Concrete Powder Slab");
        addBlock(MotrBlocks.RED_CONCRETE_POWDER_SLAB.slab(), "Red Concrete Powder Slab");
        addBlock(MotrBlocks.ORANGE_CONCRETE_POWDER_SLAB.slab(), "Orange Concrete Powder Slab");
        addBlock(MotrBlocks.YELLOW_CONCRETE_POWDER_SLAB.slab(), "Yellow Concrete Powder Slab");
        addBlock(MotrBlocks.LIME_CONCRETE_POWDER_SLAB.slab(), "Lime Concrete Powder Slab");
        addBlock(MotrBlocks.GREEN_CONCRETE_POWDER_SLAB.slab(), "Green Concrete Powder Slab");
        addBlock(MotrBlocks.CYAN_CONCRETE_POWDER_SLAB.slab(), "Cyan Concrete Powder Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB.slab(), "Light Blue Concrete Powder Slab");
        addBlock(MotrBlocks.BLUE_CONCRETE_POWDER_SLAB.slab(), "Blue Concrete Powder Slab");
        addBlock(MotrBlocks.PURPLE_CONCRETE_POWDER_SLAB.slab(), "Purple Concrete Powder Slab");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_POWDER_SLAB.slab(), "Magenta Concrete Powder Slab");
        addBlock(MotrBlocks.PINK_CONCRETE_POWDER_SLAB.slab(), "Pink Concrete Powder Slab");

        addBlock(MotrBlocks.TUBE_CORAL_BLOCK_SLAB.slab(), "Tube Coral Block Slab");
        addBlock(MotrBlocks.BRAIN_CORAL_BLOCK_SLAB.slab(), "Brain Coral Block Slab");
        addBlock(MotrBlocks.BUBBLE_CORAL_BLOCK_SLAB.slab(), "Bubble Coral Block Slab");
        addBlock(MotrBlocks.FIRE_CORAL_BLOCK_SLAB.slab(), "Fire Coral Block Slab");
        addBlock(MotrBlocks.HORN_CORAL_BLOCK_SLAB.slab(), "Horn Coral Block Slab");

        addBlock(MotrBlocks.WARPED_WART_BLOCK_SLAB.slab(), "Warped Wart Block Slab");
        addBlock(MotrBlocks.SOUL_SAND_SLAB.slab(), "Soul Sand Slab");
        addBlock(MotrBlocks.SOUL_SOIL_SLAB.slab(), "Soul Soil Slab");
        addBlock(MotrBlocks.ROOTED_DIRT_SLAB.slab(), "Rooted Dirt Slab");
        addBlock(MotrBlocks.RAW_IRON_BLOCK_SLAB.slab(), "Raw Iron Block Slab");
        addBlock(MotrBlocks.RAW_GOLD_BLOCK_SLAB.slab(), "Raw Gold Block Slab");
        addBlock(MotrBlocks.PALE_MOSS_BLOCK_SLAB.slab(), "Pale Moss Block Slab");
        addBlock(MotrBlocks.PACKED_ICE_SLAB.slab(), "Packed Ice Slab");
        addBlock(MotrBlocks.NETHER_WART_BLOCK_SLAB.slab(), "Nether Wart Block Slab");
        addBlock(MotrBlocks.MUD_SLAB.slab(), "Mud Slab");
        addBlock(MotrBlocks.MOSS_BLOCK_SLAB.slab(), "Moss Block Slab");
        addBlock(MotrBlocks.ICE_SLAB.slab(), "Ice Slab");
        addBlock(MotrBlocks.GILDED_BLACKSTONE_SLAB.slab(), "Gilded Blackstone Slab");
        addBlock(MotrBlocks.DIRT_SLAB.slab(), "Dirt Slab");
        addBlock(MotrBlocks.CLAY_SLAB.slab(), "Clay Slab");
        addBlock(MotrBlocks.COARSE_DIRT_SLAB.slab(), "Coarse Dirt Slab");
        addBlock(MotrBlocks.BLUE_ICE_SLAB.slab(), "Blue Ice Slab");
        addBlock(MotrBlocks.RESIN_BLOCK_SLAB.slab(), "Resin Block Slab");

        addBlock(MotrBlocks.GLASS_SLAB.slab(), "Glass Slab");
        addBlock(MotrBlocks.TINTED_GLASS_SLAB.slab(), "Tinted Glass Slab");
        addBlock(MotrBlocks.WHITE_STAINED_GLASS_SLAB.slab(), "White Stained Glass Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.slab(), "Light Gray Stained Glass Slab");
        addBlock(MotrBlocks.GRAY_STAINED_GLASS_SLAB.slab(), "Gray Stained Glass Slab");
        addBlock(MotrBlocks.BLACK_STAINED_GLASS_SLAB.slab(), "Black Stained Glass Slab");
        addBlock(MotrBlocks.BROWN_STAINED_GLASS_SLAB.slab(), "Brown Stained Glass Slab");
        addBlock(MotrBlocks.RED_STAINED_GLASS_SLAB.slab(), "Red Stained Glass Slab");
        addBlock(MotrBlocks.ORANGE_STAINED_GLASS_SLAB.slab(), "Orange Stained Glass Slab");
        addBlock(MotrBlocks.YELLOW_STAINED_GLASS_SLAB.slab(), "Yellow Stained Glass Slab");
        addBlock(MotrBlocks.LIME_STAINED_GLASS_SLAB.slab(), "Lime Stained Glass Slab");
        addBlock(MotrBlocks.GREEN_STAINED_GLASS_SLAB.slab(), "Green Stained Glass Slab");
        addBlock(MotrBlocks.CYAN_STAINED_GLASS_SLAB.slab(), "Cyan Stained Glass Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.slab(), "Light Blue Stained Glass Slab");
        addBlock(MotrBlocks.BLUE_STAINED_GLASS_SLAB.slab(), "Blue Stained Glass Slab");
        addBlock(MotrBlocks.PURPLE_STAINED_GLASS_SLAB.slab(), "Purple Stained Glass Slab");
        addBlock(MotrBlocks.MAGENTA_STAINED_GLASS_SLAB.slab(), "Magenta Stained Glass Slab");
        addBlock(MotrBlocks.PINK_STAINED_GLASS_SLAB.slab(), "Pink Stained Glass Slab");

        addBlock(MotrBlocks.PODZOL_SLAB.slab(), "Podzol Slab");
        addBlock(MotrBlocks.MUDDY_MANGROVE_ROOTS_SLAB.slab(), "Muddy Mangrove Roots Slab");
        addBlock(MotrBlocks.MYCELIUM_SLAB.slab(), "Mycelium Slab");
        addBlock(MotrBlocks.DIRT_PATH_SLAB.slab(), "Dirt Path Slab");
        addBlock(MotrBlocks.BONE_BLOCK_SLAB.slab(), "Bone Block Slab");

        addBlock(MotrBlocks.GOLD_BLOCK_SLAB.slab(), "Gold Block Slab");
        addBlock(MotrBlocks.IRON_BLOCK_SLAB.slab(), "Iron Block Slab");

        addBlock(MotrBlocks.WHITE_CONCRETE_BUTTON.button(), "White Concrete Button");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_BUTTON.button(), "Light Gray Concrete Button");
        addBlock(MotrBlocks.GRAY_CONCRETE_BUTTON.button(), "Gray Concrete Button");
        addBlock(MotrBlocks.BLACK_CONCRETE_BUTTON.button(), "Black Concrete Button");
        addBlock(MotrBlocks.BROWN_CONCRETE_BUTTON.button(), "Brown Concrete Button");
        addBlock(MotrBlocks.RED_CONCRETE_BUTTON.button(), "Red Concrete Button");
        addBlock(MotrBlocks.ORANGE_CONCRETE_BUTTON.button(), "Orange Concrete Button");
        addBlock(MotrBlocks.YELLOW_CONCRETE_BUTTON.button(), "Yellow Concrete Button");
        addBlock(MotrBlocks.LIME_CONCRETE_BUTTON.button(), "Lime Concrete Button");
        addBlock(MotrBlocks.GREEN_CONCRETE_BUTTON.button(), "Green Concrete Button");
        addBlock(MotrBlocks.CYAN_CONCRETE_BUTTON.button(), "Cyan Concrete Button");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_BUTTON.button(), "Light Blue Concrete Button");
        addBlock(MotrBlocks.BLUE_CONCRETE_BUTTON.button(), "Blue Concrete Button");
        addBlock(MotrBlocks.PURPLE_CONCRETE_BUTTON.button(), "Purple Concrete Button");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_BUTTON.button(), "Magenta Concrete Button");
        addBlock(MotrBlocks.PINK_CONCRETE_BUTTON.button(), "Pink Concrete Button");

        addBlock(MotrBlocks.WHITE_TERRACOTTA_BUTTON.button(), "White Terracotta Button");
        addBlock(MotrBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.button(), "Light Gray Terracotta Button");
        addBlock(MotrBlocks.GRAY_TERRACOTTA_BUTTON.button(), "Gray Terracotta Button");
        addBlock(MotrBlocks.BLACK_TERRACOTTA_BUTTON.button(), "Black Terracotta Button");
        addBlock(MotrBlocks.BROWN_TERRACOTTA_BUTTON.button(), "Brown Terracotta Button");
        addBlock(MotrBlocks.RED_TERRACOTTA_BUTTON.button(), "Red Terracotta Button");
        addBlock(MotrBlocks.ORANGE_TERRACOTTA_BUTTON.button(), "Orange Terracotta Button");
        addBlock(MotrBlocks.YELLOW_TERRACOTTA_BUTTON.button(), "Yellow Terracotta Button");
        addBlock(MotrBlocks.LIME_TERRACOTTA_BUTTON.button(), "Lime Terracotta Button");
        addBlock(MotrBlocks.GREEN_TERRACOTTA_BUTTON.button(), "Green Terracotta Button");
        addBlock(MotrBlocks.CYAN_TERRACOTTA_BUTTON.button(), "Cyan Terracotta Button");
        addBlock(MotrBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.button(), "Light Blue Terracotta Button");
        addBlock(MotrBlocks.BLUE_TERRACOTTA_BUTTON.button(), "Blue Terracotta Button");
        addBlock(MotrBlocks.PURPLE_TERRACOTTA_BUTTON.button(), "Purple Terracotta Button");
        addBlock(MotrBlocks.MAGENTA_TERRACOTTA_BUTTON.button(), "Magenta Terracotta Button");
        addBlock(MotrBlocks.PINK_TERRACOTTA_BUTTON.button(), "Pink Terracotta Button");

        addBlock(MotrBlocks.SANDSTONE_BUTTON.button(), "Sandstone Button");
        addBlock(MotrBlocks.RED_SANDSTONE_BUTTON.button(), "Red Sandstone Button");
        addBlock(MotrBlocks.MUD_BUTTON.button(), "Mud Button");

        addBlock(MotrBlocks.WHITE_CONCRETE_FENCE.fence(), "White Concrete Fence");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_FENCE.fence(), "Light Gray Concrete Fence");
        addBlock(MotrBlocks.GRAY_CONCRETE_FENCE.fence(), "Gray Concrete Fence");
        addBlock(MotrBlocks.BLACK_CONCRETE_FENCE.fence(), "Black Concrete Fence");
        addBlock(MotrBlocks.BROWN_CONCRETE_FENCE.fence(), "Brown Concrete Fence");
        addBlock(MotrBlocks.RED_CONCRETE_FENCE.fence(), "Red Concrete Fence");
        addBlock(MotrBlocks.ORANGE_CONCRETE_FENCE.fence(), "Orange Concrete Fence");
        addBlock(MotrBlocks.YELLOW_CONCRETE_FENCE.fence(), "Yellow Concrete Fence");
        addBlock(MotrBlocks.LIME_CONCRETE_FENCE.fence(), "Lime Concrete Fence");
        addBlock(MotrBlocks.GREEN_CONCRETE_FENCE.fence(), "Green Concrete Fence");
        addBlock(MotrBlocks.CYAN_CONCRETE_FENCE.fence(), "Cyan Concrete Fence");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_FENCE.fence(), "Light Blue Concrete Fence");
        addBlock(MotrBlocks.BLUE_CONCRETE_FENCE.fence(), "Blue Concrete Fence");
        addBlock(MotrBlocks.PURPLE_CONCRETE_FENCE.fence(), "Purple Concrete Fence");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_FENCE.fence(), "Magenta Concrete Fence");
        addBlock(MotrBlocks.PINK_CONCRETE_FENCE.fence(), "Pink Concrete Fence");

        addBlock(MotrBlocks.WHITE_TERRACOTTA_FENCE.fence(), "White Terracotta Fence");
        addBlock(MotrBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.fence(), "Light Gray Terracotta Fence");
        addBlock(MotrBlocks.GRAY_TERRACOTTA_FENCE.fence(), "Gray Terracotta Fence");
        addBlock(MotrBlocks.BLACK_TERRACOTTA_FENCE.fence(), "Black Terracotta Fence");
        addBlock(MotrBlocks.BROWN_TERRACOTTA_FENCE.fence(), "Brown Terracotta Fence");
        addBlock(MotrBlocks.RED_TERRACOTTA_FENCE.fence(), "Red Terracotta Fence");
        addBlock(MotrBlocks.ORANGE_TERRACOTTA_FENCE.fence(), "Orange Terracotta Fence");
        addBlock(MotrBlocks.YELLOW_TERRACOTTA_FENCE.fence(), "Yellow Terracotta Fence");
        addBlock(MotrBlocks.LIME_TERRACOTTA_FENCE.fence(), "Lime Terracotta Fence");
        addBlock(MotrBlocks.GREEN_TERRACOTTA_FENCE.fence(), "Green Terracotta Fence");
        addBlock(MotrBlocks.CYAN_TERRACOTTA_FENCE.fence(), "Cyan Terracotta Fence");
        addBlock(MotrBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.fence(), "Light Blue Terracotta Fence");
        addBlock(MotrBlocks.BLUE_TERRACOTTA_FENCE.fence(), "Blue Terracotta Fence");
        addBlock(MotrBlocks.PURPLE_TERRACOTTA_FENCE.fence(), "Purple Terracotta Fence");
        addBlock(MotrBlocks.MAGENTA_TERRACOTTA_FENCE.fence(), "Magenta Terracotta Fence");
        addBlock(MotrBlocks.PINK_TERRACOTTA_FENCE.fence(), "Pink Terracotta Fence");

        addBlock(MotrBlocks.SANDSTONE_FENCE.fence(), "Sandstone Fence");
        addBlock(MotrBlocks.RED_SANDSTONE_FENCE.fence(), "Red Sandstone Fence");
        addBlock(MotrBlocks.MUD_FENCE.fence(), "Mud Fence");

        addBlock(MotrBlocks.WHITE_CONCRETE_FENCE_GATE.fenceGate(), "White Concrete Fence Gate");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.fenceGate(), "Light Gray Concrete Fence Gate");
        addBlock(MotrBlocks.GRAY_CONCRETE_FENCE_GATE.fenceGate(), "Gray Concrete Fence Gate");
        addBlock(MotrBlocks.BLACK_CONCRETE_FENCE_GATE.fenceGate(), "Black Concrete Fence Gate");
        addBlock(MotrBlocks.BROWN_CONCRETE_FENCE_GATE.fenceGate(), "Brown Concrete Fence Gate");
        addBlock(MotrBlocks.RED_CONCRETE_FENCE_GATE.fenceGate(), "Red Concrete Fence Gate");
        addBlock(MotrBlocks.ORANGE_CONCRETE_FENCE_GATE.fenceGate(), "Orange Concrete Fence Gate");
        addBlock(MotrBlocks.YELLOW_CONCRETE_FENCE_GATE.fenceGate(), "Yellow Concrete Fence Gate");
        addBlock(MotrBlocks.LIME_CONCRETE_FENCE_GATE.fenceGate(), "Lime Concrete Fence Gate");
        addBlock(MotrBlocks.GREEN_CONCRETE_FENCE_GATE.fenceGate(), "Green Concrete Fence Gate");
        addBlock(MotrBlocks.CYAN_CONCRETE_FENCE_GATE.fenceGate(), "Cyan Concrete Fence Gate");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.fenceGate(), "Light Blue Concrete Fence Gate");
        addBlock(MotrBlocks.BLUE_CONCRETE_FENCE_GATE.fenceGate(), "Blue Concrete Fence Gate");
        addBlock(MotrBlocks.PURPLE_CONCRETE_FENCE_GATE.fenceGate(), "Purple Concrete Fence Gate");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_FENCE_GATE.fenceGate(), "Magenta Concrete Fence Gate");
        addBlock(MotrBlocks.PINK_CONCRETE_FENCE_GATE.fenceGate(), "Pink Concrete Fence Gate");

        addBlock(MotrBlocks.WHITE_TERRACOTTA_FENCE_GATE.fenceGate(), "White Terracotta Fence Gate");
        addBlock(MotrBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE.fenceGate(), "Light Gray Terracotta Fence Gate");
        addBlock(MotrBlocks.GRAY_TERRACOTTA_FENCE_GATE.fenceGate(), "Gray Terracotta Fence Gate");
        addBlock(MotrBlocks.BLACK_TERRACOTTA_FENCE_GATE.fenceGate(), "Black Terracotta Fence Gate");
        addBlock(MotrBlocks.BROWN_TERRACOTTA_FENCE_GATE.fenceGate(), "Brown Terracotta Fence Gate");
        addBlock(MotrBlocks.RED_TERRACOTTA_FENCE_GATE.fenceGate(), "Red Terracotta Fence Gate");
        addBlock(MotrBlocks.ORANGE_TERRACOTTA_FENCE_GATE.fenceGate(), "Orange Terracotta Fence Gate");
        addBlock(MotrBlocks.YELLOW_TERRACOTTA_FENCE_GATE.fenceGate(), "Yellow Terracotta Fence Gate");
        addBlock(MotrBlocks.LIME_TERRACOTTA_FENCE_GATE.fenceGate(), "Lime Terracotta Fence Gate");
        addBlock(MotrBlocks.GREEN_TERRACOTTA_FENCE_GATE.fenceGate(), "Green Terracotta Fence Gate");
        addBlock(MotrBlocks.CYAN_TERRACOTTA_FENCE_GATE.fenceGate(), "Cyan Terracotta Fence Gate");
        addBlock(MotrBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE.fenceGate(), "Light Blue Terracotta Fence Gate");
        addBlock(MotrBlocks.BLUE_TERRACOTTA_FENCE_GATE.fenceGate(), "Blue Terracotta Fence Gate");
        addBlock(MotrBlocks.PURPLE_TERRACOTTA_FENCE_GATE.fenceGate(), "Purple Terracotta Fence Gate");
        addBlock(MotrBlocks.MAGENTA_TERRACOTTA_FENCE_GATE.fenceGate(), "Magenta Terracotta Fence Gate");
        addBlock(MotrBlocks.PINK_TERRACOTTA_FENCE_GATE.fenceGate(), "Pink Terracotta Fence Gate");

        addBlock(MotrBlocks.SANDSTONE_FENCE_GATE.fenceGate(), "Sandstone Fence Gate");
        addBlock(MotrBlocks.RED_SANDSTONE_FENCE_GATE.fenceGate(), "Red Sandstone Fence Gate");
        addBlock(MotrBlocks.MUD_FENCE_GATE.fenceGate(), "Mud Fence Gate");

        add("itemGroup." + MaterialsOfTheRift.MODID, "MOTR");

    }

    private static @NotNull String getTranslationString(Block block) {
        String idString = BuiltInRegistries.BLOCK.getKey(block).getPath();
        return snakeCaseToCapitalizedCase(idString);
    }

    private static @NotNull String snakeCaseToCapitalizedCase(String idString) {
        StringBuilder sb = new StringBuilder();
        for (String word : idString.toLowerCase(Locale.ROOT).split("_")) {
            sb.append(word.substring(0, 1).toUpperCase(Locale.ROOT));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}