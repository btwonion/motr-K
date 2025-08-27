package com.materialsoftherift.motr.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class GuiHelper {
    private static final ResourceLocation imageLocation = ResourceLocation.fromNamespaceAndPath("motr", "textures/gui/stable_star.png");

    public static void renderDecorations(GuiGraphics guiGraphics, ItemStack itemStack, int x, int y) {
        if (!"motr".equals(itemStack.getItem().builtInRegistryHolder().key().location().getNamespace())) {
            return;
        }

        PoseStack pose = guiGraphics.pose();

        pose.pushPose();
        pose.translate(0, 0, -100);
        GuiHelper.renderAsterisk(guiGraphics, pose, x, y);
        pose.popPose();
    }

    private static void renderAsterisk(GuiGraphics guiGraphics, PoseStack pose, int x, int y) {
        pose.pushPose();
        pose.translate(-0, 0, 410);

        RenderSystem.disableDepthTest();
        RenderSystem.setShaderTexture(0, imageLocation);

        guiGraphics.blit(
            RenderType::guiTextured,
            imageLocation,
            x + 11,
            y + 1,
            0,
            0,
            4,
            3,
            4,
            3
        );

        RenderSystem.enableDepthTest();

        pose.popPose();
    }
}
