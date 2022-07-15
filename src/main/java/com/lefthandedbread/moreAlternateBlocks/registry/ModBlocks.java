package com.lefthandedbread.moreAlternateBlocks.registry;

import com.lefthandedbread.moreAlternateBlocks.MoreAlternateBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Material.*;

public class ModBlocks {
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(FabricBlockSettings.of(STONE).strength(0.75f, 0.75f).requiresTool()), ItemGroup.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(MoreAlternateBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(MoreAlternateBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        MoreAlternateBlocks.LOGGER.debug("Registering ModBlocks for " + MoreAlternateBlocks.MOD_ID);
    }
}