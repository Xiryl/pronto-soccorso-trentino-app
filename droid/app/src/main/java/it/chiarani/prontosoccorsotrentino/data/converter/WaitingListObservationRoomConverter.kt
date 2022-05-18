package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson

import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListObservationRoomEntity

class WaitingListObservationRoomConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalWaitingListObservationRoomEntity? {
        val listType = object : TypeToken<HospitalWaitingListObservationRoomEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalWaitingListObservationRoomEntity(data: HospitalWaitingListObservationRoomEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}