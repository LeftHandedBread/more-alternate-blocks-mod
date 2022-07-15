package com.lefthandedbread.moreAlternateBlocks.registry;

import com.lefthandedbread.moreAlternateBlocks.MoreAlternateBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreAlternateBlocks.MOD_ID, name), item);
    }

    public static void registerItems() {
        MoreAlternateBlocks.LOGGER.debug("Registering Mod Items for " + MoreAlternateBlocks.MOD_ID);
    }
}