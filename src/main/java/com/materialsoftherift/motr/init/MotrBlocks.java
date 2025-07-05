package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class MotrBlocks {

    public static class SlabInfo {
        private final DeferredBlock<SlabBlock> slab;
        private final Block baseBlock;

        public SlabInfo(DeferredBlock<SlabBlock> slab, Block baseBlock) {
            this.slab = slab;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<SlabBlock> slab() {
            return slab;
        }

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static final SlabInfo WHITE_CONCRETE_SLAB = registerSlabBlock("white_concrete_slab", Blocks.WHITE_CONCRETE);
    public static final SlabInfo ORANGE_CONCRETE_SLAB = registerSlabBlock("orange_concrete_slab",
            Blocks.ORANGE_CONCRETE);
    public static final SlabInfo MAGENTA_CONCRETE_SLAB = registerSlabBlock("magenta_concrete_slab",
            Blocks.MAGENTA_CONCRETE);
    public static final SlabInfo LIGHT_BLUE_CONCRETE_SLAB = registerSlabBlock("light_blue_concrete_slab",
            Blocks.LIGHT_BLUE_CONCRETE);
    public static final SlabInfo YELLOW_CONCRETE_SLAB = registerSlabBlock("yellow_concrete_slab",
            Blocks.YELLOW_CONCRETE);
    public static final SlabInfo LIME_CONCRETE_SLAB = registerSlabBlock("lime_concrete_slab", Blocks.LIME_CONCRETE);
    public static final SlabInfo PINK_CONCRETE_SLAB = registerSlabBlock("pink_concrete_slab", Blocks.PINK_CONCRETE);
    public static final SlabInfo GRAY_CONCRETE_SLAB = registerSlabBlock("gray_concrete_slab", Blocks.GRAY_CONCRETE);
    public static final SlabInfo LIGHT_GRAY_CONCRETE_SLAB = registerSlabBlock("light_gray_concrete_slab",
            Blocks.LIGHT_GRAY_CONCRETE);
    public static final SlabInfo CYAN_CONCRETE_SLAB = registerSlabBlock("cyan_concrete_slab", Blocks.CYAN_CONCRETE);
    public static final SlabInfo PURPLE_CONCRETE_SLAB = registerSlabBlock("purple_concrete_slab",
            Blocks.PURPLE_CONCRETE);
    public static final SlabInfo BLUE_CONCRETE_SLAB = registerSlabBlock("blue_concrete_slab", Blocks.BLUE_CONCRETE);
    public static final SlabInfo BROWN_CONCRETE_SLAB = registerSlabBlock("brown_concrete_slab", Blocks.BROWN_CONCRETE);
    public static final SlabInfo GREEN_CONCRETE_SLAB = registerSlabBlock("green_concrete_slab", Blocks.GREEN_CONCRETE);
    public static final SlabInfo RED_CONCRETE_SLAB = registerSlabBlock("red_concrete_slab", Blocks.RED_CONCRETE);
    public static final SlabInfo BLACK_CONCRETE_SLAB = registerSlabBlock("black_concrete_slab", Blocks.BLACK_CONCRETE);

    public static final SlabInfo WHITE_CONCRETE_POWDER_SLAB = registerSlabBlock("white_concrete_powder_slab",
            Blocks.WHITE_CONCRETE_POWDER);
    public static final SlabInfo ORANGE_CONCRETE_POWDER_SLAB = registerSlabBlock("orange_concrete_powder_slab",
            Blocks.ORANGE_CONCRETE_POWDER);
    public static final SlabInfo MAGENTA_CONCRETE_POWDER_SLAB = registerSlabBlock("magenta_concrete_powder_slab",
            Blocks.MAGENTA_CONCRETE_POWDER);
    public static final SlabInfo LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerSlabBlock("light_blue_concrete_powder_slab",
            Blocks.LIGHT_BLUE_CONCRETE_POWDER);
    public static final SlabInfo YELLOW_CONCRETE_POWDER_SLAB = registerSlabBlock("yellow_concrete_powder_slab",
            Blocks.YELLOW_CONCRETE_POWDER);
    public static final SlabInfo LIME_CONCRETE_POWDER_SLAB = registerSlabBlock("lime_concrete_powder_slab",
            Blocks.LIME_CONCRETE_POWDER);
    public static final SlabInfo PINK_CONCRETE_POWDER_SLAB = registerSlabBlock("pink_concrete_powder_slab",
            Blocks.PINK_CONCRETE_POWDER);
    public static final SlabInfo GRAY_CONCRETE_POWDER_SLAB = registerSlabBlock("gray_concrete_powder_slab",
            Blocks.GRAY_CONCRETE_POWDER);
    public static final SlabInfo LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerSlabBlock("light_gray_concrete_powder_slab",
            Blocks.LIGHT_GRAY_CONCRETE_POWDER);
    public static final SlabInfo CYAN_CONCRETE_POWDER_SLAB = registerSlabBlock("cyan_concrete_powder_slab",
            Blocks.CYAN_CONCRETE_POWDER);
    public static final SlabInfo PURPLE_CONCRETE_POWDER_SLAB = registerSlabBlock("purple_concrete_powder_slab",
            Blocks.PURPLE_CONCRETE_POWDER);
    public static final SlabInfo BLUE_CONCRETE_POWDER_SLAB = registerSlabBlock("blue_concrete_powder_slab",
            Blocks.BLUE_CONCRETE_POWDER);
    public static final SlabInfo BROWN_CONCRETE_POWDER_SLAB = registerSlabBlock("brown_concrete_powder_slab",
            Blocks.BROWN_CONCRETE_POWDER);
    public static final SlabInfo GREEN_CONCRETE_POWDER_SLAB = registerSlabBlock("green_concrete_powder_slab",
            Blocks.GREEN_CONCRETE_POWDER);
    public static final SlabInfo RED_CONCRETE_POWDER_SLAB = registerSlabBlock("red_concrete_powder_slab",
            Blocks.RED_CONCRETE_POWDER);
    public static final SlabInfo BLACK_CONCRETE_POWDER_SLAB = registerSlabBlock("black_concrete_powder_slab",
            Blocks.BLACK_CONCRETE_POWDER);

    public static final SlabInfo TUBE_CORAL_BLOCK_SLAB = registerSlabBlock("tube_coral_block_slab",
            Blocks.TUBE_CORAL_BLOCK);
    public static final SlabInfo BRAIN_CORAL_BLOCK_SLAB = registerSlabBlock("brain_coral_block_slab",
            Blocks.BRAIN_CORAL_BLOCK);
    public static final SlabInfo BUBBLE_CORAL_BLOCK_SLAB = registerSlabBlock("bubble_coral_block_slab",
            Blocks.BUBBLE_CORAL_BLOCK);
    public static final SlabInfo FIRE_CORAL_BLOCK_SLAB = registerSlabBlock("fire_coral_block_slab",
            Blocks.FIRE_CORAL_BLOCK);
    public static final SlabInfo HORN_CORAL_BLOCK_SLAB = registerSlabBlock("horn_coral_block_slab",
            Blocks.HORN_CORAL_BLOCK);

    public static final SlabInfo WARPED_WART_BLOCK_SLAB = registerSlabBlock("warped_wart_block_slab",
            Blocks.WARPED_WART_BLOCK);
    public static final SlabInfo SOUL_SAND_SLAB = registerSlabBlock("soul_sand_slab", Blocks.SOUL_SAND);
    public static final SlabInfo SOUL_SOIL_SLAB = registerSlabBlock("soul_soil_slab", Blocks.SOUL_SOIL);
    public static final SlabInfo ROOTED_DIRT_SLAB = registerSlabBlock("rooted_dirt_slab", Blocks.ROOTED_DIRT);
    public static final SlabInfo RAW_IRON_BLOCK_SLAB = registerSlabBlock("raw_iron_block_slab", Blocks.RAW_IRON_BLOCK);
    public static final SlabInfo RAW_GOLD_BLOCK_SLAB = registerSlabBlock("raw_gold_block_slab", Blocks.RAW_GOLD_BLOCK);
    public static final SlabInfo PALE_MOSS_BLOCK_SLAB = registerSlabBlock("pale_moss_block_slab",
            Blocks.PALE_MOSS_BLOCK);
    public static final SlabInfo PACKED_ICE_SLAB = registerSlabBlock("packed_ice_slab", Blocks.PACKED_ICE);
    public static final SlabInfo NETHER_WART_BLOCK_SLAB = registerSlabBlock("nether_wart_block_slab",
            Blocks.NETHER_WART_BLOCK);
    public static final SlabInfo MUD_SLAB = registerSlabBlock("mud_slab", Blocks.MUD);
    public static final SlabInfo MOSS_BLOCK_SLAB = registerSlabBlock("moss_block_slab", Blocks.MOSS_BLOCK);
    public static final SlabInfo ICE_SLAB = registerSlabBlock("ice_slab", Blocks.ICE);
    public static final SlabInfo GILDED_BLACKSTONE_SLAB = registerSlabBlock("gilded_blackstone_slab",
            Blocks.GILDED_BLACKSTONE);
    public static final SlabInfo DIRT_SLAB = registerSlabBlock("dirt_slab", Blocks.DIRT);
    public static final SlabInfo CLAY_SLAB = registerSlabBlock("clay_slab", Blocks.CLAY);
    public static final SlabInfo COARSE_DIRT_SLAB = registerSlabBlock("coarse_dirt_slab", Blocks.COARSE_DIRT);
    public static final SlabInfo BLUE_ICE_SLAB = registerSlabBlock("blue_ice_slab", Blocks.BLUE_ICE);
    public static final SlabInfo RESIN_BLOCK_SLAB = registerSlabBlock("resin_block_slab", Blocks.RESIN_BLOCK);

    public static final SlabInfo GLASS_SLAB = registerSlabBlock("glass_slab", Blocks.GLASS);
    public static final SlabInfo TINTED_GLASS_SLAB = registerSlabBlock("tinted_glass_slab", Blocks.TINTED_GLASS);
    public static final SlabInfo WHITE_STAINED_GLASS_SLAB = registerSlabBlock("white_stained_glass_slab",
            Blocks.WHITE_STAINED_GLASS);
    public static final SlabInfo ORANGE_STAINED_GLASS_SLAB = registerSlabBlock("orange_stained_glass_slab",
            Blocks.ORANGE_STAINED_GLASS);
    public static final SlabInfo MAGENTA_STAINED_GLASS_SLAB = registerSlabBlock("magenta_stained_glass_slab",
            Blocks.MAGENTA_STAINED_GLASS);
    public static final SlabInfo LIGHT_BLUE_STAINED_GLASS_SLAB = registerSlabBlock("light_blue_stained_glass_slab",
            Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final SlabInfo YELLOW_STAINED_GLASS_SLAB = registerSlabBlock("yellow_stained_glass_slab",
            Blocks.YELLOW_STAINED_GLASS);
    public static final SlabInfo LIME_STAINED_GLASS_SLAB = registerSlabBlock("lime_stained_glass_slab",
            Blocks.LIME_STAINED_GLASS);
    public static final SlabInfo PINK_STAINED_GLASS_SLAB = registerSlabBlock("pink_stained_glass_slab",
            Blocks.PINK_STAINED_GLASS);
    public static final SlabInfo GRAY_STAINED_GLASS_SLAB = registerSlabBlock("gray_stained_glass_slab",
            Blocks.GRAY_STAINED_GLASS);
    public static final SlabInfo LIGHT_GRAY_STAINED_GLASS_SLAB = registerSlabBlock("light_gray_stained_glass_slab",
            Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final SlabInfo CYAN_STAINED_GLASS_SLAB = registerSlabBlock("cyan_stained_glass_slab",
            Blocks.CYAN_STAINED_GLASS);
    public static final SlabInfo PURPLE_STAINED_GLASS_SLAB = registerSlabBlock("purple_stained_glass_slab",
            Blocks.PURPLE_STAINED_GLASS);
    public static final SlabInfo BLUE_STAINED_GLASS_SLAB = registerSlabBlock("blue_stained_glass_slab",
            Blocks.BLUE_STAINED_GLASS);
    public static final SlabInfo BROWN_STAINED_GLASS_SLAB = registerSlabBlock("brown_stained_glass_slab",
            Blocks.BROWN_STAINED_GLASS);
    public static final SlabInfo GREEN_STAINED_GLASS_SLAB = registerSlabBlock("green_stained_glass_slab",
            Blocks.GREEN_STAINED_GLASS);
    public static final SlabInfo RED_STAINED_GLASS_SLAB = registerSlabBlock("red_stained_glass_slab",
            Blocks.RED_STAINED_GLASS);
    public static final SlabInfo BLACK_STAINED_GLASS_SLAB = registerSlabBlock("black_stained_glass_slab",
            Blocks.BLACK_STAINED_GLASS);

    public static final SlabInfo PODZOL_SLAB = registerSlabBlock("podzol_slab", Blocks.PODZOL);
    public static final SlabInfo MUDDY_MANGROVE_ROOTS_SLAB = registerSlabBlock("muddy_mangrove_roots_slab",
            Blocks.MUDDY_MANGROVE_ROOTS);
    public static final SlabInfo MYCELIUM_SLAB = registerSlabBlock("mycelium_slab", Blocks.MYCELIUM);
    public static final SlabInfo DIRT_PATH_SLAB = registerSlabBlock("dirt_path_slab", Blocks.DIRT_PATH);
    public static final SlabInfo BONE_BLOCK_SLAB = registerSlabBlock("bone_block_slab", Blocks.BONE_BLOCK);

    public static final SlabInfo GOLD_BLOCK_SLAB = registerSlabBlock("gold_block_slab", Blocks.GOLD_BLOCK);
    public static final SlabInfo IRON_BLOCK_SLAB = registerSlabBlock("iron_block_slab", Blocks.IRON_BLOCK);

    public static final Map<String, SlabInfo> REGISTERED_STANDARD_SLABS = Map.ofEntries(
            Map.entry("white_concrete", WHITE_CONCRETE_SLAB), Map.entry("orange_concrete", ORANGE_CONCRETE_SLAB),
            Map.entry("magenta_concrete", MAGENTA_CONCRETE_SLAB),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_SLAB),
            Map.entry("yellow_concrete", YELLOW_CONCRETE_SLAB), Map.entry("lime_concrete", LIME_CONCRETE_SLAB),
            Map.entry("pink_concrete", PINK_CONCRETE_SLAB), Map.entry("gray_concrete", GRAY_CONCRETE_SLAB),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_SLAB), Map.entry("cyan_concrete", CYAN_CONCRETE_SLAB),
            Map.entry("purple_concrete", PURPLE_CONCRETE_SLAB), Map.entry("blue_concrete", BLUE_CONCRETE_SLAB),
            Map.entry("brown_concrete", BROWN_CONCRETE_SLAB), Map.entry("green_concrete", GREEN_CONCRETE_SLAB),
            Map.entry("red_concrete", RED_CONCRETE_SLAB), Map.entry("black_concrete", BLACK_CONCRETE_SLAB),
            Map.entry("white_concrete_powder", WHITE_CONCRETE_POWDER_SLAB),
            Map.entry("orange_concrete_powder", ORANGE_CONCRETE_POWDER_SLAB),
            Map.entry("magenta_concrete_powder", MAGENTA_CONCRETE_POWDER_SLAB),
            Map.entry("light_blue_concrete_powder", LIGHT_BLUE_CONCRETE_POWDER_SLAB),
            Map.entry("yellow_concrete_powder", YELLOW_CONCRETE_POWDER_SLAB),
            Map.entry("lime_concrete_powder", LIME_CONCRETE_POWDER_SLAB),
            Map.entry("pink_concrete_powder", PINK_CONCRETE_POWDER_SLAB),
            Map.entry("gray_concrete_powder", GRAY_CONCRETE_POWDER_SLAB),
            Map.entry("light_gray_concrete_powder", LIGHT_GRAY_CONCRETE_POWDER_SLAB),
            Map.entry("cyan_concrete_powder", CYAN_CONCRETE_POWDER_SLAB),
            Map.entry("purple_concrete_powder", PURPLE_CONCRETE_POWDER_SLAB),
            Map.entry("blue_concrete_powder", BLUE_CONCRETE_POWDER_SLAB),
            Map.entry("brown_concrete_powder", BROWN_CONCRETE_POWDER_SLAB),
            Map.entry("green_concrete_powder", GREEN_CONCRETE_POWDER_SLAB),
            Map.entry("red_concrete_powder", RED_CONCRETE_POWDER_SLAB),
            Map.entry("black_concrete_powder", BLACK_CONCRETE_POWDER_SLAB),
            Map.entry("tube_coral_block", TUBE_CORAL_BLOCK_SLAB),
            Map.entry("brain_coral_block", BRAIN_CORAL_BLOCK_SLAB),
            Map.entry("bubble_coral_block", BUBBLE_CORAL_BLOCK_SLAB),
            Map.entry("fire_coral_block", FIRE_CORAL_BLOCK_SLAB), Map.entry("horn_coral_block", HORN_CORAL_BLOCK_SLAB),
            Map.entry("warped_wart_block", WARPED_WART_BLOCK_SLAB), Map.entry("soul_sand", SOUL_SAND_SLAB),
            Map.entry("soul_soil", SOUL_SOIL_SLAB), Map.entry("rooted_dirt", ROOTED_DIRT_SLAB),
            Map.entry("raw_iron_block", RAW_IRON_BLOCK_SLAB), Map.entry("raw_gold_block", RAW_GOLD_BLOCK_SLAB),
            Map.entry("pale_moss_block", PALE_MOSS_BLOCK_SLAB), Map.entry("packed_ice", PACKED_ICE_SLAB),
            Map.entry("nether_wart_block", NETHER_WART_BLOCK_SLAB), Map.entry("mud", MUD_SLAB),
            Map.entry("moss_block", MOSS_BLOCK_SLAB), Map.entry("ice", ICE_SLAB),
            Map.entry("gilded_blackstone", GILDED_BLACKSTONE_SLAB), Map.entry("dirt", DIRT_SLAB),
            Map.entry("clay", CLAY_SLAB), Map.entry("coarse_dirt", COARSE_DIRT_SLAB),
            Map.entry("blue_ice", BLUE_ICE_SLAB), Map.entry("resin_block", RESIN_BLOCK_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_GLASS_SLABS = Map.ofEntries(
            Map.entry("glass", GLASS_SLAB), Map.entry("tinted_glass", TINTED_GLASS_SLAB),
            Map.entry("white_stained_glass", WHITE_STAINED_GLASS_SLAB),
            Map.entry("orange_stained_glass", ORANGE_STAINED_GLASS_SLAB),
            Map.entry("magenta_stained_glass", MAGENTA_STAINED_GLASS_SLAB),
            Map.entry("light_blue_stained_glass", LIGHT_BLUE_STAINED_GLASS_SLAB),
            Map.entry("yellow_stained_glass", YELLOW_STAINED_GLASS_SLAB),
            Map.entry("lime_stained_glass", LIME_STAINED_GLASS_SLAB),
            Map.entry("pink_stained_glass", PINK_STAINED_GLASS_SLAB),
            Map.entry("gray_stained_glass", GRAY_STAINED_GLASS_SLAB),
            Map.entry("light_gray_stained_glass", LIGHT_GRAY_STAINED_GLASS_SLAB),
            Map.entry("cyan_stained_glass", CYAN_STAINED_GLASS_SLAB),
            Map.entry("purple_stained_glass", PURPLE_STAINED_GLASS_SLAB),
            Map.entry("blue_stained_glass", BLUE_STAINED_GLASS_SLAB),
            Map.entry("brown_stained_glass", BROWN_STAINED_GLASS_SLAB),
            Map.entry("green_stained_glass", GREEN_STAINED_GLASS_SLAB),
            Map.entry("red_stained_glass", RED_STAINED_GLASS_SLAB),
            Map.entry("black_stained_glass", BLACK_STAINED_GLASS_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_DIRECTIONAL_SLABS = Map.ofEntries(
            Map.entry("podzol", PODZOL_SLAB), Map.entry("muddy_mangrove_roots", MUDDY_MANGROVE_ROOTS_SLAB),
            Map.entry("mycelium", MYCELIUM_SLAB), Map.entry("dirt_path", DIRT_PATH_SLAB),
            Map.entry("bone_block", BONE_BLOCK_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_TRIMM_SLABS = Map.ofEntries(
            Map.entry("gold_block", GOLD_BLOCK_SLAB), Map.entry("iron_block", IRON_BLOCK_SLAB)
    );

    private static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

    private static <T extends Block> DeferredBlock<T> registerDevBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleDevBlockItem(key, register);
        return register;
    }

    private static SlabInfo registerSlabBlock(String id, Block baseBlock) {
        DeferredBlock<SlabBlock> slab = registerDevBlock(id,
                () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))));
        return new SlabInfo(slab, baseBlock);
    }

    private static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}