package com.materialsoftherift.motr.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemStack.class)
public abstract class MixinItemStack {

    @Shadow
    public abstract Component getDisplayName();

    @Inject(method = "getTooltipLines", at = @At(value = "INVOKE", target = "Ljava/util/List;add(Ljava/lang/Object;)Z", ordinal = 0, shift = At.Shift.AFTER))
    private void addHoverText(
            Item.TooltipContext tooltipContext,
            Player player,
            TooltipFlag tooltipFlag,
            CallbackInfoReturnable<List<Component>> cir,
            @Local List<Component> components) {
        if (!getDisplayName().getString().startsWith("[Stable ")) {
            return;
        }
        components.add(Component.literal("Ignores gravity").withStyle(ChatFormatting.GRAY));
    }
}
