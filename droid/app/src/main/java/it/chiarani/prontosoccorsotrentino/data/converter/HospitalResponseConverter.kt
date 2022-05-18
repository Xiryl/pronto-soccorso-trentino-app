package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.HospitalResponseEntity

class HospitalResponseConverter {
    @TypeConverter
    fun fromString(value: String?): HospitalResponseEntity? {
        val listType = object : TypeToken<HospitalResponseEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromHospitalResponseEntity(data: HospitalResponseEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}