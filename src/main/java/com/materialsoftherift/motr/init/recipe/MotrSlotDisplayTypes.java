package com.materialsoftherift.motr.init.recipe;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MotrSlotDisplayTypes {
    public static final DeferredRegister<SlotDisplay.Type<?>> SLOT_DISPLAY_TYPES = DeferredRegister
            .create(Registries.SLOT_DISPLAY, MaterialsOfTheRift.MODID);

}
