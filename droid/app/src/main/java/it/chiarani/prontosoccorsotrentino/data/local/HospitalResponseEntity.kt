package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class HospitalResponseEntity (
    @PrimaryKey val id: Int? = null,
    @SerializedName("pronto_soccorso")
    var departmentEntity: DepartmentEntity?,
    @SerializedName("timestamp")
    var timestamp: String?,
    @SerializedName("@tipo")
    var type: String?
)
