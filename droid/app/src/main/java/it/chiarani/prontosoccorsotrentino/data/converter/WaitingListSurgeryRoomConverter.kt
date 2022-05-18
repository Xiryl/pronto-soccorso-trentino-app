package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalWaitingListSurgeryRoomEntity

class WaitingListSurgeryRoomConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalWaitingListSurgeryRoomEntity? {
        val listType = object : TypeToken<HospitalWaitingListSurgeryRoomEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalWaitingListSurgeryRoomEntity(data: HospitalWaitingListSurgeryRoomEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}