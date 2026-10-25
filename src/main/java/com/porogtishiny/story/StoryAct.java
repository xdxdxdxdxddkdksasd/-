package com.porogtishiny.story;

/** Акты сюжета. Ключ используется в lang: story.porog_tishiny.act.<key> */
public enum StoryAct {
    VILLAGE("village"),
    STATION("station"),
    THRESHOLD("threshold"),
    MEMORY("memory"),
    LAST_TRANSMISSION("last_transmission"),
    ENDING("ending");

    private final String key;

    StoryAct(String key) { this.key = key; }

    public String key() { return key; }

    public String translationKey() { return "story.porog_tishiny.act." + key; }

    public StoryAct next() {
        StoryAct[] all = values();
        return all[Math.min(ordinal() + 1, all.length - 1)];
    }
}
