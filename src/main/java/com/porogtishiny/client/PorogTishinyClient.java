package com.porogtishiny.client;

import com.porogtishiny.PorogTishiny;
import com.porogtishiny.client.screen.PorogMainMenuScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;

public class PorogTishinyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PorogTishiny.LOGGER.info("Клиент: проверка тишины");

        // Временная кнопка на ванильном меню, чтобы открыть наш экран.
        // Полная замена главного меню — через миксин на TitleScreen (следующий шаг).
        ScreenEvents.AFTER_INIT.register((client, screen, w, h) -> {
            if (screen instanceof TitleScreen) {
                Screens.getButtons(screen).add(
                    Button.builder(
                        Component.translatable("ui.porog_tishiny.menu.open"),
                        b -> Minecraft.getInstance().setScreen(new PorogMainMenuScreen(screen))
                    ).bounds(w / 2 - 100, 10, 200, 20).build()
                );
            }
        });
    }
}
