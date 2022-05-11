package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class HospitalAverageWaitingListEntity(
    @PrimaryKey val id: Int? = null,

    @SerializedName("bianco")
    val white: String,

    @SerializedName("verde")
    val green: String,

    @SerializedName("azzurro")
    val azure: String,

    @SerializedName("arancio")
    val orange: String,

    @SerializedName("giallo")
    val yellow: String,

    @SerializedName("rosso")
    val red: String,
)
