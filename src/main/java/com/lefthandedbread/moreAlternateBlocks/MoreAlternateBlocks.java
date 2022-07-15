package com.lefthandedbread.moreAlternateBlocks;

import com.lefthandedbread.moreAlternateBlocks.registry.ModBlocks;
import com.lefthandedbread.moreAlternateBlocks.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreAlternateBlocks implements ModInitializer {

    public static final String MOD_ID = "moreblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
