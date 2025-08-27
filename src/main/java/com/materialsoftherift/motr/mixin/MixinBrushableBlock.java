package com.materialsoftherift.motr.mixin;

import com.google.common.base.Suppliers;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.world.level.block.BrushableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Supplier;

@Mixin(BrushableBlock.class)
public class MixinBrushableBlock {

    @Unique
    private Supplier<Boolean> motr_K$isMotr = Suppliers.memoize(() ->
        (BrushableBlock) (Object) this == MotrBlocks.SUSPICIOUS_GRAVEL.block().get() || (Object) this == MotrBlocks.SUSPICIOUS_SAND.block().get()
    );

    @ModifyExpressionValue(
        method = "tick",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/level/block/FallingBlock;isFree(Lnet/minecraft/world/level/block/state/BlockState;)Z"
        )
    )
    private boolean stableBlocksAreNeverFree(boolean original) {
        if (motr_K$isMotr.get()) return false;
        return original;
    }
}
