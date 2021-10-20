package com.acxdev.learnjetpack.note.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.acxdev.learnjetpack.ui.theme.BabyBlue
import com.acxdev.learnjetpack.ui.theme.LightGreen
import com.acxdev.learnjetpack.ui.theme.RedOrange
import com.acxdev.learnjetpack.ui.theme.RedPink
import com.acxdev.learnjetpack.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}


class InvalidNoteException(message: String): Exception(message)