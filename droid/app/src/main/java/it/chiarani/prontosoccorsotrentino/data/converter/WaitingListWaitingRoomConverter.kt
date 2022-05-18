package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListWaitingRoomEntity

class WaitingListWaitingRoomConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalWaitingListWaitingRoomEntity? {
        val listType = object : TypeToken<HospitalWaitingListWaitingRoomEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalWaitingListWaitingRoomEntity(data: HospitalWaitingListWaitingRoomEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}