package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Database

@Database(
    entities = [HospitalEntity::class,
        HospitalAverageWaitingListEntity::class,
        HospitalWaitingListObservationRoomEntity::class,
        HospitalWaitingListSurgeryRoomEntity::class,
        HospitalAverageWaitingListEntity::class],
    version = 1
)
abstract class HospitalDatabase {
    abstract val dao: HospitalDao
}