package com.acxdev.learnjetpack.note.feature_note.domain.util

sealed class Screen(val route: String) {
    object NoteScreen : Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")
}