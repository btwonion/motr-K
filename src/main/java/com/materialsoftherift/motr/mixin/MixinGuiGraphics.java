package com.materialsoftherift.motr.mixin;

import com.materialsoftherift.motr.gui.GuiHelper;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiGraphics.class)
public class MixinGuiGraphics {

    @Unique
    private final GuiGraphics guiGraphics = (GuiGraphics) (Object) this;


    @Inject(
        method = "renderItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/gui/GuiGraphics;renderItemCooldown(Lnet/minecraft/world/item/ItemStack;II)V",
            shift = At.Shift.AFTER
        )
    )
    private void renderAsterisk(
        Font font,
        ItemStack itemStack,
        int x,
        int y,
        String text,
        CallbackInfo ci
    ) {
        GuiHelper.renderDecorations(guiGraphics, itemStack, x, y);
    }
}
