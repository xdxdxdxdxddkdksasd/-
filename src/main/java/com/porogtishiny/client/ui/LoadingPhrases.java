package com.porogtishiny.client.ui;

import java.util.List;

/** Ключи фраз загрузки (тексты в lang). */
public final class LoadingPhrases {
    public static final List<String> KEYS = List.of(
        "ui.porog_tishiny.loading.1",
        "ui.porog_tishiny.loading.2",
        "ui.porog_tishiny.loading.3",
        "ui.porog_tishiny.loading.4",
        "ui.porog_tishiny.loading.5"
    );

    private LoadingPhrases() {}

    public static String byProgress(float progress01) {
        int i = (int) (progress01 * KEYS.size());
        return KEYS.get(Math.max(0, Math.min(KEYS.size() - 1, i)));
    }
}
