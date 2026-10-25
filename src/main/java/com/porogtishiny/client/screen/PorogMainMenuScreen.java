package com.porogtishiny.client.screen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

/**
 * Заглушка главного меню на ванильном фоне и кнопках.
 * TODO: кастомный фон, шум, кнопки. В 26.x рендер-методы Screen менялись,
 * поэтому сигнатуры отрисовки смотри в IDE прямо в классе Screen.
 */
public class PorogMainMenuScreen extends Screen {
    private final Screen parent;

    public PorogMainMenuScreen(Screen parent) {
        super(Component.translatable("ui.porog_tishiny.menu.title"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        int cx = this.width / 2 - 100;
        int y = this.height / 2 - 30;

        addRenderableWidget(Button.builder(
            Component.translatable("ui.porog_tishiny.menu.continue"),
            b -> Minecraft.getInstance().setScreen(new PorogLoadingScreen(this))
        ).bounds(cx, y, 200, 20).build());

        addRenderableWidget(Button.builder(
            Component.translatable("ui.porog_tishiny.menu.back"),
            b -> onClose()
        ).bounds(cx, y + 28, 200, 20).build());
    }

    @Override
    public void onClose() {
        Minecraft.getInstance().setScreen(parent);
    }
}
