package it.chiarani.prontosoccorsotrentino.domain.model

import com.google.gson.annotations.SerializedName
import it.chiarani.prontosoccorsotrentino.data.local.HospitalAverageWaitingListEntity
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListObservationRoomEntity
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListSurgeryRoomEntity

/**
 * Plain kotlin class for [it.chiarani.prontosoccorsotrentino.data.local.HospitalEntity]
 */
data class Hospital(
    val code: String,
    val description: String,
    val hospitalName: String,
    val hospitalDepartment: String,
    val hospitalDepartmentDescription: String,
    val directorName: String,
    val location: String,
    val customMessage: String,
    val waitingListEntity: HospitalAverageWaitingList,
    val waitingListSurgeryRoomEntity: HospitalWaitingListSurgeryRoom,
    val waitingListObservationRoomEntity: HospitalWaitingListObservationRoom,
    val waitingAverageWaitingListEntity: HospitalAverageWaitingList
)
