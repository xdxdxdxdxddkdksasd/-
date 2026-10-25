package com.porogtishiny.story;

import java.util.LinkedHashMap;
import java.util.Map;

/** Реестр записей. Позже — загрузка данных из data/porog_tishiny/story. */
public final class StoryManager {
    private static final Map<String, StoryNote> NOTES = new LinkedHashMap<>();

    private StoryManager() {}

    public static void init() {
        register(new StoryNote("village_radio", StoryAct.VILLAGE, StoryNote.Kind.CASSETTE));
        register(new StoryNote("worker_diary_1", StoryAct.STATION, StoryNote.Kind.DIARY));
        // TODO: остальные записи по списку из документа проекта
    }

    public static void register(StoryNote note) { NOTES.put(note.id(), note); }

    public static StoryNote get(String id) { return NOTES.get(id); }

    public static Map<String, StoryNote> all() { return Map.copyOf(NOTES); }
}
