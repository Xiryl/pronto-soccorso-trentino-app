package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalAverageWaitingListEntity
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListObservationRoomEntity

class WaitingAverageWaitingListConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalAverageWaitingListEntity? {
        val listType = object : TypeToken<HospitalAverageWaitingListEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalAverageWaitingListEntity(data: HospitalAverageWaitingListEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}