package it.chiarani.prontosoccorsotrentino.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Department(
    val hospital: Hospital?
)
