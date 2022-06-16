package com.affehund.forgottenrecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod("forgottenrecipes")
public class ForgottenRecipes {
    public ForgottenRecipes() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        var generator = event.getGenerator();
        var isClientProvider = event.includeClient();

        generator.addProvider(isClientProvider, new RecipeDataGenerator(generator));
    }
}
