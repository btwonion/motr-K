package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.blockstates.Variant;
import net.minecraft.client.data.models.blockstates.VariantProperties;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;
import org.jetbrains.annotations.NotNull;

public class MotrModelProvider extends ModelProvider {
    public MotrModelProvider(PackOutput output) {
        super(output, MaterialsOfTheRift.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {

        MotrBlocks.REGISTERED_STANDARD_SLABS.forEach((textureName, slabInfo) -> {
            registerStandardSlabModel(blockModels, slabInfo.slab().get(), textureName);
        });

        MotrBlocks.REGISTERED_GLASS_SLABS.forEach((textureId, slabInfo) -> {
            registerGlassSlabModel(blockModels, slabInfo.slab().get(), textureId);
        });

        MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.forEach((id, slabInfo) -> {
            {
                String side = id;
                String top = id;
                String bottom = id;
                switch (id) {
                    case "bone_block" -> {
                        side = "bone_block_side";
                        top = "bone_block_top";
                        bottom = "bone_block_top";
                    }
                    case "muddy_mangrove_roots" -> {
                        side = "muddy_mangrove_roots_side";
                        top = "muddy_mangrove_roots_top";
                        bottom = "muddy_mangrove_roots_top";
                    }
                    case "podzol", "mycelium", "dirt_path" -> {
                        side = id + "_side";
                        top = id + "_top";
                        bottom = "dirt";
                    }
                }
                registerDirectionalSlabModel(blockModels, slabInfo.slab().get(), side, top, bottom);
            }
        });

        MotrBlocks.REGISTERED_TRIMM_SLABS.forEach((id, slabInfo) -> {
            registerTrimmSlabModel(blockModels, slabInfo.slab().get(), id, id, id);
        });

    }

    private void registerStandardSlabModel(BlockModelGenerators blockModels, Block slab, String textureName) {
        TextureMapping mapping = TextureMapping.cube(ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, blockModels.modelOutput);
        ResourceLocation top = ModelTemplates.SLAB_TOP.createWithSuffix(slab, "_top", mapping, blockModels.modelOutput);
        ResourceLocation cube = ModelTemplates.CUBE_ALL.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerStandardStairModel(BlockModelGenerators blockModels, Block stair, String textureName) {
        TextureMapping mapping = TextureMapping.cube(ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation inner = ModelTemplates.STAIRS_INNER.create(stair, mapping, blockModels.modelOutput);
        ResourceLocation straight = ModelTemplates.STAIRS_STRAIGHT.create(stair, mapping, blockModels.modelOutput);
        ResourceLocation outer = ModelTemplates.STAIRS_OUTER.create(stair, mapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stair, inner, straight, outer));
    }

    private void registerDirectionalSlabModel(
            BlockModelGenerators blockModels,
            Block slab,
            String sideTex,
            String topTex,
            String bottomTex) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/" + sideTex))
                .put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + topTex))
                .put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + bottomTex));

        ResourceLocation bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, blockModels.modelOutput);
        ResourceLocation top = ModelTemplates.SLAB_TOP.createWithSuffix(slab, "_top", mapping, blockModels.modelOutput);
        ResourceLocation cube = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerGlassSlabModel(BlockModelGenerators blockModels, Block slab, String textureId) {
        ResourceLocation texture = ResourceLocation.withDefaultNamespace("block/" + textureId);

        TextureMapping slabMapping = new TextureMapping().put(TextureSlot.SIDE, texture)
                .put(TextureSlot.TOP, texture)
                .put(TextureSlot.BOTTOM, texture);

        TextureMapping cubeMapping = new TextureMapping().put(TextureSlot.ALL, texture);

        ResourceLocation bottom = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_bottom"))
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.SIDE)
                .renderType("translucent")
                .build()
                .create(slab, slabMapping, blockModels.modelOutput);

        ResourceLocation top = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_top"))
                .suffix("_top")
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.SIDE)
                .renderType("translucent")
                .build()
                .create(slab, slabMapping, blockModels.modelOutput);

        ResourceLocation cube = ExtendedModelTemplateBuilder.builder()
                .parent(ResourceLocation.fromNamespaceAndPath("minecraft", "block/cube_all"))
                .suffix("_double")
                .requiredTextureSlot(TextureSlot.ALL)
                .renderType("translucent")
                .build()
                .create(slab, cubeMapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerTrimmSlabModel(
            BlockModelGenerators blockModels,
            Block slab,
            String sideTex,
            String topTex,
            String bottomTex) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/" + sideTex))
                .put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + topTex))
                .put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + bottomTex));

        ResourceLocation bottom = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_bottom"))
                .requiredTextureSlot(TextureSlot.SIDE)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .build()
                .create(slab, mapping, blockModels.modelOutput);

        ResourceLocation top = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_top"))
                .suffix("_top")
                .requiredTextureSlot(TextureSlot.SIDE)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .build()
                .create(slab, mapping, blockModels.modelOutput);

        ResourceLocation cube = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

}
