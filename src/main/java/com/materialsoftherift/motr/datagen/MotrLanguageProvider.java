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

// Glass walls
        addBlock(MotrBlocks.GLASS_WALL.wall(), "Glass Wall");
        addBlock(MotrBlocks.TINTED_GLASS_WALL.wall(), "Tinted Glass Wall");
        addBlock(MotrBlocks.WHITE_STAINED_GLASS_WALL.wall(), "White Stained Glass Wall");
        addBlock(MotrBlocks.ORANGE_STAINED_GLASS_WALL.wall(), "Orange Stained Glass Wall");
        addBlock(MotrBlocks.MAGENTA_STAINED_GLASS_WALL.wall(), "Magenta Stained Glass Wall");
        addBlock(MotrBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.wall(), "Light Blue Stained Glass Wall");
        addBlock(MotrBlocks.YELLOW_STAINED_GLASS_WALL.wall(), "Yellow Stained Glass Wall");
        addBlock(MotrBlocks.LIME_STAINED_GLASS_WALL.wall(), "Lime Stained Glass Wall");
        addBlock(MotrBlocks.PINK_STAINED_GLASS_WALL.wall(), "Pink Stained Glass Wall");
        addBlock(MotrBlocks.GRAY_STAINED_GLASS_WALL.wall(), "Gray Stained Glass Wall");
        addBlock(MotrBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.wall(), "Light Gray Stained Glass Wall");
        addBlock(MotrBlocks.CYAN_STAINED_GLASS_WALL.wall(), "Cyan Stained Glass Wall");
        addBlock(MotrBlocks.PURPLE_STAINED_GLASS_WALL.wall(), "Purple Stained Glass Wall");
        addBlock(MotrBlocks.BLUE_STAINED_GLASS_WALL.wall(), "Blue Stained Glass Wall");
        addBlock(MotrBlocks.BROWN_STAINED_GLASS_WALL.wall(), "Brown Stained Glass Wall");
        addBlock(MotrBlocks.GREEN_STAINED_GLASS_WALL.wall(), "Green Stained Glass Wall");
        addBlock(MotrBlocks.RED_STAINED_GLASS_WALL.wall(), "Red Stained Glass Wall");
        addBlock(MotrBlocks.BLACK_STAINED_GLASS_WALL.wall(), "Black Stained Glass Wall");

//Concrete walls
        addBlock(MotrBlocks.WHITE_CONCRETE_WALL.wall(), "White Concrete Wall");
        addBlock(MotrBlocks.ORANGE_CONCRETE_WALL.wall(), "Orange Concrete Wall");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_WALL.wall(), "Magenta Concrete Wall");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_WALL.wall(), "Light Blue Concrete Wall");
        addBlock(MotrBlocks.YELLOW_CONCRETE_WALL.wall(), "Yellow Concrete Wall");
        addBlock(MotrBlocks.LIME_CONCRETE_WALL.wall(), "Lime Concrete Wall");
        addBlock(MotrBlocks.PINK_CONCRETE_WALL.wall(), "Pink Concrete Wall");
        addBlock(MotrBlocks.GRAY_CONCRETE_WALL.wall(), "Gray Concrete Wall");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_WALL.wall(), "Light Gray Concrete Wall");
        addBlock(MotrBlocks.CYAN_CONCRETE_WALL.wall(), "Cyan Concrete Wall");
        addBlock(MotrBlocks.PURPLE_CONCRETE_WALL.wall(), "Purple Concrete Wall");
        addBlock(MotrBlocks.BLUE_CONCRETE_WALL.wall(), "Blue Concrete Wall");
        addBlock(MotrBlocks.BROWN_CONCRETE_WALL.wall(), "Brown Concrete Wall");
        addBlock(MotrBlocks.GREEN_CONCRETE_WALL.wall(), "Green Concrete Wall");
        addBlock(MotrBlocks.RED_CONCRETE_WALL.wall(), "Red Concrete Wall");
        addBlock(MotrBlocks.BLACK_CONCRETE_WALL.wall(), "Black Concrete Wall");

