package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalEntity
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital

/***
 * Extension function to map the [HospitalEntity] (entity) to [Hospital] (model)
 */

fun HospitalEntity.toHospital(): Hospital {
    return Hospital(
        code = code,
        description = description,
        hospitalName = hospitalName,
        hospitalDepartment = hospitalDepartment,
        hospitalDepartmentDescription = hospitalDepartmentDescription,
        directorName = directorName,
        location = location,
        customMessage = customMessage,
        waitingListEntity = waitingListEntity.toHospitalAverageWaitingList(),
        waitingListSurgeryRoomEntity = waitingListSurgeryRoomEntity.toHospitalWaitingListSurgeryRoom(),
        waitingListObservationRoomEntity = waitingListObservationRoomEntity.toHospitalWaitingListObservationRoom(),
        waitingAverageWaitingListEntity = waitingAverageWaitingListEntity.toHospitalAverageWaitingList(),
    )
}

/***
 * Extension function to map the [Hospital] (model) to [HospitalEntity] (entity)
 */

fun Hospital.toHospitalEntity(): HospitalEntity {
    return HospitalEntity(
        code = code,
        description = description,
        hospitalName = hospitalName,
        hospitalDepartment = hospitalDepartment,
        hospitalDepartmentDescription = hospitalDepartmentDescription,
        directorName = directorName,
        location = location,
        customMessage = customMessage,
        waitingListEntity = waitingListEntity.toHospitalAverageWaitingListEntity(),
        waitingListSurgeryRoomEntity = waitingListSurgeryRoomEntity.toHospitalWaitingListSurgeryRoomEntity(),
        waitingListObservationRoomEntity = waitingListObservationRoomEntity.toHospitalWaitingListObservationRoomEntity(),
        waitingAverageWaitingListEntity = waitingAverageWaitingListEntity.toHospitalAverageWaitingListEntity(),
    )
}