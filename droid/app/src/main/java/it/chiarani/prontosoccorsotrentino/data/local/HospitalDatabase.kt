package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import it.chiarani.prontosoccorsotrentino.data.converter.*

@Database(
    entities = [HospitalEntity::class,
        HospitalWaitingListWaitingRoomEntity::class,
        HospitalWaitingListObservationRoomEntity::class,
        HospitalWaitingListSurgeryRoomEntity::class,
        HospitalAverageWaitingListEntity::class,
        HospitalResponseEntity::class,
        HospitalListEntity::class,
        DepartmentEntity::class],
    version = 1
)
@TypeConverters(
    WaitingListObservationRoomConverter::class,
    WaitingAverageWaitingListConverter::class,
    WaitingListSurgeryRoomConverter::class,
    WaitingListWaitingRoomConverter::class,
    HospitalResponseConverter::class,
    DepartmentConverter::class,
    HospitalConverter::class
)
abstract class HospitalDatabase : RoomDatabase() {
    abstract val dao: HospitalDao
}