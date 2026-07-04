package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, TheLostFrontiers.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_BLOCK.getKey())
                .add(ModBlocks.RAW_SILVER_BLOCK.getKey())
                .add(ModBlocks.SILVER_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.getKey());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK.getKey())
                .add(ModBlocks.RAW_SILVER_BLOCK.getKey())
                .add(ModBlocks.SILVER_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.getKey());
    }
}