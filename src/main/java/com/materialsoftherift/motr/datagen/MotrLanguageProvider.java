package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
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

        // addBlock(WotrBlocks.RUNE_ANVIL_ENTITY_BLOCK, "Rune Anvil"); left this as example!
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