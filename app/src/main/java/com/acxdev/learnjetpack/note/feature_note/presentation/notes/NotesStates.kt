package com.acxdev.learnjetpack.note.feature_note.presentation.notes

import com.acxdev.learnjetpack.note.feature_note.domain.model.Note
import com.acxdev.learnjetpack.note.feature_note.domain.util.NoteOrder
import com.acxdev.learnjetpack.note.feature_note.domain.util.OrderType

data class NotesStates(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)