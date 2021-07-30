package com.affehund.forgottenrecipes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ForgottenRecipes.MOD_ID)
public class ForgottenRecipes
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "forgottenrecipes";
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public ForgottenRecipes() {
        // ITEMS.register(modEventBus);
        // BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    /*
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            "minecraft");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            "minecraft");

    public static final RegistryObject<Block> LIGHT_BLOCK = BLOCKS.register("light", () -> new LightBlock(BlockBehaviour.Properties.of(Material.AIR).strength(0F, 3600000.8F).noOcclusion().lightLevel(LightBlock.LIGHT_EMISSION)));

    public static final RegistryObject<Item> LIGHT = ITEMS.register("light", () -> new BlockItem(LIGHT_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).rarity(Rarity.UNCOMMON)));
     */
}

