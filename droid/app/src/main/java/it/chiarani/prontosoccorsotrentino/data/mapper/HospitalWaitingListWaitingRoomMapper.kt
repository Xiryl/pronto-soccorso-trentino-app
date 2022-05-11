package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListWaitingRoomEntity
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalWaitingListWaitingRoom

/***
 * Extension function to map the [HospitalWaitingListWaitingRoomEntity] (entity) to [HospitalWaitingListWaitingRoom] (model)
 */

fun HospitalWaitingListWaitingRoomEntity.toHospitalWaitingListWaitingRoom(): HospitalWaitingListWaitingRoom {
    return HospitalWaitingListWaitingRoom(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}

/***
 * Extension function to map the [HospitalWaitingListWaitingRoom] (model) to [HospitalWaitingListWaitingRoomEntity] (entity)
 */

fun HospitalWaitingListWaitingRoom.toHospitalWaitingListWaitingRoomEntity(): HospitalWaitingListWaitingRoomEntity {
    return HospitalWaitingListWaitingRoomEntity(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}