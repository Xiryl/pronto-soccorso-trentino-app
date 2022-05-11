package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListObservationRoomEntity
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalWaitingListObservationRoom

/***
 * Extension function to map the [HospitalWaitingListObservationRoomEntity] (entity) to [HospitalWaitingListObservationRoom] (model)
 */

fun HospitalWaitingListObservationRoomEntity.toHospitalWaitingListObservationRoom(): HospitalWaitingListObservationRoom {
    return HospitalWaitingListObservationRoom(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}

/***
 * Extension function to map the [HospitalWaitingListObservationRoom] (model) to [HospitalWaitingListObservationRoomEntity] (entity)
 */

fun HospitalWaitingListObservationRoom.toHospitalWaitingListObservationRoomEntity(): HospitalWaitingListObservationRoomEntity {
    return HospitalWaitingListObservationRoomEntity(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}