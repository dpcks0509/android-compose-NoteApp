package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val getNoteById: GetNoteById,
    val addNote: AddNote,
    val deleteNote: DeleteNote
)