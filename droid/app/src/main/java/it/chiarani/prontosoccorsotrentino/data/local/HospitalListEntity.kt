package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class HospitalListEntity(
    @PrimaryKey val id: Int? = null,
    @SerializedName("risposta")
    var hospitalResponseEntity: HospitalResponseEntity?
)