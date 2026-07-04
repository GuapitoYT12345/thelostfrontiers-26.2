package com.opaqueyardinfinity.thelostfrontiers.block;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TheLostFrontiers.MOD_ID);

    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
             properties -> new Block(properties.strength(25f)
                     .requiresCorrectToolForDrops().sound(SoundType.IRON)));
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
             properties -> new Block(properties.strength(25f)
                     .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
             properties -> new Block(properties.strength(3f)
                     .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
             properties -> new Block(properties.strength(4.5f)
                     .requiresCorrectToolForDrops().sound(SoundType.STONE)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name,properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
