package com.affehund.forgottenrecipes;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
