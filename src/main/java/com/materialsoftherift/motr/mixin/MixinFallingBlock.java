package com.materialsoftherift.motr.mixin;

import com.google.common.base.Suppliers;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;
import java.util.function.Supplier;

@Mixin(FallingBlock.class)
public class MixinFallingBlock {

    @Unique public Supplier<Boolean> isMotr = Suppliers.memoize(() -> {
        Block thisBlock = (Block) (Object) this;
        List<Block> motrFallingBlocks = MotrBlocks.REGISTERED_FALLING_BLOCKS.values()
                .stream()
                .map(info -> info.block().get())
                .toList();
        List<Block> motrBrushableBlocks = MotrBlocks.REGISTERED_BRUSHABLE_BLOCKS.values()
                .stream()
                .map(info -> (Block) info.block().get())
                .toList();
        List<Block> motrAnvilBlocks = MotrBlocks.REGISTERED_ANVIL_BLOCKS.values()
                .stream()
                .map(info -> (Block) info.block().get())
                .toList();
        return motrFallingBlocks.contains(thisBlock) || motrBrushableBlocks.contains(thisBlock)
                || motrAnvilBlocks.contains(thisBlock);
    });

    @ModifyExpressionValue(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/FallingBlock;isFree(Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private boolean motrBlocksAreNeverFree(boolean original, BlockState state) {
        if (isMotr.get()) {
            return false;
        }
        return original;
    }
}
