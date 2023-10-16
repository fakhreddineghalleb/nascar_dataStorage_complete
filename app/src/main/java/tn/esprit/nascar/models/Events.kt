package tn.esprit.nascar.models

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "eventTable")
data class Events(
    @PrimaryKey(autoGenerate = true)
    val id:Int,

    @DrawableRes
    val imageRes:Int,

    val title: String,

    val description: String,
)