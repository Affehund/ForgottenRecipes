package com.affehund.forgottenrecipes;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkConstants;

@Mod("forgottenrecipes")
public class ForgottenRecipes {
    public ForgottenRecipes() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        var generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new RecipeDataGenerator(generator.getPackOutput()));
    }
}