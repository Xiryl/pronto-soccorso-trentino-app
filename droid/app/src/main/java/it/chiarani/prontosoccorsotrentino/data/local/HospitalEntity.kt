package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class HospitalEntity(
    @PrimaryKey val id: Int? = null,

    @SerializedName("codice")
    val code: String?,

    @SerializedName("descrizione")
    val description: String?,

    @SerializedName("ospedale")
    val hospitalName: String?,

    @SerializedName("unita_operativa")
    val hospitalDepartment: String?,

    @SerializedName("descrizione_ambulatorio")
    val hospitalDepartmentDescription: String?,

    @SerializedName("direttore")
    val directorName: String?,

    @SerializedName("localita")
    val location: String?,

    @SerializedName("messaggio")
    val customMessage: String?,

    @SerializedName("attesa")
    val waitingListEntity: HospitalWaitingListWaitingRoomEntity?,

    @SerializedName("ambulatorio")
    val waitingListSurgeryRoomEntity: HospitalWaitingListSurgeryRoomEntity?,

    @SerializedName("osservazione")
    val waitingListObservationRoomEntity: HospitalWaitingListObservationRoomEntity?,

    @SerializedName("attesa-media")
    val waitingAverageWaitingListEntity: HospitalAverageWaitingListEntity?
)
