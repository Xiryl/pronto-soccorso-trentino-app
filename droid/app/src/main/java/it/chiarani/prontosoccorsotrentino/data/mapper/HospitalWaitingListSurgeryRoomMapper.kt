package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListSurgeryRoomEntity
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalWaitingListSurgeryRoom

/***
 * Extension function to map the [HospitalWaitingListSurgeryRoomEntity] (entity) to [HospitalWaitingListSurgeryRoom] (model)
 */

fun HospitalWaitingListSurgeryRoomEntity.toHospitalWaitingListSurgeryRoom(): HospitalWaitingListSurgeryRoom {
    return HospitalWaitingListSurgeryRoom(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}

/***
 * Extension function to map the [HospitalWaitingListSurgeryRoom] (model) to [HospitalWaitingListSurgeryRoomEntity] (entity)
 */

fun HospitalWaitingListSurgeryRoom.toHospitalWaitingListSurgeryRoomEntity(): HospitalWaitingListSurgeryRoomEntity {
    return HospitalWaitingListSurgeryRoomEntity(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}