// Extra walls
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

// Concrete slabs
        addBlock(MotrBlocks.WHITE_CONCRETE_SLAB.slab(), "White Concrete Slab");
        addBlock(MotrBlocks.ORANGE_CONCRETE_SLAB.slab(), "Orange Concrete Slab");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_SLAB.slab(), "Magenta Concrete Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_SLAB.slab(), "Light Blue Concrete Slab");
        addBlock(MotrBlocks.YELLOW_CONCRETE_SLAB.slab(), "Yellow Concrete Slab");
        addBlock(MotrBlocks.LIME_CONCRETE_SLAB.slab(), "Lime Concrete Slab");
        addBlock(MotrBlocks.PINK_CONCRETE_SLAB.slab(), "Pink Concrete Slab");
        addBlock(MotrBlocks.GRAY_CONCRETE_SLAB.slab(), "Gray Concrete Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_SLAB.slab(), "Light Gray Concrete Slab");
        addBlock(MotrBlocks.CYAN_CONCRETE_SLAB.slab(), "Cyan Concrete Slab");
        addBlock(MotrBlocks.PURPLE_CONCRETE_SLAB.slab(), "Purple Concrete Slab");
        addBlock(MotrBlocks.BLUE_CONCRETE_SLAB.slab(), "Blue Concrete Slab");
        addBlock(MotrBlocks.BROWN_CONCRETE_SLAB.slab(), "Brown Concrete Slab");
        addBlock(MotrBlocks.GREEN_CONCRETE_SLAB.slab(), "Green Concrete Slab");
        addBlock(MotrBlocks.RED_CONCRETE_SLAB.slab(), "Red Concrete Slab");
        addBlock(MotrBlocks.BLACK_CONCRETE_SLAB.slab(), "Black Concrete Slab");

// Concrete powder slabs
        addBlock(MotrBlocks.WHITE_CONCRETE_POWDER_SLAB.slab(), "White Concrete Powder Slab");
        addBlock(MotrBlocks.ORANGE_CONCRETE_POWDER_SLAB.slab(), "Orange Concrete Powder Slab");
        addBlock(MotrBlocks.MAGENTA_CONCRETE_POWDER_SLAB.slab(), "Magenta Concrete Powder Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB.slab(), "Light Blue Concrete Powder Slab");
        addBlock(MotrBlocks.YELLOW_CONCRETE_POWDER_SLAB.slab(), "Yellow Concrete Powder Slab");
        addBlock(MotrBlocks.LIME_CONCRETE_POWDER_SLAB.slab(), "Lime Concrete Powder Slab");
        addBlock(MotrBlocks.PINK_CONCRETE_POWDER_SLAB.slab(), "Pink Concrete Powder Slab");
        addBlock(MotrBlocks.GRAY_CONCRETE_POWDER_SLAB.slab(), "Gray Concrete Powder Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB.slab(), "Light Gray Concrete Powder Slab");
        addBlock(MotrBlocks.CYAN_CONCRETE_POWDER_SLAB.slab(), "Cyan Concrete Powder Slab");
        addBlock(MotrBlocks.PURPLE_CONCRETE_POWDER_SLAB.slab(), "Purple Concrete Powder Slab");
        addBlock(MotrBlocks.BLUE_CONCRETE_POWDER_SLAB.slab(), "Blue Concrete Powder Slab");
        addBlock(MotrBlocks.BROWN_CONCRETE_POWDER_SLAB.slab(), "Brown Concrete Powder Slab");
        addBlock(MotrBlocks.GREEN_CONCRETE_POWDER_SLAB.slab(), "Green Concrete Powder Slab");
        addBlock(MotrBlocks.RED_CONCRETE_POWDER_SLAB.slab(), "Red Concrete Powder Slab");
        addBlock(MotrBlocks.BLACK_CONCRETE_POWDER_SLAB.slab(), "Black Concrete Powder Slab");

// Coral block slabs
        addBlock(MotrBlocks.TUBE_CORAL_BLOCK_SLAB.slab(), "Tube Coral Block Slab");
        addBlock(MotrBlocks.BRAIN_CORAL_BLOCK_SLAB.slab(), "Brain Coral Block Slab");
        addBlock(MotrBlocks.BUBBLE_CORAL_BLOCK_SLAB.slab(), "Bubble Coral Block Slab");
        addBlock(MotrBlocks.FIRE_CORAL_BLOCK_SLAB.slab(), "Fire Coral Block Slab");
        addBlock(MotrBlocks.HORN_CORAL_BLOCK_SLAB.slab(), "Horn Coral Block Slab");

// Misc organic slabs
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

// Glass slabs
        addBlock(MotrBlocks.GLASS_SLAB.slab(), "Glass Slab");
        addBlock(MotrBlocks.TINTED_GLASS_SLAB.slab(), "Tinted Glass Slab");
        addBlock(MotrBlocks.WHITE_STAINED_GLASS_SLAB.slab(), "White Stained Glass Slab");
        addBlock(MotrBlocks.ORANGE_STAINED_GLASS_SLAB.slab(), "Orange Stained Glass Slab");
        addBlock(MotrBlocks.MAGENTA_STAINED_GLASS_SLAB.slab(), "Magenta Stained Glass Slab");
        addBlock(MotrBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.slab(), "Light Blue Stained Glass Slab");
        addBlock(MotrBlocks.YELLOW_STAINED_GLASS_SLAB.slab(), "Yellow Stained Glass Slab");
        addBlock(MotrBlocks.LIME_STAINED_GLASS_SLAB.slab(), "Lime Stained Glass Slab");
        addBlock(MotrBlocks.PINK_STAINED_GLASS_SLAB.slab(), "Pink Stained Glass Slab");
        addBlock(MotrBlocks.GRAY_STAINED_GLASS_SLAB.slab(), "Gray Stained Glass Slab");
        addBlock(MotrBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.slab(), "Light Gray Stained Glass Slab");
        addBlock(MotrBlocks.CYAN_STAINED_GLASS_SLAB.slab(), "Cyan Stained Glass Slab");
        addBlock(MotrBlocks.PURPLE_STAINED_GLASS_SLAB.slab(), "Purple Stained Glass Slab");
        addBlock(MotrBlocks.BLUE_STAINED_GLASS_SLAB.slab(), "Blue Stained Glass Slab");
        addBlock(MotrBlocks.BROWN_STAINED_GLASS_SLAB.slab(), "Brown Stained Glass Slab");
        addBlock(MotrBlocks.GREEN_STAINED_GLASS_SLAB.slab(), "Green Stained Glass Slab");
        addBlock(MotrBlocks.RED_STAINED_GLASS_SLAB.slab(), "Red Stained Glass Slab");
        addBlock(MotrBlocks.BLACK_STAINED_GLASS_SLAB.slab(), "Black Stained Glass Slab");

// Directional slabs
        addBlock(MotrBlocks.PODZOL_SLAB.slab(), "Podzol Slab");
        addBlock(MotrBlocks.MUDDY_MANGROVE_ROOTS_SLAB.slab(), "Muddy Mangrove Roots Slab");
        addBlock(MotrBlocks.MYCELIUM_SLAB.slab(), "Mycelium Slab");
        addBlock(MotrBlocks.DIRT_PATH_SLAB.slab(), "Dirt Path Slab");
        addBlock(MotrBlocks.BONE_BLOCK_SLAB.slab(), "Bone Block Slab");

// Extra blocks
        addBlock(MotrBlocks.GOLD_BLOCK_SLAB.slab(), "Gold Block Slab");
        addBlock(MotrBlocks.IRON_BLOCK_SLAB.slab(), "Iron Block Slab");

        addBlock(MotrBlocks.WHITE_CONCRETE_BUTTON.button(), "White Concrete Button");
        addBlock(MotrBlocks.BLACK_CONCRETE_BUTTON.button(), "Black Concrete Button");
        addBlock(MotrBlocks.PINK_CONCRETE_BUTTON.button(), "Pink Concrete Button");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_BUTTON.button(), "Light Blue Concrete Button");
        addBlock(MotrBlocks.RED_CONCRETE_BUTTON.button(), "Red Concrete Button");

        addBlock(MotrBlocks.WHITE_TERRACOTTA_BUTTON.button(), "White Terracotta Button");
        addBlock(MotrBlocks.BLACK_TERRACOTTA_BUTTON.button(), "Black Terracotta Button");
        addBlock(MotrBlocks.PINK_TERRACOTTA_BUTTON.button(), "Pink Terracotta Button");
        addBlock(MotrBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.button(), "Light Blue Terracotta Button");
        addBlock(MotrBlocks.RED_TERRACOTTA_BUTTON.button(), "Red Terracotta Button");

        addBlock(MotrBlocks.WHITE_WOOL_BUTTON.button(), "White Wool Button");
        addBlock(MotrBlocks.BLACK_WOOL_BUTTON.button(), "Black Wool Button");
        addBlock(MotrBlocks.PINK_WOOL_BUTTON.button(), "Pink Wool Button");
        addBlock(MotrBlocks.LIGHT_BLUE_WOOL_BUTTON.button(), "Light Blue Wool Button");
        addBlock(MotrBlocks.RED_WOOL_BUTTON.button(), "Red Wool Button");

        addBlock(MotrBlocks.SANDSTONE_BUTTON.button(), "Sandstone Button");
        addBlock(MotrBlocks.RED_SANDSTONE_BUTTON.button(), "Red Sandstone Button");
        addBlock(MotrBlocks.MUD_BUTTON.button(), "Mud Button");

        addBlock(MotrBlocks.WHITE_CONCRETE_FENCE.fence(), "White Concrete Fence");
        addBlock(MotrBlocks.BLACK_CONCRETE_FENCE.fence(), "Black Concrete Fence");
        addBlock(MotrBlocks.PINK_CONCRETE_FENCE.fence(), "Pink Concrete Fence");
        addBlock(MotrBlocks.LIGHT_BLUE_CONCRETE_FENCE.fence(), "Light Blue Concrete Fence");
        addBlock(MotrBlocks.RED_CONCRETE_FENCE.fence(), "Red Concrete Fence");

        addBlock(MotrBlocks.WHITE_TERRACOTTA_FENCE.fence(), "White Terracotta Fence");
        addBlock(MotrBlocks.BLACK_TERRACOTTA_FENCE.fence(), "Black Terracotta Fence");
        addBlock(MotrBlocks.PINK_TERRACOTTA_FENCE.fence(), "Pink Terracotta Fence");
        addBlock(MotrBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.fence(), "Light Blue Terracotta Fence");
        addBlock(MotrBlocks.RED_TERRACOTTA_FENCE.fence(), "Red Terracotta Fence");

        addBlock(MotrBlocks.WHITE_WOOL_FENCE.fence(), "White Wool Fence");
        addBlock(MotrBlocks.BLACK_WOOL_FENCE.fence(), "Black Wool Fence");
        addBlock(MotrBlocks.PINK_WOOL_FENCE.fence(), "Pink Wool Fence");
        addBlock(MotrBlocks.LIGHT_BLUE_WOOL_FENCE.fence(), "Light Blue Wool Fence");
        addBlock(MotrBlocks.RED_WOOL_FENCE.fence(), "Red Wool Fence");

        addBlock(MotrBlocks.SANDSTONE_FENCE.fence(), "Sandstone Fence");
        addBlock(MotrBlocks.RED_SANDSTONE_FENCE.fence(), "Red Sandstone Fence");
        addBlock(MotrBlocks.MUD_FENCE.fence(), "Mud Fence");

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