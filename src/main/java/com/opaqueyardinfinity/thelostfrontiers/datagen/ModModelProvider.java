package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.block.ModBlocks;
import com.opaqueyardinfinity.thelostfrontiers.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import org.jspecify.annotations.NonNull;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, TheLostFrontiers.MOD_ID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.SILVER_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILVER.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.SILVER_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_SILVER_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.SILVER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SILVER_ORE.get());



    }
}
