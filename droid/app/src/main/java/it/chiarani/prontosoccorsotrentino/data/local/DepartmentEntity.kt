package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital

@Entity
data class DepartmentEntity(
    @PrimaryKey val id: Int? = null,
    @SerializedName("reparto")
    var hospital: HospitalEntity?
)