package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import it.chiarani.prontosoccorsotrentino.data.converter.WaitingAverageWaitingListConverter
import it.chiarani.prontosoccorsotrentino.data.converter.WaitingListObservationRoomConverter
import it.chiarani.prontosoccorsotrentino.data.converter.WaitingListSurgeryRoomConverter
import it.chiarani.prontosoccorsotrentino.data.converter.WaitingListWaitingRoomConverter

@Database(
    entities = [HospitalEntity::class,
        HospitalWaitingListWaitingRoomEntity::class,
        HospitalWaitingListObservationRoomEntity::class,
        HospitalWaitingListSurgeryRoomEntity::class,
        HospitalAverageWaitingListEntity::class],
    version = 1
)
@TypeConverters(
    WaitingListObservationRoomConverter::class,
    WaitingAverageWaitingListConverter::class,
    WaitingListSurgeryRoomConverter::class,
    WaitingListWaitingRoomConverter::class
)
abstract class HospitalDatabase: RoomDatabase() {
    abstract val dao: HospitalDao
}