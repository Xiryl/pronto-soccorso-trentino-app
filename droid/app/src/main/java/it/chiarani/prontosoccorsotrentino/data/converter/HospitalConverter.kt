package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalEntity

class HospitalConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalEntity? {
        val listType = object : TypeToken<HospitalEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalEntity(data: HospitalEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}