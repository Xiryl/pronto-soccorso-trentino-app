package it.chiarani.prontosoccorsotrentino.domain.model

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
    val waitingListEntity: HospitalWaitingListWaitingRoom,
    val waitingListSurgeryRoomEntity: HospitalWaitingListSurgeryRoom,
    val waitingListObservationRoomEntity: HospitalWaitingListObservationRoom,
    val waitingAverageWaitingListEntity: HospitalAverageWaitingList
)
