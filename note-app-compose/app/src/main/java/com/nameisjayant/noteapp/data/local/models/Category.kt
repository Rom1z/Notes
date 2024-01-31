package com.nameisjayant.noteapp.data.local.models

import androidx.compose.ui.graphics.Color
import com.nameisjayant.noteapp.ui.theme.Teal200

data class Category(
    val id: Int,
    val title: String,
    val color: Color
)

val categoryList = listOf(
    Category(
        1,
        "Важный",
        Color.Red
    ),
    Category(
        2,
        "Делать",
        Teal200
    ),
    Category(
        3,
        "Идея",
        Color.Green
    )
)