package com.porogtishiny.story;

import java.util.HashSet;
import java.util.Set;

/** Прогресс игрока: текущий акт, найденные записи, выбранный финал. */
public class StoryState {
    private StoryAct act = StoryAct.VILLAGE;
    private final Set<String> foundNotes = new HashSet<>();
    private Ending ending = null;

    public StoryAct act() { return act; }
    public void advance() { act = act.next(); }

    public boolean addNote(String noteId) { return foundNotes.add(noteId); }
    public boolean hasNote(String noteId) { return foundNotes.contains(noteId); }
    public int notesCount() { return foundNotes.size(); }

    public Ending ending() { return ending; }
    public void setEnding(Ending ending) { this.ending = ending; }

    // TODO: сохранение (Fabric Data Attachment API) на игрока или мир
}
