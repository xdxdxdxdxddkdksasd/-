package com.porogtishiny.client.screen;

import com.porogtishiny.client.ui.LoadingPhrases;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

/**
 * Заглушка экрана загрузки: по таймеру меняет фразу и возвращается назад.
 * TODO: вывести фразу на экран, добавить затемнение и шум.
 */
public class PorogLoadingScreen extends Screen {
    private static final int TOTAL_TICKS = 100;
    private final Screen parent;
    private int ticks = 0;

    public PorogLoadingScreen(Screen parent) {
        super(Component.translatable("ui.porog_tishiny.loading.title"));
        this.parent = parent;
    }

    public Component currentPhrase() {
        return Component.translatable(LoadingPhrases.byProgress(ticks / (float) TOTAL_TICKS));
    }

    @Override
    public void tick() {
        if (++ticks >= TOTAL_TICKS) {
            Minecraft.getInstance().setScreen(parent);
        }
    }

    @Override
    public boolean shouldCloseOnEsc() { return false; }
}
