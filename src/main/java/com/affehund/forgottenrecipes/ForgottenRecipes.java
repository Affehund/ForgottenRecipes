package com.affehund.forgottenrecipes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LightBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ForgottenRecipes implements ModInitializer {

    /*  TODO
        doesn't work
        should I even replace the light block stuff to work for survival?
    */
    public static final Item LIGHT_ITEM = new BlockItem(ForgottenRecipes.LIGHT_BLOCK, (new Item.Settings()).rarity(Rarity.EPIC));
    public static final Block LIGHT_BLOCK = new LightBlock(Block.Settings.of(Material.AIR).strength(0F, 3600000.8F).nonOpaque().luminance(LightBlock.STATE_TO_LUMINANCE));

    @Override
    public void onInitialize() {
        /*
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.LIGHT), "light",
                LIGHT_ITEM);
        Registry.register(Registry.BLOCK, Registry.BLOCK.getRawId(Blocks.LIGHT), "light", LIGHT_BLOCK);
        */
    }
}
