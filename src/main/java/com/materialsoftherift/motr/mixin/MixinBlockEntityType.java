package com.materialsoftherift.motr.mixin;

import com.google.common.base.Suppliers;
import com.llamalad7.mixinextras.injector.ModifyReceiver;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

@Mixin(BlockEntityType.class)
public class MixinBlockEntityType {

    @Unique
    private static Supplier<Block> motr_K$suspiciousSand = Suppliers.memoize(() -> MotrBlocks.SUSPICIOUS_SAND.block().get());
    @Unique
    private static Supplier<Block> motr_K$suspiciousGravel = Suppliers.memoize(() -> MotrBlocks.SUSPICIOUS_GRAVEL.block().get());

    @ModifyReceiver(
        method = "isValid",
        at = @At(
            value = "INVOKE",
            target = "Ljava/util/Set;contains(Ljava/lang/Object;)Z"
        )
    )
    private static Set<Block> modifyBrushableBlockArgs(
        Set<Block> original,
        Object toTest
    ) {
        if (!(toTest instanceof Block block)) return original;
        if (block != motr_K$suspiciousSand.get() && block != motr_K$suspiciousGravel.get()) return original;
        Set<Block> newBlocks = new HashSet<>(original);
        newBlocks.add(MotrBlocks.SUSPICIOUS_SAND.block().get());
        newBlocks.add(MotrBlocks.SUSPICIOUS_GRAVEL.block().get());
        return newBlocks;
    }
}
