package com.porogtishiny.story;

/**
 * Сюжетная запись (кассета, дневник, фото).
 * Текст в lang: note.porog_tishiny.<id>.title / .text
 */
public record StoryNote(String id, StoryAct act, Kind kind) {
    public enum Kind { CASSETTE, DIARY, PHOTO, MAP, LOG }

    public String titleKey() { return "note.porog_tishiny." + id + ".title"; }
    public String textKey()  { return "note.porog_tishiny." + id + ".text"; }
}
