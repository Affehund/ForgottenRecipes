package com.affehund.forgottenrecipes;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod("forgottenrecipes")
public class ForgottenRecipes {
    public ForgottenRecipes() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new RecipeDataGenerator(generator));
        }
    }
}
