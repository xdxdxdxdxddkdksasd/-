package com.porogtishiny;

import com.porogtishiny.story.StoryManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Общая точка входа (клиент + сервер). */
public class PorogTishiny implements ModInitializer {
    public static final String MOD_ID = "porog_tishiny";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Порог открывается...");
        StoryManager.init();
        // TODO: ModSounds.init(), ModItems.init(), ModBlocks.init() (пакет registry)
    }
}
